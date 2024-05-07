package com.tencentcloudapi.wemeet.core.xhttp;

import okhttp3.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DefaultHttpClient implements HttpClient {

    private OkHttpClient clt;

    private String host;

    private String protocol;

    private Serializable serializer;

    private DefaultHttpClient() {}

    private DefaultHttpClient(Builder builder) {
        this.clt = builder.clt;
        this.host = builder.host;
        this.protocol = builder.protocol;
        this.serializer = builder.serializer;
    }

    public static class Builder {
        private OkHttpClient clt;

        private final String host;

        private String protocol;

        private Serializable serializer;

        public Builder(String host) {
            this.host = host;
        }
        public Builder withHTTPClient(OkHttpClient client) {
            this.clt = client;
            return this;
        }

        public Builder withProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder withSerializer(Serializable serializer) {
            this.serializer = serializer;
            return this;
        }

        public HttpClient build() {
            if (this.protocol == null || this.protocol.isEmpty()) {
                this.protocol = "http";
            }
            if (this.clt == null) {
                this.clt = new OkHttpClient.Builder().build();
            }
            return new DefaultHttpClient(this);
        }
    }

    @Override
    public ApiResponse get(ApiRequest req) throws Exception {
        return doRequest(req, "GET");
    }

    @Override
    public ApiResponse post(ApiRequest req) throws Exception {
        return doRequest(req, "POST");
    }

    @Override
    public ApiResponse put(ApiRequest req) throws Exception {
        return doRequest(req, "PUT");
    }

    @Override
    public ApiResponse delete(ApiRequest req) throws Exception {
        return doRequest(req, "DELETE");
    }

    private ApiResponse doRequest(ApiRequest req, String method) throws Exception {

        // 获取序列化器，以当前请求配置的为准
        Serializable serializer = this.serializer;
        if (req.getSerializer() != null) {
            serializer = req.getSerializer();
        }

        // 序列化请求体
        RequestBody body = null;
        if (req.getBody() != null) {
            if (serializer != null) {
                byte[] data = serializer.Serialize(req.getBody());
                body = RequestBody.create(data);
            } else if (req.getBody() instanceof Byte[] ||
                    req.getBody() instanceof byte[]) {
                body = RequestBody.create((byte[]) req.getBody());
            } else if (req.getBody() instanceof String) {
                body = RequestBody.create(((String) req.getBody()).getBytes());
            } else if (req.getBody() instanceof RequestBody) {
                body = (RequestBody) req.getBody();
            }
        }


        // 生成 url
        URL url = req.generateURL(String.format("%s://%s", this.protocol, this.host));
        // 构造 okhttp3 request 请求
        Request.Builder builder = new Request.Builder().url(url.toString())
                .method(method, body);

        // 设置请求头
        for (Map.Entry<String, List<String>> entry: req.getHeaders().entrySet()) {
            for (String value: entry.getValue()) {
                builder.addHeader(entry.getKey(), value);
            }
        }

        // 增加鉴权头
        if (req.getAuthenticators() != null) {
            for (Authentication authenticator: req.getAuthenticators()) {
                authenticator.AuthHeader(builder);
            }
        }

        // 获取 okhttp3 client
        if (this.clt == null) {
            this.clt = new OkHttpClient();
        }

        // 执行发送请求
        Request httpReq = builder.build();
        try (Response httpRsp = this.clt.newCall(httpReq).execute()) {
            // 封装响应返回
            Map<String, List<String>> header = new HashMap<>();
            httpRsp.headers().forEach((pair) -> {
                List<String> vs = header.getOrDefault(pair.component1(), new ArrayList<>());
                vs.add(pair.component2());
                header.put(pair.component1(), vs);
            });
            // 读取响应
            byte[] respBody = new byte[0];
            if (httpRsp.body() != null) {
                respBody = httpRsp.body().bytes();
            }
            return new ApiResponse(httpRsp.code(), respBody, header, serializer);
        }
    }

}

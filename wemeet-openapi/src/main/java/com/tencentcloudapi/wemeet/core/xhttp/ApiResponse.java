package com.tencentcloudapi.wemeet.core.xhttp;

import java.util.List;
import java.util.Map;

public class ApiResponse {

    private final int statusCode;

    private final Map<String, List<String>> header;

    private final byte[] rawBody;

    private final Serializable serializer;

    public ApiResponse(int statusCode, byte[] rawBody, Map<String, List<String>> header) {
        this(statusCode, rawBody, header, null);
    }

    public ApiResponse(int statusCode, byte[] rawBody, Map<String, List<String>> header, Serializable serializer) {
        this.statusCode = statusCode;
        this.rawBody = rawBody;
        this.header = header;
        this.serializer = serializer;
    }

    public ApiResponse(ApiResponse resp) {
        this(resp.statusCode, resp.rawBody, resp.header, resp.serializer);
    }

    public <T> T translate(Class<T> clz) throws Exception {
        return translate(clz, this.serializer);
    }
    public <T> T translate(Class<T> clz, Serializable serializer) throws Exception {
        if (serializer == null) {
            if (this.serializer != null) {
                serializer = this.serializer;
            } else throw new IllegalArgumentException("response body translate error, serializer is null");
        }
        try {
            return serializer.Deserialize(this.rawBody, clz);
        } catch (Exception e) {
            throw new Exception("response body translate error, "+
                    "body can't be translated by "+serializer.Name()+" serializer", e);
        }

    }

    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, List<String>> getHeader() {
        return header;
    }

    public byte[] getRawBody() {
        return this.rawBody;
    }
}

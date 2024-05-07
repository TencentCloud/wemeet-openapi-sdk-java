package com.tencentcloudapi.wemeet.core.xhttp;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiRequest {

    private String apiPath;

    private Object body;

    private PathParams pathParams;

    private QueryParams queryParams;

    private Map<String, List<String>> headers;

    private Serializable serializer;

    private Set<Authentication> authenticators;

    private ApiRequest() {}

    private ApiRequest(Builder builder) {
        this.apiPath = builder.apiPath;
        this.body = builder.body;
        this.headers = builder.headers;
        this.pathParams = builder.pathParams;
        this.queryParams = builder.queryParams;
        this.serializer = builder.serializer;
        this.authenticators = builder.authenticators;
    }

    public static final class Builder {

        private final String apiPath;

        private Object body;

        private final PathParams pathParams = new PathParams();

        private final QueryParams queryParams = new QueryParams();

        private final Map<String, List<String>> headers = new HashMap<>();

        private Serializable serializer;

        private final Set<Authentication> authenticators = new LinkedHashSet<>();

        public Builder(String apiPath) {
            this.apiPath = apiPath;
        }

        public Builder body(Object body) {
            this.body = body;
            return this;
        }

        public Builder serializer(Serializable serializer) {
            this.serializer = serializer;
            return this;
        }

        public Builder authenticator(Authentication authenticator) {
            this.authenticators.add(authenticator);
            return this;
        }

        public Builder authenticators(Authentication... authenticators) {
            this.authenticators.addAll(Arrays.asList(authenticators));
            return this;
        }

        public Builder addHeader(String name, String value) {
            List<String> vs = this.headers.getOrDefault(name, new ArrayList<>(1));
            vs.add(value);
            this.headers.put(name, vs);
            return this;
        }

        public Builder setHeader(String name, List<String> values) {
            this.headers.put(name, values);
            return this;
        }

        public ApiRequest build() {
            return new ApiRequest(this);
        }
    }

    public URL generateURL(String baseURL) throws MalformedURLException {
        String rawURL = this.apiPath;
        if (!rawURL.startsWith("http")) {
            rawURL = baseURL + rawURL;
        }

        // path
        Matcher matcher = Pattern.compile("\\{.*}").matcher(this.apiPath);
        while (matcher.find()) {
            String matchStr = matcher.group();
            String paramName = matchStr.substring(1, matchStr.length() - 1);
            String paramValue = this.pathParams.get(paramName);
            if (paramValue == null || paramValue.isEmpty()) {
                throw new IllegalArgumentException("path:" + this.apiPath + ", param name:" + paramName + " not found value");
            }
            rawURL = rawURL.replace(matchStr, paramValue);
        }

        // query
        rawURL += this.queryParams.encode();
        return URI.create(rawURL).toURL();
    }

    public static class PathParams {
        Map<String, String> params = new HashMap<>();

        public void set(String name, String value) {
            this.params.put(name, value);
        }

        public String get(String name) {
            return this.params.get(name);
        }
    }
    public static class QueryParams {
        Map<String, List<String>> params = new HashMap<>();

        public void set(String name, String value) {
            this.params.put(name, Collections.singletonList(value));
        }

        public List<String> get(String name) {
            return this.params.get(name);
        }

        public void add(String name, String value) {
            List<String> vs = this.params.get(name);
            if (vs == null) {
                this.set(name, value);
            } else {
                vs.add(value);
            }
        }

        public String encode() {
            if (this.params.isEmpty()) return "";
            StringBuilder query = new StringBuilder();
            try {
                for (Map.Entry<String, List<String>> entry : this.params.entrySet()) {
                    for (String value : entry.getValue()) {
                        if (value == null) continue;
                        query.append('&').append(entry.getKey()).append('=')
                                .append(URLEncoder.encode(value, "UTF-8"));
                    }
                }
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException("query params can't url encode");
            }
            return query.replace(0, 1, "?").toString();
        }
    }


    public String getApiPath() {
        return apiPath;
    }

    public Object getBody() {
        return body;
    }

    public PathParams getPathParams() {
        return pathParams;
    }

    public QueryParams getQueryParams() {
        return queryParams;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public Serializable getSerializer() {
        return serializer;
    }

    public Set<Authentication> getAuthenticators() {
        return authenticators;
    }

    public void addHeader(String name, String value) {
        List<String> vs = this.headers.getOrDefault(name, new ArrayList<>(1));
        vs.add(value);
        this.headers.put(name, vs);
    }

    public void setHeader(String name, List<String> values) {
        this.headers.put(name, values);
    }

    public void removeHeader(String name) {
        this.headers.remove(name);
    }

    public String getHeader(String name) {
        List<String> vs = this.headers.get(name);
        if (vs.isEmpty()) {
            return null;
        }
        return vs.get(0);
    }

    public List<String> getHeaderList(String name) {
        return this.headers.get(name);
    }

}

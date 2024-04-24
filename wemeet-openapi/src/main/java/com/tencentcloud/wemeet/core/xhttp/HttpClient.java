package com.tencentcloud.wemeet.core.xhttp;

/**
 * Client 封装 REST 标准客户端接口
 */
public interface HttpClient {
    ApiResponse get(ApiRequest req) throws Exception;
    ApiResponse post(ApiRequest req) throws Exception;
    ApiResponse put(ApiRequest req) throws Exception;
    ApiResponse delete(ApiRequest req) throws Exception;
}

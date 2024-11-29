package com.tencentcloudapi.wemeet.core.xhttp;

import okhttp3.Request;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Authentication 鉴权能力
 */
public interface Authentication {

    /**
     * AuthHeader 增加鉴权逻辑请求头
     * @param req ApiRequest
     */
    void AuthHeader(Request.Builder req) throws Exception;
}

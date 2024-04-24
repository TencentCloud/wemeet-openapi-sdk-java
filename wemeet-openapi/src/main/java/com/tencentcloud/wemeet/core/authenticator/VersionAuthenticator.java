package com.tencentcloud.wemeet.core.authenticator;

import com.tencentcloud.wemeet.core.Constants;
import com.tencentcloud.wemeet.core.Version;
import com.tencentcloud.wemeet.core.xhttp.Authentication;
import okhttp3.Request;

/**
 * VersionAuthenticator SDK 版本鉴权器
 */
public class VersionAuthenticator implements Authentication {
    @Override
    public void AuthHeader(Request.Builder req) throws Exception {
        req.addHeader(Constants.HTTPHeader.USER_AGENT, Version.VERSION);
    }
}

package com.tencentcloudapi.wemeet.core.authenticator;

import com.tencentcloudapi.wemeet.core.Constants;
import com.tencentcloudapi.wemeet.core.Version;
import com.tencentcloudapi.wemeet.core.xhttp.Authentication;
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

package com.tencentcloudapi.wemeet.core.authenticator;

import com.tencentcloudapi.wemeet.core.Config;
import com.tencentcloudapi.wemeet.core.xhttp.Authentication;

@FunctionalInterface
public interface AuthenticatorBuilder<T extends Authentication> {
     T build(Config config);
}

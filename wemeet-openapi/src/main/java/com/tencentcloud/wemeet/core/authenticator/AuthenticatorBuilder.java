package com.tencentcloud.wemeet.core.authenticator;

import com.tencentcloud.wemeet.core.Config;
import com.tencentcloud.wemeet.core.xhttp.Authentication;

@FunctionalInterface
public interface AuthenticatorBuilder<T extends Authentication> {
     T build(Config config);
}

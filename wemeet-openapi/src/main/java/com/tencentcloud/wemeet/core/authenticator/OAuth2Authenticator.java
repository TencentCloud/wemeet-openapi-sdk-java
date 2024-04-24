package com.tencentcloud.wemeet.core.authenticator;

import com.tencentcloud.wemeet.core.Config;
import com.tencentcloud.wemeet.core.Constants;
import com.tencentcloud.wemeet.core.utils.NonceUtil;
import com.tencentcloud.wemeet.core.xhttp.Authentication;
import okhttp3.Headers;
import okhttp3.Request;

import java.math.BigInteger;
import java.util.Random;

/**
 * Oauth2Authenticator oauth2 鉴权器
 * <p>提供 oauth2 类型鉴权头的设置逻辑。</p>
 */
public class OAuth2Authenticator implements Authentication {

    private final Config config;

    /**
     * 此参数参与签名计算。随机正整数。SDK 默认自动随机生成。
     */
    private BigInteger nonce;

    /**
     * 此参数参与签名计算。当前 UNIX 时间戳，可记录发起 API 请求的时间。SDK 默认当前时间戳。
     * <p>例如1529223702，单位为秒。注意：如果与服务器时间相差超过5分钟，会引起签名过期错误。</p>
     */
    private String timestamp;

    /**
     * 操作的接口名称。注意：某些接口不需要传递该参数，接口文档中会对此特别说明，此时即使传递该参数也不会生效。
     */
    private final String action;

    /**
     * 地域参数，用来标识希望操作哪个地域的数据。注意：某些接口不需要传递该参数，接口文档中会对此特别说明，此时即使传递该参数也不会生效。
     */
    private final String region;

    /**
     * OAuth2.0 鉴权成功后返回的 token 信息。
     */
    private final String accessToken;


    /**
     *  OAuth2.0 鉴权成功后的用户信息。
     */
    private final String openId;

    private OAuth2Authenticator(Config config, Builder builder) {
        this.config = config;
        this.nonce = builder.nonce;
        this.timestamp = builder.timestamp;
        this.action = builder.action;
        this.region = builder.region;
        this.accessToken = builder.accessToken;
        this.openId = builder.openId;
    }

    @Override
    public void AuthHeader(Request.Builder req) throws Exception {

        if (this.config == null) {
            throw new IllegalArgumentException("OAuth2 authenticator is not available");
        }

        Headers.Builder headers = req.getHeaders$okhttp();
        if (headers.get(Constants.HTTPHeader.CONTENT_TYPE) == null) {
            headers.set(Constants.HTTPHeader.CONTENT_TYPE, Constants.DEFAULT_CONTENT_TYPE);
        }

        if (this.accessToken == null || this.accessToken.isEmpty()) {
            throw new IllegalArgumentException("OAuth2 authenticator AccessToken can't be empty");
        }
        headers.set(Constants.HTTPHeader.ACCESS_TOKEN, this.accessToken);
        if (this.openId == null || this.openId.isEmpty()) {
            throw new IllegalArgumentException("OAuth2 authenticator OpenId can't be empty");
        }
        headers.set(Constants.HTTPHeader.OPEN_ID, this.openId);

        if (this.nonce == null) {
            BigInteger nonce = NonceUtil.GenerateTimestampRandom();
            this.nonce = nonce;
        }
        headers.set(Constants.HTTPHeader.X_TC_NONCE, this.nonce.toString());

        if (this.config.getVersion() != null && !this.config.getVersion().isEmpty()) {
            headers.set(Constants.HTTPHeader.X_TC_VERSION, this.config.getVersion());
        }

        if (this.action != null && !this.action.isEmpty()) {
            headers.set(Constants.HTTPHeader.X_TC_ACTION, this.action);
        }

        if (this.region != null && !this.region.isEmpty()) {
            headers.set(Constants.HTTPHeader.X_TC_REGION, this.region);
        }

        if (this.timestamp == null || this.timestamp.isEmpty()) {
            this.timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        }
        headers.set(Constants.HTTPHeader.X_TC_TIMESTAMP, this.timestamp);
        req.setHeaders$okhttp(headers);
    }

    public static class Builder implements AuthenticatorBuilder<OAuth2Authenticator> {

        private final String accessToken;

        private final String openId;

        private BigInteger nonce;

        private String timestamp;

        private String action;

        private String region;

        /**
         * OAuth2.0 鉴权器构造器
         * @param accessToken OAuth2.0 鉴权成功后返回的 token 信息。
         * @param openId OAuth2.0 鉴权成功后的用户信息。
         */
        public Builder(String accessToken, String openId) {
            this.accessToken = accessToken;
            this.openId = openId;
        }

        /**
         * 此参数参与签名计算。随机正整数。SDK 默认自动随机生成。
         */
        public Builder nonce(BigInteger nonce) {
            this.nonce = nonce;
            return this;
        }

        /**
         * 此参数参与签名计算。当前 UNIX 时间戳，可记录发起 API 请求的时间。SDK 默认当前时间戳。
         * <p>例如1529223702，单位为秒。注意：如果与服务器时间相差超过5分钟，会引起签名过期错误。</p>
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * 操作的接口名称。注意：某些接口不需要传递该参数，接口文档中会对此特别说明，此时即使传递该参数也不会生效。
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * 地域参数，用来标识希望操作哪个地域的数据。注意：某些接口不需要传递该参数，接口文档中会对此特别说明，此时即使传递该参数也不会生效。
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        @Override
        public OAuth2Authenticator build(Config config) {
            return new OAuth2Authenticator(config, this);
        }
    }
}

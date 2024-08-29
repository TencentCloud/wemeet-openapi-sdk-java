package com.tencentcloudapi.wemeet.core.authenticator;

import com.tencentcloudapi.wemeet.core.Config;
import com.tencentcloudapi.wemeet.core.Constants;
import com.tencentcloudapi.wemeet.core.utils.Bytes;
import com.tencentcloudapi.wemeet.core.utils.NonceUtil;
import com.tencentcloudapi.wemeet.core.xhttp.Authentication;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * JWTAuthenticator JWT 鉴权器
 * <p>提供标准的 JWT 鉴权头的设置和签名生成逻辑。</p>
 */
public class JWTAuthenticator implements Authentication {

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
     * 放置由官网的签名方法产生的签名。SDK 默认自动生成，也可替换为自己生成符合标准的签名。
     */
    private String signature;

    /**
     * 启用账户通讯录，传入值必须为1，创建的会议可出现在用户的会议列表中。
     *  <p>启用账户通讯录说明：</p>
     * <ui>
     *      <li>1. 通过 SSO 接入腾讯会议账号体系。</li>
     *      <li>2. 通过调用接口创建企业用户。</li>
     *      <li>3. 通过企业管理后台添加或批量导入企业用户。</li>
     *  </ui>
     *
     */
    private String registered;

    private JWTAuthenticator(Config config, Builder builder) {
        this.config = config;
        this.nonce = builder.nonce;
        this.timestamp = builder.timestamp;
        this.action = builder.action;
        this.region = builder.region;
        this.signature = builder.signature;
        this.registered = builder.registered;
    }

    @Override
    public void AuthHeader(Request.Builder req) throws Exception {

        if (this.config == null) {
            throw new IllegalArgumentException("JWT authenticator is not available");
        }

        Headers.Builder headers = req.getHeaders$okhttp();
        if (headers.get(Constants.HTTPHeader.CONTENT_TYPE) == null) {
            headers.set(Constants.HTTPHeader.CONTENT_TYPE, Constants.DEFAULT_CONTENT_TYPE);
        }

        if (this.config.getSecretID() == null || this.config.getSecretID().isEmpty()) {
            throw new IllegalArgumentException("JWT authenticator SecretId can't be empty");
        }
        headers.set(Constants.HTTPHeader.X_TC_KEY, this.config.getSecretID());
        if (this.config.getAppId() == null || this.config.getAppId().isEmpty()) {
            throw new IllegalArgumentException("JWT authenticator AppId can't be empty");
        }
        headers.set(Constants.HTTPHeader.APP_ID, this.config.getAppId());
        headers.set(Constants.HTTPHeader.SDK_ID, this.config.getSdkId());

        if (this.nonce == null) {
            BigInteger nonce = NonceUtil.GenerateTimestampRandom();
            this.nonce = nonce;
        }
        headers.set(Constants.HTTPHeader.X_TC_NONCE, this.nonce.toString());

        if (this.registered == null || this.registered.isEmpty()) {
            this.registered = "1";
        }
        headers.set(Constants.HTTPHeader.X_TC_REGISTERED, this.registered);

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

        if (this.signature == null || this.signature.isEmpty()) {
            this.signature = this.signature(req);
        }
        headers.set(Constants.HTTPHeader.X_TC_SIGNATURE, this.signature);
        req.setHeaders$okhttp(headers);
    }

    /**
     * 生成签名，开发版本oracle jdk 1.8.0_221
     *
     * @return 签名，需要设置在请求头X-TC-Signature中
     */
    private String signature(Request.Builder req) throws InvalidKeyException, NoSuchAlgorithmException {
        String reqBody = "";

        if (req.getBody$okhttp() != null && !(req.getBody$okhttp() instanceof okhttp3.MultipartBody)) {
            reqBody = new String(this.readRequestBody(req));
        }

        String signStr = String.format("%s\nX-TC-Key=%s&X-TC-Nonce=%s&X-TC-Timestamp=%s\n%s\n%s",
                req.getMethod$okhttp(), this.config.getSecretID(), this.nonce, this.timestamp,
                this.getUriPath(req), reqBody);

        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec =
                new SecretKeySpec(this.config.getSecretKey().getBytes(StandardCharsets.UTF_8), mac.getAlgorithm());
        mac.init(secretKeySpec);
        byte[] hash = mac.doFinal(signStr.getBytes(StandardCharsets.UTF_8));
        // 将字节数组转换为十六进制字符串
        String hexHash = Bytes.toHexString(hash);
        return new String(Base64.getEncoder().encode(hexHash.getBytes(StandardCharsets.UTF_8)));

    }

    private byte[] readRequestBody(Request.Builder req) {
        try(Buffer buf = new Buffer()) {
            RequestBody reqBody = req.getBody$okhttp();
            if (reqBody != null) {
                reqBody.writeTo(buf);
            }
            byte[] data = buf.readByteArray();
            // 回设请求体
            req.setBody$okhttp(RequestBody.create(data));
            return data;
        } catch (Exception e) {
            return new byte[0];
        }
    }

    private String getUriPath(Request.Builder req) {
        if (req.getUrl$okhttp() != null) {
            URI uri = req.getUrl$okhttp().uri();
            return uri.getPath() + (uri.getQuery() == null || uri.getQuery().isEmpty() ? "" :  "?" + uri.getQuery());
        }
       return  "";
    }

    public static class Builder implements AuthenticatorBuilder<JWTAuthenticator> {

        private BigInteger nonce;

        private String timestamp;

        private String action;

        private String region;

        private String signature;

        private String registered;

        /**
         * JWT 鉴权器构造器
         */
        public Builder() {}

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

        /**
         * 放置由官网的签名方法产生的签名。SDK 默认自动生成，也可替换为自己生成符合标准的签名。
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * 启用账户通讯录，传入值必须为1，创建的会议可出现在用户的会议列表中。
         *  <p>启用账户通讯录说明：</p>
         * <ui>
         *      <li>1. 通过 SSO 接入腾讯会议账号体系。</li>
         *      <li>2. 通过调用接口创建企业用户。</li>
         *      <li>3. 通过企业管理后台添加或批量导入企业用户。</li>
         *  </ui>
         *
         */
        public Builder registered(String registered) {
            this.registered = registered;
            return this;
        }

        @Override
        public JWTAuthenticator build(Config config) {
            return new JWTAuthenticator(config, this);
        }
    }
}

package com.tencentcloudapi.wemeet.core;

import com.tencentcloudapi.wemeet.core.authenticator.VersionAuthenticator;
import com.tencentcloudapi.wemeet.core.serializor.JSONSerializer;
import com.tencentcloudapi.wemeet.core.xhttp.Authentication;
import com.tencentcloudapi.wemeet.core.xhttp.Serializable;

public final class Constants {
    private Constants() {}
    /**
     * OPEN_API_DOMAIN 域名
     */
    public static final String OPEN_API_DOMAIN = "api.meeting.qq.com";

    /**
     * DEFAULT_PROTOCOL 默认协议
     */
    public static final String DEFAULT_PROTOCOL = "https";

    public static final String APPLICATION_JSON = "application/json";
    public static final String DEFAULT_CONTENT_TYPE = APPLICATION_JSON +"; charset=utf-8";

    /**
     * JSON_SERIALIZER 全局 JSON 序列化器
     */
    public static final JSONSerializer JSON_SERIALIZER = new JSONSerializer();

    /**
     * DEFAULT_SERIALIZER 默认序列化器
     */
    public static final Serializable DEFAULT_SERIALIZER = JSON_SERIALIZER;

    /**
     * DEFAULT_AUTHENTICATOR 默认鉴权器，用于增加 SDK 版本标识头
     */
    public static final Authentication DEFAULT_AUTHENTICATOR = new VersionAuthenticator();

    public static final class HTTPHeader {
        private HTTPHeader() {}

        public static final String CONTENT_TYPE = "Content-Type";
        public static final String USER_AGENT = "User-Agent";

        /**
         * X-TC-Nonce 随机正整数。
         */
        public static final String X_TC_NONCE = "X-TC-Nonce";

        /**
         * X-TC-Key 应用安全凭证密钥对中的 SecretId。
         */
        public static final String X_TC_KEY = "X-TC-Key";
        /**
         * X-TC-Action 操作的接口名称。
         */
        public static final String X_TC_ACTION = "X-TC-Action";
        /**
         * X-TC-Region 地域参数，用来标识希望操作哪个地域的数据。
         */
        public static final String X_TC_REGION = "X-TC-Region";
        /**
         * X-TC-Timestamp 当前 UNIX 时间戳，可记录发起 API 请求的时间。例如1529223702，单位为秒。
         */
        public static final String X_TC_TIMESTAMP = "X-TC-Timestamp";
        /**
         * X-TC-Version 应用 App 的版本号，建议设置，以便灰度和查找问题。
         */
        public static final String X_TC_VERSION = "X-TC-Version";
        /**
         * X-TC-Signature 签名方法产生的签名。
         */
        public static final String X_TC_SIGNATURE = "X-TC-Signature";
        /**
         * X-TC-Registered 启用账户通讯录，传入值必须为1，创建的会议可出现在用户的会议列表中。
         */
        public static final String X_TC_REGISTERED = "X-TC-Registered";
        /**
         * AppId 腾讯会议分配给企业的企业 ID。
         */
        public static final String APP_ID = "AppId";
        /**
         * SdkId 用户子账号或开发的应用 ID。
         */
        public static final String SDK_ID = "SdkId";
        /**
         * AccessToken OAuth2.0 鉴权成功后返回的 token 信息。
         */
        public static final String ACCESS_TOKEN = "AccessToken";
        /**
         * OpenId Auth2.0 鉴权成功后的用户信息。
         */
        public static final String OPEN_ID = "OpenId";
    }

}

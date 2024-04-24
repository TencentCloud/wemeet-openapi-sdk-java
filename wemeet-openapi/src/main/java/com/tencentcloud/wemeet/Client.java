package com.tencentcloud.wemeet;

import com.tencentcloud.wemeet.core.Config;
import com.tencentcloud.wemeet.core.Constants;
import com.tencentcloud.wemeet.core.xhttp.DefaultHttpClient;
import com.tencentcloud.wemeet.core.xhttp.HttpClient;
import com.tencentcloud.wemeet.service.meetings.api.MeetingsApi;
import com.tencentcloud.wemeet.service.records.api.RecordsApi;
import com.tencentcloud.wemeet.service.meeting_control.api.MeetingControlApi;
import com.tencentcloud.wemeet.service.meeting_guest.api.MeetingGuestApi;


public class Client {

    private Config config;

    // service interfaces
    private MeetingsApi meetings;
    private RecordsApi records;
    private MeetingControlApi meeting_control;
    private MeetingGuestApi meeting_guest;

    private Client() {}

    public static class Builder {
        private final Config config;

        public Builder() {
            this.config = new Config();
        }
        public Builder(Config config) {
            this.config = config;
        }

        /**
         * 设置 appId
         * @param appId 腾讯会议分配给企业的企业 ID。
         *              <p>企业管理员可以登录 腾讯会议官网，单击右上角用户中心，在左侧菜单栏中的企业管理 > 账户管理 > 账户信息中进行查看。</p>
         *              <p>开发者可以单击右上角用户中心，在左侧菜单栏中的企业管理 > 高级 > REST API 应用信息中查看。</p>
         * @return Client.Builder
         */
        public Builder withAppId(String appId) {
            this.config.setAppId(appId);
            return this;
        }

        /**
         * 设置 sdkId
         * @param sdkId 用户子账号或开发的应用 ID。
         *              <p>企业管理员可以登录 腾讯会议官网，单击右上角用户中心，在左侧菜单栏中的企业管理 > 高级 > REST API 中进行查看（如存在 SdkId 则必须填写，早期申请 API 且未分配 SdkId 的客户可不填写）。</p>
         * @return Client.Builder
         */
        public Builder withSdkId(String sdkId) {
            this.config.setSdkId(sdkId);
            return this;
        }

        /**
         * 设置 jwt 鉴权用的 secretID 和 secretKey
         * @param secretID 应用生成的 Secret ID。JWT 鉴权用。
         * @param secretKey 应用生成的 Secret Key。JWT 鉴权用。
         * @return Client.Builder
         */
        public Builder withSecret(String secretID, String secretKey) {
            this.config.setSecretID(secretID);
            this.config.setSecretKey(secretKey);
            return this;
        }

        /**
         * 设置应用 App 的版本号
         * @param version 应用 App 的版本号，建议设置，以便灰度和查找问题。
         * @return Client.Builder
         */
        public Builder withAppVersion(String version) {
            this.config.setVersion(version);
            return this;
        }

        /**
         * 设置自定义 wemeet http client
         * @param clt 自定义实现的 wemeet http client
         * @return Client.Builder
         */
        public Builder withHttpClient(HttpClient clt) {
            this.config.setClt(clt);
            return this;
        }

        public Client build() {

            if (this.config.getClt() == null) {
                this.config.setClt(new DefaultHttpClient.Builder(Constants.OPEN_API_DOMAIN)
                        .withProtocol(Constants.DEFAULT_PROTOCOL)
                        .withSerializer(Constants.DEFAULT_SERIALIZER)
                        .build());
            }
            Client client = new Client();
            client.config = this.config;

            // 注册服务
            client.meetings = new MeetingsApi(client.config);
            client.records = new RecordsApi(client.config);
            client.meeting_control = new MeetingControlApi(client.config);
            client.meeting_guest = new MeetingGuestApi(client.config);
            return client;
        }
    }

    public MeetingsApi meetings() {
        return this.meetings;
    }

    public RecordsApi records() {
        return this.records;
    }

    public MeetingControlApi meeting_control() {
        return this.meeting_control;
    }

    public MeetingGuestApi meeting_guest() {
        return this.meeting_guest;
    }
}

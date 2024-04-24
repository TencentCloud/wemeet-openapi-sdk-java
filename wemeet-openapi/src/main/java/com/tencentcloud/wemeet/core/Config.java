package com.tencentcloud.wemeet.core;

import com.tencentcloud.wemeet.core.xhttp.HttpClient;

/**
 * Config 通用配置
 */
public class Config {

    /**
     *  wemeet 封装的 http client
     */
    private HttpClient clt;

    /**
     * 应用 App 的版本号，建议设置，以便灰度和查找问题。通过设置该字段，API 会把该版本信息传递给会议后台，以控制一些和 App 版本有关的特性。
     */
    private String version;

    /**
     * 腾讯会议分配给企业的企业 ID。
     * <p>企业管理员可以登录 腾讯会议官网，单击右上角用户中心，在左侧菜单栏中的企业管理 > 账户管理 > 账户信息中进行查看。</p>
     * <p>开发者可以单击右上角用户中心，在左侧菜单栏中的企业管理 > 高级  > REST API 应用信息中查看。</p>
     */
    private String appId;

    /**
     *  用户子账号或开发的应用 ID。
     *  <p>企业管理员可以登录 腾讯会议官网，单击右上角用户中心，在左侧菜单栏中的企业管理 > 高级 > REST API 中进行查看（如存在 SdkId 则必须填写，早期申请 API 且未分配 SdkId 的客户可不填写）。</p>
     */
    private String sdkId;

    /**
     * 应用生成的 Secret ID。JWT 鉴权用。
     */
    private String secretID;

    /**
     * 应用生成的 Secret Key。JWT 鉴权用。
     */
    private String secretKey;

    public Config() {
    }

    @Override
    public Config clone() throws CloneNotSupportedException {
        Config clone = (Config) super.clone();
        clone.clt = this.clt;
        clone.version = this.version;
        clone.appId = this.appId;
        clone.sdkId = this.sdkId;
        clone.secretID = this.secretID;
        clone.secretKey = this.secretKey;
        return clone;
    }

    public Config(HttpClient clt, String appId, String sdkId, String secretID, String secretKey, String version) {
        this.clt = clt;
        this.version = version;
        this.appId = appId;
        this.sdkId = sdkId;
        this.secretID = secretID;
        this.secretKey = secretKey;
    }

    public Config(HttpClient clt, String appId, String sdkId, String secretID, String secretKey) {
        this(clt, appId, sdkId, secretID, secretKey, null);
    }

    public Config(HttpClient clt, String appId, String secretID, String secretKey) {
        this(clt, appId, null, secretID, secretKey);
    }

    public Config(HttpClient clt, String appId, String sdkId) {
        this(clt, appId, sdkId, null, null);
    }

    public Config(HttpClient clt, String appId) {
        this(clt, appId, null);
    }

    public HttpClient getClt() {
        return clt;
    }

    public String getVersion() {
        return version;
    }

    public String getAppId() {
        return appId;
    }

    public String getSdkId() {
        return sdkId;
    }

    public String getSecretID() {
        return secretID;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setClt(HttpClient clt) {
        this.clt = clt;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setSdkId(String sdkId) {
        this.sdkId = sdkId;
    }

    public void setSecretID(String secretID) {
        this.secretID = secretID;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}

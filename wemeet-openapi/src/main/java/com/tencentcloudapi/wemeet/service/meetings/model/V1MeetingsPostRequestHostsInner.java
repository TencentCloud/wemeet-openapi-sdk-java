/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsPostRequestHostsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsPostRequestHostsInner {
    @JsonProperty(value = "is_anonymous")
    private Boolean isAnonymous;

    @JsonProperty(value = "nick_name")
    private String nickName;

    @JsonProperty(value = "userid", required = true)
    private String userid;

    /**
     * @param userid 用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId） 企业唯一用户标识说明： 企业对接 SSO 时使用的员工唯一标识 ID，企业调用创建用户接口时传递的 userid 参数。 (required)
     */
    public V1MeetingsPostRequestHostsInner(@NotNull String userid) {
        this.userid = userid;
    }

    /**
     * @param isAnonymous 用户是否匿名入会，缺省为 false，不匿名 true：匿名 false：不匿名
     */
    public V1MeetingsPostRequestHostsInner isAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
        return this;
    }
    /**
     * @return isAnonymous 用户是否匿名入会，缺省为 false，不匿名 true：匿名 false：不匿名
     **/
    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    /**
     * @param isAnonymous 用户是否匿名入会，缺省为 false，不匿名 true：匿名 false：不匿名
     */
    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }
    /**
     * @param nickName 用户匿名字符串。如果字段“is_anonymous”设置为“true”，但是无指定匿名字符串, 会议将分配缺省名称，例如 “会议用户xxxx”，其中“xxxx”为随机数字。
     */
    public V1MeetingsPostRequestHostsInner nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    /**
     * @return nickName 用户匿名字符串。如果字段“is_anonymous”设置为“true”，但是无指定匿名字符串, 会议将分配缺省名称，例如 “会议用户xxxx”，其中“xxxx”为随机数字。
     **/
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName 用户匿名字符串。如果字段“is_anonymous”设置为“true”，但是无指定匿名字符串, 会议将分配缺省名称，例如 “会议用户xxxx”，其中“xxxx”为随机数字。
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    /**
     * @param userid 用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId） 企业唯一用户标识说明： 企业对接 SSO 时使用的员工唯一标识 ID，企业调用创建用户接口时传递的 userid 参数。 (required)
     */
    public V1MeetingsPostRequestHostsInner userid(@NotNull String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId） 企业唯一用户标识说明： 企业对接 SSO 时使用的员工唯一标识 ID，企业调用创建用户接口时传递的 userid 参数。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId） 企业唯一用户标识说明： 企业对接 SSO 时使用的员工唯一标识 ID，企业调用创建用户接口时传递的 userid 参数。 (required)
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsPostRequestHostsInner v1MeetingsPostRequestHostsInner = (V1MeetingsPostRequestHostsInner) o;
        return Objects.equals(this.isAnonymous, v1MeetingsPostRequestHostsInner.isAnonymous) &&
            Objects.equals(this.nickName, v1MeetingsPostRequestHostsInner.nickName) &&
            Objects.equals(this.userid, v1MeetingsPostRequestHostsInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAnonymous, nickName, userid);
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1MeetingsPostRequestHostsInner {\n");
        sb.append("    isAnonymous: ").append(toIndentedString(isAnonymous)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


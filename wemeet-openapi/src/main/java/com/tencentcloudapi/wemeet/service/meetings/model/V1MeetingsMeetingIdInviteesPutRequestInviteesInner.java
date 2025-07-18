/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.12
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
 * V1MeetingsMeetingIdInviteesPutRequestInviteesInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdInviteesPutRequestInviteesInner {
    @JsonProperty(value = "userid", required = true)
    private String userid;

    /**
     * @param userid 调用方用于标示用户的唯一 ID，仅支持邀请与会议创建者同企业的成员（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 企业对接 SSO 时使用的员工唯一标识 ID。 企业调用创建用户接口时传递的 userid 参数。 (required)
     */
    public V1MeetingsMeetingIdInviteesPutRequestInviteesInner(@NotNull String userid) {
        this.userid = userid;
    }

    /**
     * @param userid 调用方用于标示用户的唯一 ID，仅支持邀请与会议创建者同企业的成员（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 企业对接 SSO 时使用的员工唯一标识 ID。 企业调用创建用户接口时传递的 userid 参数。 (required)
     */
    public V1MeetingsMeetingIdInviteesPutRequestInviteesInner userid(@NotNull String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 调用方用于标示用户的唯一 ID，仅支持邀请与会议创建者同企业的成员（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 企业对接 SSO 时使用的员工唯一标识 ID。 企业调用创建用户接口时传递的 userid 参数。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 调用方用于标示用户的唯一 ID，仅支持邀请与会议创建者同企业的成员（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 企业对接 SSO 时使用的员工唯一标识 ID。 企业调用创建用户接口时传递的 userid 参数。 (required)
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
        V1MeetingsMeetingIdInviteesPutRequestInviteesInner v1MeetingsMeetingIdInviteesPutRequestInviteesInner = (V1MeetingsMeetingIdInviteesPutRequestInviteesInner) o;
        return Objects.equals(this.userid, v1MeetingsMeetingIdInviteesPutRequestInviteesInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid);
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
        sb.append("class V1MeetingsMeetingIdInviteesPutRequestInviteesInner {\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


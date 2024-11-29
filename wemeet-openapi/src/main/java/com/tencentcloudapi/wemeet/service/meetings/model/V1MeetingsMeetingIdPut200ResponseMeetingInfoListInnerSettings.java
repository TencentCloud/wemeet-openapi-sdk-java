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
 * V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings {
    @JsonProperty(value = "change_nickname")
    private Long changeNickname;

    @JsonProperty(value = "only_invitees_allowed")
    private Boolean onlyInviteesAllowed;

    /**
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings() {
    }

    /**
     * @param changeNickname 是否允许用户自己改名 1:允许用户自己改名，2:不允许用户自己改名，默认为1
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings changeNickname(Long changeNickname) {
        this.changeNickname = changeNickname;
        return this;
    }
    /**
     * @return changeNickname 是否允许用户自己改名 1:允许用户自己改名，2:不允许用户自己改名，默认为1
     **/
    public Long getChangeNickname() {
        return changeNickname;
    }

    /**
     * @param changeNickname 是否允许用户自己改名 1:允许用户自己改名，2:不允许用户自己改名，默认为1
     */
    public void setChangeNickname(Long changeNickname) {
        this.changeNickname = changeNickname;
    }
    /**
     * @param onlyInviteesAllowed 是否仅受邀成员可入会，默认值为false，true：仅受邀成员可入会，false：所有成员可入会
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings onlyInviteesAllowed(Boolean onlyInviteesAllowed) {
        this.onlyInviteesAllowed = onlyInviteesAllowed;
        return this;
    }
    /**
     * @return onlyInviteesAllowed 是否仅受邀成员可入会，默认值为false，true：仅受邀成员可入会，false：所有成员可入会
     **/
    public Boolean getOnlyInviteesAllowed() {
        return onlyInviteesAllowed;
    }

    /**
     * @param onlyInviteesAllowed 是否仅受邀成员可入会，默认值为false，true：仅受邀成员可入会，false：所有成员可入会
     */
    public void setOnlyInviteesAllowed(Boolean onlyInviteesAllowed) {
        this.onlyInviteesAllowed = onlyInviteesAllowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings v1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings = (V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings) o;
        return Objects.equals(this.changeNickname, v1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings.changeNickname) &&
            Objects.equals(this.onlyInviteesAllowed, v1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings.onlyInviteesAllowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeNickname, onlyInviteesAllowed);
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
        sb.append("class V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerSettings {\n");
        sb.append("    changeNickname: ").append(toIndentedString(changeNickname)).append("\n");
        sb.append("    onlyInviteesAllowed: ").append(toIndentedString(onlyInviteesAllowed)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

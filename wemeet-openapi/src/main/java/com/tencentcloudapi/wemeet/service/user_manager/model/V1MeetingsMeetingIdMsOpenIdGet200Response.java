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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdMsOpenIdGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdMsOpenIdGet200Response {
    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "ms_open_id")
    private String msOpenId;

    /**
     */
    public V1MeetingsMeetingIdMsOpenIdGet200Response() {
    }

    /**
     * @param meetingId 会议唯一id
     */
    public V1MeetingsMeetingIdMsOpenIdGet200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议唯一id
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议唯一id
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。
     */
    public V1MeetingsMeetingIdMsOpenIdGet200Response msOpenId(String msOpenId) {
        this.msOpenId = msOpenId;
        return this;
    }
    /**
     * @return msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。
     **/
    public String getMsOpenId() {
        return msOpenId;
    }

    /**
     * @param msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。
     */
    public void setMsOpenId(String msOpenId) {
        this.msOpenId = msOpenId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdMsOpenIdGet200Response v1MeetingsMeetingIdMsOpenIdGet200Response = (V1MeetingsMeetingIdMsOpenIdGet200Response) o;
        return Objects.equals(this.meetingId, v1MeetingsMeetingIdMsOpenIdGet200Response.meetingId) &&
            Objects.equals(this.msOpenId, v1MeetingsMeetingIdMsOpenIdGet200Response.msOpenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingId, msOpenId);
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
        sb.append("class V1MeetingsMeetingIdMsOpenIdGet200Response {\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    msOpenId: ").append(toIndentedString(msOpenId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


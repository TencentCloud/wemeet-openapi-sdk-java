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
 * V1MeetingsMeetingIdPut200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdPut200Response {
    @JsonProperty(value = "meeting_info_list")
    private List<V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner> meetingInfoList;

    @JsonProperty(value = "meeting_number")
    private Long meetingNumber;

    /**
     */
    public V1MeetingsMeetingIdPut200Response() {
    }

    /**
     * @param meetingInfoList 会议列表
     */
    public V1MeetingsMeetingIdPut200Response meetingInfoList(List<V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
        return this;
    }
    /**
     * @return meetingInfoList 会议列表
     **/
    public List<V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner> getMeetingInfoList() {
        return meetingInfoList;
    }

    /**
     * @param meetingInfoList 会议列表
     */
    public void setMeetingInfoList(List<V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }
    /**
     * @param meetingNumber 会议数量
     */
    public V1MeetingsMeetingIdPut200Response meetingNumber(Long meetingNumber) {
        this.meetingNumber = meetingNumber;
        return this;
    }
    /**
     * @return meetingNumber 会议数量
     **/
    public Long getMeetingNumber() {
        return meetingNumber;
    }

    /**
     * @param meetingNumber 会议数量
     */
    public void setMeetingNumber(Long meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdPut200Response v1MeetingsMeetingIdPut200Response = (V1MeetingsMeetingIdPut200Response) o;
        return Objects.equals(this.meetingInfoList, v1MeetingsMeetingIdPut200Response.meetingInfoList) &&
            Objects.equals(this.meetingNumber, v1MeetingsMeetingIdPut200Response.meetingNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingInfoList, meetingNumber);
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
        sb.append("class V1MeetingsMeetingIdPut200Response {\n");
        sb.append("    meetingInfoList: ").append(toIndentedString(meetingInfoList)).append("\n");
        sb.append("    meetingNumber: ").append(toIndentedString(meetingNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


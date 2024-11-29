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
 * V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner {
    @JsonProperty(value = "end_time")
    private String endTime;

    @JsonProperty(value = "start_time")
    private String startTime;

    @JsonProperty(value = "status")
    private Long status;

    @JsonProperty(value = "sub_meeting_id")
    private String subMeetingId;

    /**
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner() {
    }

    /**
     * @param endTime 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    /**
     * @return endTime 
     **/
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    /**
     * @param startTime 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    /**
     * @return startTime 
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    /**
     * @param status 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner status(Long status) {
        this.status = status;
        return this;
    }
    /**
     * @return status 
     **/
    public Long getStatus() {
        return status;
    }

    /**
     * @param status 
     */
    public void setStatus(Long status) {
        this.status = status;
    }
    /**
     * @param subMeetingId 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner subMeetingId(String subMeetingId) {
        this.subMeetingId = subMeetingId;
        return this;
    }
    /**
     * @return subMeetingId 
     **/
    public String getSubMeetingId() {
        return subMeetingId;
    }

    /**
     * @param subMeetingId 
     */
    public void setSubMeetingId(String subMeetingId) {
        this.subMeetingId = subMeetingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner = (V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner) o;
        return Objects.equals(this.endTime, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner.endTime) &&
            Objects.equals(this.startTime, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner.startTime) &&
            Objects.equals(this.status, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner.status) &&
            Objects.equals(this.subMeetingId, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner.subMeetingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, startTime, status, subMeetingId);
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
        sb.append("class V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subMeetingId: ").append(toIndentedString(subMeetingId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


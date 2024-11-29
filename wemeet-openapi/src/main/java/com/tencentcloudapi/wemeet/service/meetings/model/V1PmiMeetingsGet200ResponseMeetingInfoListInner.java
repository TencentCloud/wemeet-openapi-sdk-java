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
 * V1PmiMeetingsGet200ResponseMeetingInfoListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1PmiMeetingsGet200ResponseMeetingInfoListInner {
    @JsonProperty(value = "end_time")
    private Long endTime;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "start_time")
    private Long startTime;

    @JsonProperty(value = "status")
    private Long status;

    @JsonProperty(value = "subject")
    private String subject;

    /**
     */
    public V1PmiMeetingsGet200ResponseMeetingInfoListInner() {
    }

    /**
     * @param endTime 会议预订结束时间（UTC 秒）（UTC 秒）
     */
    public V1PmiMeetingsGet200ResponseMeetingInfoListInner endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    /**
     * @return endTime 会议预订结束时间（UTC 秒）（UTC 秒）
     **/
    public Long getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 会议预订结束时间（UTC 秒）（UTC 秒）
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    /**
     * @param meetingCode 有效会议Code
     */
    public V1PmiMeetingsGet200ResponseMeetingInfoListInner meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 有效会议Code
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 有效会议Code
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议 ID
     */
    public V1PmiMeetingsGet200ResponseMeetingInfoListInner meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议 ID
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议 ID
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param startTime 会议预订开始时间（UTC 秒）（UTC 秒）
     */
    public V1PmiMeetingsGet200ResponseMeetingInfoListInner startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    /**
     * @return startTime 会议预订开始时间（UTC 秒）（UTC 秒）
     **/
    public Long getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 会议预订开始时间（UTC 秒）（UTC 秒）
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    /**
     * @param status 会议状态
     */
    public V1PmiMeetingsGet200ResponseMeetingInfoListInner status(Long status) {
        this.status = status;
        return this;
    }
    /**
     * @return status 会议状态
     **/
    public Long getStatus() {
        return status;
    }

    /**
     * @param status 会议状态
     */
    public void setStatus(Long status) {
        this.status = status;
    }
    /**
     * @param subject 会议主题
     */
    public V1PmiMeetingsGet200ResponseMeetingInfoListInner subject(String subject) {
        this.subject = subject;
        return this;
    }
    /**
     * @return subject 会议主题
     **/
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject 会议主题
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1PmiMeetingsGet200ResponseMeetingInfoListInner v1PmiMeetingsGet200ResponseMeetingInfoListInner = (V1PmiMeetingsGet200ResponseMeetingInfoListInner) o;
        return Objects.equals(this.endTime, v1PmiMeetingsGet200ResponseMeetingInfoListInner.endTime) &&
            Objects.equals(this.meetingCode, v1PmiMeetingsGet200ResponseMeetingInfoListInner.meetingCode) &&
            Objects.equals(this.meetingId, v1PmiMeetingsGet200ResponseMeetingInfoListInner.meetingId) &&
            Objects.equals(this.startTime, v1PmiMeetingsGet200ResponseMeetingInfoListInner.startTime) &&
            Objects.equals(this.status, v1PmiMeetingsGet200ResponseMeetingInfoListInner.status) &&
            Objects.equals(this.subject, v1PmiMeetingsGet200ResponseMeetingInfoListInner.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, meetingCode, meetingId, startTime, status, subject);
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
        sb.append("class V1PmiMeetingsGet200ResponseMeetingInfoListInner {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


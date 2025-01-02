/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.5
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
 * V1MeetingsMeetingIdEnrollConfigPut200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollConfigPut200Response {
    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "question_count")
    private Long questionCount;

    /**
     */
    public V1MeetingsMeetingIdEnrollConfigPut200Response() {
    }

    /**
     * @param meetingId 会议的唯一标识
     */
    public V1MeetingsMeetingIdEnrollConfigPut200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议的唯一标识
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议的唯一标识
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param questionCount 报名问题数量，不收集问题时该字段返回0
     */
    public V1MeetingsMeetingIdEnrollConfigPut200Response questionCount(Long questionCount) {
        this.questionCount = questionCount;
        return this;
    }
    /**
     * @return questionCount 报名问题数量，不收集问题时该字段返回0
     **/
    public Long getQuestionCount() {
        return questionCount;
    }

    /**
     * @param questionCount 报名问题数量，不收集问题时该字段返回0
     */
    public void setQuestionCount(Long questionCount) {
        this.questionCount = questionCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdEnrollConfigPut200Response v1MeetingsMeetingIdEnrollConfigPut200Response = (V1MeetingsMeetingIdEnrollConfigPut200Response) o;
        return Objects.equals(this.meetingId, v1MeetingsMeetingIdEnrollConfigPut200Response.meetingId) &&
            Objects.equals(this.questionCount, v1MeetingsMeetingIdEnrollConfigPut200Response.questionCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingId, questionCount);
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
        sb.append("class V1MeetingsMeetingIdEnrollConfigPut200Response {\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


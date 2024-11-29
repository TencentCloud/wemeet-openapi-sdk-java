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
 * V1AsrPushStatusPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AsrPushStatusPostRequest {
    @JsonProperty(value = "is_open", required = true)
    private Boolean isOpen;

    @JsonProperty(value = "meeting_id", required = true)
    private String meetingId;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param isOpen 开启/取消转写内容推送 true：开启推送 false：取消推送 (required)
     * @param meetingId 会议 ID。 (required)
     * @param operatorId 操作者ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     * @param operatorIdType 操作者ID类型： 1：userid 2:openid (required)
     */
    public V1AsrPushStatusPostRequest(@NotNull Boolean isOpen, @NotNull String meetingId, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.isOpen = isOpen;
        this.meetingId = meetingId;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param isOpen 开启/取消转写内容推送 true：开启推送 false：取消推送 (required)
     */
    public V1AsrPushStatusPostRequest isOpen(@NotNull Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    /**
     * @return isOpen 开启/取消转写内容推送 true：开启推送 false：取消推送
     **/
    public Boolean getIsOpen() {
        return isOpen;
    }

    /**
     * @param isOpen 开启/取消转写内容推送 true：开启推送 false：取消推送 (required)
     */
    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }
    /**
     * @param meetingId 会议 ID。 (required)
     */
    public V1AsrPushStatusPostRequest meetingId(@NotNull String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议 ID。
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议 ID。 (required)
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param operatorId 操作者ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public V1AsrPushStatusPostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID类型： 1：userid 2:openid (required)
     */
    public V1AsrPushStatusPostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID类型： 1：userid 2:openid
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID类型： 1：userid 2:openid (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1AsrPushStatusPostRequest v1AsrPushStatusPostRequest = (V1AsrPushStatusPostRequest) o;
        return Objects.equals(this.isOpen, v1AsrPushStatusPostRequest.isOpen) &&
            Objects.equals(this.meetingId, v1AsrPushStatusPostRequest.meetingId) &&
            Objects.equals(this.operatorId, v1AsrPushStatusPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1AsrPushStatusPostRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen, meetingId, operatorId, operatorIdType);
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
        sb.append("class V1AsrPushStatusPostRequest {\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


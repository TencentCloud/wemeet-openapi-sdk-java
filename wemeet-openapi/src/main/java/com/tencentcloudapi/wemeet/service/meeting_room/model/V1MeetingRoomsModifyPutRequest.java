/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingRoomsModifyPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsModifyPutRequest {
    @JsonProperty(value = "instance_id", required = true)
    private Long instanceId;

    @JsonProperty(value = "is_allow_call")
    private Boolean isAllowCall;

    @JsonProperty(value = "meeting_room_id", required = true)
    private String meetingRoomId;

    @JsonProperty(value = "meeting_room_info")
    private V1MeetingRoomsModifyPutRequestMeetingRoomInfo meetingRoomInfo;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "scheduled_status")
    private Boolean scheduledStatus;

    /**
     * @param instanceId  (required)
     * @param meetingRoomId 要设置的会议室 ID。 (required)
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     * @param operatorIdType 操作者 ID 的类型： 1：userid (required)
     */
    public V1MeetingRoomsModifyPutRequest(@NotNull Long instanceId, @NotNull String meetingRoomId, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.instanceId = instanceId;
        this.meetingRoomId = meetingRoomId;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param instanceId  (required)
     */
    public V1MeetingRoomsModifyPutRequest instanceId(@NotNull Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    /**
     * @return instanceId 
     **/
    public Long getInstanceId() {
        return instanceId;
    }

    /**
     * @param instanceId  (required)
     */
    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * @param isAllowCall 是否允许被呼叫
     */
    public V1MeetingRoomsModifyPutRequest isAllowCall(Boolean isAllowCall) {
        this.isAllowCall = isAllowCall;
        return this;
    }
    /**
     * @return isAllowCall 是否允许被呼叫
     **/
    public Boolean getIsAllowCall() {
        return isAllowCall;
    }

    /**
     * @param isAllowCall 是否允许被呼叫
     */
    public void setIsAllowCall(Boolean isAllowCall) {
        this.isAllowCall = isAllowCall;
    }
    /**
     * @param meetingRoomId 要设置的会议室 ID。 (required)
     */
    public V1MeetingRoomsModifyPutRequest meetingRoomId(@NotNull String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
        return this;
    }
    /**
     * @return meetingRoomId 要设置的会议室 ID。
     **/
    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    /**
     * @param meetingRoomId 要设置的会议室 ID。 (required)
     */
    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }
    /**
     * @param meetingRoomInfo 
     */
    public V1MeetingRoomsModifyPutRequest meetingRoomInfo(V1MeetingRoomsModifyPutRequestMeetingRoomInfo meetingRoomInfo) {
        this.meetingRoomInfo = meetingRoomInfo;
        return this;
    }
    /**
     * @return meetingRoomInfo 
     **/
    public V1MeetingRoomsModifyPutRequestMeetingRoomInfo getMeetingRoomInfo() {
        return meetingRoomInfo;
    }

    /**
     * @param meetingRoomInfo 
     */
    public void setMeetingRoomInfo(V1MeetingRoomsModifyPutRequestMeetingRoomInfo meetingRoomInfo) {
        this.meetingRoomInfo = meetingRoomInfo;
    }
    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public V1MeetingRoomsModifyPutRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid (required)
     */
    public V1MeetingRoomsModifyPutRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型： 1：userid
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param scheduledStatus 是否开放预定初始值false
     */
    public V1MeetingRoomsModifyPutRequest scheduledStatus(Boolean scheduledStatus) {
        this.scheduledStatus = scheduledStatus;
        return this;
    }
    /**
     * @return scheduledStatus 是否开放预定初始值false
     **/
    public Boolean getScheduledStatus() {
        return scheduledStatus;
    }

    /**
     * @param scheduledStatus 是否开放预定初始值false
     */
    public void setScheduledStatus(Boolean scheduledStatus) {
        this.scheduledStatus = scheduledStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsModifyPutRequest v1MeetingRoomsModifyPutRequest = (V1MeetingRoomsModifyPutRequest) o;
        return Objects.equals(this.instanceId, v1MeetingRoomsModifyPutRequest.instanceId) &&
            Objects.equals(this.isAllowCall, v1MeetingRoomsModifyPutRequest.isAllowCall) &&
            Objects.equals(this.meetingRoomId, v1MeetingRoomsModifyPutRequest.meetingRoomId) &&
            Objects.equals(this.meetingRoomInfo, v1MeetingRoomsModifyPutRequest.meetingRoomInfo) &&
            Objects.equals(this.operatorId, v1MeetingRoomsModifyPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingRoomsModifyPutRequest.operatorIdType) &&
            Objects.equals(this.scheduledStatus, v1MeetingRoomsModifyPutRequest.scheduledStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, isAllowCall, meetingRoomId, meetingRoomInfo, operatorId, operatorIdType, scheduledStatus);
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
        sb.append("class V1MeetingRoomsModifyPutRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    isAllowCall: ").append(toIndentedString(isAllowCall)).append("\n");
        sb.append("    meetingRoomId: ").append(toIndentedString(meetingRoomId)).append("\n");
        sb.append("    meetingRoomInfo: ").append(toIndentedString(meetingRoomInfo)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    scheduledStatus: ").append(toIndentedString(scheduledStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

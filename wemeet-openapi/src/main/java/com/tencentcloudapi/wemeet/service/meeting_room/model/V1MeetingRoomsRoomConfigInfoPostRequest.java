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

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingRoomsRoomConfigInfoPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsRoomConfigInfoPostRequest {
    @JsonProperty(value = "instance_id", required = true)
    private Long instanceId;

    @JsonProperty(value = "meeting_room_id", required = true)
    private String meetingRoomId;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param instanceId 设备类型 ID (required)
     * @param meetingRoomId 会议室 ID。 (required)
     * @param operatorId 操作者 ID。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     * @param operatorIdType 操作者 ID 的类型： 1：userid (required)
     */
    public V1MeetingRoomsRoomConfigInfoPostRequest(@NotNull Long instanceId, @NotNull String meetingRoomId, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.instanceId = instanceId;
        this.meetingRoomId = meetingRoomId;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param instanceId 设备类型 ID (required)
     */
    public V1MeetingRoomsRoomConfigInfoPostRequest instanceId(@NotNull Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    /**
     * @return instanceId 设备类型 ID
     **/
    public Long getInstanceId() {
        return instanceId;
    }

    /**
     * @param instanceId 设备类型 ID (required)
     */
    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * @param meetingRoomId 会议室 ID。 (required)
     */
    public V1MeetingRoomsRoomConfigInfoPostRequest meetingRoomId(@NotNull String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
        return this;
    }
    /**
     * @return meetingRoomId 会议室 ID。
     **/
    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    /**
     * @param meetingRoomId 会议室 ID。 (required)
     */
    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }
    /**
     * @param operatorId 操作者 ID。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public V1MeetingRoomsRoomConfigInfoPostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid (required)
     */
    public V1MeetingRoomsRoomConfigInfoPostRequest operatorIdType(@NotNull Long operatorIdType) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsRoomConfigInfoPostRequest v1MeetingRoomsRoomConfigInfoPostRequest = (V1MeetingRoomsRoomConfigInfoPostRequest) o;
        return Objects.equals(this.instanceId, v1MeetingRoomsRoomConfigInfoPostRequest.instanceId) &&
            Objects.equals(this.meetingRoomId, v1MeetingRoomsRoomConfigInfoPostRequest.meetingRoomId) &&
            Objects.equals(this.operatorId, v1MeetingRoomsRoomConfigInfoPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingRoomsRoomConfigInfoPostRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, meetingRoomId, operatorId, operatorIdType);
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
        sb.append("class V1MeetingRoomsRoomConfigInfoPostRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    meetingRoomId: ").append(toIndentedString(meetingRoomId)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


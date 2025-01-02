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

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingRoomsCancelRoomCallPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsCancelRoomCallPutRequest {
    @JsonProperty(value = "instance_id", required = true)
    private Long instanceId;

    @JsonProperty(value = "invite_id", required = true)
    private String inviteId;

    @JsonProperty(value = "meeting_id", required = true)
    private String meetingId;

    @JsonProperty(value = "meeting_room_id")
    private String meetingRoomId;

    @JsonProperty(value = "mra_address")
    private V1MeetingRoomsCancelRoomCallPutRequestMraAddress mraAddress;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param instanceId  (required)
     * @param inviteId 呼叫ID (required)
     * @param meetingId 会议ID (required)
     * @param operatorId  (required)
     * @param operatorIdType 操作者 ID 的类型： 1：userid (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequest(@NotNull Long instanceId, @NotNull String inviteId, @NotNull String meetingId, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.instanceId = instanceId;
        this.inviteId = inviteId;
        this.meetingId = meetingId;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param instanceId  (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequest instanceId(@NotNull Long instanceId) {
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
     * @param inviteId 呼叫ID (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequest inviteId(@NotNull String inviteId) {
        this.inviteId = inviteId;
        return this;
    }
    /**
     * @return inviteId 呼叫ID
     **/
    public String getInviteId() {
        return inviteId;
    }

    /**
     * @param inviteId 呼叫ID (required)
     */
    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }
    /**
     * @param meetingId 会议ID (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequest meetingId(@NotNull String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议ID
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议ID (required)
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param meetingRoomId 会议室 ID，与 mra_address 二选一。
     */
    public V1MeetingRoomsCancelRoomCallPutRequest meetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
        return this;
    }
    /**
     * @return meetingRoomId 会议室 ID，与 mra_address 二选一。
     **/
    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    /**
     * @param meetingRoomId 会议室 ID，与 mra_address 二选一。
     */
    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }
    /**
     * @param mraAddress 
     */
    public V1MeetingRoomsCancelRoomCallPutRequest mraAddress(V1MeetingRoomsCancelRoomCallPutRequestMraAddress mraAddress) {
        this.mraAddress = mraAddress;
        return this;
    }
    /**
     * @return mraAddress 
     **/
    public V1MeetingRoomsCancelRoomCallPutRequestMraAddress getMraAddress() {
        return mraAddress;
    }

    /**
     * @param mraAddress 
     */
    public void setMraAddress(V1MeetingRoomsCancelRoomCallPutRequestMraAddress mraAddress) {
        this.mraAddress = mraAddress;
    }
    /**
     * @param operatorId  (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId  (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequest operatorIdType(@NotNull Long operatorIdType) {
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
        V1MeetingRoomsCancelRoomCallPutRequest v1MeetingRoomsCancelRoomCallPutRequest = (V1MeetingRoomsCancelRoomCallPutRequest) o;
        return Objects.equals(this.instanceId, v1MeetingRoomsCancelRoomCallPutRequest.instanceId) &&
            Objects.equals(this.inviteId, v1MeetingRoomsCancelRoomCallPutRequest.inviteId) &&
            Objects.equals(this.meetingId, v1MeetingRoomsCancelRoomCallPutRequest.meetingId) &&
            Objects.equals(this.meetingRoomId, v1MeetingRoomsCancelRoomCallPutRequest.meetingRoomId) &&
            Objects.equals(this.mraAddress, v1MeetingRoomsCancelRoomCallPutRequest.mraAddress) &&
            Objects.equals(this.operatorId, v1MeetingRoomsCancelRoomCallPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingRoomsCancelRoomCallPutRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, inviteId, meetingId, meetingRoomId, mraAddress, operatorId, operatorIdType);
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
        sb.append("class V1MeetingRoomsCancelRoomCallPutRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    meetingRoomId: ").append(toIndentedString(meetingRoomId)).append("\n");
        sb.append("    mraAddress: ").append(toIndentedString(mraAddress)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


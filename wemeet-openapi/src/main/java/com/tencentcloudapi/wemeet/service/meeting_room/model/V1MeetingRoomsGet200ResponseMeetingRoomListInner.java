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
 * V1MeetingRoomsGet200ResponseMeetingRoomListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsGet200ResponseMeetingRoomListInner {
    @JsonProperty(value = "account_new_type")
    private Long accountNewType;

    @JsonProperty(value = "account_type")
    private Long accountType;

    @JsonProperty(value = "active_code")
    private String activeCode;

    @JsonProperty(value = "is_allow_call")
    private Boolean isAllowCall;

    @JsonProperty(value = "meeting_room_id")
    private String meetingRoomId;

    @JsonProperty(value = "meeting_room_location")
    private String meetingRoomLocation;

    @JsonProperty(value = "meeting_room_name")
    private String meetingRoomName;

    @JsonProperty(value = "meeting_room_status")
    private Long meetingRoomStatus;

    @JsonProperty(value = "participant_number")
    private Long participantNumber;

    @JsonProperty(value = "scheduled_status")
    private Long scheduledStatus;

    /**
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner() {
    }

    /**
     * @param accountNewType 0:基础版账号 1:专业版账号
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner accountNewType(Long accountNewType) {
        this.accountNewType = accountNewType;
        return this;
    }
    /**
     * @return accountNewType 0:基础版账号 1:专业版账号
     **/
    public Long getAccountNewType() {
        return accountNewType;
    }

    /**
     * @param accountNewType 0:基础版账号 1:专业版账号
     */
    public void setAccountNewType(Long accountNewType) {
        this.accountNewType = accountNewType;
    }
    /**
     * @param accountType 账号类型0:普通，1:专款，2:试用
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner accountType(Long accountType) {
        this.accountType = accountType;
        return this;
    }
    /**
     * @return accountType 账号类型0:普通，1:专款，2:试用
     **/
    public Long getAccountType() {
        return accountType;
    }

    /**
     * @param accountType 账号类型0:普通，1:专款，2:试用
     */
    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }
    /**
     * @param activeCode 激活码
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner activeCode(String activeCode) {
        this.activeCode = activeCode;
        return this;
    }
    /**
     * @return activeCode 激活码
     **/
    public String getActiveCode() {
        return activeCode;
    }

    /**
     * @param activeCode 激活码
     */
    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }
    /**
     * @param isAllowCall 是否允许被呼叫
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner isAllowCall(Boolean isAllowCall) {
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
     * @param meetingRoomId 会议室ID
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner meetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
        return this;
    }
    /**
     * @return meetingRoomId 会议室ID
     **/
    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    /**
     * @param meetingRoomId 会议室ID
     */
    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }
    /**
     * @param meetingRoomLocation 会议室地址
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner meetingRoomLocation(String meetingRoomLocation) {
        this.meetingRoomLocation = meetingRoomLocation;
        return this;
    }
    /**
     * @return meetingRoomLocation 会议室地址
     **/
    public String getMeetingRoomLocation() {
        return meetingRoomLocation;
    }

    /**
     * @param meetingRoomLocation 会议室地址
     */
    public void setMeetingRoomLocation(String meetingRoomLocation) {
        this.meetingRoomLocation = meetingRoomLocation;
    }
    /**
     * @param meetingRoomName 会议室名称
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner meetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
        return this;
    }
    /**
     * @return meetingRoomName 会议室名称
     **/
    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    /**
     * @param meetingRoomName 会议室名称
     */
    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
    }
    /**
     * @param meetingRoomStatus 会议室状态0:未激活，1:未绑定，2:空闲，3:试用中，4:离线，5:未登录
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner meetingRoomStatus(Long meetingRoomStatus) {
        this.meetingRoomStatus = meetingRoomStatus;
        return this;
    }
    /**
     * @return meetingRoomStatus 会议室状态0:未激活，1:未绑定，2:空闲，3:试用中，4:离线，5:未登录
     **/
    public Long getMeetingRoomStatus() {
        return meetingRoomStatus;
    }

    /**
     * @param meetingRoomStatus 会议室状态0:未激活，1:未绑定，2:空闲，3:试用中，4:离线，5:未登录
     */
    public void setMeetingRoomStatus(Long meetingRoomStatus) {
        this.meetingRoomStatus = meetingRoomStatus;
    }
    /**
     * @param participantNumber 容纳人数
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner participantNumber(Long participantNumber) {
        this.participantNumber = participantNumber;
        return this;
    }
    /**
     * @return participantNumber 容纳人数
     **/
    public Long getParticipantNumber() {
        return participantNumber;
    }

    /**
     * @param participantNumber 容纳人数
     */
    public void setParticipantNumber(Long participantNumber) {
        this.participantNumber = participantNumber;
    }
    /**
     * @param scheduledStatus 预定状态
     */
    public V1MeetingRoomsGet200ResponseMeetingRoomListInner scheduledStatus(Long scheduledStatus) {
        this.scheduledStatus = scheduledStatus;
        return this;
    }
    /**
     * @return scheduledStatus 预定状态
     **/
    public Long getScheduledStatus() {
        return scheduledStatus;
    }

    /**
     * @param scheduledStatus 预定状态
     */
    public void setScheduledStatus(Long scheduledStatus) {
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
        V1MeetingRoomsGet200ResponseMeetingRoomListInner v1MeetingRoomsGet200ResponseMeetingRoomListInner = (V1MeetingRoomsGet200ResponseMeetingRoomListInner) o;
        return Objects.equals(this.accountNewType, v1MeetingRoomsGet200ResponseMeetingRoomListInner.accountNewType) &&
            Objects.equals(this.accountType, v1MeetingRoomsGet200ResponseMeetingRoomListInner.accountType) &&
            Objects.equals(this.activeCode, v1MeetingRoomsGet200ResponseMeetingRoomListInner.activeCode) &&
            Objects.equals(this.isAllowCall, v1MeetingRoomsGet200ResponseMeetingRoomListInner.isAllowCall) &&
            Objects.equals(this.meetingRoomId, v1MeetingRoomsGet200ResponseMeetingRoomListInner.meetingRoomId) &&
            Objects.equals(this.meetingRoomLocation, v1MeetingRoomsGet200ResponseMeetingRoomListInner.meetingRoomLocation) &&
            Objects.equals(this.meetingRoomName, v1MeetingRoomsGet200ResponseMeetingRoomListInner.meetingRoomName) &&
            Objects.equals(this.meetingRoomStatus, v1MeetingRoomsGet200ResponseMeetingRoomListInner.meetingRoomStatus) &&
            Objects.equals(this.participantNumber, v1MeetingRoomsGet200ResponseMeetingRoomListInner.participantNumber) &&
            Objects.equals(this.scheduledStatus, v1MeetingRoomsGet200ResponseMeetingRoomListInner.scheduledStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNewType, accountType, activeCode, isAllowCall, meetingRoomId, meetingRoomLocation, meetingRoomName, meetingRoomStatus, participantNumber, scheduledStatus);
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
        sb.append("class V1MeetingRoomsGet200ResponseMeetingRoomListInner {\n");
        sb.append("    accountNewType: ").append(toIndentedString(accountNewType)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    activeCode: ").append(toIndentedString(activeCode)).append("\n");
        sb.append("    isAllowCall: ").append(toIndentedString(isAllowCall)).append("\n");
        sb.append("    meetingRoomId: ").append(toIndentedString(meetingRoomId)).append("\n");
        sb.append("    meetingRoomLocation: ").append(toIndentedString(meetingRoomLocation)).append("\n");
        sb.append("    meetingRoomName: ").append(toIndentedString(meetingRoomName)).append("\n");
        sb.append("    meetingRoomStatus: ").append(toIndentedString(meetingRoomStatus)).append("\n");
        sb.append("    participantNumber: ").append(toIndentedString(participantNumber)).append("\n");
        sb.append("    scheduledStatus: ").append(toIndentedString(scheduledStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


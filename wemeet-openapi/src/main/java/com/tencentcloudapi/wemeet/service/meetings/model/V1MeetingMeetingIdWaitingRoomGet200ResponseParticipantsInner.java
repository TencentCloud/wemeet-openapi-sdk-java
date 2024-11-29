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
 * V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner {
    @JsonProperty(value = "app_version")
    private String appVersion;

    @JsonProperty(value = "customer_data")
    private String customerData;

    @JsonProperty(value = "instanceid")
    private String instanceid;

    @JsonProperty(value = "join_time")
    private Long joinTime;

    @JsonProperty(value = "left_time")
    private Long leftTime;

    @JsonProperty(value = "ms_open_id")
    private String msOpenId;

    @JsonProperty(value = "open_id")
    private String openId;

    @JsonProperty(value = "user_name")
    private String userName;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner() {
    }

    /**
     * @param appVersion 应用版本
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    /**
     * @return appVersion 应用版本
     **/
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * @param appVersion 应用版本
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
    /**
     * @param customerData 专属链接进入等候室的昵称
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner customerData(String customerData) {
        this.customerData = customerData;
        return this;
    }
    /**
     * @return customerData 专属链接进入等候室的昵称
     **/
    public String getCustomerData() {
        return customerData;
    }

    /**
     * @param customerData 专属链接进入等候室的昵称
     */
    public void setCustomerData(String customerData) {
        this.customerData = customerData;
    }
    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner instanceid(String instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     **/
    public String getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     */
    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param joinTime 加入时间（单位：毫秒）
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner joinTime(Long joinTime) {
        this.joinTime = joinTime;
        return this;
    }
    /**
     * @return joinTime 加入时间（单位：毫秒）
     **/
    public Long getJoinTime() {
        return joinTime;
    }

    /**
     * @param joinTime 加入时间（单位：毫秒）
     */
    public void setJoinTime(Long joinTime) {
        this.joinTime = joinTime;
    }
    /**
     * @param leftTime 离开时间（单位：毫秒）
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner leftTime(Long leftTime) {
        this.leftTime = leftTime;
        return this;
    }
    /**
     * @return leftTime 离开时间（单位：毫秒）
     **/
    public Long getLeftTime() {
        return leftTime;
    }

    /**
     * @param leftTime 离开时间（单位：毫秒）
     */
    public void setLeftTime(Long leftTime) {
        this.leftTime = leftTime;
    }
    /**
     * @param msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。 
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner msOpenId(String msOpenId) {
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
    /**
     * @param openId OAuth2.0 鉴权用户的ID。
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner openId(String openId) {
        this.openId = openId;
        return this;
    }
    /**
     * @return openId OAuth2.0 鉴权用户的ID。
     **/
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId OAuth2.0 鉴权用户的ID。
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**
     * @param userName 入会用户名（base64）
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner userName(String userName) {
        this.userName = userName;
        return this;
    }
    /**
     * @return userName 入会用户名（base64）
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName 入会用户名（base64）
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @param userid 成员用户 ID
     */
    public V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 成员用户 ID
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 成员用户 ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner = (V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner) o;
        return Objects.equals(this.appVersion, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.appVersion) &&
            Objects.equals(this.customerData, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.customerData) &&
            Objects.equals(this.instanceid, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.instanceid) &&
            Objects.equals(this.joinTime, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.joinTime) &&
            Objects.equals(this.leftTime, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.leftTime) &&
            Objects.equals(this.msOpenId, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.msOpenId) &&
            Objects.equals(this.openId, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.openId) &&
            Objects.equals(this.userName, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.userName) &&
            Objects.equals(this.userid, v1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appVersion, customerData, instanceid, joinTime, leftTime, msOpenId, openId, userName, userid);
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
        sb.append("class V1MeetingMeetingIdWaitingRoomGet200ResponseParticipantsInner {\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    customerData: ").append(toIndentedString(customerData)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
        sb.append("    leftTime: ").append(toIndentedString(leftTime)).append("\n");
        sb.append("    msOpenId: ").append(toIndentedString(msOpenId)).append("\n");
        sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


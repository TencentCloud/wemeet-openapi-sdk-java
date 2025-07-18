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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner {
    @JsonProperty(value = "app_version")
    private String appVersion;

    @JsonProperty(value = "audio_state")
    private Boolean audioState;

    @JsonProperty(value = "customer_data")
    private String customerData;

    @JsonProperty(value = "instanceid")
    private Long instanceid;

    @JsonProperty(value = "join_time")
    private String joinTime;

    @JsonProperty(value = "join_type")
    private Long joinType;

    @JsonProperty(value = "ms_open_id")
    private String msOpenId;

    @JsonProperty(value = "open_id")
    private String openId;

    @JsonProperty(value = "screen_shared_state")
    private Boolean screenSharedState;

    @JsonProperty(value = "user_name")
    private String userName;

    @JsonProperty(value = "user_role")
    private Long userRole;

    @JsonProperty(value = "userid")
    private String userid;

    @JsonProperty(value = "video_state")
    private Boolean videoState;

    /**
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner() {
    }

    /**
     * @param appVersion 用户的客户端版本。当用户在会中时才能返回。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    /**
     * @return appVersion 用户的客户端版本。当用户在会中时才能返回。
     **/
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * @param appVersion 用户的客户端版本。当用户在会中时才能返回。
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
    /**
     * @param audioState 麦克风状态： true：开启 false：关闭
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner audioState(Boolean audioState) {
        this.audioState = audioState;
        return this;
    }
    /**
     * @return audioState 麦克风状态： true：开启 false：关闭
     **/
    public Boolean getAudioState() {
        return audioState;
    }

    /**
     * @param audioState 麦克风状态： true：开启 false：关闭
     */
    public void setAudioState(Boolean audioState) {
        this.audioState = audioState;
    }
    /**
     * @param customerData 
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner customerData(String customerData) {
        this.customerData = customerData;
        return this;
    }
    /**
     * @return customerData 
     **/
    public String getCustomerData() {
        return customerData;
    }

    /**
     * @param customerData 
     */
    public void setCustomerData(String customerData) {
        this.customerData = customerData;
    }
    /**
     * @param instanceid 用户的终端设备类型： 0:pstn或mra 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner instanceid(Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 0:pstn或mra 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0:pstn或mra 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param joinTime 参会者加入会议时间戳（单位秒）。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner joinTime(String joinTime) {
        this.joinTime = joinTime;
        return this;
    }
    /**
     * @return joinTime 参会者加入会议时间戳（单位秒）。
     **/
    public String getJoinTime() {
        return joinTime;
    }

    /**
     * @param joinTime 参会者加入会议时间戳（单位秒）。
     */
    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }
    /**
     * @param joinType 入会方式： 0：PSTN 普通用户，标准的手机或固话类型 1：普通 VOIP 用户 2：附属投屏 VOIP 3：linux sdk for VOIP 4：附属语音 PSTN 5：附属视频 PSTN 6：linux sdk for PSTN
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner joinType(Long joinType) {
        this.joinType = joinType;
        return this;
    }
    /**
     * @return joinType 入会方式： 0：PSTN 普通用户，标准的手机或固话类型 1：普通 VOIP 用户 2：附属投屏 VOIP 3：linux sdk for VOIP 4：附属语音 PSTN 5：附属视频 PSTN 6：linux sdk for PSTN
     **/
    public Long getJoinType() {
        return joinType;
    }

    /**
     * @param joinType 入会方式： 0：PSTN 普通用户，标准的手机或固话类型 1：普通 VOIP 用户 2：附属投屏 VOIP 3：linux sdk for VOIP 4：附属语音 PSTN 5：附属视频 PSTN 6：linux sdk for PSTN
     */
    public void setJoinType(Long joinType) {
        this.joinType = joinType;
    }
    /**
     * @param msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner msOpenId(String msOpenId) {
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
     * @param openId OAuth2.0 鉴权用户请使用 open_id
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner openId(String openId) {
        this.openId = openId;
        return this;
    }
    /**
     * @return openId OAuth2.0 鉴权用户请使用 open_id
     **/
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId OAuth2.0 鉴权用户请使用 open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**
     * @param screenSharedState 屏幕共享状态： true：开启 false：关闭
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner screenSharedState(Boolean screenSharedState) {
        this.screenSharedState = screenSharedState;
        return this;
    }
    /**
     * @return screenSharedState 屏幕共享状态： true：开启 false：关闭
     **/
    public Boolean getScreenSharedState() {
        return screenSharedState;
    }

    /**
     * @param screenSharedState 屏幕共享状态： true：开启 false：关闭
     */
    public void setScreenSharedState(Boolean screenSharedState) {
        this.screenSharedState = screenSharedState;
    }
    /**
     * @param userName 入会用户名（base64）。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner userName(String userName) {
        this.userName = userName;
        return this;
    }
    /**
     * @return userName 入会用户名（base64）。
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName 入会用户名（base64）。
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @param userRole 用户角色： 0：普通成员角色 1：创建者角色 2：主持人 3：创建者+主持人 4：游客 5：游客+主持人 6：联席主持人 7：创建者+联席主持人
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner userRole(Long userRole) {
        this.userRole = userRole;
        return this;
    }
    /**
     * @return userRole 用户角色： 0：普通成员角色 1：创建者角色 2：主持人 3：创建者+主持人 4：游客 5：游客+主持人 6：联席主持人 7：创建者+联席主持人
     **/
    public Long getUserRole() {
        return userRole;
    }

    /**
     * @param userRole 用户角色： 0：普通成员角色 1：创建者角色 2：主持人 3：创建者+主持人 4：游客 5：游客+主持人 6：联席主持人 7：创建者+联席主持人
     */
    public void setUserRole(Long userRole) {
        this.userRole = userRole;
    }
    /**
     * @param userid 同企业内部请使用企业唯一用户标识； 其他企业，个人，小程序没有
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 同企业内部请使用企业唯一用户标识； 其他企业，个人，小程序没有
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 同企业内部请使用企业唯一用户标识； 其他企业，个人，小程序没有
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param videoState 摄像头状态： true：开启 false：关闭
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner videoState(Boolean videoState) {
        this.videoState = videoState;
        return this;
    }
    /**
     * @return videoState 摄像头状态： true：开启 false：关闭
     **/
    public Boolean getVideoState() {
        return videoState;
    }

    /**
     * @param videoState 摄像头状态： true：开启 false：关闭
     */
    public void setVideoState(Boolean videoState) {
        this.videoState = videoState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner = (V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner) o;
        return Objects.equals(this.appVersion, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.appVersion) &&
            Objects.equals(this.audioState, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.audioState) &&
            Objects.equals(this.customerData, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.customerData) &&
            Objects.equals(this.instanceid, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.instanceid) &&
            Objects.equals(this.joinTime, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.joinTime) &&
            Objects.equals(this.joinType, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.joinType) &&
            Objects.equals(this.msOpenId, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.msOpenId) &&
            Objects.equals(this.openId, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.openId) &&
            Objects.equals(this.screenSharedState, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.screenSharedState) &&
            Objects.equals(this.userName, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.userName) &&
            Objects.equals(this.userRole, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.userRole) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.userid) &&
            Objects.equals(this.videoState, v1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner.videoState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appVersion, audioState, customerData, instanceid, joinTime, joinType, msOpenId, openId, screenSharedState, userName, userRole, userid, videoState);
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
        sb.append("class V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner {\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    audioState: ").append(toIndentedString(audioState)).append("\n");
        sb.append("    customerData: ").append(toIndentedString(customerData)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
        sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
        sb.append("    msOpenId: ").append(toIndentedString(msOpenId)).append("\n");
        sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
        sb.append("    screenSharedState: ").append(toIndentedString(screenSharedState)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    videoState: ").append(toIndentedString(videoState)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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
 * V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner {
    @JsonProperty(value = "app_version")
    private String appVersion;

    @JsonProperty(value = "audio_state")
    private Boolean audioState;

    @JsonProperty(value = "customer_data")
    private String customerData;

    @JsonProperty(value = "instanceid")
    private Long instanceid;

    @JsonProperty(value = "ip")
    private String ip;

    @JsonProperty(value = "join_time")
    private String joinTime;

    @JsonProperty(value = "join_type")
    private Long joinType;

    @JsonProperty(value = "left_time")
    private String leftTime;

    @JsonProperty(value = "link_type")
    private String linkType;

    @JsonProperty(value = "location")
    private String location;

    @JsonProperty(value = "ms_open_id")
    private String msOpenId;

    @JsonProperty(value = "net")
    private String net;

    @JsonProperty(value = "open_id")
    private String openId;

    @JsonProperty(value = "phone")
    private String phone;

    @JsonProperty(value = "screen_shared_state")
    private Boolean screenSharedState;

    @JsonProperty(value = "user_name")
    private String userName;

    @JsonProperty(value = "user_role")
    private Long userRole;

    @JsonProperty(value = "userid")
    private String userid;

    @JsonProperty(value = "uuid")
    private String uuid;

    @JsonProperty(value = "video_state")
    private Boolean videoState;

    @JsonProperty(value = "webinar_member_role")
    private Long webinarMemberRole;

    /**
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner() {
    }

    /**
     * @param appVersion 用户的客户端版本。当用户在会中时才能返回。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner appVersion(String appVersion) {
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
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner audioState(Boolean audioState) {
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
     * @param customerData 专属字段
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner customerData(String customerData) {
        this.customerData = customerData;
        return this;
    }
    /**
     * @return customerData 专属字段
     **/
    public String getCustomerData() {
        return customerData;
    }

    /**
     * @param customerData 专属字段
     */
    public void setCustomerData(String customerData) {
        this.customerData = customerData;
    }
    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备（即MRA设备） 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS/iPadOS
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner instanceid(Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备（即MRA设备） 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS/iPadOS
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备（即MRA设备） 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS/iPadOS
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param ip 用户的 IP 地址。当用户在会中时才能返回。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner ip(String ip) {
        this.ip = ip;
        return this;
    }
    /**
     * @return ip 用户的 IP 地址。当用户在会中时才能返回。
     **/
    public String getIp() {
        return ip;
    }

    /**
     * @param ip 用户的 IP 地址。当用户在会中时才能返回。
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    /**
     * @param joinTime 参会者加入会议时间戳（单位秒）。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner joinTime(String joinTime) {
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
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner joinType(Long joinType) {
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
     * @param leftTime 参会者离开会议时间戳（单位秒）。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner leftTime(String leftTime) {
        this.leftTime = leftTime;
        return this;
    }
    /**
     * @return leftTime 参会者离开会议时间戳（单位秒）。
     **/
    public String getLeftTime() {
        return leftTime;
    }

    /**
     * @param leftTime 参会者离开会议时间戳（单位秒）。
     */
    public void setLeftTime(String leftTime) {
        this.leftTime = leftTime;
    }
    /**
     * @param linkType 用户的连接方式：UDP、TCP、未知，当用户在会中时才能返回。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner linkType(String linkType) {
        this.linkType = linkType;
        return this;
    }
    /**
     * @return linkType 用户的连接方式：UDP、TCP、未知，当用户在会中时才能返回。
     **/
    public String getLinkType() {
        return linkType;
    }

    /**
     * @param linkType 用户的连接方式：UDP、TCP、未知，当用户在会中时才能返回。
     */
    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }
    /**
     * @param location 用户的地理位置信息。当用户在会中时才能返回。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner location(String location) {
        this.location = location;
        return this;
    }
    /**
     * @return location 用户的地理位置信息。当用户在会中时才能返回。
     **/
    public String getLocation() {
        return location;
    }

    /**
     * @param location 用户的地理位置信息。当用户在会中时才能返回。
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * @param msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner msOpenId(String msOpenId) {
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
     * @param net 网络类型：有线、WIFI、2G、3G、4G、未知。当用户在会中时才能返回。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner net(String net) {
        this.net = net;
        return this;
    }
    /**
     * @return net 网络类型：有线、WIFI、2G、3G、4G、未知。当用户在会中时才能返回。
     **/
    public String getNet() {
        return net;
    }

    /**
     * @param net 网络类型：有线、WIFI、2G、3G、4G、未知。当用户在会中时才能返回。
     */
    public void setNet(String net) {
        this.net = net;
    }
    /**
     * @param openId 
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner openId(String openId) {
        this.openId = openId;
        return this;
    }
    /**
     * @return openId 
     **/
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId 
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**
     * @param phone 参会者手机号 hash 值 SHA256（手机号 + \&quot;/\&quot; + secretid）。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner phone(String phone) {
        this.phone = phone;
        return this;
    }
    /**
     * @return phone 参会者手机号 hash 值 SHA256（手机号 + \&quot;/\&quot; + secretid）。
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 参会者手机号 hash 值 SHA256（手机号 + \&quot;/\&quot; + secretid）。
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * @param screenSharedState 屏幕共享状态： true：开启 false：关闭
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner screenSharedState(Boolean screenSharedState) {
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
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner userName(String userName) {
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
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner userRole(Long userRole) {
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
     * @param userid 参会者用户 ID。 使用企业自建应用鉴权方式（JWT）时，该值为企业唯一用户标识。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 参会者用户 ID。 使用企业自建应用鉴权方式（JWT）时，该值为企业唯一用户标识。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 参会者用户 ID。 使用企业自建应用鉴权方式（JWT）时，该值为企业唯一用户标识。
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param uuid 用户的身份 ID，仅适用于单场会议。
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    /**
     * @return uuid 用户的身份 ID，仅适用于单场会议。
     **/
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid 用户的身份 ID，仅适用于单场会议。
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    /**
     * @param videoState 摄像头状态： true：开启 false：关闭
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner videoState(Boolean videoState) {
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
    /**
     * @param webinarMemberRole 网络研讨会成员角色： 0：普通参会角色 1：内部嘉宾 2：外部嘉宾 3：邀请链接入会嘉宾 4：观众 5：有音视频权限的研讨会观众
     */
    public V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner webinarMemberRole(Long webinarMemberRole) {
        this.webinarMemberRole = webinarMemberRole;
        return this;
    }
    /**
     * @return webinarMemberRole 网络研讨会成员角色： 0：普通参会角色 1：内部嘉宾 2：外部嘉宾 3：邀请链接入会嘉宾 4：观众 5：有音视频权限的研讨会观众
     **/
    public Long getWebinarMemberRole() {
        return webinarMemberRole;
    }

    /**
     * @param webinarMemberRole 网络研讨会成员角色： 0：普通参会角色 1：内部嘉宾 2：外部嘉宾 3：邀请链接入会嘉宾 4：观众 5：有音视频权限的研讨会观众
     */
    public void setWebinarMemberRole(Long webinarMemberRole) {
        this.webinarMemberRole = webinarMemberRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner = (V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner) o;
        return Objects.equals(this.appVersion, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.appVersion) &&
            Objects.equals(this.audioState, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.audioState) &&
            Objects.equals(this.customerData, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.customerData) &&
            Objects.equals(this.instanceid, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.instanceid) &&
            Objects.equals(this.ip, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.ip) &&
            Objects.equals(this.joinTime, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.joinTime) &&
            Objects.equals(this.joinType, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.joinType) &&
            Objects.equals(this.leftTime, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.leftTime) &&
            Objects.equals(this.linkType, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.linkType) &&
            Objects.equals(this.location, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.location) &&
            Objects.equals(this.msOpenId, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.msOpenId) &&
            Objects.equals(this.net, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.net) &&
            Objects.equals(this.openId, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.openId) &&
            Objects.equals(this.phone, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.phone) &&
            Objects.equals(this.screenSharedState, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.screenSharedState) &&
            Objects.equals(this.userName, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.userName) &&
            Objects.equals(this.userRole, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.userRole) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.userid) &&
            Objects.equals(this.uuid, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.uuid) &&
            Objects.equals(this.videoState, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.videoState) &&
            Objects.equals(this.webinarMemberRole, v1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner.webinarMemberRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appVersion, audioState, customerData, instanceid, ip, joinTime, joinType, leftTime, linkType, location, msOpenId, net, openId, phone, screenSharedState, userName, userRole, userid, uuid, videoState, webinarMemberRole);
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
        sb.append("class V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner {\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    audioState: ").append(toIndentedString(audioState)).append("\n");
        sb.append("    customerData: ").append(toIndentedString(customerData)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
        sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
        sb.append("    leftTime: ").append(toIndentedString(leftTime)).append("\n");
        sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    msOpenId: ").append(toIndentedString(msOpenId)).append("\n");
        sb.append("    net: ").append(toIndentedString(net)).append("\n");
        sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    screenSharedState: ").append(toIndentedString(screenSharedState)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    videoState: ").append(toIndentedString(videoState)).append("\n");
        sb.append("    webinarMemberRole: ").append(toIndentedString(webinarMemberRole)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


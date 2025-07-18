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

package com.tencentcloudapi.wemeet.service.meeting_control.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RealControlMeetingsMeetingIdStatusPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RealControlMeetingsMeetingIdStatusPutRequest {
    @JsonProperty(value = "allow_chat")
    private Long allowChat;

    @JsonProperty(value = "allow_unmute_by_self")
    private Boolean allowUnmuteBySelf;

    @JsonProperty(value = "auto_waiting_room")
    private Boolean autoWaitingRoom;

    @JsonProperty(value = "enable_red_envelope")
    private Boolean enableRedEnvelope;

    @JsonProperty(value = "hide_meeting_code_password")
    private Boolean hideMeetingCodePassword;

    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "meeting_locked")
    private Boolean meetingLocked;

    @JsonProperty(value = "mute_all")
    private Boolean muteAll;

    @JsonProperty(value = "only_enterprise_user_allowed")
    private Boolean onlyEnterpriseUserAllowed;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type")
    private Long operatorIdType;

    @JsonProperty(value = "participant_join_mute")
    private Long participantJoinMute;

    @JsonProperty(value = "play_ivr_on_join")
    private Boolean playIvrOnJoin;

    @JsonProperty(value = "share_screen")
    private Boolean shareScreen;

    /**
     * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest(@NotNull Long instanceid) {
        this.instanceid = instanceid;
    }

    /**
     * @param allowChat 允许参会者聊天设置  0:允许参会者自由聊天  1:仅允许参会者公开聊天  2:只允许支持人发言
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest allowChat(Long allowChat) {
        this.allowChat = allowChat;
        return this;
    }
    /**
     * @return allowChat 允许参会者聊天设置  0:允许参会者自由聊天  1:仅允许参会者公开聊天  2:只允许支持人发言
     **/
    public Long getAllowChat() {
        return allowChat;
    }

    /**
     * @param allowChat 允许参会者聊天设置  0:允许参会者自由聊天  1:仅允许参会者公开聊天  2:只允许支持人发言
     */
    public void setAllowChat(Long allowChat) {
        this.allowChat = allowChat;
    }
    /**
     * @param allowUnmuteBySelf 是否允许成员自己解除静音
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest allowUnmuteBySelf(Boolean allowUnmuteBySelf) {
        this.allowUnmuteBySelf = allowUnmuteBySelf;
        return this;
    }
    /**
     * @return allowUnmuteBySelf 是否允许成员自己解除静音
     **/
    public Boolean getAllowUnmuteBySelf() {
        return allowUnmuteBySelf;
    }

    /**
     * @param allowUnmuteBySelf 是否允许成员自己解除静音
     */
    public void setAllowUnmuteBySelf(Boolean allowUnmuteBySelf) {
        this.allowUnmuteBySelf = allowUnmuteBySelf;
    }
    /**
     * @param autoWaitingRoom 是否开启等候室 true：开启 false：关闭
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest autoWaitingRoom(Boolean autoWaitingRoom) {
        this.autoWaitingRoom = autoWaitingRoom;
        return this;
    }
    /**
     * @return autoWaitingRoom 是否开启等候室 true：开启 false：关闭
     **/
    public Boolean getAutoWaitingRoom() {
        return autoWaitingRoom;
    }

    /**
     * @param autoWaitingRoom 是否开启等候室 true：开启 false：关闭
     */
    public void setAutoWaitingRoom(Boolean autoWaitingRoom) {
        this.autoWaitingRoom = autoWaitingRoom;
    }
    /**
     * @param enableRedEnvelope 是否允许参会者发送红包 true：允许 false：不允许
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest enableRedEnvelope(Boolean enableRedEnvelope) {
        this.enableRedEnvelope = enableRedEnvelope;
        return this;
    }
    /**
     * @return enableRedEnvelope 是否允许参会者发送红包 true：允许 false：不允许
     **/
    public Boolean getEnableRedEnvelope() {
        return enableRedEnvelope;
    }

    /**
     * @param enableRedEnvelope 是否允许参会者发送红包 true：允许 false：不允许
     */
    public void setEnableRedEnvelope(Boolean enableRedEnvelope) {
        this.enableRedEnvelope = enableRedEnvelope;
    }
    /**
     * @param hideMeetingCodePassword 隐藏会议号和密码 true：隐藏 false：不隐藏
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest hideMeetingCodePassword(Boolean hideMeetingCodePassword) {
        this.hideMeetingCodePassword = hideMeetingCodePassword;
        return this;
    }
    /**
     * @return hideMeetingCodePassword 隐藏会议号和密码 true：隐藏 false：不隐藏
     **/
    public Boolean getHideMeetingCodePassword() {
        return hideMeetingCodePassword;
    }

    /**
     * @param hideMeetingCodePassword 隐藏会议号和密码 true：隐藏 false：不隐藏
     */
    public void setHideMeetingCodePassword(Boolean hideMeetingCodePassword) {
        this.hideMeetingCodePassword = hideMeetingCodePassword;
    }
    /**
     * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param meetingLocked 是否锁定会议 true：锁定 false：关闭锁定
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest meetingLocked(Boolean meetingLocked) {
        this.meetingLocked = meetingLocked;
        return this;
    }
    /**
     * @return meetingLocked 是否锁定会议 true：锁定 false：关闭锁定
     **/
    public Boolean getMeetingLocked() {
        return meetingLocked;
    }

    /**
     * @param meetingLocked 是否锁定会议 true：锁定 false：关闭锁定
     */
    public void setMeetingLocked(Boolean meetingLocked) {
        this.meetingLocked = meetingLocked;
    }
    /**
     * @param muteAll 是否全体静音，true：是；false关闭全体静音
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest muteAll(Boolean muteAll) {
        this.muteAll = muteAll;
        return this;
    }
    /**
     * @return muteAll 是否全体静音，true：是；false关闭全体静音
     **/
    public Boolean getMuteAll() {
        return muteAll;
    }

    /**
     * @param muteAll 是否全体静音，true：是；false关闭全体静音
     */
    public void setMuteAll(Boolean muteAll) {
        this.muteAll = muteAll;
    }
    /**
     * @param onlyEnterpriseUserAllowed 是否仅企业成员可入会  true：仅企业成员可入会  false：不限制
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest onlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
        return this;
    }
    /**
     * @return onlyEnterpriseUserAllowed 是否仅企业成员可入会  true：仅企业成员可入会  false：不限制
     **/
    public Boolean getOnlyEnterpriseUserAllowed() {
        return onlyEnterpriseUserAllowed;
    }

    /**
     * @param onlyEnterpriseUserAllowed 是否仅企业成员可入会  true：仅企业成员可入会  false：不限制
     */
    public void setOnlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
    }
    /**
     * @param operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID的类型：1:userid  2:openid（预留编号，本次不添加，未来新增接口使用）3:rooms_id  4: ms_open_id
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest operatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID的类型：1:userid  2:openid（预留编号，本次不添加，未来新增接口使用）3:rooms_id  4: ms_open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID的类型：1:userid  2:openid（预留编号，本次不添加，未来新增接口使用）3:rooms_id  4: ms_open_id
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param participantJoinMute 成员入会静音 0:关闭静音 1:开启静音 2:超过6人自动开启静音
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest participantJoinMute(Long participantJoinMute) {
        this.participantJoinMute = participantJoinMute;
        return this;
    }
    /**
     * @return participantJoinMute 成员入会静音 0:关闭静音 1:开启静音 2:超过6人自动开启静音
     **/
    public Long getParticipantJoinMute() {
        return participantJoinMute;
    }

    /**
     * @param participantJoinMute 成员入会静音 0:关闭静音 1:开启静音 2:超过6人自动开启静音
     */
    public void setParticipantJoinMute(Long participantJoinMute) {
        this.participantJoinMute = participantJoinMute;
    }
    /**
     * @param playIvrOnJoin 成员入会是否播放提示音 true：成员入会播放提示音 false：不播放
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest playIvrOnJoin(Boolean playIvrOnJoin) {
        this.playIvrOnJoin = playIvrOnJoin;
        return this;
    }
    /**
     * @return playIvrOnJoin 成员入会是否播放提示音 true：成员入会播放提示音 false：不播放
     **/
    public Boolean getPlayIvrOnJoin() {
        return playIvrOnJoin;
    }

    /**
     * @param playIvrOnJoin 成员入会是否播放提示音 true：成员入会播放提示音 false：不播放
     */
    public void setPlayIvrOnJoin(Boolean playIvrOnJoin) {
        this.playIvrOnJoin = playIvrOnJoin;
    }
    /**
     * @param shareScreen 是否允许参会者发起屏幕共享 true：允许 false：不允许
     */
    public V1RealControlMeetingsMeetingIdStatusPutRequest shareScreen(Boolean shareScreen) {
        this.shareScreen = shareScreen;
        return this;
    }
    /**
     * @return shareScreen 是否允许参会者发起屏幕共享 true：允许 false：不允许
     **/
    public Boolean getShareScreen() {
        return shareScreen;
    }

    /**
     * @param shareScreen 是否允许参会者发起屏幕共享 true：允许 false：不允许
     */
    public void setShareScreen(Boolean shareScreen) {
        this.shareScreen = shareScreen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RealControlMeetingsMeetingIdStatusPutRequest v1RealControlMeetingsMeetingIdStatusPutRequest = (V1RealControlMeetingsMeetingIdStatusPutRequest) o;
        return Objects.equals(this.allowChat, v1RealControlMeetingsMeetingIdStatusPutRequest.allowChat) &&
            Objects.equals(this.allowUnmuteBySelf, v1RealControlMeetingsMeetingIdStatusPutRequest.allowUnmuteBySelf) &&
            Objects.equals(this.autoWaitingRoom, v1RealControlMeetingsMeetingIdStatusPutRequest.autoWaitingRoom) &&
            Objects.equals(this.enableRedEnvelope, v1RealControlMeetingsMeetingIdStatusPutRequest.enableRedEnvelope) &&
            Objects.equals(this.hideMeetingCodePassword, v1RealControlMeetingsMeetingIdStatusPutRequest.hideMeetingCodePassword) &&
            Objects.equals(this.instanceid, v1RealControlMeetingsMeetingIdStatusPutRequest.instanceid) &&
            Objects.equals(this.meetingLocked, v1RealControlMeetingsMeetingIdStatusPutRequest.meetingLocked) &&
            Objects.equals(this.muteAll, v1RealControlMeetingsMeetingIdStatusPutRequest.muteAll) &&
            Objects.equals(this.onlyEnterpriseUserAllowed, v1RealControlMeetingsMeetingIdStatusPutRequest.onlyEnterpriseUserAllowed) &&
            Objects.equals(this.operatorId, v1RealControlMeetingsMeetingIdStatusPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1RealControlMeetingsMeetingIdStatusPutRequest.operatorIdType) &&
            Objects.equals(this.participantJoinMute, v1RealControlMeetingsMeetingIdStatusPutRequest.participantJoinMute) &&
            Objects.equals(this.playIvrOnJoin, v1RealControlMeetingsMeetingIdStatusPutRequest.playIvrOnJoin) &&
            Objects.equals(this.shareScreen, v1RealControlMeetingsMeetingIdStatusPutRequest.shareScreen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowChat, allowUnmuteBySelf, autoWaitingRoom, enableRedEnvelope, hideMeetingCodePassword, instanceid, meetingLocked, muteAll, onlyEnterpriseUserAllowed, operatorId, operatorIdType, participantJoinMute, playIvrOnJoin, shareScreen);
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
        sb.append("class V1RealControlMeetingsMeetingIdStatusPutRequest {\n");
        sb.append("    allowChat: ").append(toIndentedString(allowChat)).append("\n");
        sb.append("    allowUnmuteBySelf: ").append(toIndentedString(allowUnmuteBySelf)).append("\n");
        sb.append("    autoWaitingRoom: ").append(toIndentedString(autoWaitingRoom)).append("\n");
        sb.append("    enableRedEnvelope: ").append(toIndentedString(enableRedEnvelope)).append("\n");
        sb.append("    hideMeetingCodePassword: ").append(toIndentedString(hideMeetingCodePassword)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    meetingLocked: ").append(toIndentedString(meetingLocked)).append("\n");
        sb.append("    muteAll: ").append(toIndentedString(muteAll)).append("\n");
        sb.append("    onlyEnterpriseUserAllowed: ").append(toIndentedString(onlyEnterpriseUserAllowed)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    participantJoinMute: ").append(toIndentedString(participantJoinMute)).append("\n");
        sb.append("    playIvrOnJoin: ").append(toIndentedString(playIvrOnJoin)).append("\n");
        sb.append("    shareScreen: ").append(toIndentedString(shareScreen)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


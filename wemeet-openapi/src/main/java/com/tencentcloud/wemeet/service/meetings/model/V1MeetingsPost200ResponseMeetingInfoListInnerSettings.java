/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.0.70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloud.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * 会议媒体参数配置
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsPost200ResponseMeetingInfoListInnerSettings {
    @JsonProperty(value = "allow_in_before_host")
    private Boolean allowInBeforeHost;

    @JsonProperty(value = "allow_screen_shared_watermark")
    private Boolean allowScreenSharedWatermark;

    @JsonProperty(value = "allow_unmute_self")
    private Boolean allowUnmuteSelf;

    @JsonProperty(value = "auto_in_waiting_room")
    private Boolean autoInWaitingRoom;

    @JsonProperty(value = "auto_record_type")
    private String autoRecordType;

    @JsonProperty(value = "enable_host_pause_auto_record")
    private Boolean enableHostPauseAutoRecord;

    @JsonProperty(value = "mute_enable_join")
    private Boolean muteEnableJoin;

    @JsonProperty(value = "mute_enable_type_join")
    private Long muteEnableTypeJoin;

    @JsonProperty(value = "only_enterprise_user_allowed")
    private Boolean onlyEnterpriseUserAllowed;

    @JsonProperty(value = "participant_join_auto_record")
    private Boolean participantJoinAutoRecord;

    @JsonProperty(value = "play_ivr_on_join")
    private Boolean playIvrOnJoin;

    @JsonProperty(value = "play_ivr_on_leave")
    private Boolean playIvrOnLeave;

    @JsonProperty(value = "water_mark_type")
    private Long waterMarkType;

    /**
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings() {
    }

    /**
     * @param allowInBeforeHost 是否允许成员在主持人进会前加入会议，默认值为 true。 true：允许 false：不允许
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings allowInBeforeHost(Boolean allowInBeforeHost) {
        this.allowInBeforeHost = allowInBeforeHost;
        return this;
    }
    /**
     * @return allowInBeforeHost 是否允许成员在主持人进会前加入会议，默认值为 true。 true：允许 false：不允许
     **/
    public Boolean getAllowInBeforeHost() {
        return allowInBeforeHost;
    }

    /**
     * @param allowInBeforeHost 是否允许成员在主持人进会前加入会议，默认值为 true。 true：允许 false：不允许
     */
    public void setAllowInBeforeHost(Boolean allowInBeforeHost) {
        this.allowInBeforeHost = allowInBeforeHost;
    }
    /**
     * @param allowScreenSharedWatermark 是否开启屏幕共享水印，默认值为 false。 true： 开启 false：不开启
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings allowScreenSharedWatermark(Boolean allowScreenSharedWatermark) {
        this.allowScreenSharedWatermark = allowScreenSharedWatermark;
        return this;
    }
    /**
     * @return allowScreenSharedWatermark 是否开启屏幕共享水印，默认值为 false。 true： 开启 false：不开启
     **/
    public Boolean getAllowScreenSharedWatermark() {
        return allowScreenSharedWatermark;
    }

    /**
     * @param allowScreenSharedWatermark 是否开启屏幕共享水印，默认值为 false。 true： 开启 false：不开启
     */
    public void setAllowScreenSharedWatermark(Boolean allowScreenSharedWatermark) {
        this.allowScreenSharedWatermark = allowScreenSharedWatermark;
    }
    /**
     * @param allowUnmuteSelf 允许参会者取消静音，默认值为 true。 true：开启 false：关闭
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings allowUnmuteSelf(Boolean allowUnmuteSelf) {
        this.allowUnmuteSelf = allowUnmuteSelf;
        return this;
    }
    /**
     * @return allowUnmuteSelf 允许参会者取消静音，默认值为 true。 true：开启 false：关闭
     **/
    public Boolean getAllowUnmuteSelf() {
        return allowUnmuteSelf;
    }

    /**
     * @param allowUnmuteSelf 允许参会者取消静音，默认值为 true。 true：开启 false：关闭
     */
    public void setAllowUnmuteSelf(Boolean allowUnmuteSelf) {
        this.allowUnmuteSelf = allowUnmuteSelf;
    }
    /**
     * @param autoInWaitingRoom 是否开启等候室，默认值为 false。 true：开启 false：不开启
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings autoInWaitingRoom(Boolean autoInWaitingRoom) {
        this.autoInWaitingRoom = autoInWaitingRoom;
        return this;
    }
    /**
     * @return autoInWaitingRoom 是否开启等候室，默认值为 false。 true：开启 false：不开启
     **/
    public Boolean getAutoInWaitingRoom() {
        return autoInWaitingRoom;
    }

    /**
     * @param autoInWaitingRoom 是否开启等候室，默认值为 false。 true：开启 false：不开启
     */
    public void setAutoInWaitingRoom(Boolean autoInWaitingRoom) {
        this.autoInWaitingRoom = autoInWaitingRoom;
    }
    /**
     * @param autoRecordType 自动会议录制类型。 none：禁用，表示不开启自动会议录制。 local：本地录制，表示主持人入会后自动开启本地录制。 cloud：云录制，表示主持人入会后自动开启云录制。 说明： 该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本可生效。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings autoRecordType(String autoRecordType) {
        this.autoRecordType = autoRecordType;
        return this;
    }
    /**
     * @return autoRecordType 自动会议录制类型。 none：禁用，表示不开启自动会议录制。 local：本地录制，表示主持人入会后自动开启本地录制。 cloud：云录制，表示主持人入会后自动开启云录制。 说明： 该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本可生效。
     **/
    public String getAutoRecordType() {
        return autoRecordType;
    }

    /**
     * @param autoRecordType 自动会议录制类型。 none：禁用，表示不开启自动会议录制。 local：本地录制，表示主持人入会后自动开启本地录制。 cloud：云录制，表示主持人入会后自动开启云录制。 说明： 该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本可生效。
     */
    public void setAutoRecordType(String autoRecordType) {
        this.autoRecordType = autoRecordType;
    }
    /**
     * @param enableHostPauseAutoRecord 允许主持人暂停或者停止云录制，默认值为 true 开启，开启时，主持人允许暂停和停止云录制；当设置为关闭时，则主持人不允许暂停和关闭云录制。 说明： 该参数必须 auto_record_type 设置为“cloud”时才生效，该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本生效。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings enableHostPauseAutoRecord(Boolean enableHostPauseAutoRecord) {
        this.enableHostPauseAutoRecord = enableHostPauseAutoRecord;
        return this;
    }
    /**
     * @return enableHostPauseAutoRecord 允许主持人暂停或者停止云录制，默认值为 true 开启，开启时，主持人允许暂停和停止云录制；当设置为关闭时，则主持人不允许暂停和关闭云录制。 说明： 该参数必须 auto_record_type 设置为“cloud”时才生效，该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本生效。
     **/
    public Boolean getEnableHostPauseAutoRecord() {
        return enableHostPauseAutoRecord;
    }

    /**
     * @param enableHostPauseAutoRecord 允许主持人暂停或者停止云录制，默认值为 true 开启，开启时，主持人允许暂停和停止云录制；当设置为关闭时，则主持人不允许暂停和关闭云录制。 说明： 该参数必须 auto_record_type 设置为“cloud”时才生效，该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本生效。
     */
    public void setEnableHostPauseAutoRecord(Boolean enableHostPauseAutoRecord) {
        this.enableHostPauseAutoRecord = enableHostPauseAutoRecord;
    }
    /**
     * @param muteEnableJoin 入会时静音，默认值为 true true：开启 false：关闭
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings muteEnableJoin(Boolean muteEnableJoin) {
        this.muteEnableJoin = muteEnableJoin;
        return this;
    }
    /**
     * @return muteEnableJoin 入会时静音，默认值为 true true：开启 false：关闭
     **/
    public Boolean getMuteEnableJoin() {
        return muteEnableJoin;
    }

    /**
     * @param muteEnableJoin 入会时静音，默认值为 true true：开启 false：关闭
     */
    public void setMuteEnableJoin(Boolean muteEnableJoin) {
        this.muteEnableJoin = muteEnableJoin;
    }
    /**
     * @param muteEnableTypeJoin 成员入会时静音选项，默认值为2。 当同时传入“mute_enable_join”和“mute_enable_type_join”时，将以“mute_enable_type_join”的选项为准。 0：关闭 1：开启 2：超过6人后自动开启
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings muteEnableTypeJoin(Long muteEnableTypeJoin) {
        this.muteEnableTypeJoin = muteEnableTypeJoin;
        return this;
    }
    /**
     * @return muteEnableTypeJoin 成员入会时静音选项，默认值为2。 当同时传入“mute_enable_join”和“mute_enable_type_join”时，将以“mute_enable_type_join”的选项为准。 0：关闭 1：开启 2：超过6人后自动开启
     **/
    public Long getMuteEnableTypeJoin() {
        return muteEnableTypeJoin;
    }

    /**
     * @param muteEnableTypeJoin 成员入会时静音选项，默认值为2。 当同时传入“mute_enable_join”和“mute_enable_type_join”时，将以“mute_enable_type_join”的选项为准。 0：关闭 1：开启 2：超过6人后自动开启
     */
    public void setMuteEnableTypeJoin(Long muteEnableTypeJoin) {
        this.muteEnableTypeJoin = muteEnableTypeJoin;
    }
    /**
     * @param onlyEnterpriseUserAllowed 是否仅企业内部成员可入会，默认值为 false。 true：仅企业内部用户可入会 false：所有人可入会
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings onlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
        return this;
    }
    /**
     * @return onlyEnterpriseUserAllowed 是否仅企业内部成员可入会，默认值为 false。 true：仅企业内部用户可入会 false：所有人可入会
     **/
    public Boolean getOnlyEnterpriseUserAllowed() {
        return onlyEnterpriseUserAllowed;
    }

    /**
     * @param onlyEnterpriseUserAllowed 是否仅企业内部成员可入会，默认值为 false。 true：仅企业内部用户可入会 false：所有人可入会
     */
    public void setOnlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
    }
    /**
     * @param participantJoinAutoRecord 当有参会成员入会时立即开启云录制，默认值为 false 关闭，关闭时，主持人入会自动开启云录制；当设置为开启时，则有参会成员入会自动开启云录制。 说明： 该参数必须 auto_record_type 设置为“cloud”时才生效，该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本生效。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings participantJoinAutoRecord(Boolean participantJoinAutoRecord) {
        this.participantJoinAutoRecord = participantJoinAutoRecord;
        return this;
    }
    /**
     * @return participantJoinAutoRecord 当有参会成员入会时立即开启云录制，默认值为 false 关闭，关闭时，主持人入会自动开启云录制；当设置为开启时，则有参会成员入会自动开启云录制。 说明： 该参数必须 auto_record_type 设置为“cloud”时才生效，该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本生效。
     **/
    public Boolean getParticipantJoinAutoRecord() {
        return participantJoinAutoRecord;
    }

    /**
     * @param participantJoinAutoRecord 当有参会成员入会时立即开启云录制，默认值为 false 关闭，关闭时，主持人入会自动开启云录制；当设置为开启时，则有参会成员入会自动开启云录制。 说明： 该参数必须 auto_record_type 设置为“cloud”时才生效，该参数依赖企业账户设置，当企业强制锁定后，该参数必须与企业配置保持一致。 仅客户端2.7及以上版本生效。
     */
    public void setParticipantJoinAutoRecord(Boolean participantJoinAutoRecord) {
        this.participantJoinAutoRecord = participantJoinAutoRecord;
    }
    /**
     * @param playIvrOnJoin 有新的与会者加入时播放提示音，暂不支持，可在客户端设置
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings playIvrOnJoin(Boolean playIvrOnJoin) {
        this.playIvrOnJoin = playIvrOnJoin;
        return this;
    }
    /**
     * @return playIvrOnJoin 有新的与会者加入时播放提示音，暂不支持，可在客户端设置
     **/
    public Boolean getPlayIvrOnJoin() {
        return playIvrOnJoin;
    }

    /**
     * @param playIvrOnJoin 有新的与会者加入时播放提示音，暂不支持，可在客户端设置
     */
    public void setPlayIvrOnJoin(Boolean playIvrOnJoin) {
        this.playIvrOnJoin = playIvrOnJoin;
    }
    /**
     * @param playIvrOnLeave 参会者离开时播放提示音，暂时不支持，可在客户端设置。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings playIvrOnLeave(Boolean playIvrOnLeave) {
        this.playIvrOnLeave = playIvrOnLeave;
        return this;
    }
    /**
     * @return playIvrOnLeave 参会者离开时播放提示音，暂时不支持，可在客户端设置。
     **/
    public Boolean getPlayIvrOnLeave() {
        return playIvrOnLeave;
    }

    /**
     * @param playIvrOnLeave 参会者离开时播放提示音，暂时不支持，可在客户端设置。
     */
    public void setPlayIvrOnLeave(Boolean playIvrOnLeave) {
        this.playIvrOnLeave = playIvrOnLeave;
    }
    /**
     * @param waterMarkType 水印样式，默认为单排。当屏幕共享水印参数为开启时，此参数才生效。 0：单排 1：多排
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings waterMarkType(Long waterMarkType) {
        this.waterMarkType = waterMarkType;
        return this;
    }
    /**
     * @return waterMarkType 水印样式，默认为单排。当屏幕共享水印参数为开启时，此参数才生效。 0：单排 1：多排
     **/
    public Long getWaterMarkType() {
        return waterMarkType;
    }

    /**
     * @param waterMarkType 水印样式，默认为单排。当屏幕共享水印参数为开启时，此参数才生效。 0：单排 1：多排
     */
    public void setWaterMarkType(Long waterMarkType) {
        this.waterMarkType = waterMarkType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsPost200ResponseMeetingInfoListInnerSettings v1MeetingsPost200ResponseMeetingInfoListInnerSettings = (V1MeetingsPost200ResponseMeetingInfoListInnerSettings) o;
        return Objects.equals(this.allowInBeforeHost, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.allowInBeforeHost) &&
            Objects.equals(this.allowScreenSharedWatermark, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.allowScreenSharedWatermark) &&
            Objects.equals(this.allowUnmuteSelf, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.allowUnmuteSelf) &&
            Objects.equals(this.autoInWaitingRoom, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.autoInWaitingRoom) &&
            Objects.equals(this.autoRecordType, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.autoRecordType) &&
            Objects.equals(this.enableHostPauseAutoRecord, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.enableHostPauseAutoRecord) &&
            Objects.equals(this.muteEnableJoin, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.muteEnableJoin) &&
            Objects.equals(this.muteEnableTypeJoin, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.muteEnableTypeJoin) &&
            Objects.equals(this.onlyEnterpriseUserAllowed, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.onlyEnterpriseUserAllowed) &&
            Objects.equals(this.participantJoinAutoRecord, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.participantJoinAutoRecord) &&
            Objects.equals(this.playIvrOnJoin, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.playIvrOnJoin) &&
            Objects.equals(this.playIvrOnLeave, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.playIvrOnLeave) &&
            Objects.equals(this.waterMarkType, v1MeetingsPost200ResponseMeetingInfoListInnerSettings.waterMarkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowInBeforeHost, allowScreenSharedWatermark, allowUnmuteSelf, autoInWaitingRoom, autoRecordType, enableHostPauseAutoRecord, muteEnableJoin, muteEnableTypeJoin, onlyEnterpriseUserAllowed, participantJoinAutoRecord, playIvrOnJoin, playIvrOnLeave, waterMarkType);
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
        sb.append("class V1MeetingsPost200ResponseMeetingInfoListInnerSettings {\n");
        sb.append("    allowInBeforeHost: ").append(toIndentedString(allowInBeforeHost)).append("\n");
        sb.append("    allowScreenSharedWatermark: ").append(toIndentedString(allowScreenSharedWatermark)).append("\n");
        sb.append("    allowUnmuteSelf: ").append(toIndentedString(allowUnmuteSelf)).append("\n");
        sb.append("    autoInWaitingRoom: ").append(toIndentedString(autoInWaitingRoom)).append("\n");
        sb.append("    autoRecordType: ").append(toIndentedString(autoRecordType)).append("\n");
        sb.append("    enableHostPauseAutoRecord: ").append(toIndentedString(enableHostPauseAutoRecord)).append("\n");
        sb.append("    muteEnableJoin: ").append(toIndentedString(muteEnableJoin)).append("\n");
        sb.append("    muteEnableTypeJoin: ").append(toIndentedString(muteEnableTypeJoin)).append("\n");
        sb.append("    onlyEnterpriseUserAllowed: ").append(toIndentedString(onlyEnterpriseUserAllowed)).append("\n");
        sb.append("    participantJoinAutoRecord: ").append(toIndentedString(participantJoinAutoRecord)).append("\n");
        sb.append("    playIvrOnJoin: ").append(toIndentedString(playIvrOnJoin)).append("\n");
        sb.append("    playIvrOnLeave: ").append(toIndentedString(playIvrOnLeave)).append("\n");
        sb.append("    waterMarkType: ").append(toIndentedString(waterMarkType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


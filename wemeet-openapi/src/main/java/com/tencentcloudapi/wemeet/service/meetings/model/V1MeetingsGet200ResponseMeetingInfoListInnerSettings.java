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
 * V1MeetingsGet200ResponseMeetingInfoListInnerSettings
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsGet200ResponseMeetingInfoListInnerSettings {
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

    @JsonProperty(value = "only_allow_enterprise_user_join")
    private Boolean onlyAllowEnterpriseUserJoin;

    @JsonProperty(value = "participant_join_auto_record")
    private Boolean participantJoinAutoRecord;

    @JsonProperty(value = "water_mark_type")
    private Long waterMarkType;

    /**
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings() {
    }

    /**
     * @param allowInBeforeHost 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings allowInBeforeHost(Boolean allowInBeforeHost) {
        this.allowInBeforeHost = allowInBeforeHost;
        return this;
    }
    /**
     * @return allowInBeforeHost 
     **/
    public Boolean getAllowInBeforeHost() {
        return allowInBeforeHost;
    }

    /**
     * @param allowInBeforeHost 
     */
    public void setAllowInBeforeHost(Boolean allowInBeforeHost) {
        this.allowInBeforeHost = allowInBeforeHost;
    }
    /**
     * @param allowScreenSharedWatermark 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings allowScreenSharedWatermark(Boolean allowScreenSharedWatermark) {
        this.allowScreenSharedWatermark = allowScreenSharedWatermark;
        return this;
    }
    /**
     * @return allowScreenSharedWatermark 
     **/
    public Boolean getAllowScreenSharedWatermark() {
        return allowScreenSharedWatermark;
    }

    /**
     * @param allowScreenSharedWatermark 
     */
    public void setAllowScreenSharedWatermark(Boolean allowScreenSharedWatermark) {
        this.allowScreenSharedWatermark = allowScreenSharedWatermark;
    }
    /**
     * @param allowUnmuteSelf 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings allowUnmuteSelf(Boolean allowUnmuteSelf) {
        this.allowUnmuteSelf = allowUnmuteSelf;
        return this;
    }
    /**
     * @return allowUnmuteSelf 
     **/
    public Boolean getAllowUnmuteSelf() {
        return allowUnmuteSelf;
    }

    /**
     * @param allowUnmuteSelf 
     */
    public void setAllowUnmuteSelf(Boolean allowUnmuteSelf) {
        this.allowUnmuteSelf = allowUnmuteSelf;
    }
    /**
     * @param autoInWaitingRoom 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings autoInWaitingRoom(Boolean autoInWaitingRoom) {
        this.autoInWaitingRoom = autoInWaitingRoom;
        return this;
    }
    /**
     * @return autoInWaitingRoom 
     **/
    public Boolean getAutoInWaitingRoom() {
        return autoInWaitingRoom;
    }

    /**
     * @param autoInWaitingRoom 
     */
    public void setAutoInWaitingRoom(Boolean autoInWaitingRoom) {
        this.autoInWaitingRoom = autoInWaitingRoom;
    }
    /**
     * @param autoRecordType 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings autoRecordType(String autoRecordType) {
        this.autoRecordType = autoRecordType;
        return this;
    }
    /**
     * @return autoRecordType 
     **/
    public String getAutoRecordType() {
        return autoRecordType;
    }

    /**
     * @param autoRecordType 
     */
    public void setAutoRecordType(String autoRecordType) {
        this.autoRecordType = autoRecordType;
    }
    /**
     * @param enableHostPauseAutoRecord 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings enableHostPauseAutoRecord(Boolean enableHostPauseAutoRecord) {
        this.enableHostPauseAutoRecord = enableHostPauseAutoRecord;
        return this;
    }
    /**
     * @return enableHostPauseAutoRecord 
     **/
    public Boolean getEnableHostPauseAutoRecord() {
        return enableHostPauseAutoRecord;
    }

    /**
     * @param enableHostPauseAutoRecord 
     */
    public void setEnableHostPauseAutoRecord(Boolean enableHostPauseAutoRecord) {
        this.enableHostPauseAutoRecord = enableHostPauseAutoRecord;
    }
    /**
     * @param muteEnableJoin 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings muteEnableJoin(Boolean muteEnableJoin) {
        this.muteEnableJoin = muteEnableJoin;
        return this;
    }
    /**
     * @return muteEnableJoin 
     **/
    public Boolean getMuteEnableJoin() {
        return muteEnableJoin;
    }

    /**
     * @param muteEnableJoin 
     */
    public void setMuteEnableJoin(Boolean muteEnableJoin) {
        this.muteEnableJoin = muteEnableJoin;
    }
    /**
     * @param muteEnableTypeJoin 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings muteEnableTypeJoin(Long muteEnableTypeJoin) {
        this.muteEnableTypeJoin = muteEnableTypeJoin;
        return this;
    }
    /**
     * @return muteEnableTypeJoin 
     **/
    public Long getMuteEnableTypeJoin() {
        return muteEnableTypeJoin;
    }

    /**
     * @param muteEnableTypeJoin 
     */
    public void setMuteEnableTypeJoin(Long muteEnableTypeJoin) {
        this.muteEnableTypeJoin = muteEnableTypeJoin;
    }
    /**
     * @param onlyAllowEnterpriseUserJoin 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings onlyAllowEnterpriseUserJoin(Boolean onlyAllowEnterpriseUserJoin) {
        this.onlyAllowEnterpriseUserJoin = onlyAllowEnterpriseUserJoin;
        return this;
    }
    /**
     * @return onlyAllowEnterpriseUserJoin 
     **/
    public Boolean getOnlyAllowEnterpriseUserJoin() {
        return onlyAllowEnterpriseUserJoin;
    }

    /**
     * @param onlyAllowEnterpriseUserJoin 
     */
    public void setOnlyAllowEnterpriseUserJoin(Boolean onlyAllowEnterpriseUserJoin) {
        this.onlyAllowEnterpriseUserJoin = onlyAllowEnterpriseUserJoin;
    }
    /**
     * @param participantJoinAutoRecord 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings participantJoinAutoRecord(Boolean participantJoinAutoRecord) {
        this.participantJoinAutoRecord = participantJoinAutoRecord;
        return this;
    }
    /**
     * @return participantJoinAutoRecord 
     **/
    public Boolean getParticipantJoinAutoRecord() {
        return participantJoinAutoRecord;
    }

    /**
     * @param participantJoinAutoRecord 
     */
    public void setParticipantJoinAutoRecord(Boolean participantJoinAutoRecord) {
        this.participantJoinAutoRecord = participantJoinAutoRecord;
    }
    /**
     * @param waterMarkType 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerSettings waterMarkType(Long waterMarkType) {
        this.waterMarkType = waterMarkType;
        return this;
    }
    /**
     * @return waterMarkType 
     **/
    public Long getWaterMarkType() {
        return waterMarkType;
    }

    /**
     * @param waterMarkType 
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
        V1MeetingsGet200ResponseMeetingInfoListInnerSettings v1MeetingsGet200ResponseMeetingInfoListInnerSettings = (V1MeetingsGet200ResponseMeetingInfoListInnerSettings) o;
        return Objects.equals(this.allowInBeforeHost, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.allowInBeforeHost) &&
            Objects.equals(this.allowScreenSharedWatermark, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.allowScreenSharedWatermark) &&
            Objects.equals(this.allowUnmuteSelf, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.allowUnmuteSelf) &&
            Objects.equals(this.autoInWaitingRoom, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.autoInWaitingRoom) &&
            Objects.equals(this.autoRecordType, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.autoRecordType) &&
            Objects.equals(this.enableHostPauseAutoRecord, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.enableHostPauseAutoRecord) &&
            Objects.equals(this.muteEnableJoin, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.muteEnableJoin) &&
            Objects.equals(this.muteEnableTypeJoin, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.muteEnableTypeJoin) &&
            Objects.equals(this.onlyAllowEnterpriseUserJoin, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.onlyAllowEnterpriseUserJoin) &&
            Objects.equals(this.participantJoinAutoRecord, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.participantJoinAutoRecord) &&
            Objects.equals(this.waterMarkType, v1MeetingsGet200ResponseMeetingInfoListInnerSettings.waterMarkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowInBeforeHost, allowScreenSharedWatermark, allowUnmuteSelf, autoInWaitingRoom, autoRecordType, enableHostPauseAutoRecord, muteEnableJoin, muteEnableTypeJoin, onlyAllowEnterpriseUserJoin, participantJoinAutoRecord, waterMarkType);
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
        sb.append("class V1MeetingsGet200ResponseMeetingInfoListInnerSettings {\n");
        sb.append("    allowInBeforeHost: ").append(toIndentedString(allowInBeforeHost)).append("\n");
        sb.append("    allowScreenSharedWatermark: ").append(toIndentedString(allowScreenSharedWatermark)).append("\n");
        sb.append("    allowUnmuteSelf: ").append(toIndentedString(allowUnmuteSelf)).append("\n");
        sb.append("    autoInWaitingRoom: ").append(toIndentedString(autoInWaitingRoom)).append("\n");
        sb.append("    autoRecordType: ").append(toIndentedString(autoRecordType)).append("\n");
        sb.append("    enableHostPauseAutoRecord: ").append(toIndentedString(enableHostPauseAutoRecord)).append("\n");
        sb.append("    muteEnableJoin: ").append(toIndentedString(muteEnableJoin)).append("\n");
        sb.append("    muteEnableTypeJoin: ").append(toIndentedString(muteEnableTypeJoin)).append("\n");
        sb.append("    onlyAllowEnterpriseUserJoin: ").append(toIndentedString(onlyAllowEnterpriseUserJoin)).append("\n");
        sb.append("    participantJoinAutoRecord: ").append(toIndentedString(participantJoinAutoRecord)).append("\n");
        sb.append("    waterMarkType: ").append(toIndentedString(waterMarkType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


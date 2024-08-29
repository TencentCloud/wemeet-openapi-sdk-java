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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings {
    @JsonProperty(value = "allow_in_before_host")
    private Boolean allowInBeforeHost;

    @JsonProperty(value = "mute_enable_type_join")
    private Long muteEnableTypeJoin;

    @JsonProperty(value = "only_enterprise_user_allowed")
    private Boolean onlyEnterpriseUserAllowed;

    @JsonProperty(value = "room_pmi_psw")
    private String roomPmiPsw;

    @JsonProperty(value = "waiting_room")
    private Boolean waitingRoom;

    /**
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings() {
    }

    /**
     * @param allowInBeforeHost 
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings allowInBeforeHost(Boolean allowInBeforeHost) {
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
     * @param muteEnableTypeJoin 
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings muteEnableTypeJoin(Long muteEnableTypeJoin) {
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
     * @param onlyEnterpriseUserAllowed 
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings onlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
        return this;
    }
    /**
     * @return onlyEnterpriseUserAllowed 
     **/
    public Boolean getOnlyEnterpriseUserAllowed() {
        return onlyEnterpriseUserAllowed;
    }

    /**
     * @param onlyEnterpriseUserAllowed 
     */
    public void setOnlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
    }
    /**
     * @param roomPmiPsw 
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings roomPmiPsw(String roomPmiPsw) {
        this.roomPmiPsw = roomPmiPsw;
        return this;
    }
    /**
     * @return roomPmiPsw 
     **/
    public String getRoomPmiPsw() {
        return roomPmiPsw;
    }

    /**
     * @param roomPmiPsw 
     */
    public void setRoomPmiPsw(String roomPmiPsw) {
        this.roomPmiPsw = roomPmiPsw;
    }
    /**
     * @param waitingRoom 
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings waitingRoom(Boolean waitingRoom) {
        this.waitingRoom = waitingRoom;
        return this;
    }
    /**
     * @return waitingRoom 
     **/
    public Boolean getWaitingRoom() {
        return waitingRoom;
    }

    /**
     * @param waitingRoom 
     */
    public void setWaitingRoom(Boolean waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings v1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings = (V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings) o;
        return Objects.equals(this.allowInBeforeHost, v1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings.allowInBeforeHost) &&
            Objects.equals(this.muteEnableTypeJoin, v1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings.muteEnableTypeJoin) &&
            Objects.equals(this.onlyEnterpriseUserAllowed, v1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings.onlyEnterpriseUserAllowed) &&
            Objects.equals(this.roomPmiPsw, v1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings.roomPmiPsw) &&
            Objects.equals(this.waitingRoom, v1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings.waitingRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowInBeforeHost, muteEnableTypeJoin, onlyEnterpriseUserAllowed, roomPmiPsw, waitingRoom);
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
        sb.append("class V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettingsRoomPmiSettings {\n");
        sb.append("    allowInBeforeHost: ").append(toIndentedString(allowInBeforeHost)).append("\n");
        sb.append("    muteEnableTypeJoin: ").append(toIndentedString(muteEnableTypeJoin)).append("\n");
        sb.append("    onlyEnterpriseUserAllowed: ").append(toIndentedString(onlyEnterpriseUserAllowed)).append("\n");
        sb.append("    roomPmiPsw: ").append(toIndentedString(roomPmiPsw)).append("\n");
        sb.append("    waitingRoom: ").append(toIndentedString(waitingRoom)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

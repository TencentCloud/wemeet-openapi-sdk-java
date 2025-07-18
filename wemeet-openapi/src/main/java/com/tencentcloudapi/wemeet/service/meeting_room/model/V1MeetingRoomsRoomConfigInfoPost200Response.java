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
 * V1MeetingRoomsRoomConfigInfoPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsRoomConfigInfoPost200Response {
    @JsonProperty(value = "meeting_settings")
    private V1MeetingRoomsRoomConfigInfoPost200ResponseMeetingSettings meetingSettings;

    @JsonProperty(value = "record_settings")
    private V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings recordSettings;

    /**
     */
    public V1MeetingRoomsRoomConfigInfoPost200Response() {
    }

    /**
     * @param meetingSettings 
     */
    public V1MeetingRoomsRoomConfigInfoPost200Response meetingSettings(V1MeetingRoomsRoomConfigInfoPost200ResponseMeetingSettings meetingSettings) {
        this.meetingSettings = meetingSettings;
        return this;
    }
    /**
     * @return meetingSettings 
     **/
    public V1MeetingRoomsRoomConfigInfoPost200ResponseMeetingSettings getMeetingSettings() {
        return meetingSettings;
    }

    /**
     * @param meetingSettings 
     */
    public void setMeetingSettings(V1MeetingRoomsRoomConfigInfoPost200ResponseMeetingSettings meetingSettings) {
        this.meetingSettings = meetingSettings;
    }
    /**
     * @param recordSettings 
     */
    public V1MeetingRoomsRoomConfigInfoPost200Response recordSettings(V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings recordSettings) {
        this.recordSettings = recordSettings;
        return this;
    }
    /**
     * @return recordSettings 
     **/
    public V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings getRecordSettings() {
        return recordSettings;
    }

    /**
     * @param recordSettings 
     */
    public void setRecordSettings(V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings recordSettings) {
        this.recordSettings = recordSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsRoomConfigInfoPost200Response v1MeetingRoomsRoomConfigInfoPost200Response = (V1MeetingRoomsRoomConfigInfoPost200Response) o;
        return Objects.equals(this.meetingSettings, v1MeetingRoomsRoomConfigInfoPost200Response.meetingSettings) &&
            Objects.equals(this.recordSettings, v1MeetingRoomsRoomConfigInfoPost200Response.recordSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingSettings, recordSettings);
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
        sb.append("class V1MeetingRoomsRoomConfigInfoPost200Response {\n");
        sb.append("    meetingSettings: ").append(toIndentedString(meetingSettings)).append("\n");
        sb.append("    recordSettings: ").append(toIndentedString(recordSettings)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


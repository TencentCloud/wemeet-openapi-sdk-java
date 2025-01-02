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
 * V1MeetingsMeetingIdBookRoomsPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdBookRoomsPost200Response {
    @JsonProperty(value = "meeting_room_list")
    private List<V1MeetingsMeetingIdBookRoomsPost200ResponseMeetingRoomListInner> meetingRoomList;

    @JsonProperty(value = "meeting_room_number")
    private Long meetingRoomNumber;

    /**
     */
    public V1MeetingsMeetingIdBookRoomsPost200Response() {
    }

    /**
     * @param meetingRoomList 会议室对象列表
     */
    public V1MeetingsMeetingIdBookRoomsPost200Response meetingRoomList(List<V1MeetingsMeetingIdBookRoomsPost200ResponseMeetingRoomListInner> meetingRoomList) {
        this.meetingRoomList = meetingRoomList;
        return this;
    }
    /**
     * @return meetingRoomList 会议室对象列表
     **/
    public List<V1MeetingsMeetingIdBookRoomsPost200ResponseMeetingRoomListInner> getMeetingRoomList() {
        return meetingRoomList;
    }

    /**
     * @param meetingRoomList 会议室对象列表
     */
    public void setMeetingRoomList(List<V1MeetingsMeetingIdBookRoomsPost200ResponseMeetingRoomListInner> meetingRoomList) {
        this.meetingRoomList = meetingRoomList;
    }
    /**
     * @param meetingRoomNumber 会议室数量
     */
    public V1MeetingsMeetingIdBookRoomsPost200Response meetingRoomNumber(Long meetingRoomNumber) {
        this.meetingRoomNumber = meetingRoomNumber;
        return this;
    }
    /**
     * @return meetingRoomNumber 会议室数量
     **/
    public Long getMeetingRoomNumber() {
        return meetingRoomNumber;
    }

    /**
     * @param meetingRoomNumber 会议室数量
     */
    public void setMeetingRoomNumber(Long meetingRoomNumber) {
        this.meetingRoomNumber = meetingRoomNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdBookRoomsPost200Response v1MeetingsMeetingIdBookRoomsPost200Response = (V1MeetingsMeetingIdBookRoomsPost200Response) o;
        return Objects.equals(this.meetingRoomList, v1MeetingsMeetingIdBookRoomsPost200Response.meetingRoomList) &&
            Objects.equals(this.meetingRoomNumber, v1MeetingsMeetingIdBookRoomsPost200Response.meetingRoomNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingRoomList, meetingRoomNumber);
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
        sb.append("class V1MeetingsMeetingIdBookRoomsPost200Response {\n");
        sb.append("    meetingRoomList: ").append(toIndentedString(meetingRoomList)).append("\n");
        sb.append("    meetingRoomNumber: ").append(toIndentedString(meetingRoomNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


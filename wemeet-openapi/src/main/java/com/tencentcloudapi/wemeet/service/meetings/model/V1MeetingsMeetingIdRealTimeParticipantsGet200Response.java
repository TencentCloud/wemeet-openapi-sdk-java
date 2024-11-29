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
 * V1MeetingsMeetingIdRealTimeParticipantsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdRealTimeParticipantsGet200Response {
    @JsonProperty(value = "current_page")
    private Long currentPage;

    @JsonProperty(value = "current_size")
    private Long currentSize;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "participants")
    private List<V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner> participants;

    @JsonProperty(value = "schedule_end_time")
    private String scheduleEndTime;

    @JsonProperty(value = "schedule_start_time")
    private String scheduleStartTime;

    @JsonProperty(value = "status")
    private String status;

    @JsonProperty(value = "subject")
    private String subject;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "total_page")
    private Long totalPage;

    /**
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response() {
    }

    /**
     * @param currentPage 当前页。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response currentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    /**
     * @return currentPage 当前页。
     **/
    public Long getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage 当前页。
     */
    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }
    /**
     * @param currentSize 当前页实际大小。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response currentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    /**
     * @return currentSize 当前页实际大小。
     **/
    public Long getCurrentSize() {
        return currentSize;
    }

    /**
     * @param currentSize 当前页实际大小。
     */
    public void setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
    }
    /**
     * @param meetingCode 会议号码。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 会议号码。
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 会议号码。
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议的唯一 ID。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议的唯一 ID。
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议的唯一 ID。
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param participants 参会人员对象数组。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response participants(List<V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner> participants) {
        this.participants = participants;
        return this;
    }
    /**
     * @return participants 参会人员对象数组。
     **/
    public List<V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner> getParticipants() {
        return participants;
    }

    /**
     * @param participants 参会人员对象数组。
     */
    public void setParticipants(List<V1MeetingsMeetingIdRealTimeParticipantsGet200ResponseParticipantsInner> participants) {
        this.participants = participants;
    }
    /**
     * @param scheduleEndTime 预定会议结束时间戳（单位秒）。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response scheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
        return this;
    }
    /**
     * @return scheduleEndTime 预定会议结束时间戳（单位秒）。
     **/
    public String getScheduleEndTime() {
        return scheduleEndTime;
    }

    /**
     * @param scheduleEndTime 预定会议结束时间戳（单位秒）。
     */
    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }
    /**
     * @param scheduleStartTime 预定会议开始时间戳（单位秒）。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response scheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
        return this;
    }
    /**
     * @return scheduleStartTime 预定会议开始时间戳（单位秒）。
     **/
    public String getScheduleStartTime() {
        return scheduleStartTime;
    }

    /**
     * @param scheduleStartTime 预定会议开始时间戳（单位秒）。
     */
    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }
    /**
     * @param status 当前会议状态： 1. MEETING_STATE_INVALID： 非法或未知的会议状态，错误状态。 2. MEETING_STATE_INIT： 会议待开始。会议预定到预定结束时间前，会议尚无人进会。 3. MEETING_STATE_CANCELLED： 会议已取消。主持人主动取消会议，待开始的会议才能取消，且取消的会议无法再进入。 4. MEETING_STATE_STARTED： 会议已开始。会议中有人则表示会议进行中。 5. MEETING_STATE_ENDED： 会议已删除。会议已过预定结束时间且尚无人进会时，主持人删除会议，已删除的会议无法再进入。 6. MEETING_STATE_NULL： 会议无状态。会议已过预定结束时间，会议尚无人进会。 7. MEETING_STATE_RECYCLED： 会议已回收。会议已过预定开始时间30天，则会议号将被后台回收，无法再进入。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response status(String status) {
        this.status = status;
        return this;
    }
    /**
     * @return status 当前会议状态： 1. MEETING_STATE_INVALID： 非法或未知的会议状态，错误状态。 2. MEETING_STATE_INIT： 会议待开始。会议预定到预定结束时间前，会议尚无人进会。 3. MEETING_STATE_CANCELLED： 会议已取消。主持人主动取消会议，待开始的会议才能取消，且取消的会议无法再进入。 4. MEETING_STATE_STARTED： 会议已开始。会议中有人则表示会议进行中。 5. MEETING_STATE_ENDED： 会议已删除。会议已过预定结束时间且尚无人进会时，主持人删除会议，已删除的会议无法再进入。 6. MEETING_STATE_NULL： 会议无状态。会议已过预定结束时间，会议尚无人进会。 7. MEETING_STATE_RECYCLED： 会议已回收。会议已过预定开始时间30天，则会议号将被后台回收，无法再进入。
     **/
    public String getStatus() {
        return status;
    }

    /**
     * @param status 当前会议状态： 1. MEETING_STATE_INVALID： 非法或未知的会议状态，错误状态。 2. MEETING_STATE_INIT： 会议待开始。会议预定到预定结束时间前，会议尚无人进会。 3. MEETING_STATE_CANCELLED： 会议已取消。主持人主动取消会议，待开始的会议才能取消，且取消的会议无法再进入。 4. MEETING_STATE_STARTED： 会议已开始。会议中有人则表示会议进行中。 5. MEETING_STATE_ENDED： 会议已删除。会议已过预定结束时间且尚无人进会时，主持人删除会议，已删除的会议无法再进入。 6. MEETING_STATE_NULL： 会议无状态。会议已过预定结束时间，会议尚无人进会。 7. MEETING_STATE_RECYCLED： 会议已回收。会议已过预定开始时间30天，则会议号将被后台回收，无法再进入。
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @param subject 会议主题（base64）。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response subject(String subject) {
        this.subject = subject;
        return this;
    }
    /**
     * @return subject 会议主题（base64）。
     **/
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject 会议主题（base64）。
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * @param totalCount 根据条件筛选后的总人数。
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 根据条件筛选后的总人数。
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 根据条件筛选后的总人数。
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param totalPage 根据条件筛选后的总分页数
     */
    public V1MeetingsMeetingIdRealTimeParticipantsGet200Response totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    /**
     * @return totalPage 根据条件筛选后的总分页数
     **/
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage 根据条件筛选后的总分页数
     */
    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdRealTimeParticipantsGet200Response v1MeetingsMeetingIdRealTimeParticipantsGet200Response = (V1MeetingsMeetingIdRealTimeParticipantsGet200Response) o;
        return Objects.equals(this.currentPage, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.currentPage) &&
            Objects.equals(this.currentSize, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.currentSize) &&
            Objects.equals(this.meetingCode, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.meetingCode) &&
            Objects.equals(this.meetingId, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.meetingId) &&
            Objects.equals(this.participants, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.participants) &&
            Objects.equals(this.scheduleEndTime, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.scheduleEndTime) &&
            Objects.equals(this.scheduleStartTime, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.scheduleStartTime) &&
            Objects.equals(this.status, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.status) &&
            Objects.equals(this.subject, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.subject) &&
            Objects.equals(this.totalCount, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.totalCount) &&
            Objects.equals(this.totalPage, v1MeetingsMeetingIdRealTimeParticipantsGet200Response.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPage, currentSize, meetingCode, meetingId, participants, scheduleEndTime, scheduleStartTime, status, subject, totalCount, totalPage);
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
        sb.append("class V1MeetingsMeetingIdRealTimeParticipantsGet200Response {\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
        sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


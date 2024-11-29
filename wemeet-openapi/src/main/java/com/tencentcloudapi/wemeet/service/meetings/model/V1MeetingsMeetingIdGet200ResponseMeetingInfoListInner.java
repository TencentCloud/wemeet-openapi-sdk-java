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
 * V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner {
    @JsonProperty(value = "current_co_hosts")
    private List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> currentCoHosts;

    @JsonProperty(value = "current_hosts")
    private List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> currentHosts;

    @JsonProperty(value = "current_sub_meeting_id")
    private String currentSubMeetingId;

    @JsonProperty(value = "enable_doc_upload_permission")
    private Boolean enableDocUploadPermission;

    @JsonProperty(value = "enable_enroll")
    private Boolean enableEnroll;

    @JsonProperty(value = "enable_host_key")
    private Boolean enableHostKey;

    @JsonProperty(value = "enable_live")
    private Boolean enableLive;

    @JsonProperty(value = "end_time")
    private String endTime;

    @JsonProperty(value = "guests")
    private List<V1MeetingsGet200ResponseMeetingInfoListInnerGuestsInner> guests;

    @JsonProperty(value = "has_more_sub_meeting")
    private Long hasMoreSubMeeting;

    @JsonProperty(value = "has_vote")
    private Boolean hasVote;

    @JsonProperty(value = "host_key")
    private String hostKey;

    @JsonProperty(value = "hosts")
    private List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> hosts;

    @JsonProperty(value = "join_url")
    private String joinUrl;

    @JsonProperty(value = "live_config")
    private V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig liveConfig;

    @JsonProperty(value = "location")
    private String location;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "meeting_type")
    private Long meetingType;

    @JsonProperty(value = "need_password")
    private Boolean needPassword;

    @JsonProperty(value = "participants")
    private List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> participants;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "recurring_rule")
    private V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerRecurringRule recurringRule;

    @JsonProperty(value = "remain_sub_meetings")
    private Long remainSubMeetings;

    @JsonProperty(value = "settings")
    private V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSettings settings;

    @JsonProperty(value = "start_time")
    private String startTime;

    @JsonProperty(value = "status")
    private String status;

    @JsonProperty(value = "sub_meetings")
    private List<V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner> subMeetings;

    @JsonProperty(value = "subject")
    private String subject;

    @JsonProperty(value = "sync_to_wework")
    private Boolean syncToWework;

    @JsonProperty(value = "time_zone")
    private String timeZone;

    @JsonProperty(value = "type")
    private Long type;

    /**
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner() {
    }

    /**
     * @param currentCoHosts 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner currentCoHosts(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> currentCoHosts) {
        this.currentCoHosts = currentCoHosts;
        return this;
    }
    /**
     * @return currentCoHosts 
     **/
    public List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> getCurrentCoHosts() {
        return currentCoHosts;
    }

    /**
     * @param currentCoHosts 
     */
    public void setCurrentCoHosts(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> currentCoHosts) {
        this.currentCoHosts = currentCoHosts;
    }
    /**
     * @param currentHosts 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner currentHosts(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> currentHosts) {
        this.currentHosts = currentHosts;
        return this;
    }
    /**
     * @return currentHosts 
     **/
    public List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> getCurrentHosts() {
        return currentHosts;
    }

    /**
     * @param currentHosts 
     */
    public void setCurrentHosts(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> currentHosts) {
        this.currentHosts = currentHosts;
    }
    /**
     * @param currentSubMeetingId 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner currentSubMeetingId(String currentSubMeetingId) {
        this.currentSubMeetingId = currentSubMeetingId;
        return this;
    }
    /**
     * @return currentSubMeetingId 
     **/
    public String getCurrentSubMeetingId() {
        return currentSubMeetingId;
    }

    /**
     * @param currentSubMeetingId 
     */
    public void setCurrentSubMeetingId(String currentSubMeetingId) {
        this.currentSubMeetingId = currentSubMeetingId;
    }
    /**
     * @param enableDocUploadPermission 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner enableDocUploadPermission(Boolean enableDocUploadPermission) {
        this.enableDocUploadPermission = enableDocUploadPermission;
        return this;
    }
    /**
     * @return enableDocUploadPermission 
     **/
    public Boolean getEnableDocUploadPermission() {
        return enableDocUploadPermission;
    }

    /**
     * @param enableDocUploadPermission 
     */
    public void setEnableDocUploadPermission(Boolean enableDocUploadPermission) {
        this.enableDocUploadPermission = enableDocUploadPermission;
    }
    /**
     * @param enableEnroll 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner enableEnroll(Boolean enableEnroll) {
        this.enableEnroll = enableEnroll;
        return this;
    }
    /**
     * @return enableEnroll 
     **/
    public Boolean getEnableEnroll() {
        return enableEnroll;
    }

    /**
     * @param enableEnroll 
     */
    public void setEnableEnroll(Boolean enableEnroll) {
        this.enableEnroll = enableEnroll;
    }
    /**
     * @param enableHostKey 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner enableHostKey(Boolean enableHostKey) {
        this.enableHostKey = enableHostKey;
        return this;
    }
    /**
     * @return enableHostKey 
     **/
    public Boolean getEnableHostKey() {
        return enableHostKey;
    }

    /**
     * @param enableHostKey 
     */
    public void setEnableHostKey(Boolean enableHostKey) {
        this.enableHostKey = enableHostKey;
    }
    /**
     * @param enableLive 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner enableLive(Boolean enableLive) {
        this.enableLive = enableLive;
        return this;
    }
    /**
     * @return enableLive 
     **/
    public Boolean getEnableLive() {
        return enableLive;
    }

    /**
     * @param enableLive 
     */
    public void setEnableLive(Boolean enableLive) {
        this.enableLive = enableLive;
    }
    /**
     * @param endTime 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    /**
     * @return endTime 
     **/
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    /**
     * @param guests 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner guests(List<V1MeetingsGet200ResponseMeetingInfoListInnerGuestsInner> guests) {
        this.guests = guests;
        return this;
    }
    /**
     * @return guests 
     **/
    public List<V1MeetingsGet200ResponseMeetingInfoListInnerGuestsInner> getGuests() {
        return guests;
    }

    /**
     * @param guests 
     */
    public void setGuests(List<V1MeetingsGet200ResponseMeetingInfoListInnerGuestsInner> guests) {
        this.guests = guests;
    }
    /**
     * @param hasMoreSubMeeting 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner hasMoreSubMeeting(Long hasMoreSubMeeting) {
        this.hasMoreSubMeeting = hasMoreSubMeeting;
        return this;
    }
    /**
     * @return hasMoreSubMeeting 
     **/
    public Long getHasMoreSubMeeting() {
        return hasMoreSubMeeting;
    }

    /**
     * @param hasMoreSubMeeting 
     */
    public void setHasMoreSubMeeting(Long hasMoreSubMeeting) {
        this.hasMoreSubMeeting = hasMoreSubMeeting;
    }
    /**
     * @param hasVote 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner hasVote(Boolean hasVote) {
        this.hasVote = hasVote;
        return this;
    }
    /**
     * @return hasVote 
     **/
    public Boolean getHasVote() {
        return hasVote;
    }

    /**
     * @param hasVote 
     */
    public void setHasVote(Boolean hasVote) {
        this.hasVote = hasVote;
    }
    /**
     * @param hostKey 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner hostKey(String hostKey) {
        this.hostKey = hostKey;
        return this;
    }
    /**
     * @return hostKey 
     **/
    public String getHostKey() {
        return hostKey;
    }

    /**
     * @param hostKey 
     */
    public void setHostKey(String hostKey) {
        this.hostKey = hostKey;
    }
    /**
     * @param hosts 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner hosts(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> hosts) {
        this.hosts = hosts;
        return this;
    }
    /**
     * @return hosts 
     **/
    public List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> getHosts() {
        return hosts;
    }

    /**
     * @param hosts 
     */
    public void setHosts(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> hosts) {
        this.hosts = hosts;
    }
    /**
     * @param joinUrl 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner joinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
        return this;
    }
    /**
     * @return joinUrl 
     **/
    public String getJoinUrl() {
        return joinUrl;
    }

    /**
     * @param joinUrl 
     */
    public void setJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
    }
    /**
     * @param liveConfig 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner liveConfig(V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig liveConfig) {
        this.liveConfig = liveConfig;
        return this;
    }
    /**
     * @return liveConfig 
     **/
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig getLiveConfig() {
        return liveConfig;
    }

    /**
     * @param liveConfig 
     */
    public void setLiveConfig(V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig liveConfig) {
        this.liveConfig = liveConfig;
    }
    /**
     * @param location 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner location(String location) {
        this.location = location;
        return this;
    }
    /**
     * @return location 
     **/
    public String getLocation() {
        return location;
    }

    /**
     * @param location 
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * @param meetingCode 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param meetingType 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner meetingType(Long meetingType) {
        this.meetingType = meetingType;
        return this;
    }
    /**
     * @return meetingType 
     **/
    public Long getMeetingType() {
        return meetingType;
    }

    /**
     * @param meetingType 
     */
    public void setMeetingType(Long meetingType) {
        this.meetingType = meetingType;
    }
    /**
     * @param needPassword 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner needPassword(Boolean needPassword) {
        this.needPassword = needPassword;
        return this;
    }
    /**
     * @return needPassword 
     **/
    public Boolean getNeedPassword() {
        return needPassword;
    }

    /**
     * @param needPassword 
     */
    public void setNeedPassword(Boolean needPassword) {
        this.needPassword = needPassword;
    }
    /**
     * @param participants 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner participants(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> participants) {
        this.participants = participants;
        return this;
    }
    /**
     * @return participants 
     **/
    public List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> getParticipants() {
        return participants;
    }

    /**
     * @param participants 
     */
    public void setParticipants(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> participants) {
        this.participants = participants;
    }
    /**
     * @param password 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner password(String password) {
        this.password = password;
        return this;
    }
    /**
     * @return password 
     **/
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @param recurringRule 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner recurringRule(V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerRecurringRule recurringRule) {
        this.recurringRule = recurringRule;
        return this;
    }
    /**
     * @return recurringRule 
     **/
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerRecurringRule getRecurringRule() {
        return recurringRule;
    }

    /**
     * @param recurringRule 
     */
    public void setRecurringRule(V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerRecurringRule recurringRule) {
        this.recurringRule = recurringRule;
    }
    /**
     * @param remainSubMeetings 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner remainSubMeetings(Long remainSubMeetings) {
        this.remainSubMeetings = remainSubMeetings;
        return this;
    }
    /**
     * @return remainSubMeetings 
     **/
    public Long getRemainSubMeetings() {
        return remainSubMeetings;
    }

    /**
     * @param remainSubMeetings 
     */
    public void setRemainSubMeetings(Long remainSubMeetings) {
        this.remainSubMeetings = remainSubMeetings;
    }
    /**
     * @param settings 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner settings(V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSettings settings) {
        this.settings = settings;
        return this;
    }
    /**
     * @return settings 
     **/
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSettings getSettings() {
        return settings;
    }

    /**
     * @param settings 
     */
    public void setSettings(V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSettings settings) {
        this.settings = settings;
    }
    /**
     * @param startTime 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    /**
     * @return startTime 
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    /**
     * @param status 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner status(String status) {
        this.status = status;
        return this;
    }
    /**
     * @return status 
     **/
    public String getStatus() {
        return status;
    }

    /**
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @param subMeetings 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner subMeetings(List<V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner> subMeetings) {
        this.subMeetings = subMeetings;
        return this;
    }
    /**
     * @return subMeetings 
     **/
    public List<V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner> getSubMeetings() {
        return subMeetings;
    }

    /**
     * @param subMeetings 
     */
    public void setSubMeetings(List<V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerSubMeetingsInner> subMeetings) {
        this.subMeetings = subMeetings;
    }
    /**
     * @param subject 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner subject(String subject) {
        this.subject = subject;
        return this;
    }
    /**
     * @return subject 
     **/
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject 
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * @param syncToWework 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner syncToWework(Boolean syncToWework) {
        this.syncToWework = syncToWework;
        return this;
    }
    /**
     * @return syncToWework 
     **/
    public Boolean getSyncToWework() {
        return syncToWework;
    }

    /**
     * @param syncToWework 
     */
    public void setSyncToWework(Boolean syncToWework) {
        this.syncToWework = syncToWework;
    }
    /**
     * @param timeZone 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    /**
     * @return timeZone 
     **/
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone 
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    /**
     * @param type 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner type(Long type) {
        this.type = type;
        return this;
    }
    /**
     * @return type 
     **/
    public Long getType() {
        return type;
    }

    /**
     * @param type 
     */
    public void setType(Long type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner = (V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner) o;
        return Objects.equals(this.currentCoHosts, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.currentCoHosts) &&
            Objects.equals(this.currentHosts, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.currentHosts) &&
            Objects.equals(this.currentSubMeetingId, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.currentSubMeetingId) &&
            Objects.equals(this.enableDocUploadPermission, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.enableDocUploadPermission) &&
            Objects.equals(this.enableEnroll, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.enableEnroll) &&
            Objects.equals(this.enableHostKey, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.enableHostKey) &&
            Objects.equals(this.enableLive, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.enableLive) &&
            Objects.equals(this.endTime, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.endTime) &&
            Objects.equals(this.guests, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.guests) &&
            Objects.equals(this.hasMoreSubMeeting, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.hasMoreSubMeeting) &&
            Objects.equals(this.hasVote, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.hasVote) &&
            Objects.equals(this.hostKey, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.hostKey) &&
            Objects.equals(this.hosts, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.hosts) &&
            Objects.equals(this.joinUrl, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.joinUrl) &&
            Objects.equals(this.liveConfig, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.liveConfig) &&
            Objects.equals(this.location, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.location) &&
            Objects.equals(this.meetingCode, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.meetingCode) &&
            Objects.equals(this.meetingId, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.meetingId) &&
            Objects.equals(this.meetingType, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.meetingType) &&
            Objects.equals(this.needPassword, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.needPassword) &&
            Objects.equals(this.participants, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.participants) &&
            Objects.equals(this.password, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.password) &&
            Objects.equals(this.recurringRule, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.recurringRule) &&
            Objects.equals(this.remainSubMeetings, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.remainSubMeetings) &&
            Objects.equals(this.settings, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.settings) &&
            Objects.equals(this.startTime, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.startTime) &&
            Objects.equals(this.status, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.status) &&
            Objects.equals(this.subMeetings, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.subMeetings) &&
            Objects.equals(this.subject, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.subject) &&
            Objects.equals(this.syncToWework, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.syncToWework) &&
            Objects.equals(this.timeZone, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.timeZone) &&
            Objects.equals(this.type, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInner.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentCoHosts, currentHosts, currentSubMeetingId, enableDocUploadPermission, enableEnroll, enableHostKey, enableLive, endTime, guests, hasMoreSubMeeting, hasVote, hostKey, hosts, joinUrl, liveConfig, location, meetingCode, meetingId, meetingType, needPassword, participants, password, recurringRule, remainSubMeetings, settings, startTime, status, subMeetings, subject, syncToWework, timeZone, type);
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
        sb.append("class V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner {\n");
        sb.append("    currentCoHosts: ").append(toIndentedString(currentCoHosts)).append("\n");
        sb.append("    currentHosts: ").append(toIndentedString(currentHosts)).append("\n");
        sb.append("    currentSubMeetingId: ").append(toIndentedString(currentSubMeetingId)).append("\n");
        sb.append("    enableDocUploadPermission: ").append(toIndentedString(enableDocUploadPermission)).append("\n");
        sb.append("    enableEnroll: ").append(toIndentedString(enableEnroll)).append("\n");
        sb.append("    enableHostKey: ").append(toIndentedString(enableHostKey)).append("\n");
        sb.append("    enableLive: ").append(toIndentedString(enableLive)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    guests: ").append(toIndentedString(guests)).append("\n");
        sb.append("    hasMoreSubMeeting: ").append(toIndentedString(hasMoreSubMeeting)).append("\n");
        sb.append("    hasVote: ").append(toIndentedString(hasVote)).append("\n");
        sb.append("    hostKey: ").append(toIndentedString(hostKey)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    joinUrl: ").append(toIndentedString(joinUrl)).append("\n");
        sb.append("    liveConfig: ").append(toIndentedString(liveConfig)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    meetingType: ").append(toIndentedString(meetingType)).append("\n");
        sb.append("    needPassword: ").append(toIndentedString(needPassword)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    recurringRule: ").append(toIndentedString(recurringRule)).append("\n");
        sb.append("    remainSubMeetings: ").append(toIndentedString(remainSubMeetings)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subMeetings: ").append(toIndentedString(subMeetings)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    syncToWework: ").append(toIndentedString(syncToWework)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


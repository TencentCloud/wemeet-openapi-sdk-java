/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1MeetingsPost200ResponseMeetingInfoListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsPost200ResponseMeetingInfoListInner {
    @JsonProperty(value = "enable_live")
    private Boolean enableLive;

    @JsonProperty(value = "end_time")
    private String endTime;

    @JsonProperty(value = "host_key")
    private String hostKey;

    @JsonProperty(value = "hosts")
    private List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> hosts;

    @JsonProperty(value = "join_url")
    private String joinUrl;

    @JsonProperty(value = "live_config")
    private V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig liveConfig;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "participants")
    private List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> participants;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "settings")
    private V1MeetingsPost200ResponseMeetingInfoListInnerSettings settings;

    @JsonProperty(value = "start_time")
    private String startTime;

    @JsonProperty(value = "subject")
    private String subject;

    @JsonProperty(value = "user_non_registered")
    private List<String> userNonRegistered;

    /**
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner() {
    }

    /**
     * @param enableLive 是否开启直播。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner enableLive(Boolean enableLive) {
        this.enableLive = enableLive;
        return this;
    }
    /**
     * @return enableLive 是否开启直播。
     **/
    public Boolean getEnableLive() {
        return enableLive;
    }

    /**
     * @param enableLive 是否开启直播。
     */
    public void setEnableLive(Boolean enableLive) {
        this.enableLive = enableLive;
    }
    /**
     * @param endTime 会议结束时间戳（单位秒）
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    /**
     * @return endTime 会议结束时间戳（单位秒）
     **/
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 会议结束时间戳（单位秒）
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    /**
     * @param hostKey 主持人密钥，仅支持6位数字。 如开启主持人密钥后没有填写此项，将自动分配一个6位数字的密钥。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner hostKey(String hostKey) {
        this.hostKey = hostKey;
        return this;
    }
    /**
     * @return hostKey 主持人密钥，仅支持6位数字。 如开启主持人密钥后没有填写此项，将自动分配一个6位数字的密钥。
     **/
    public String getHostKey() {
        return hostKey;
    }

    /**
     * @param hostKey 主持人密钥，仅支持6位数字。 如开启主持人密钥后没有填写此项，将自动分配一个6位数字的密钥。
     */
    public void setHostKey(String hostKey) {
        this.hostKey = hostKey;
    }
    /**
     * @param hosts 会议主持人的用户 ID，如果无指定，主持人将被设定为上文的 userid，即 API 调用者，仅商业版和企业版可指定主持人。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner hosts(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> hosts) {
        this.hosts = hosts;
        return this;
    }
    /**
     * @return hosts 会议主持人的用户 ID，如果无指定，主持人将被设定为上文的 userid，即 API 调用者，仅商业版和企业版可指定主持人。
     **/
    public List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> getHosts() {
        return hosts;
    }

    /**
     * @param hosts 会议主持人的用户 ID，如果无指定，主持人将被设定为上文的 userid，即 API 调用者，仅商业版和企业版可指定主持人。
     */
    public void setHosts(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> hosts) {
        this.hosts = hosts;
    }
    /**
     * @param joinUrl 加入会议 URL（单击链接直接加入会议）。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner joinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
        return this;
    }
    /**
     * @return joinUrl 加入会议 URL（单击链接直接加入会议）。
     **/
    public String getJoinUrl() {
        return joinUrl;
    }

    /**
     * @param joinUrl 加入会议 URL（单击链接直接加入会议）。
     */
    public void setJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
    }
    /**
     * @param liveConfig 
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner liveConfig(V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig liveConfig) {
        this.liveConfig = liveConfig;
        return this;
    }
    /**
     * @return liveConfig 
     **/
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig getLiveConfig() {
        return liveConfig;
    }

    /**
     * @param liveConfig 
     */
    public void setLiveConfig(V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig liveConfig) {
        this.liveConfig = liveConfig;
    }
    /**
     * @param meetingCode 会议 App 的呼入号码。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 会议 App 的呼入号码。
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 会议 App 的呼入号码。
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议ID 
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议ID 
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议ID 
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param participants 邀请的参会者用户 ID，仅商业版和企业版可邀请参会用户。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner participants(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> participants) {
        this.participants = participants;
        return this;
    }
    /**
     * @return participants 邀请的参会者用户 ID，仅商业版和企业版可邀请参会用户。
     **/
    public List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> getParticipants() {
        return participants;
    }

    /**
     * @param participants 邀请的参会者用户 ID，仅商业版和企业版可邀请参会用户。
     */
    public void setParticipants(List<V1MeetingsGet200ResponseMeetingInfoListInnerCurrentCoHostsInner> participants) {
        this.participants = participants;
    }
    /**
     * @param password 会议密码。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner password(String password) {
        this.password = password;
        return this;
    }
    /**
     * @return password 会议密码。
     **/
    public String getPassword() {
        return password;
    }

    /**
     * @param password 会议密码。
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @param settings 
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner settings(V1MeetingsPost200ResponseMeetingInfoListInnerSettings settings) {
        this.settings = settings;
        return this;
    }
    /**
     * @return settings 
     **/
    public V1MeetingsPost200ResponseMeetingInfoListInnerSettings getSettings() {
        return settings;
    }

    /**
     * @param settings 
     */
    public void setSettings(V1MeetingsPost200ResponseMeetingInfoListInnerSettings settings) {
        this.settings = settings;
    }
    /**
     * @param startTime 会议开始时间戳（单位秒），对于快速会议则为会议创建的时间。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    /**
     * @return startTime 会议开始时间戳（单位秒），对于快速会议则为会议创建的时间。
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 会议开始时间戳（单位秒），对于快速会议则为会议创建的时间。
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    /**
     * @param subject 会议主题
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner subject(String subject) {
        this.subject = subject;
        return this;
    }
    /**
     * @return subject 会议主题
     **/
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject 会议主题
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * @param userNonRegistered 邀请的参会者中未注册用户。 注意：仅腾讯会议商业版和企业版可获取该参数。
     */
    public V1MeetingsPost200ResponseMeetingInfoListInner userNonRegistered(List<String> userNonRegistered) {
        this.userNonRegistered = userNonRegistered;
        return this;
    }
    /**
     * @return userNonRegistered 邀请的参会者中未注册用户。 注意：仅腾讯会议商业版和企业版可获取该参数。
     **/
    public List<String> getUserNonRegistered() {
        return userNonRegistered;
    }

    /**
     * @param userNonRegistered 邀请的参会者中未注册用户。 注意：仅腾讯会议商业版和企业版可获取该参数。
     */
    public void setUserNonRegistered(List<String> userNonRegistered) {
        this.userNonRegistered = userNonRegistered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsPost200ResponseMeetingInfoListInner v1MeetingsPost200ResponseMeetingInfoListInner = (V1MeetingsPost200ResponseMeetingInfoListInner) o;
        return Objects.equals(this.enableLive, v1MeetingsPost200ResponseMeetingInfoListInner.enableLive) &&
            Objects.equals(this.endTime, v1MeetingsPost200ResponseMeetingInfoListInner.endTime) &&
            Objects.equals(this.hostKey, v1MeetingsPost200ResponseMeetingInfoListInner.hostKey) &&
            Objects.equals(this.hosts, v1MeetingsPost200ResponseMeetingInfoListInner.hosts) &&
            Objects.equals(this.joinUrl, v1MeetingsPost200ResponseMeetingInfoListInner.joinUrl) &&
            Objects.equals(this.liveConfig, v1MeetingsPost200ResponseMeetingInfoListInner.liveConfig) &&
            Objects.equals(this.meetingCode, v1MeetingsPost200ResponseMeetingInfoListInner.meetingCode) &&
            Objects.equals(this.meetingId, v1MeetingsPost200ResponseMeetingInfoListInner.meetingId) &&
            Objects.equals(this.participants, v1MeetingsPost200ResponseMeetingInfoListInner.participants) &&
            Objects.equals(this.password, v1MeetingsPost200ResponseMeetingInfoListInner.password) &&
            Objects.equals(this.settings, v1MeetingsPost200ResponseMeetingInfoListInner.settings) &&
            Objects.equals(this.startTime, v1MeetingsPost200ResponseMeetingInfoListInner.startTime) &&
            Objects.equals(this.subject, v1MeetingsPost200ResponseMeetingInfoListInner.subject) &&
            Objects.equals(this.userNonRegistered, v1MeetingsPost200ResponseMeetingInfoListInner.userNonRegistered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableLive, endTime, hostKey, hosts, joinUrl, liveConfig, meetingCode, meetingId, participants, password, settings, startTime, subject, userNonRegistered);
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
        sb.append("class V1MeetingsPost200ResponseMeetingInfoListInner {\n");
        sb.append("    enableLive: ").append(toIndentedString(enableLive)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    hostKey: ").append(toIndentedString(hostKey)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    joinUrl: ").append(toIndentedString(joinUrl)).append("\n");
        sb.append("    liveConfig: ").append(toIndentedString(liveConfig)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    userNonRegistered: ").append(toIndentedString(userNonRegistered)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


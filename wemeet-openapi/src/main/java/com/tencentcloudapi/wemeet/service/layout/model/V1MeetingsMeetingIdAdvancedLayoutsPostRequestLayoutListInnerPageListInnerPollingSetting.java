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

package com.tencentcloudapi.wemeet.service.layout.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * 轮询参数设置对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting {
    @JsonProperty(value = "ignore_user_absence", required = true)
    private Boolean ignoreUserAbsence;

    @JsonProperty(value = "ignore_user_novideo", required = true)
    private Boolean ignoreUserNovideo;

    @JsonProperty(value = "polling_interval", required = true)
    private Long pollingInterval;

    @JsonProperty(value = "polling_interval_unit", required = true)
    private Long pollingIntervalUnit;

    /**
     * @param ignoreUserAbsence 轮询开启后设置参数， 设置是否忽略未入会成员 (required)
     * @param ignoreUserNovideo 轮询开启后设置参数，设置是否忽略没开启视频成员 (required)
     * @param pollingInterval 轮询开启后设置参数 轮询间隔时长， 允许取值范围1～999999 (required)
     * @param pollingIntervalUnit 轮询开启后设置参数。 轮询间隔时间类型： 1-秒 2-分钟 (required)
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting(@NotNull Boolean ignoreUserAbsence, @NotNull Boolean ignoreUserNovideo, @NotNull Long pollingInterval, @NotNull Long pollingIntervalUnit) {
        this.ignoreUserAbsence = ignoreUserAbsence;
        this.ignoreUserNovideo = ignoreUserNovideo;
        this.pollingInterval = pollingInterval;
        this.pollingIntervalUnit = pollingIntervalUnit;
    }

    /**
     * @param ignoreUserAbsence 轮询开启后设置参数， 设置是否忽略未入会成员 (required)
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting ignoreUserAbsence(@NotNull Boolean ignoreUserAbsence) {
        this.ignoreUserAbsence = ignoreUserAbsence;
        return this;
    }
    /**
     * @return ignoreUserAbsence 轮询开启后设置参数， 设置是否忽略未入会成员
     **/
    public Boolean getIgnoreUserAbsence() {
        return ignoreUserAbsence;
    }

    /**
     * @param ignoreUserAbsence 轮询开启后设置参数， 设置是否忽略未入会成员 (required)
     */
    public void setIgnoreUserAbsence(Boolean ignoreUserAbsence) {
        this.ignoreUserAbsence = ignoreUserAbsence;
    }
    /**
     * @param ignoreUserNovideo 轮询开启后设置参数，设置是否忽略没开启视频成员 (required)
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting ignoreUserNovideo(@NotNull Boolean ignoreUserNovideo) {
        this.ignoreUserNovideo = ignoreUserNovideo;
        return this;
    }
    /**
     * @return ignoreUserNovideo 轮询开启后设置参数，设置是否忽略没开启视频成员
     **/
    public Boolean getIgnoreUserNovideo() {
        return ignoreUserNovideo;
    }

    /**
     * @param ignoreUserNovideo 轮询开启后设置参数，设置是否忽略没开启视频成员 (required)
     */
    public void setIgnoreUserNovideo(Boolean ignoreUserNovideo) {
        this.ignoreUserNovideo = ignoreUserNovideo;
    }
    /**
     * @param pollingInterval 轮询开启后设置参数 轮询间隔时长， 允许取值范围1～999999 (required)
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting pollingInterval(@NotNull Long pollingInterval) {
        this.pollingInterval = pollingInterval;
        return this;
    }
    /**
     * @return pollingInterval 轮询开启后设置参数 轮询间隔时长， 允许取值范围1～999999
     **/
    public Long getPollingInterval() {
        return pollingInterval;
    }

    /**
     * @param pollingInterval 轮询开启后设置参数 轮询间隔时长， 允许取值范围1～999999 (required)
     */
    public void setPollingInterval(Long pollingInterval) {
        this.pollingInterval = pollingInterval;
    }
    /**
     * @param pollingIntervalUnit 轮询开启后设置参数。 轮询间隔时间类型： 1-秒 2-分钟 (required)
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting pollingIntervalUnit(@NotNull Long pollingIntervalUnit) {
        this.pollingIntervalUnit = pollingIntervalUnit;
        return this;
    }
    /**
     * @return pollingIntervalUnit 轮询开启后设置参数。 轮询间隔时间类型： 1-秒 2-分钟
     **/
    public Long getPollingIntervalUnit() {
        return pollingIntervalUnit;
    }

    /**
     * @param pollingIntervalUnit 轮询开启后设置参数。 轮询间隔时间类型： 1-秒 2-分钟 (required)
     */
    public void setPollingIntervalUnit(Long pollingIntervalUnit) {
        this.pollingIntervalUnit = pollingIntervalUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting = (V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting) o;
        return Objects.equals(this.ignoreUserAbsence, v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting.ignoreUserAbsence) &&
            Objects.equals(this.ignoreUserNovideo, v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting.ignoreUserNovideo) &&
            Objects.equals(this.pollingInterval, v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting.pollingInterval) &&
            Objects.equals(this.pollingIntervalUnit, v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting.pollingIntervalUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ignoreUserAbsence, ignoreUserNovideo, pollingInterval, pollingIntervalUnit);
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
        sb.append("class V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting {\n");
        sb.append("    ignoreUserAbsence: ").append(toIndentedString(ignoreUserAbsence)).append("\n");
        sb.append("    ignoreUserNovideo: ").append(toIndentedString(ignoreUserNovideo)).append("\n");
        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
        sb.append("    pollingIntervalUnit: ").append(toIndentedString(pollingIntervalUnit)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


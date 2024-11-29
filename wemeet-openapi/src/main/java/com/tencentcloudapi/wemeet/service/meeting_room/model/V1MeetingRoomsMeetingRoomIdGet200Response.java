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

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingRoomsMeetingRoomIdGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsMeetingRoomIdGet200Response {
    @JsonProperty(value = "account_info")
    private V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo accountInfo;

    @JsonProperty(value = "basic_info")
    private V1MeetingRoomsMeetingRoomIdGet200ResponseBasicInfo basicInfo;

    @JsonProperty(value = "hardware_info")
    private V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo hardwareInfo;

    @JsonProperty(value = "is_allow_call")
    private Boolean isAllowCall;

    @JsonProperty(value = "monitor_status")
    private Long monitorStatus;

    @JsonProperty(value = "pmi_info")
    private V1MeetingRoomsMeetingRoomIdGet200ResponsePmiInfo pmiInfo;

    @JsonProperty(value = "scheduled_status")
    private Long scheduledStatus;

    /**
     */
    public V1MeetingRoomsMeetingRoomIdGet200Response() {
    }

    /**
     * @param accountInfo 
     */
    public V1MeetingRoomsMeetingRoomIdGet200Response accountInfo(V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    /**
     * @return accountInfo 
     **/
    public V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * @param accountInfo 
     */
    public void setAccountInfo(V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }
    /**
     * @param basicInfo 
     */
    public V1MeetingRoomsMeetingRoomIdGet200Response basicInfo(V1MeetingRoomsMeetingRoomIdGet200ResponseBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }
    /**
     * @return basicInfo 
     **/
    public V1MeetingRoomsMeetingRoomIdGet200ResponseBasicInfo getBasicInfo() {
        return basicInfo;
    }

    /**
     * @param basicInfo 
     */
    public void setBasicInfo(V1MeetingRoomsMeetingRoomIdGet200ResponseBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }
    /**
     * @param hardwareInfo 
     */
    public V1MeetingRoomsMeetingRoomIdGet200Response hardwareInfo(V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo hardwareInfo) {
        this.hardwareInfo = hardwareInfo;
        return this;
    }
    /**
     * @return hardwareInfo 
     **/
    public V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo getHardwareInfo() {
        return hardwareInfo;
    }

    /**
     * @param hardwareInfo 
     */
    public void setHardwareInfo(V1MeetingRoomsMeetingRoomIdGet200ResponseHardwareInfo hardwareInfo) {
        this.hardwareInfo = hardwareInfo;
    }
    /**
     * @param isAllowCall 是否允许被呼叫，true：是 false：否
     */
    public V1MeetingRoomsMeetingRoomIdGet200Response isAllowCall(Boolean isAllowCall) {
        this.isAllowCall = isAllowCall;
        return this;
    }
    /**
     * @return isAllowCall 是否允许被呼叫，true：是 false：否
     **/
    public Boolean getIsAllowCall() {
        return isAllowCall;
    }

    /**
     * @param isAllowCall 是否允许被呼叫，true：是 false：否
     */
    public void setIsAllowCall(Boolean isAllowCall) {
        this.isAllowCall = isAllowCall;
    }
    /**
     * @param monitorStatus 告警通知状态，0：未开启 1：已开启
     */
    public V1MeetingRoomsMeetingRoomIdGet200Response monitorStatus(Long monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    /**
     * @return monitorStatus 告警通知状态，0：未开启 1：已开启
     **/
    public Long getMonitorStatus() {
        return monitorStatus;
    }

    /**
     * @param monitorStatus 告警通知状态，0：未开启 1：已开启
     */
    public void setMonitorStatus(Long monitorStatus) {
        this.monitorStatus = monitorStatus;
    }
    /**
     * @param pmiInfo 
     */
    public V1MeetingRoomsMeetingRoomIdGet200Response pmiInfo(V1MeetingRoomsMeetingRoomIdGet200ResponsePmiInfo pmiInfo) {
        this.pmiInfo = pmiInfo;
        return this;
    }
    /**
     * @return pmiInfo 
     **/
    public V1MeetingRoomsMeetingRoomIdGet200ResponsePmiInfo getPmiInfo() {
        return pmiInfo;
    }

    /**
     * @param pmiInfo 
     */
    public void setPmiInfo(V1MeetingRoomsMeetingRoomIdGet200ResponsePmiInfo pmiInfo) {
        this.pmiInfo = pmiInfo;
    }
    /**
     * @param scheduledStatus 预定状态： 0：未开放预定 1：开放预定
     */
    public V1MeetingRoomsMeetingRoomIdGet200Response scheduledStatus(Long scheduledStatus) {
        this.scheduledStatus = scheduledStatus;
        return this;
    }
    /**
     * @return scheduledStatus 预定状态： 0：未开放预定 1：开放预定
     **/
    public Long getScheduledStatus() {
        return scheduledStatus;
    }

    /**
     * @param scheduledStatus 预定状态： 0：未开放预定 1：开放预定
     */
    public void setScheduledStatus(Long scheduledStatus) {
        this.scheduledStatus = scheduledStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsMeetingRoomIdGet200Response v1MeetingRoomsMeetingRoomIdGet200Response = (V1MeetingRoomsMeetingRoomIdGet200Response) o;
        return Objects.equals(this.accountInfo, v1MeetingRoomsMeetingRoomIdGet200Response.accountInfo) &&
            Objects.equals(this.basicInfo, v1MeetingRoomsMeetingRoomIdGet200Response.basicInfo) &&
            Objects.equals(this.hardwareInfo, v1MeetingRoomsMeetingRoomIdGet200Response.hardwareInfo) &&
            Objects.equals(this.isAllowCall, v1MeetingRoomsMeetingRoomIdGet200Response.isAllowCall) &&
            Objects.equals(this.monitorStatus, v1MeetingRoomsMeetingRoomIdGet200Response.monitorStatus) &&
            Objects.equals(this.pmiInfo, v1MeetingRoomsMeetingRoomIdGet200Response.pmiInfo) &&
            Objects.equals(this.scheduledStatus, v1MeetingRoomsMeetingRoomIdGet200Response.scheduledStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountInfo, basicInfo, hardwareInfo, isAllowCall, monitorStatus, pmiInfo, scheduledStatus);
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
        sb.append("class V1MeetingRoomsMeetingRoomIdGet200Response {\n");
        sb.append("    accountInfo: ").append(toIndentedString(accountInfo)).append("\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    hardwareInfo: ").append(toIndentedString(hardwareInfo)).append("\n");
        sb.append("    isAllowCall: ").append(toIndentedString(isAllowCall)).append("\n");
        sb.append("    monitorStatus: ").append(toIndentedString(monitorStatus)).append("\n");
        sb.append("    pmiInfo: ").append(toIndentedString(pmiInfo)).append("\n");
        sb.append("    scheduledStatus: ").append(toIndentedString(scheduledStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


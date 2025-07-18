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

package com.tencentcloudapi.wemeet.service.record_intelligence.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner {
    @JsonProperty(value = "end_time")
    private String endTime;

    @JsonProperty(value = "sid")
    private String sid;

    @JsonProperty(value = "start_time")
    private String startTime;

    /**
     */
    public V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner() {
    }

    /**
     * @param endTime 结束时间戳（单位毫秒）
     */
    public V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    /**
     * @return endTime 结束时间戳（单位毫秒）
     **/
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 结束时间戳（单位毫秒）
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    /**
     * @param sid 发言语句id
     */
    public V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner sid(String sid) {
        this.sid = sid;
        return this;
    }
    /**
     * @return sid 发言语句id
     **/
    public String getSid() {
        return sid;
    }

    /**
     * @param sid 发言语句id
     */
    public void setSid(String sid) {
        this.sid = sid;
    }
    /**
     * @param startTime 开始时间戳（单位毫秒）
     */
    public V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    /**
     * @return startTime 开始时间戳（单位毫秒）
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 开始时间戳（单位毫秒）
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner v1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner = (V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner) o;
        return Objects.equals(this.endTime, v1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner.endTime) &&
            Objects.equals(this.sid, v1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner.sid) &&
            Objects.equals(this.startTime, v1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, sid, startTime);
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
        sb.append("class V1SmartSpeakersGet200ResponseSpeakerListInnerSpeakerTimeInner {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


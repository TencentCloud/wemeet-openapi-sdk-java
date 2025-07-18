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

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RecordsEventsGet200ResponseEventsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsEventsGet200ResponseEventsInner {
    @JsonProperty(value = "event_type")
    private Long eventType;

    @JsonProperty(value = "operate_time")
    private Long operateTime;

    @JsonProperty(value = "record_name")
    private String recordName;

    @JsonProperty(value = "user_name")
    private String userName;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     */
    public V1RecordsEventsGet200ResponseEventsInner() {
    }

    /**
     * @param eventType 查询事件类型：1：下载，2：查看。
     */
    public V1RecordsEventsGet200ResponseEventsInner eventType(Long eventType) {
        this.eventType = eventType;
        return this;
    }
    /**
     * @return eventType 查询事件类型：1：下载，2：查看。
     **/
    public Long getEventType() {
        return eventType;
    }

    /**
     * @param eventType 查询事件类型：1：下载，2：查看。
     */
    public void setEventType(Long eventType) {
        this.eventType = eventType;
    }
    /**
     * @param operateTime 操作时间，UNIX 时间戳（单位毫秒）。
     */
    public V1RecordsEventsGet200ResponseEventsInner operateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    /**
     * @return operateTime 操作时间，UNIX 时间戳（单位毫秒）。
     **/
    public Long getOperateTime() {
        return operateTime;
    }

    /**
     * @param operateTime 操作时间，UNIX 时间戳（单位毫秒）。
     */
    public void setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
    }
    /**
     * @param recordName 录制文件名称。
     */
    public V1RecordsEventsGet200ResponseEventsInner recordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    /**
     * @return recordName 录制文件名称。
     **/
    public String getRecordName() {
        return recordName;
    }

    /**
     * @param recordName 录制文件名称。
     */
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }
    /**
     * @param userName 用户名称。
     */
    public V1RecordsEventsGet200ResponseEventsInner userName(String userName) {
        this.userName = userName;
        return this;
    }
    /**
     * @return userName 用户名称。
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName 用户名称。
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @param userid 用户 ID。
     */
    public V1RecordsEventsGet200ResponseEventsInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 用户 ID。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 用户 ID。
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RecordsEventsGet200ResponseEventsInner v1RecordsEventsGet200ResponseEventsInner = (V1RecordsEventsGet200ResponseEventsInner) o;
        return Objects.equals(this.eventType, v1RecordsEventsGet200ResponseEventsInner.eventType) &&
            Objects.equals(this.operateTime, v1RecordsEventsGet200ResponseEventsInner.operateTime) &&
            Objects.equals(this.recordName, v1RecordsEventsGet200ResponseEventsInner.recordName) &&
            Objects.equals(this.userName, v1RecordsEventsGet200ResponseEventsInner.userName) &&
            Objects.equals(this.userid, v1RecordsEventsGet200ResponseEventsInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, operateTime, recordName, userName, userid);
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
        sb.append("class V1RecordsEventsGet200ResponseEventsInner {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    recordName: ").append(toIndentedString(recordName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


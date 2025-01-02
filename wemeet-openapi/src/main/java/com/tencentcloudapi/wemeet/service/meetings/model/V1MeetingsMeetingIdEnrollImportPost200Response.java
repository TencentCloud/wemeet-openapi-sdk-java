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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdEnrollImportPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollImportPost200Response {
    @JsonProperty(value = "enroll_list")
    private List<V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner> enrollList;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "user_non_registered")
    private List<String> userNonRegistered;

    /**
     */
    public V1MeetingsMeetingIdEnrollImportPost200Response() {
    }

    /**
     * @param enrollList 报名对象列表 
     */
    public V1MeetingsMeetingIdEnrollImportPost200Response enrollList(List<V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner> enrollList) {
        this.enrollList = enrollList;
        return this;
    }
    /**
     * @return enrollList 报名对象列表 
     **/
    public List<V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner> getEnrollList() {
        return enrollList;
    }

    /**
     * @param enrollList 报名对象列表 
     */
    public void setEnrollList(List<V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner> enrollList) {
        this.enrollList = enrollList;
    }
    /**
     * @param totalCount 成功导入的报名信息条数
     */
    public V1MeetingsMeetingIdEnrollImportPost200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 成功导入的报名信息条数
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 成功导入的报名信息条数
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param userNonRegistered 未注册用户列表
     */
    public V1MeetingsMeetingIdEnrollImportPost200Response userNonRegistered(List<String> userNonRegistered) {
        this.userNonRegistered = userNonRegistered;
        return this;
    }
    /**
     * @return userNonRegistered 未注册用户列表
     **/
    public List<String> getUserNonRegistered() {
        return userNonRegistered;
    }

    /**
     * @param userNonRegistered 未注册用户列表
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
        V1MeetingsMeetingIdEnrollImportPost200Response v1MeetingsMeetingIdEnrollImportPost200Response = (V1MeetingsMeetingIdEnrollImportPost200Response) o;
        return Objects.equals(this.enrollList, v1MeetingsMeetingIdEnrollImportPost200Response.enrollList) &&
            Objects.equals(this.totalCount, v1MeetingsMeetingIdEnrollImportPost200Response.totalCount) &&
            Objects.equals(this.userNonRegistered, v1MeetingsMeetingIdEnrollImportPost200Response.userNonRegistered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enrollList, totalCount, userNonRegistered);
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
        sb.append("class V1MeetingsMeetingIdEnrollImportPost200Response {\n");
        sb.append("    enrollList: ").append(toIndentedString(enrollList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    userNonRegistered: ").append(toIndentedString(userNonRegistered)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.0.70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloud.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1PmiMeetingsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1PmiMeetingsGet200Response {
    @JsonProperty(value = "current_page")
    private Long currentPage;

    @JsonProperty(value = "current_size")
    private Long currentSize;

    @JsonProperty(value = "meeting_info_list")
    private List<V1PmiMeetingsGet200ResponseMeetingInfoListInner> meetingInfoList;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "total_page")
    private Long totalPage;

    /**
     */
    public V1PmiMeetingsGet200Response() {
    }

    /**
     * @param currentPage 当前页。
     */
    public V1PmiMeetingsGet200Response currentPage(Long currentPage) {
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
     * @param currentSize 当前实际页大小。
     */
    public V1PmiMeetingsGet200Response currentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    /**
     * @return currentSize 当前实际页大小。
     **/
    public Long getCurrentSize() {
        return currentSize;
    }

    /**
     * @param currentSize 当前实际页大小。
     */
    public void setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
    }
    /**
     * @param meetingInfoList 会议列表。
     */
    public V1PmiMeetingsGet200Response meetingInfoList(List<V1PmiMeetingsGet200ResponseMeetingInfoListInner> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
        return this;
    }
    /**
     * @return meetingInfoList 会议列表。
     **/
    public List<V1PmiMeetingsGet200ResponseMeetingInfoListInner> getMeetingInfoList() {
        return meetingInfoList;
    }

    /**
     * @param meetingInfoList 会议列表。
     */
    public void setMeetingInfoList(List<V1PmiMeetingsGet200ResponseMeetingInfoListInner> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }
    /**
     * @param totalCount 数据总条数。
     */
    public V1PmiMeetingsGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 数据总条数。
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 数据总条数。
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param totalPage 数据总页数。
     */
    public V1PmiMeetingsGet200Response totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    /**
     * @return totalPage 数据总页数。
     **/
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage 数据总页数。
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
        V1PmiMeetingsGet200Response v1PmiMeetingsGet200Response = (V1PmiMeetingsGet200Response) o;
        return Objects.equals(this.currentPage, v1PmiMeetingsGet200Response.currentPage) &&
            Objects.equals(this.currentSize, v1PmiMeetingsGet200Response.currentSize) &&
            Objects.equals(this.meetingInfoList, v1PmiMeetingsGet200Response.meetingInfoList) &&
            Objects.equals(this.totalCount, v1PmiMeetingsGet200Response.totalCount) &&
            Objects.equals(this.totalPage, v1PmiMeetingsGet200Response.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPage, currentSize, meetingInfoList, totalCount, totalPage);
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
        sb.append("class V1PmiMeetingsGet200Response {\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    meetingInfoList: ").append(toIndentedString(meetingInfoList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


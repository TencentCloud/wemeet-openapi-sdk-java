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

package com.tencentcloud.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RecordsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsGet200Response {
    @JsonProperty(value = "current_page")
    private Long currentPage;

    @JsonProperty(value = "current_size")
    private Long currentSize;

    @JsonProperty(value = "record_meetings")
    private List<V1RecordsGet200ResponseRecordMeetingsInner> recordMeetings;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "total_page")
    private Long totalPage;

    /**
     */
    public V1RecordsGet200Response() {
    }

    /**
     * @param currentPage 分页查询返回当前页码。
     */
    public V1RecordsGet200Response currentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    /**
     * @return currentPage 分页查询返回当前页码。
     **/
    public Long getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage 分页查询返回当前页码。
     */
    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }
    /**
     * @param currentSize 分页查询返回单页数据条数。
     */
    public V1RecordsGet200Response currentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    /**
     * @return currentSize 分页查询返回单页数据条数。
     **/
    public Long getCurrentSize() {
        return currentSize;
    }

    /**
     * @param currentSize 分页查询返回单页数据条数。
     */
    public void setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
    }
    /**
     * @param recordMeetings 会议录制列表。
     */
    public V1RecordsGet200Response recordMeetings(List<V1RecordsGet200ResponseRecordMeetingsInner> recordMeetings) {
        this.recordMeetings = recordMeetings;
        return this;
    }
    /**
     * @return recordMeetings 会议录制列表。
     **/
    public List<V1RecordsGet200ResponseRecordMeetingsInner> getRecordMeetings() {
        return recordMeetings;
    }

    /**
     * @param recordMeetings 会议录制列表。
     */
    public void setRecordMeetings(List<V1RecordsGet200ResponseRecordMeetingsInner> recordMeetings) {
        this.recordMeetings = recordMeetings;
    }
    /**
     * @param totalCount 分页查询返回数据总数。
     */
    public V1RecordsGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 分页查询返回数据总数。
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 分页查询返回数据总数。
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param totalPage 分页查询返回分页总数。
     */
    public V1RecordsGet200Response totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    /**
     * @return totalPage 分页查询返回分页总数。
     **/
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage 分页查询返回分页总数。
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
        V1RecordsGet200Response v1RecordsGet200Response = (V1RecordsGet200Response) o;
        return Objects.equals(this.currentPage, v1RecordsGet200Response.currentPage) &&
            Objects.equals(this.currentSize, v1RecordsGet200Response.currentSize) &&
            Objects.equals(this.recordMeetings, v1RecordsGet200Response.recordMeetings) &&
            Objects.equals(this.totalCount, v1RecordsGet200Response.totalCount) &&
            Objects.equals(this.totalPage, v1RecordsGet200Response.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPage, currentSize, recordMeetings, totalCount, totalPage);
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
        sb.append("class V1RecordsGet200Response {\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    recordMeetings: ").append(toIndentedString(recordMeetings)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


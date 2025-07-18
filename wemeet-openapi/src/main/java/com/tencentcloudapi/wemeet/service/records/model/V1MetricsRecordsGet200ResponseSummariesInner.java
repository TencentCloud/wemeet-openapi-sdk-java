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
 * V1MetricsRecordsGet200ResponseSummariesInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MetricsRecordsGet200ResponseSummariesInner {
    @JsonProperty(value = "date")
    private String date;

    @JsonProperty(value = "download_counts")
    private Long downloadCounts;

    @JsonProperty(value = "view_counts")
    private Long viewCounts;

    /**
     */
    public V1MetricsRecordsGet200ResponseSummariesInner() {
    }

    /**
     * @param date 统计时间，格式：yyyy-MM-dd。
     */
    public V1MetricsRecordsGet200ResponseSummariesInner date(String date) {
        this.date = date;
        return this;
    }
    /**
     * @return date 统计时间，格式：yyyy-MM-dd。
     **/
    public String getDate() {
        return date;
    }

    /**
     * @param date 统计时间，格式：yyyy-MM-dd。
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * @param downloadCounts 下载次数（当天数据），默认0。
     */
    public V1MetricsRecordsGet200ResponseSummariesInner downloadCounts(Long downloadCounts) {
        this.downloadCounts = downloadCounts;
        return this;
    }
    /**
     * @return downloadCounts 下载次数（当天数据），默认0。
     **/
    public Long getDownloadCounts() {
        return downloadCounts;
    }

    /**
     * @param downloadCounts 下载次数（当天数据），默认0。
     */
    public void setDownloadCounts(Long downloadCounts) {
        this.downloadCounts = downloadCounts;
    }
    /**
     * @param viewCounts 观看次数（当天数据），默认0。
     */
    public V1MetricsRecordsGet200ResponseSummariesInner viewCounts(Long viewCounts) {
        this.viewCounts = viewCounts;
        return this;
    }
    /**
     * @return viewCounts 观看次数（当天数据），默认0。
     **/
    public Long getViewCounts() {
        return viewCounts;
    }

    /**
     * @param viewCounts 观看次数（当天数据），默认0。
     */
    public void setViewCounts(Long viewCounts) {
        this.viewCounts = viewCounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MetricsRecordsGet200ResponseSummariesInner v1MetricsRecordsGet200ResponseSummariesInner = (V1MetricsRecordsGet200ResponseSummariesInner) o;
        return Objects.equals(this.date, v1MetricsRecordsGet200ResponseSummariesInner.date) &&
            Objects.equals(this.downloadCounts, v1MetricsRecordsGet200ResponseSummariesInner.downloadCounts) &&
            Objects.equals(this.viewCounts, v1MetricsRecordsGet200ResponseSummariesInner.viewCounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, downloadCounts, viewCounts);
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
        sb.append("class V1MetricsRecordsGet200ResponseSummariesInner {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    downloadCounts: ").append(toIndentedString(downloadCounts)).append("\n");
        sb.append("    viewCounts: ").append(toIndentedString(viewCounts)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


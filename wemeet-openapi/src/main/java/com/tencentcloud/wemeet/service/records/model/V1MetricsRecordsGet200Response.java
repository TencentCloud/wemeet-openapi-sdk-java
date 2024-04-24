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
 * V1MetricsRecordsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MetricsRecordsGet200Response {
    @JsonProperty(value = "summaries")
    private List<V1MetricsRecordsGet200ResponseSummariesInner> summaries;

    /**
     */
    public V1MetricsRecordsGet200Response() {
    }

    /**
     * @param summaries 概览数据集合。
     */
    public V1MetricsRecordsGet200Response summaries(List<V1MetricsRecordsGet200ResponseSummariesInner> summaries) {
        this.summaries = summaries;
        return this;
    }
    /**
     * @return summaries 概览数据集合。
     **/
    public List<V1MetricsRecordsGet200ResponseSummariesInner> getSummaries() {
        return summaries;
    }

    /**
     * @param summaries 概览数据集合。
     */
    public void setSummaries(List<V1MetricsRecordsGet200ResponseSummariesInner> summaries) {
        this.summaries = summaries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MetricsRecordsGet200Response v1MetricsRecordsGet200Response = (V1MetricsRecordsGet200Response) o;
        return Objects.equals(this.summaries, v1MetricsRecordsGet200Response.summaries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summaries);
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
        sb.append("class V1MetricsRecordsGet200Response {\n");
        sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


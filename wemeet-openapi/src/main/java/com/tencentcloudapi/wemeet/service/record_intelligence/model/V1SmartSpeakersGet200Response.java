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
 * V1SmartSpeakersGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1SmartSpeakersGet200Response {
    @JsonProperty(value = "speaker_list")
    private List<V1SmartSpeakersGet200ResponseSpeakerListInner> speakerList;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    /**
     */
    public V1SmartSpeakersGet200Response() {
    }

    /**
     * @param speakerList 本录制文件的发言人列表，以对象数组形式返回
     */
    public V1SmartSpeakersGet200Response speakerList(List<V1SmartSpeakersGet200ResponseSpeakerListInner> speakerList) {
        this.speakerList = speakerList;
        return this;
    }
    /**
     * @return speakerList 本录制文件的发言人列表，以对象数组形式返回
     **/
    public List<V1SmartSpeakersGet200ResponseSpeakerListInner> getSpeakerList() {
        return speakerList;
    }

    /**
     * @param speakerList 本录制文件的发言人列表，以对象数组形式返回
     */
    public void setSpeakerList(List<V1SmartSpeakersGet200ResponseSpeakerListInner> speakerList) {
        this.speakerList = speakerList;
    }
    /**
     * @param totalCount 发言人总数
     */
    public V1SmartSpeakersGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 发言人总数
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 发言人总数
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1SmartSpeakersGet200Response v1SmartSpeakersGet200Response = (V1SmartSpeakersGet200Response) o;
        return Objects.equals(this.speakerList, v1SmartSpeakersGet200Response.speakerList) &&
            Objects.equals(this.totalCount, v1SmartSpeakersGet200Response.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speakerList, totalCount);
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
        sb.append("class V1SmartSpeakersGet200Response {\n");
        sb.append("    speakerList: ").append(toIndentedString(speakerList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


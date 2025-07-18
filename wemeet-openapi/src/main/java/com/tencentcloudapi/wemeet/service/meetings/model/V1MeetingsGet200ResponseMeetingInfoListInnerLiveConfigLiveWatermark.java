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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark {
    @JsonProperty(value = "watermark_opt")
    private Long watermarkOpt;

    /**
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark() {
    }

    /**
     * @param watermarkOpt 
     */
    public V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark watermarkOpt(Long watermarkOpt) {
        this.watermarkOpt = watermarkOpt;
        return this;
    }
    /**
     * @return watermarkOpt 
     **/
    public Long getWatermarkOpt() {
        return watermarkOpt;
    }

    /**
     * @param watermarkOpt 
     */
    public void setWatermarkOpt(Long watermarkOpt) {
        this.watermarkOpt = watermarkOpt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark v1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark = (V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark) o;
        return Objects.equals(this.watermarkOpt, v1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark.watermarkOpt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watermarkOpt);
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
        sb.append("class V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark {\n");
        sb.append("    watermarkOpt: ").append(toIndentedString(watermarkOpt)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


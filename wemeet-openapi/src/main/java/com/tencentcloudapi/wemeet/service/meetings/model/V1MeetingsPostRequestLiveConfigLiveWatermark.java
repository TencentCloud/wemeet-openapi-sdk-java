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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * 直播水印对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsPostRequestLiveConfigLiveWatermark {
    @JsonProperty(value = "watermark_opt")
    private Long watermarkOpt;

    /**
     */
    public V1MeetingsPostRequestLiveConfigLiveWatermark() {
    }

    /**
     * @param watermarkOpt 水印选项，默认为0。 0：默认水印 1：无水印
     */
    public V1MeetingsPostRequestLiveConfigLiveWatermark watermarkOpt(Long watermarkOpt) {
        this.watermarkOpt = watermarkOpt;
        return this;
    }
    /**
     * @return watermarkOpt 水印选项，默认为0。 0：默认水印 1：无水印
     **/
    public Long getWatermarkOpt() {
        return watermarkOpt;
    }

    /**
     * @param watermarkOpt 水印选项，默认为0。 0：默认水印 1：无水印
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
        V1MeetingsPostRequestLiveConfigLiveWatermark v1MeetingsPostRequestLiveConfigLiveWatermark = (V1MeetingsPostRequestLiveConfigLiveWatermark) o;
        return Objects.equals(this.watermarkOpt, v1MeetingsPostRequestLiveConfigLiveWatermark.watermarkOpt);
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
        sb.append("class V1MeetingsPostRequestLiveConfigLiveWatermark {\n");
        sb.append("    watermarkOpt: ").append(toIndentedString(watermarkOpt)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


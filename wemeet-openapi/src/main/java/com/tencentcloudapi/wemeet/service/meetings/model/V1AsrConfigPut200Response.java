/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1AsrConfigPut200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AsrConfigPut200Response {
    @JsonProperty(value = "tag")
    private String tag;

    /**
     */
    public V1AsrConfigPut200Response() {
    }

    /**
     * @param tag 自定义热词标签
     */
    public V1AsrConfigPut200Response tag(String tag) {
        this.tag = tag;
        return this;
    }
    /**
     * @return tag 自定义热词标签
     **/
    public String getTag() {
        return tag;
    }

    /**
     * @param tag 自定义热词标签
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1AsrConfigPut200Response v1AsrConfigPut200Response = (V1AsrConfigPut200Response) o;
        return Objects.equals(this.tag, v1AsrConfigPut200Response.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
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
        sb.append("class V1AsrConfigPut200Response {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


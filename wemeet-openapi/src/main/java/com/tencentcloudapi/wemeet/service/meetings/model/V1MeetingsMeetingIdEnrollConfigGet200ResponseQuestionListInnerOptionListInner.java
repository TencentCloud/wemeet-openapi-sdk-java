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
 * V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner {
    @JsonProperty(value = "content")
    private String content;

    /**
     */
    public V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner() {
    }

    /**
     * @param content 
     */
    public V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner content(String content) {
        this.content = content;
        return this;
    }
    /**
     * @return content 
     **/
    public String getContent() {
        return content;
    }

    /**
     * @param content 
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner v1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner = (V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner) o;
        return Objects.equals(this.content, v1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
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
        sb.append("class V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


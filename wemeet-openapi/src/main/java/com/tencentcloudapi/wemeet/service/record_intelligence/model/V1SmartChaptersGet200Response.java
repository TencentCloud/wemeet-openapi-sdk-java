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
 * V1SmartChaptersGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1SmartChaptersGet200Response {
    @JsonProperty(value = "chapter_list")
    private List<V1SmartChaptersGet200ResponseChapterListInner> chapterList;

    /**
     */
    public V1SmartChaptersGet200Response() {
    }

    /**
     * @param chapterList ChapterList对象数组
     */
    public V1SmartChaptersGet200Response chapterList(List<V1SmartChaptersGet200ResponseChapterListInner> chapterList) {
        this.chapterList = chapterList;
        return this;
    }
    /**
     * @return chapterList ChapterList对象数组
     **/
    public List<V1SmartChaptersGet200ResponseChapterListInner> getChapterList() {
        return chapterList;
    }

    /**
     * @param chapterList ChapterList对象数组
     */
    public void setChapterList(List<V1SmartChaptersGet200ResponseChapterListInner> chapterList) {
        this.chapterList = chapterList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1SmartChaptersGet200Response v1SmartChaptersGet200Response = (V1SmartChaptersGet200Response) o;
        return Objects.equals(this.chapterList, v1SmartChaptersGet200Response.chapterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chapterList);
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
        sb.append("class V1SmartChaptersGet200Response {\n");
        sb.append("    chapterList: ").append(toIndentedString(chapterList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


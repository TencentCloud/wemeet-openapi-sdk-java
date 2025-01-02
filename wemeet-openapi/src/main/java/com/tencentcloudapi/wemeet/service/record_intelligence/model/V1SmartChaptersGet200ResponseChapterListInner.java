/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.5
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
 * V1SmartChaptersGet200ResponseChapterListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1SmartChaptersGet200ResponseChapterListInner {
    @JsonProperty(value = "chapter_id")
    private String chapterId;

    @JsonProperty(value = "chapter_name")
    private String chapterName;

    @JsonProperty(value = "pic_url")
    private String picUrl;

    @JsonProperty(value = "start_time")
    private String startTime;

    /**
     */
    public V1SmartChaptersGet200ResponseChapterListInner() {
    }

    /**
     * @param chapterId 章节唯一ID
     */
    public V1SmartChaptersGet200ResponseChapterListInner chapterId(String chapterId) {
        this.chapterId = chapterId;
        return this;
    }
    /**
     * @return chapterId 章节唯一ID
     **/
    public String getChapterId() {
        return chapterId;
    }

    /**
     * @param chapterId 章节唯一ID
     */
    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }
    /**
     * @param chapterName 章节主题，返回base64编码后的结果
     */
    public V1SmartChaptersGet200ResponseChapterListInner chapterName(String chapterName) {
        this.chapterName = chapterName;
        return this;
    }
    /**
     * @return chapterName 章节主题，返回base64编码后的结果
     **/
    public String getChapterName() {
        return chapterName;
    }

    /**
     * @param chapterName 章节主题，返回base64编码后的结果
     */
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }
    /**
     * @param picUrl 章节封面图片url
     */
    public V1SmartChaptersGet200ResponseChapterListInner picUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    /**
     * @return picUrl 章节封面图片url
     **/
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * @param picUrl 章节封面图片url
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    /**
     * @param startTime 开始时间戳（单位毫秒）
     */
    public V1SmartChaptersGet200ResponseChapterListInner startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    /**
     * @return startTime 开始时间戳（单位毫秒）
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 开始时间戳（单位毫秒）
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1SmartChaptersGet200ResponseChapterListInner v1SmartChaptersGet200ResponseChapterListInner = (V1SmartChaptersGet200ResponseChapterListInner) o;
        return Objects.equals(this.chapterId, v1SmartChaptersGet200ResponseChapterListInner.chapterId) &&
            Objects.equals(this.chapterName, v1SmartChaptersGet200ResponseChapterListInner.chapterName) &&
            Objects.equals(this.picUrl, v1SmartChaptersGet200ResponseChapterListInner.picUrl) &&
            Objects.equals(this.startTime, v1SmartChaptersGet200ResponseChapterListInner.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chapterId, chapterName, picUrl, startTime);
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
        sb.append("class V1SmartChaptersGet200ResponseChapterListInner {\n");
        sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
        sb.append("    chapterName: ").append(toIndentedString(chapterName)).append("\n");
        sb.append("    picUrl: ").append(toIndentedString(picUrl)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


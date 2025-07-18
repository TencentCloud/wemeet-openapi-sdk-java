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
 * V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner {
    @JsonProperty(value = "end_time")
    private Long endTime;

    @JsonProperty(value = "pid")
    private String pid;

    @JsonProperty(value = "sentences")
    private List<V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner> sentences;

    @JsonProperty(value = "speaker_info")
    private V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo speakerInfo;

    @JsonProperty(value = "start_time")
    private Long startTime;

    /**
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner() {
    }

    /**
     * @param endTime 录制文件中的段落结束时间（毫秒）。
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    /**
     * @return endTime 录制文件中的段落结束时间（毫秒）。
     **/
    public Long getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 录制文件中的段落结束时间（毫秒）。
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    /**
     * @param pid 段落id
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner pid(String pid) {
        this.pid = pid;
        return this;
    }
    /**
     * @return pid 段落id
     **/
    public String getPid() {
        return pid;
    }

    /**
     * @param pid 段落id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }
    /**
     * @param sentences 
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner sentences(List<V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner> sentences) {
        this.sentences = sentences;
        return this;
    }
    /**
     * @return sentences 
     **/
    public List<V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner> getSentences() {
        return sentences;
    }

    /**
     * @param sentences 
     */
    public void setSentences(List<V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner> sentences) {
        this.sentences = sentences;
    }
    /**
     * @param speakerInfo 
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner speakerInfo(V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo speakerInfo) {
        this.speakerInfo = speakerInfo;
        return this;
    }
    /**
     * @return speakerInfo 
     **/
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo getSpeakerInfo() {
        return speakerInfo;
    }

    /**
     * @param speakerInfo 
     */
    public void setSpeakerInfo(V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo speakerInfo) {
        this.speakerInfo = speakerInfo;
    }
    /**
     * @param startTime 录制文件中的段落开始时间（毫秒）。
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    /**
     * @return startTime 录制文件中的段落开始时间（毫秒）。
     **/
    public Long getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 录制文件中的段落开始时间（毫秒）。
     */
    public void setStartTime(Long startTime) {
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
        V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner = (V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner) o;
        return Objects.equals(this.endTime, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner.endTime) &&
            Objects.equals(this.pid, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner.pid) &&
            Objects.equals(this.sentences, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner.sentences) &&
            Objects.equals(this.speakerInfo, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner.speakerInfo) &&
            Objects.equals(this.startTime, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, pid, sentences, speakerInfo, startTime);
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
        sb.append("class V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInner {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
        sb.append("    speakerInfo: ").append(toIndentedString(speakerInfo)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


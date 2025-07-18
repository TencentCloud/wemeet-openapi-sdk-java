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
 * V1AsrConfigPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AsrConfigPutRequest {
    @JsonProperty(value = "customize_words", required = true)
    private List<String> customizeWords;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "record_file_id")
    private String recordFileId;

    @JsonProperty(value = "tag", required = true)
    private String tag;

    /**
     * @param customizeWords  自定义热词，不得包含数字、特殊字符、中英混合，中文十个字以内，英文 20 个字母以内。同场会议或同一个人每次设置会覆盖上次设置内容。会议维度最多支持设置 500 个，创建者维度最多支持设置 100 个。 (required)
     * @param operatorId 操作者ID (required)
     * @param operatorIdType 操作者ID类型 1:userid，2:openid (required)
     * @param tag 自定义热词标签，便于热词分类，最多支持输入 32 个字符（中英文） (required)
     */
    public V1AsrConfigPutRequest(@NotNull List<String> customizeWords, @NotNull String operatorId, @NotNull Long operatorIdType, @NotNull String tag) {
        this.customizeWords = customizeWords;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
        this.tag = tag;
    }

    /**
     * @param customizeWords  自定义热词，不得包含数字、特殊字符、中英混合，中文十个字以内，英文 20 个字母以内。同场会议或同一个人每次设置会覆盖上次设置内容。会议维度最多支持设置 500 个，创建者维度最多支持设置 100 个。 (required)
     */
    public V1AsrConfigPutRequest customizeWords(@NotNull List<String> customizeWords) {
        this.customizeWords = customizeWords;
        return this;
    }
    /**
     * @return customizeWords  自定义热词，不得包含数字、特殊字符、中英混合，中文十个字以内，英文 20 个字母以内。同场会议或同一个人每次设置会覆盖上次设置内容。会议维度最多支持设置 500 个，创建者维度最多支持设置 100 个。
     **/
    public List<String> getCustomizeWords() {
        return customizeWords;
    }

    /**
     * @param customizeWords  自定义热词，不得包含数字、特殊字符、中英混合，中文十个字以内，英文 20 个字母以内。同场会议或同一个人每次设置会覆盖上次设置内容。会议维度最多支持设置 500 个，创建者维度最多支持设置 100 个。 (required)
     */
    public void setCustomizeWords(List<String> customizeWords) {
        this.customizeWords = customizeWords;
    }
    /**
     * @param meetingId 会议ID，有该字段则对该场会议生效。不传该字段则对操作人创建的会议生效
     */
    public V1AsrConfigPutRequest meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议ID，有该字段则对该场会议生效。不传该字段则对操作人创建的会议生效
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议ID，有该字段则对该场会议生效。不传该字段则对操作人创建的会议生效
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param operatorId 操作者ID (required)
     */
    public V1AsrConfigPutRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID类型 1:userid，2:openid (required)
     */
    public V1AsrConfigPutRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID类型 1:userid，2:openid
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID类型 1:userid，2:openid (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param recordFileId 录制文件 ID，若仅传入 record_file_id，未传入 meeting_id，则热词仅对该录制文件生效。
     */
    public V1AsrConfigPutRequest recordFileId(String recordFileId) {
        this.recordFileId = recordFileId;
        return this;
    }
    /**
     * @return recordFileId 录制文件 ID，若仅传入 record_file_id，未传入 meeting_id，则热词仅对该录制文件生效。
     **/
    public String getRecordFileId() {
        return recordFileId;
    }

    /**
     * @param recordFileId 录制文件 ID，若仅传入 record_file_id，未传入 meeting_id，则热词仅对该录制文件生效。
     */
    public void setRecordFileId(String recordFileId) {
        this.recordFileId = recordFileId;
    }
    /**
     * @param tag 自定义热词标签，便于热词分类，最多支持输入 32 个字符（中英文） (required)
     */
    public V1AsrConfigPutRequest tag(@NotNull String tag) {
        this.tag = tag;
        return this;
    }
    /**
     * @return tag 自定义热词标签，便于热词分类，最多支持输入 32 个字符（中英文）
     **/
    public String getTag() {
        return tag;
    }

    /**
     * @param tag 自定义热词标签，便于热词分类，最多支持输入 32 个字符（中英文） (required)
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
        V1AsrConfigPutRequest v1AsrConfigPutRequest = (V1AsrConfigPutRequest) o;
        return Objects.equals(this.customizeWords, v1AsrConfigPutRequest.customizeWords) &&
            Objects.equals(this.meetingId, v1AsrConfigPutRequest.meetingId) &&
            Objects.equals(this.operatorId, v1AsrConfigPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1AsrConfigPutRequest.operatorIdType) &&
            Objects.equals(this.recordFileId, v1AsrConfigPutRequest.recordFileId) &&
            Objects.equals(this.tag, v1AsrConfigPutRequest.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customizeWords, meetingId, operatorId, operatorIdType, recordFileId, tag);
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
        sb.append("class V1AsrConfigPutRequest {\n");
        sb.append("    customizeWords: ").append(toIndentedString(customizeWords)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    recordFileId: ").append(toIndentedString(recordFileId)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1AddressesRecordFileIdGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AddressesRecordFileIdGet200Response {
    @JsonProperty(value = "ai_meeting_transcripts")
    private List<V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner> aiMeetingTranscripts;

    @JsonProperty(value = "ai_minutes")
    private List<V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner> aiMinutes;

    @JsonProperty(value = "audio_address")
    private String audioAddress;

    @JsonProperty(value = "audio_address_file_type")
    private String audioAddressFileType;

    @JsonProperty(value = "download_address")
    private String downloadAddress;

    @JsonProperty(value = "download_address_file_type")
    private String downloadAddressFileType;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "meeting_summary")
    private List<V1AddressesGet200ResponseRecordFilesInnerMeetingSummaryInner> meetingSummary;

    @JsonProperty(value = "record_file_id")
    private String recordFileId;

    @JsonProperty(value = "view_address")
    private String viewAddress;

    /**
     */
    public V1AddressesRecordFileIdGet200Response() {
    }

    /**
     * @param aiMeetingTranscripts 录制转写文件（智能优化版）列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesRecordFileIdGet200Response aiMeetingTranscripts(List<V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner> aiMeetingTranscripts) {
        this.aiMeetingTranscripts = aiMeetingTranscripts;
        return this;
    }
    /**
     * @return aiMeetingTranscripts 录制转写文件（智能优化版）列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public List<V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner> getAiMeetingTranscripts() {
        return aiMeetingTranscripts;
    }

    /**
     * @param aiMeetingTranscripts 录制转写文件（智能优化版）列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setAiMeetingTranscripts(List<V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner> aiMeetingTranscripts) {
        this.aiMeetingTranscripts = aiMeetingTranscripts;
    }
    /**
     * @param aiMinutes 智能纪要列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesRecordFileIdGet200Response aiMinutes(List<V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner> aiMinutes) {
        this.aiMinutes = aiMinutes;
        return this;
    }
    /**
     * @return aiMinutes 智能纪要列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public List<V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner> getAiMinutes() {
        return aiMinutes;
    }

    /**
     * @param aiMinutes 智能纪要列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setAiMinutes(List<V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner> aiMinutes) {
        this.aiMinutes = aiMinutes;
    }
    /**
     * @param audioAddress 音频下载地址。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesRecordFileIdGet200Response audioAddress(String audioAddress) {
        this.audioAddress = audioAddress;
        return this;
    }
    /**
     * @return audioAddress 音频下载地址。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public String getAudioAddress() {
        return audioAddress;
    }

    /**
     * @param audioAddress 音频下载地址。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setAudioAddress(String audioAddress) {
        this.audioAddress = audioAddress;
    }
    /**
     * @param audioAddressFileType 下载音频文件格式，例如：m4a。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesRecordFileIdGet200Response audioAddressFileType(String audioAddressFileType) {
        this.audioAddressFileType = audioAddressFileType;
        return this;
    }
    /**
     * @return audioAddressFileType 下载音频文件格式，例如：m4a。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public String getAudioAddressFileType() {
        return audioAddressFileType;
    }

    /**
     * @param audioAddressFileType 下载音频文件格式，例如：m4a。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setAudioAddressFileType(String audioAddressFileType) {
        this.audioAddressFileType = audioAddressFileType;
    }
    /**
     * @param downloadAddress 下载地址，过期时间6小时。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesRecordFileIdGet200Response downloadAddress(String downloadAddress) {
        this.downloadAddress = downloadAddress;
        return this;
    }
    /**
     * @return downloadAddress 下载地址，过期时间6小时。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public String getDownloadAddress() {
        return downloadAddress;
    }

    /**
     * @param downloadAddress 下载地址，过期时间6小时。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setDownloadAddress(String downloadAddress) {
        this.downloadAddress = downloadAddress;
    }
    /**
     * @param downloadAddressFileType 下载视频文件格式，例如：mp4。
     */
    public V1AddressesRecordFileIdGet200Response downloadAddressFileType(String downloadAddressFileType) {
        this.downloadAddressFileType = downloadAddressFileType;
        return this;
    }
    /**
     * @return downloadAddressFileType 下载视频文件格式，例如：mp4。
     **/
    public String getDownloadAddressFileType() {
        return downloadAddressFileType;
    }

    /**
     * @param downloadAddressFileType 下载视频文件格式，例如：mp4。
     */
    public void setDownloadAddressFileType(String downloadAddressFileType) {
        this.downloadAddressFileType = downloadAddressFileType;
    }
    /**
     * @param meetingCode 会议 code。
     */
    public V1AddressesRecordFileIdGet200Response meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 会议 code。
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 会议 code。
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议唯一 ID。
     */
    public V1AddressesRecordFileIdGet200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议唯一 ID。
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议唯一 ID。
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param meetingSummary 会议转写文件列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesRecordFileIdGet200Response meetingSummary(List<V1AddressesGet200ResponseRecordFilesInnerMeetingSummaryInner> meetingSummary) {
        this.meetingSummary = meetingSummary;
        return this;
    }
    /**
     * @return meetingSummary 会议转写文件列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public List<V1AddressesGet200ResponseRecordFilesInnerMeetingSummaryInner> getMeetingSummary() {
        return meetingSummary;
    }

    /**
     * @param meetingSummary 会议转写文件列表。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setMeetingSummary(List<V1AddressesGet200ResponseRecordFilesInnerMeetingSummaryInner> meetingSummary) {
        this.meetingSummary = meetingSummary;
    }
    /**
     * @param recordFileId 录制文件 ID。
     */
    public V1AddressesRecordFileIdGet200Response recordFileId(String recordFileId) {
        this.recordFileId = recordFileId;
        return this;
    }
    /**
     * @return recordFileId 录制文件 ID。
     **/
    public String getRecordFileId() {
        return recordFileId;
    }

    /**
     * @param recordFileId 录制文件 ID。
     */
    public void setRecordFileId(String recordFileId) {
        this.recordFileId = recordFileId;
    }
    /**
     * @param viewAddress 播放地址。
     */
    public V1AddressesRecordFileIdGet200Response viewAddress(String viewAddress) {
        this.viewAddress = viewAddress;
        return this;
    }
    /**
     * @return viewAddress 播放地址。
     **/
    public String getViewAddress() {
        return viewAddress;
    }

    /**
     * @param viewAddress 播放地址。
     */
    public void setViewAddress(String viewAddress) {
        this.viewAddress = viewAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1AddressesRecordFileIdGet200Response v1AddressesRecordFileIdGet200Response = (V1AddressesRecordFileIdGet200Response) o;
        return Objects.equals(this.aiMeetingTranscripts, v1AddressesRecordFileIdGet200Response.aiMeetingTranscripts) &&
            Objects.equals(this.aiMinutes, v1AddressesRecordFileIdGet200Response.aiMinutes) &&
            Objects.equals(this.audioAddress, v1AddressesRecordFileIdGet200Response.audioAddress) &&
            Objects.equals(this.audioAddressFileType, v1AddressesRecordFileIdGet200Response.audioAddressFileType) &&
            Objects.equals(this.downloadAddress, v1AddressesRecordFileIdGet200Response.downloadAddress) &&
            Objects.equals(this.downloadAddressFileType, v1AddressesRecordFileIdGet200Response.downloadAddressFileType) &&
            Objects.equals(this.meetingCode, v1AddressesRecordFileIdGet200Response.meetingCode) &&
            Objects.equals(this.meetingId, v1AddressesRecordFileIdGet200Response.meetingId) &&
            Objects.equals(this.meetingSummary, v1AddressesRecordFileIdGet200Response.meetingSummary) &&
            Objects.equals(this.recordFileId, v1AddressesRecordFileIdGet200Response.recordFileId) &&
            Objects.equals(this.viewAddress, v1AddressesRecordFileIdGet200Response.viewAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiMeetingTranscripts, aiMinutes, audioAddress, audioAddressFileType, downloadAddress, downloadAddressFileType, meetingCode, meetingId, meetingSummary, recordFileId, viewAddress);
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
        sb.append("class V1AddressesRecordFileIdGet200Response {\n");
        sb.append("    aiMeetingTranscripts: ").append(toIndentedString(aiMeetingTranscripts)).append("\n");
        sb.append("    aiMinutes: ").append(toIndentedString(aiMinutes)).append("\n");
        sb.append("    audioAddress: ").append(toIndentedString(audioAddress)).append("\n");
        sb.append("    audioAddressFileType: ").append(toIndentedString(audioAddressFileType)).append("\n");
        sb.append("    downloadAddress: ").append(toIndentedString(downloadAddress)).append("\n");
        sb.append("    downloadAddressFileType: ").append(toIndentedString(downloadAddressFileType)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    meetingSummary: ").append(toIndentedString(meetingSummary)).append("\n");
        sb.append("    recordFileId: ").append(toIndentedString(recordFileId)).append("\n");
        sb.append("    viewAddress: ").append(toIndentedString(viewAddress)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


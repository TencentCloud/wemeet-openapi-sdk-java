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

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1AddressesGet200ResponseRecordFilesInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AddressesGet200ResponseRecordFilesInner {
    @JsonProperty(value = "audio_address")
    private String audioAddress;

    @JsonProperty(value = "audio_address_file_type")
    private String audioAddressFileType;

    @JsonProperty(value = "download_address")
    private String downloadAddress;

    @JsonProperty(value = "download_address_file_type")
    private String downloadAddressFileType;

    @JsonProperty(value = "meeting_summary")
    private List<V1AddressesGet200ResponseRecordFilesInnerMeetingSummaryInner> meetingSummary;

    @JsonProperty(value = "record_file_id")
    private String recordFileId;

    @JsonProperty(value = "view_address")
    private String viewAddress;

    /**
     */
    public V1AddressesGet200ResponseRecordFilesInner() {
    }

    /**
     * @param audioAddress 音频下载地址。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesGet200ResponseRecordFilesInner audioAddress(String audioAddress) {
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
    public V1AddressesGet200ResponseRecordFilesInner audioAddressFileType(String audioAddressFileType) {
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
    public V1AddressesGet200ResponseRecordFilesInner downloadAddress(String downloadAddress) {
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
    public V1AddressesGet200ResponseRecordFilesInner downloadAddressFileType(String downloadAddressFileType) {
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
     * @param meetingSummary 会议纪要文件列表。。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesGet200ResponseRecordFilesInner meetingSummary(List<V1AddressesGet200ResponseRecordFilesInnerMeetingSummaryInner> meetingSummary) {
        this.meetingSummary = meetingSummary;
        return this;
    }
    /**
     * @return meetingSummary 会议纪要文件列表。。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public List<V1AddressesGet200ResponseRecordFilesInnerMeetingSummaryInner> getMeetingSummary() {
        return meetingSummary;
    }

    /**
     * @param meetingSummary 会议纪要文件列表。。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setMeetingSummary(List<V1AddressesGet200ResponseRecordFilesInnerMeetingSummaryInner> meetingSummary) {
        this.meetingSummary = meetingSummary;
    }
    /**
     * @param recordFileId 录制文件 ID。
     */
    public V1AddressesGet200ResponseRecordFilesInner recordFileId(String recordFileId) {
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
    public V1AddressesGet200ResponseRecordFilesInner viewAddress(String viewAddress) {
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
        V1AddressesGet200ResponseRecordFilesInner v1AddressesGet200ResponseRecordFilesInner = (V1AddressesGet200ResponseRecordFilesInner) o;
        return Objects.equals(this.audioAddress, v1AddressesGet200ResponseRecordFilesInner.audioAddress) &&
            Objects.equals(this.audioAddressFileType, v1AddressesGet200ResponseRecordFilesInner.audioAddressFileType) &&
            Objects.equals(this.downloadAddress, v1AddressesGet200ResponseRecordFilesInner.downloadAddress) &&
            Objects.equals(this.downloadAddressFileType, v1AddressesGet200ResponseRecordFilesInner.downloadAddressFileType) &&
            Objects.equals(this.meetingSummary, v1AddressesGet200ResponseRecordFilesInner.meetingSummary) &&
            Objects.equals(this.recordFileId, v1AddressesGet200ResponseRecordFilesInner.recordFileId) &&
            Objects.equals(this.viewAddress, v1AddressesGet200ResponseRecordFilesInner.viewAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioAddress, audioAddressFileType, downloadAddress, downloadAddressFileType, meetingSummary, recordFileId, viewAddress);
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
        sb.append("class V1AddressesGet200ResponseRecordFilesInner {\n");
        sb.append("    audioAddress: ").append(toIndentedString(audioAddress)).append("\n");
        sb.append("    audioAddressFileType: ").append(toIndentedString(audioAddressFileType)).append("\n");
        sb.append("    downloadAddress: ").append(toIndentedString(downloadAddress)).append("\n");
        sb.append("    downloadAddressFileType: ").append(toIndentedString(downloadAddressFileType)).append("\n");
        sb.append("    meetingSummary: ").append(toIndentedString(meetingSummary)).append("\n");
        sb.append("    recordFileId: ").append(toIndentedString(recordFileId)).append("\n");
        sb.append("    viewAddress: ").append(toIndentedString(viewAddress)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


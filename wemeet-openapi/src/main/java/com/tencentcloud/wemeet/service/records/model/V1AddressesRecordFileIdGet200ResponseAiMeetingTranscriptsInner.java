/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.0.70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloud.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner {
    @JsonProperty(value = "download_address")
    private String downloadAddress;

    @JsonProperty(value = "file_type")
    private String fileType;

    /**
     */
    public V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner() {
    }

    /**
     * @param downloadAddress 录制转写文件下载文件地址，链接有效期为5分钟。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner downloadAddress(String downloadAddress) {
        this.downloadAddress = downloadAddress;
        return this;
    }
    /**
     * @return downloadAddress 录制转写文件下载文件地址，链接有效期为5分钟。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public String getDownloadAddress() {
        return downloadAddress;
    }

    /**
     * @param downloadAddress 录制转写文件下载文件地址，链接有效期为5分钟。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setDownloadAddress(String downloadAddress) {
        this.downloadAddress = downloadAddress;
    }
    /**
     * @param fileType 下载文件类型，例如：txt、pdf、docx。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    /**
     * @return fileType 下载文件类型，例如：txt、pdf、docx。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     **/
    public String getFileType() {
        return fileType;
    }

    /**
     * @param fileType 下载文件类型，例如：txt、pdf、docx。OAuth 鉴权方式下，账号类型为个人免费版、企微创建企业时，该值返回为空。
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner v1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner = (V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner) o;
        return Objects.equals(this.downloadAddress, v1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner.downloadAddress) &&
            Objects.equals(this.fileType, v1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner.fileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadAddress, fileType);
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
        sb.append("class V1AddressesRecordFileIdGet200ResponseAiMeetingTranscriptsInner {\n");
        sb.append("    downloadAddress: ").append(toIndentedString(downloadAddress)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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
 * V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner {
    @JsonProperty(value = "allow_download")
    private Boolean allowDownload;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "record_end_time")
    private Long recordEndTime;

    @JsonProperty(value = "record_file_id")
    private String recordFileId;

    @JsonProperty(value = "record_size")
    private Long recordSize;

    @JsonProperty(value = "record_start_time")
    private Long recordStartTime;

    @JsonProperty(value = "required_participant")
    private Boolean requiredParticipant;

    @JsonProperty(value = "required_same_corp")
    private Boolean requiredSameCorp;

    @JsonProperty(value = "sharing_expire")
    private Long sharingExpire;

    @JsonProperty(value = "sharing_state")
    private Long sharingState;

    @JsonProperty(value = "sharing_url")
    private String sharingUrl;

    /**
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner() {
    }

    /**
     * @param allowDownload 是否允许下载，开启共享时返回。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner allowDownload(Boolean allowDownload) {
        this.allowDownload = allowDownload;
        return this;
    }
    /**
     * @return allowDownload 是否允许下载，开启共享时返回。
     **/
    public Boolean getAllowDownload() {
        return allowDownload;
    }

    /**
     * @param allowDownload 是否允许下载，开启共享时返回。
     */
    public void setAllowDownload(Boolean allowDownload) {
        this.allowDownload = allowDownload;
    }
    /**
     * @param password 访问密码，开启共享时返回。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner password(String password) {
        this.password = password;
        return this;
    }
    /**
     * @return password 访问密码，开启共享时返回。
     **/
    public String getPassword() {
        return password;
    }

    /**
     * @param password 访问密码，开启共享时返回。
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @param recordEndTime 结束录制时间，UNIX 时间戳（单位毫秒）。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner recordEndTime(Long recordEndTime) {
        this.recordEndTime = recordEndTime;
        return this;
    }
    /**
     * @return recordEndTime 结束录制时间，UNIX 时间戳（单位毫秒）。
     **/
    public Long getRecordEndTime() {
        return recordEndTime;
    }

    /**
     * @param recordEndTime 结束录制时间，UNIX 时间戳（单位毫秒）。
     */
    public void setRecordEndTime(Long recordEndTime) {
        this.recordEndTime = recordEndTime;
    }
    /**
     * @param recordFileId 录制文件 ID。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner recordFileId(String recordFileId) {
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
     * @param recordSize 文件大小（单位字节）。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner recordSize(Long recordSize) {
        this.recordSize = recordSize;
        return this;
    }
    /**
     * @return recordSize 文件大小（单位字节）。
     **/
    public Long getRecordSize() {
        return recordSize;
    }

    /**
     * @param recordSize 文件大小（单位字节）。
     */
    public void setRecordSize(Long recordSize) {
        this.recordSize = recordSize;
    }
    /**
     * @param recordStartTime 开始录制时间，UNIX 时间戳（单位毫秒）。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner recordStartTime(Long recordStartTime) {
        this.recordStartTime = recordStartTime;
        return this;
    }
    /**
     * @return recordStartTime 开始录制时间，UNIX 时间戳（单位毫秒）。
     **/
    public Long getRecordStartTime() {
        return recordStartTime;
    }

    /**
     * @param recordStartTime 开始录制时间，UNIX 时间戳（单位毫秒）。
     */
    public void setRecordStartTime(Long recordStartTime) {
        this.recordStartTime = recordStartTime;
    }
    /**
     * @param requiredParticipant 仅参会成员可查看，开启共享时返回。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner requiredParticipant(Boolean requiredParticipant) {
        this.requiredParticipant = requiredParticipant;
        return this;
    }
    /**
     * @return requiredParticipant 仅参会成员可查看，开启共享时返回。
     **/
    public Boolean getRequiredParticipant() {
        return requiredParticipant;
    }

    /**
     * @param requiredParticipant 仅参会成员可查看，开启共享时返回。
     */
    public void setRequiredParticipant(Boolean requiredParticipant) {
        this.requiredParticipant = requiredParticipant;
    }
    /**
     * @param requiredSameCorp 仅企业用户可查看，开启共享时返回。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner requiredSameCorp(Boolean requiredSameCorp) {
        this.requiredSameCorp = requiredSameCorp;
        return this;
    }
    /**
     * @return requiredSameCorp 仅企业用户可查看，开启共享时返回。
     **/
    public Boolean getRequiredSameCorp() {
        return requiredSameCorp;
    }

    /**
     * @param requiredSameCorp 仅企业用户可查看，开启共享时返回。
     */
    public void setRequiredSameCorp(Boolean requiredSameCorp) {
        this.requiredSameCorp = requiredSameCorp;
    }
    /**
     * @param sharingExpire 共享链接有效期（单位毫秒），当未开启共享时，返回0表示永久有效；开启共享时返回。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner sharingExpire(Long sharingExpire) {
        this.sharingExpire = sharingExpire;
        return this;
    }
    /**
     * @return sharingExpire 共享链接有效期（单位毫秒），当未开启共享时，返回0表示永久有效；开启共享时返回。
     **/
    public Long getSharingExpire() {
        return sharingExpire;
    }

    /**
     * @param sharingExpire 共享链接有效期（单位毫秒），当未开启共享时，返回0表示永久有效；开启共享时返回。
     */
    public void setSharingExpire(Long sharingExpire) {
        this.sharingExpire = sharingExpire;
    }
    /**
     * @param sharingState 共享状态，是否开启共享。0：未开启1：开启，当开启共享时返回访问权限、访问密码、共享链接有效期、是否允许下载。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner sharingState(Long sharingState) {
        this.sharingState = sharingState;
        return this;
    }
    /**
     * @return sharingState 共享状态，是否开启共享。0：未开启1：开启，当开启共享时返回访问权限、访问密码、共享链接有效期、是否允许下载。
     **/
    public Long getSharingState() {
        return sharingState;
    }

    /**
     * @param sharingState 共享状态，是否开启共享。0：未开启1：开启，当开启共享时返回访问权限、访问密码、共享链接有效期、是否允许下载。
     */
    public void setSharingState(Long sharingState) {
        this.sharingState = sharingState;
    }
    /**
     * @param sharingUrl 共享链接，开启共享时返回。
     */
    public V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner sharingUrl(String sharingUrl) {
        this.sharingUrl = sharingUrl;
        return this;
    }
    /**
     * @return sharingUrl 共享链接，开启共享时返回。
     **/
    public String getSharingUrl() {
        return sharingUrl;
    }

    /**
     * @param sharingUrl 共享链接，开启共享时返回。
     */
    public void setSharingUrl(String sharingUrl) {
        this.sharingUrl = sharingUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner = (V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner) o;
        return Objects.equals(this.allowDownload, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.allowDownload) &&
            Objects.equals(this.password, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.password) &&
            Objects.equals(this.recordEndTime, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.recordEndTime) &&
            Objects.equals(this.recordFileId, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.recordFileId) &&
            Objects.equals(this.recordSize, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.recordSize) &&
            Objects.equals(this.recordStartTime, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.recordStartTime) &&
            Objects.equals(this.requiredParticipant, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.requiredParticipant) &&
            Objects.equals(this.requiredSameCorp, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.requiredSameCorp) &&
            Objects.equals(this.sharingExpire, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.sharingExpire) &&
            Objects.equals(this.sharingState, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.sharingState) &&
            Objects.equals(this.sharingUrl, v1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner.sharingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowDownload, password, recordEndTime, recordFileId, recordSize, recordStartTime, requiredParticipant, requiredSameCorp, sharingExpire, sharingState, sharingUrl);
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
        sb.append("class V1RecordsGet200ResponseRecordMeetingsInnerRecordFilesInner {\n");
        sb.append("    allowDownload: ").append(toIndentedString(allowDownload)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    recordEndTime: ").append(toIndentedString(recordEndTime)).append("\n");
        sb.append("    recordFileId: ").append(toIndentedString(recordFileId)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    recordStartTime: ").append(toIndentedString(recordStartTime)).append("\n");
        sb.append("    requiredParticipant: ").append(toIndentedString(requiredParticipant)).append("\n");
        sb.append("    requiredSameCorp: ").append(toIndentedString(requiredSameCorp)).append("\n");
        sb.append("    sharingExpire: ").append(toIndentedString(sharingExpire)).append("\n");
        sb.append("    sharingState: ").append(toIndentedString(sharingState)).append("\n");
        sb.append("    sharingUrl: ").append(toIndentedString(sharingUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


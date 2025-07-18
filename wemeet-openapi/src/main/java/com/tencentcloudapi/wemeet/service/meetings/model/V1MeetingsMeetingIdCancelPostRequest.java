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
 * V1MeetingsMeetingIdCancelPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdCancelPostRequest {
    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "meeting_type")
    private Long meetingType;

    @JsonProperty(value = "reason_code", required = true)
    private Long reasonCode;

    @JsonProperty(value = "reason_detail")
    private String reasonDetail;

    @JsonProperty(value = "sub_meeting_id")
    private String subMeetingId;

    @JsonProperty(value = "userid", required = true)
    private String userid;

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     * @param reasonCode 原因代码，可为用户自定义 (required)
     * @param userid 调用 API 的用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 1：企业对接 SSO 时使用的员工唯一标识 ID。 2：企业调用创建用户接口时传递的 userid 参数。  (required)
     */
    public V1MeetingsMeetingIdCancelPostRequest(@NotNull Long instanceid, @NotNull Long reasonCode, @NotNull String userid) {
        this.instanceid = instanceid;
        this.reasonCode = reasonCode;
        this.userid = userid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     */
    public V1MeetingsMeetingIdCancelPostRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param meetingType 会议类型，默认值为0。 0：普通会议 1：周期性会议
     */
    public V1MeetingsMeetingIdCancelPostRequest meetingType(Long meetingType) {
        this.meetingType = meetingType;
        return this;
    }
    /**
     * @return meetingType 会议类型，默认值为0。 0：普通会议 1：周期性会议
     **/
    public Long getMeetingType() {
        return meetingType;
    }

    /**
     * @param meetingType 会议类型，默认值为0。 0：普通会议 1：周期性会议
     */
    public void setMeetingType(Long meetingType) {
        this.meetingType = meetingType;
    }
    /**
     * @param reasonCode 原因代码，可为用户自定义 (required)
     */
    public V1MeetingsMeetingIdCancelPostRequest reasonCode(@NotNull Long reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    /**
     * @return reasonCode 原因代码，可为用户自定义
     **/
    public Long getReasonCode() {
        return reasonCode;
    }

    /**
     * @param reasonCode 原因代码，可为用户自定义 (required)
     */
    public void setReasonCode(Long reasonCode) {
        this.reasonCode = reasonCode;
    }
    /**
     * @param reasonDetail 取消原因描述
     */
    public V1MeetingsMeetingIdCancelPostRequest reasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
        return this;
    }
    /**
     * @return reasonDetail 取消原因描述
     **/
    public String getReasonDetail() {
        return reasonDetail;
    }

    /**
     * @param reasonDetail 取消原因描述
     */
    public void setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
    }
    /**
     * @param subMeetingId 周期性子会议 ID，如果不传，则会取消该系列的周期性会议
     */
    public V1MeetingsMeetingIdCancelPostRequest subMeetingId(String subMeetingId) {
        this.subMeetingId = subMeetingId;
        return this;
    }
    /**
     * @return subMeetingId 周期性子会议 ID，如果不传，则会取消该系列的周期性会议
     **/
    public String getSubMeetingId() {
        return subMeetingId;
    }

    /**
     * @param subMeetingId 周期性子会议 ID，如果不传，则会取消该系列的周期性会议
     */
    public void setSubMeetingId(String subMeetingId) {
        this.subMeetingId = subMeetingId;
    }
    /**
     * @param userid 调用 API 的用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 1：企业对接 SSO 时使用的员工唯一标识 ID。 2：企业调用创建用户接口时传递的 userid 参数。  (required)
     */
    public V1MeetingsMeetingIdCancelPostRequest userid(@NotNull String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 调用 API 的用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 1：企业对接 SSO 时使用的员工唯一标识 ID。 2：企业调用创建用户接口时传递的 userid 参数。 
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 调用 API 的用户 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 1：企业对接 SSO 时使用的员工唯一标识 ID。 2：企业调用创建用户接口时传递的 userid 参数。  (required)
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdCancelPostRequest v1MeetingsMeetingIdCancelPostRequest = (V1MeetingsMeetingIdCancelPostRequest) o;
        return Objects.equals(this.instanceid, v1MeetingsMeetingIdCancelPostRequest.instanceid) &&
            Objects.equals(this.meetingType, v1MeetingsMeetingIdCancelPostRequest.meetingType) &&
            Objects.equals(this.reasonCode, v1MeetingsMeetingIdCancelPostRequest.reasonCode) &&
            Objects.equals(this.reasonDetail, v1MeetingsMeetingIdCancelPostRequest.reasonDetail) &&
            Objects.equals(this.subMeetingId, v1MeetingsMeetingIdCancelPostRequest.subMeetingId) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdCancelPostRequest.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceid, meetingType, reasonCode, reasonDetail, subMeetingId, userid);
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
        sb.append("class V1MeetingsMeetingIdCancelPostRequest {\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    meetingType: ").append(toIndentedString(meetingType)).append("\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    reasonDetail: ").append(toIndentedString(reasonDetail)).append("\n");
        sb.append("    subMeetingId: ").append(toIndentedString(subMeetingId)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


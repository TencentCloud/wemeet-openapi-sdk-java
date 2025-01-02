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

package com.tencentcloudapi.wemeet.service.meeting_control.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdDismissPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdDismissPostRequest {
    @JsonProperty(value = "force_dismiss_meeting")
    private Long forceDismissMeeting;

    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type")
    private Long operatorIdType;

    @JsonProperty(value = "reason_code", required = true)
    private Long reasonCode;

    @JsonProperty(value = "reason_detail")
    private String reasonDetail;

    @JsonProperty(value = "retrieve_code")
    private Long retrieveCode;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     * @param instanceid 设备类型 (required)
     * @param reasonCode 原因代码，可为用户自定义 (required)
     */
    public V1MeetingsMeetingIdDismissPostRequest(@NotNull Long instanceid, @NotNull Long reasonCode) {
        this.instanceid = instanceid;
        this.reasonCode = reasonCode;
    }

    /**
     * @param forceDismissMeeting 是否强制结束会议，默认值为1：0：不强制结束会议，会议中有参会者，则无法强制结束会议 1 ：强制结束会议，会议中有参会者，也会强制结束会议
     */
    public V1MeetingsMeetingIdDismissPostRequest forceDismissMeeting(Long forceDismissMeeting) {
        this.forceDismissMeeting = forceDismissMeeting;
        return this;
    }
    /**
     * @return forceDismissMeeting 是否强制结束会议，默认值为1：0：不强制结束会议，会议中有参会者，则无法强制结束会议 1 ：强制结束会议，会议中有参会者，也会强制结束会议
     **/
    public Long getForceDismissMeeting() {
        return forceDismissMeeting;
    }

    /**
     * @param forceDismissMeeting 是否强制结束会议，默认值为1：0：不强制结束会议，会议中有参会者，则无法强制结束会议 1 ：强制结束会议，会议中有参会者，也会强制结束会议
     */
    public void setForceDismissMeeting(Long forceDismissMeeting) {
        this.forceDismissMeeting = forceDismissMeeting;
    }
    /**
     * @param instanceid 设备类型 (required)
     */
    public V1MeetingsMeetingIdDismissPostRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 设备类型
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 设备类型 (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     */
    public V1MeetingsMeetingIdDismissPostRequest operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID的类型：1:userid  2:openid（预留编号，本次不添加，未来新增接口使用）3:rooms_id  4: ms_open_id
     */
    public V1MeetingsMeetingIdDismissPostRequest operatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID的类型：1:userid  2:openid（预留编号，本次不添加，未来新增接口使用）3:rooms_id  4: ms_open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID的类型：1:userid  2:openid（预留编号，本次不添加，未来新增接口使用）3:rooms_id  4: ms_open_id
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param reasonCode 原因代码，可为用户自定义 (required)
     */
    public V1MeetingsMeetingIdDismissPostRequest reasonCode(@NotNull Long reasonCode) {
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
     * @param reasonDetail 取消原因
     */
    public V1MeetingsMeetingIdDismissPostRequest reasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
        return this;
    }
    /**
     * @return reasonDetail 取消原因
     **/
    public String getReasonDetail() {
        return reasonDetail;
    }

    /**
     * @param reasonDetail 取消原因
     */
    public void setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
    }
    /**
     * @param retrieveCode 是否回收会议号，默认值为0： 0：不回收会议号，可以重新入会 1： 回收会议号，不可重新入会
     */
    public V1MeetingsMeetingIdDismissPostRequest retrieveCode(Long retrieveCode) {
        this.retrieveCode = retrieveCode;
        return this;
    }
    /**
     * @return retrieveCode 是否回收会议号，默认值为0： 0：不回收会议号，可以重新入会 1： 回收会议号，不可重新入会
     **/
    public Long getRetrieveCode() {
        return retrieveCode;
    }

    /**
     * @param retrieveCode 是否回收会议号，默认值为0： 0：不回收会议号，可以重新入会 1： 回收会议号，不可重新入会
     */
    public void setRetrieveCode(Long retrieveCode) {
        this.retrieveCode = retrieveCode;
    }
    /**
     * @param userid 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明：企业对接 SSO 时使用的员工唯一标识 ID，企业调用创建用户接口时传递的 userid 参数。
     */
    public V1MeetingsMeetingIdDismissPostRequest userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明：企业对接 SSO 时使用的员工唯一标识 ID，企业调用创建用户接口时传递的 userid 参数。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明：企业对接 SSO 时使用的员工唯一标识 ID，企业调用创建用户接口时传递的 userid 参数。
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
        V1MeetingsMeetingIdDismissPostRequest v1MeetingsMeetingIdDismissPostRequest = (V1MeetingsMeetingIdDismissPostRequest) o;
        return Objects.equals(this.forceDismissMeeting, v1MeetingsMeetingIdDismissPostRequest.forceDismissMeeting) &&
            Objects.equals(this.instanceid, v1MeetingsMeetingIdDismissPostRequest.instanceid) &&
            Objects.equals(this.operatorId, v1MeetingsMeetingIdDismissPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingsMeetingIdDismissPostRequest.operatorIdType) &&
            Objects.equals(this.reasonCode, v1MeetingsMeetingIdDismissPostRequest.reasonCode) &&
            Objects.equals(this.reasonDetail, v1MeetingsMeetingIdDismissPostRequest.reasonDetail) &&
            Objects.equals(this.retrieveCode, v1MeetingsMeetingIdDismissPostRequest.retrieveCode) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdDismissPostRequest.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forceDismissMeeting, instanceid, operatorId, operatorIdType, reasonCode, reasonDetail, retrieveCode, userid);
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
        sb.append("class V1MeetingsMeetingIdDismissPostRequest {\n");
        sb.append("    forceDismissMeeting: ").append(toIndentedString(forceDismissMeeting)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    reasonDetail: ").append(toIndentedString(reasonDetail)).append("\n");
        sb.append("    retrieveCode: ").append(toIndentedString(retrieveCode)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


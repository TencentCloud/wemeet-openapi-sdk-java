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

package com.tencentcloud.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner {
    @JsonProperty(value = "answer_list")
    private List<V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner> answerList;

    @JsonProperty(value = "enroll_code")
    private String enrollCode;

    @JsonProperty(value = "enroll_id")
    private Long enrollId;

    @JsonProperty(value = "enroll_source_type")
    private Long enrollSourceType;

    @JsonProperty(value = "enroll_time")
    private String enrollTime;

    @JsonProperty(value = "ms_open_id")
    private String msOpenId;

    @JsonProperty(value = "nick_name")
    private String nickName;

    @JsonProperty(value = "open_id")
    private String openId;

    @JsonProperty(value = "status")
    private Long status;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner() {
    }

    /**
     * @param answerList 答题列表
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner answerList(List<V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner> answerList) {
        this.answerList = answerList;
        return this;
    }
    /**
     * @return answerList 答题列表
     **/
    public List<V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner> getAnswerList() {
        return answerList;
    }

    /**
     * @param answerList 答题列表
     */
    public void setAnswerList(List<V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner> answerList) {
        this.answerList = answerList;
    }
    /**
     * @param enrollCode pstn入会凭证
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner enrollCode(String enrollCode) {
        this.enrollCode = enrollCode;
        return this;
    }
    /**
     * @return enrollCode pstn入会凭证
     **/
    public String getEnrollCode() {
        return enrollCode;
    }

    /**
     * @param enrollCode pstn入会凭证
     */
    public void setEnrollCode(String enrollCode) {
        this.enrollCode = enrollCode;
    }
    /**
     * @param enrollId 报名id
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner enrollId(Long enrollId) {
        this.enrollId = enrollId;
        return this;
    }
    /**
     * @return enrollId 报名id
     **/
    public Long getEnrollId() {
        return enrollId;
    }

    /**
     * @param enrollId 报名id
     */
    public void setEnrollId(Long enrollId) {
        this.enrollId = enrollId;
    }
    /**
     * @param enrollSourceType 报名来源： 1：用户手动报名 2：批量导入报名
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner enrollSourceType(Long enrollSourceType) {
        this.enrollSourceType = enrollSourceType;
        return this;
    }
    /**
     * @return enrollSourceType 报名来源： 1：用户手动报名 2：批量导入报名
     **/
    public Long getEnrollSourceType() {
        return enrollSourceType;
    }

    /**
     * @param enrollSourceType 报名来源： 1：用户手动报名 2：批量导入报名
     */
    public void setEnrollSourceType(Long enrollSourceType) {
        this.enrollSourceType = enrollSourceType;
    }
    /**
     * @param enrollTime 报名时间（utc+8，非时间戳）
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner enrollTime(String enrollTime) {
        this.enrollTime = enrollTime;
        return this;
    }
    /**
     * @return enrollTime 报名时间（utc+8，非时间戳）
     **/
    public String getEnrollTime() {
        return enrollTime;
    }

    /**
     * @param enrollTime 报名时间（utc+8，非时间戳）
     */
    public void setEnrollTime(String enrollTime) {
        this.enrollTime = enrollTime;
    }
    /**
     * @param msOpenId 当场会议的用户临时id，所有用户都有
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner msOpenId(String msOpenId) {
        this.msOpenId = msOpenId;
        return this;
    }
    /**
     * @return msOpenId 当场会议的用户临时id，所有用户都有
     **/
    public String getMsOpenId() {
        return msOpenId;
    }

    /**
     * @param msOpenId 当场会议的用户临时id，所有用户都有
     */
    public void setMsOpenId(String msOpenId) {
        this.msOpenId = msOpenId;
    }
    /**
     * @param nickName 昵称
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    /**
     * @return nickName 昵称
     **/
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    /**
     * @param openId 报名者已授权过会议创建的应用时返回openid，否则为空
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner openId(String openId) {
        this.openId = openId;
        return this;
    }
    /**
     * @return openId 报名者已授权过会议创建的应用时返回openid，否则为空
     **/
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId 报名者已授权过会议创建的应用时返回openid，否则为空
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**
     * @param status 报名状态：1 待审批，2 已拒绝，3 已批准
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner status(Long status) {
        this.status = status;
        return this;
    }
    /**
     * @return status 报名状态：1 待审批，2 已拒绝，3 已批准
     **/
    public Long getStatus() {
        return status;
    }

    /**
     * @param status 报名状态：1 待审批，2 已拒绝，3 已批准
     */
    public void setStatus(Long status) {
        this.status = status;
    }
    /**
     * @param userid 报名者与会议创建者为同企业时，返回userid，否则为空,导入报名入参为手机号的情况不返回userid。
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 报名者与会议创建者为同企业时，返回userid，否则为空,导入报名入参为手机号的情况不返回userid。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 报名者与会议创建者为同企业时，返回userid，否则为空,导入报名入参为手机号的情况不返回userid。
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
        V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner = (V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner) o;
        return Objects.equals(this.answerList, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.answerList) &&
            Objects.equals(this.enrollCode, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.enrollCode) &&
            Objects.equals(this.enrollId, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.enrollId) &&
            Objects.equals(this.enrollSourceType, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.enrollSourceType) &&
            Objects.equals(this.enrollTime, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.enrollTime) &&
            Objects.equals(this.msOpenId, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.msOpenId) &&
            Objects.equals(this.nickName, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.nickName) &&
            Objects.equals(this.openId, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.openId) &&
            Objects.equals(this.status, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.status) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerList, enrollCode, enrollId, enrollSourceType, enrollTime, msOpenId, nickName, openId, status, userid);
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
        sb.append("class V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInner {\n");
        sb.append("    answerList: ").append(toIndentedString(answerList)).append("\n");
        sb.append("    enrollCode: ").append(toIndentedString(enrollCode)).append("\n");
        sb.append("    enrollId: ").append(toIndentedString(enrollId)).append("\n");
        sb.append("    enrollSourceType: ").append(toIndentedString(enrollSourceType)).append("\n");
        sb.append("    enrollTime: ").append(toIndentedString(enrollTime)).append("\n");
        sb.append("    msOpenId: ").append(toIndentedString(msOpenId)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


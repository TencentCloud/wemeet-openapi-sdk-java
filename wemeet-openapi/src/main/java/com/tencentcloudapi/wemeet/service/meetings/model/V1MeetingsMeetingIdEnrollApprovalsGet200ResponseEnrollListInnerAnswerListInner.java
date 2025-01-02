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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner {
    @JsonProperty(value = "answer_content")
    private List<String> answerContent;

    @JsonProperty(value = "is_required")
    private Long isRequired;

    @JsonProperty(value = "question_num")
    private Long questionNum;

    @JsonProperty(value = "question_title")
    private String questionTitle;

    @JsonProperty(value = "question_type")
    private Long questionType;

    @JsonProperty(value = "special_type")
    private Long specialType;

    /**
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner() {
    }

    /**
     * @param answerContent 回答内容：单选/简答只有一个元素，多选会有多个
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner answerContent(List<String> answerContent) {
        this.answerContent = answerContent;
        return this;
    }
    /**
     * @return answerContent 回答内容：单选/简答只有一个元素，多选会有多个
     **/
    public List<String> getAnswerContent() {
        return answerContent;
    }

    /**
     * @param answerContent 回答内容：单选/简答只有一个元素，多选会有多个
     */
    public void setAnswerContent(List<String> answerContent) {
        this.answerContent = answerContent;
    }
    /**
     * @param isRequired 是否必填：1 否，2 是
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner isRequired(Long isRequired) {
        this.isRequired = isRequired;
        return this;
    }
    /**
     * @return isRequired 是否必填：1 否，2 是
     **/
    public Long getIsRequired() {
        return isRequired;
    }

    /**
     * @param isRequired 是否必填：1 否，2 是
     */
    public void setIsRequired(Long isRequired) {
        this.isRequired = isRequired;
    }
    /**
     * @param questionNum 问题编号，1,2,3...等形式
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner questionNum(Long questionNum) {
        this.questionNum = questionNum;
        return this;
    }
    /**
     * @return questionNum 问题编号，1,2,3...等形式
     **/
    public Long getQuestionNum() {
        return questionNum;
    }

    /**
     * @param questionNum 问题编号，1,2,3...等形式
     */
    public void setQuestionNum(Long questionNum) {
        this.questionNum = questionNum;
    }
    /**
     * @param questionTitle 问题标题
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner questionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
        return this;
    }
    /**
     * @return questionTitle 问题标题
     **/
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * @param questionTitle 问题标题
     */
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }
    /**
     * @param questionType 问题类型：1 单选，2 多选，3 简答
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner questionType(Long questionType) {
        this.questionType = questionType;
        return this;
    }
    /**
     * @return questionType 问题类型：1 单选，2 多选，3 简答
     **/
    public Long getQuestionType() {
        return questionType;
    }

    /**
     * @param questionType 问题类型：1 单选，2 多选，3 简答
     */
    public void setQuestionType(Long questionType) {
        this.questionType = questionType;
    }
    /**
     * @param specialType 特殊问题类型：1 无，2 手机号，3 邮箱，4 姓名，5 公司名称（目前4种特殊问题均为简答题）
     */
    public V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner specialType(Long specialType) {
        this.specialType = specialType;
        return this;
    }
    /**
     * @return specialType 特殊问题类型：1 无，2 手机号，3 邮箱，4 姓名，5 公司名称（目前4种特殊问题均为简答题）
     **/
    public Long getSpecialType() {
        return specialType;
    }

    /**
     * @param specialType 特殊问题类型：1 无，2 手机号，3 邮箱，4 姓名，5 公司名称（目前4种特殊问题均为简答题）
     */
    public void setSpecialType(Long specialType) {
        this.specialType = specialType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner = (V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner) o;
        return Objects.equals(this.answerContent, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner.answerContent) &&
            Objects.equals(this.isRequired, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner.isRequired) &&
            Objects.equals(this.questionNum, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner.questionNum) &&
            Objects.equals(this.questionTitle, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner.questionTitle) &&
            Objects.equals(this.questionType, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner.questionType) &&
            Objects.equals(this.specialType, v1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner.specialType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerContent, isRequired, questionNum, questionTitle, questionType, specialType);
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
        sb.append("class V1MeetingsMeetingIdEnrollApprovalsGet200ResponseEnrollListInnerAnswerListInner {\n");
        sb.append("    answerContent: ").append(toIndentedString(answerContent)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    questionNum: ").append(toIndentedString(questionNum)).append("\n");
        sb.append("    questionTitle: ").append(toIndentedString(questionTitle)).append("\n");
        sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
        sb.append("    specialType: ").append(toIndentedString(specialType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


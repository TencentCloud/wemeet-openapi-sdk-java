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
 * V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner {
    @JsonProperty(value = "is_required")
    private Long isRequired;

    @JsonProperty(value = "option_list")
    private List<V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner> optionList;

    @JsonProperty(value = "question_title")
    private String questionTitle;

    @JsonProperty(value = "question_type")
    private Long questionType;

    @JsonProperty(value = "special_type")
    private Long specialType;

    /**
     */
    public V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner() {
    }

    /**
     * @param isRequired 是否必填：1 否，2 是
     */
    public V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner isRequired(Long isRequired) {
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
     * @param optionList 问题选项列表，按传入的顺序排序，仅单选/多选时有效，最多8个选项，每个选项限40个汉字
     */
    public V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner optionList(List<V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner> optionList) {
        this.optionList = optionList;
        return this;
    }
    /**
     * @return optionList 问题选项列表，按传入的顺序排序，仅单选/多选时有效，最多8个选项，每个选项限40个汉字
     **/
    public List<V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner> getOptionList() {
        return optionList;
    }

    /**
     * @param optionList 问题选项列表，按传入的顺序排序，仅单选/多选时有效，最多8个选项，每个选项限40个汉字
     */
    public void setOptionList(List<V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInnerOptionListInner> optionList) {
        this.optionList = optionList;
    }
    /**
     * @param questionTitle 问题标题，限制40个汉字
     */
    public V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner questionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
        return this;
    }
    /**
     * @return questionTitle 问题标题，限制40个汉字
     **/
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * @param questionTitle 问题标题，限制40个汉字
     */
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }
    /**
     * @param questionType 问题类型：1 单选，2 多选，3 简答
     */
    public V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner questionType(Long questionType) {
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
     * @param specialType 特殊问题类型：1 无，2 手机号，3 邮箱，4 姓名，5 组织名称，6 组织规模（目前除组织规模外均为简答题，组织规模为单选题）
     */
    public V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner specialType(Long specialType) {
        this.specialType = specialType;
        return this;
    }
    /**
     * @return specialType 特殊问题类型：1 无，2 手机号，3 邮箱，4 姓名，5 组织名称，6 组织规模（目前除组织规模外均为简答题，组织规模为单选题）
     **/
    public Long getSpecialType() {
        return specialType;
    }

    /**
     * @param specialType 特殊问题类型：1 无，2 手机号，3 邮箱，4 姓名，5 组织名称，6 组织规模（目前除组织规模外均为简答题，组织规模为单选题）
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
        V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner v1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner = (V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner) o;
        return Objects.equals(this.isRequired, v1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner.isRequired) &&
            Objects.equals(this.optionList, v1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner.optionList) &&
            Objects.equals(this.questionTitle, v1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner.questionTitle) &&
            Objects.equals(this.questionType, v1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner.questionType) &&
            Objects.equals(this.specialType, v1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner.specialType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRequired, optionList, questionTitle, questionType, specialType);
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
        sb.append("class V1MeetingsMeetingIdEnrollConfigGet200ResponseQuestionListInner {\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    optionList: ").append(toIndentedString(optionList)).append("\n");
        sb.append("    questionTitle: ").append(toIndentedString(questionTitle)).append("\n");
        sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
        sb.append("    specialType: ").append(toIndentedString(specialType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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
 * V1MeetingSetWaitingRoomWelcomeMessagePostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingSetWaitingRoomWelcomeMessagePostRequest {
    @JsonProperty(value = "enable_welcome", required = true)
    private Boolean enableWelcome;

    @JsonProperty(value = "meeting_id", required = true)
    private String meetingId;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "welcome_text", required = true)
    private String welcomeText;

    /**
     * @param enableWelcome 是否开启等候室欢迎语能力。 (required)
     * @param meetingId 会议ID (required)
     * @param operatorId 操作者 ID，设置等候室欢迎语的用户。会议的创建者、主持人、联席主持人，企业管理平台有会控权限的用户可以设置。  operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     * @param operatorIdType 操作者 ID 的类型： 1: 企业内用户 userid。 2: open_id (required)
     * @param welcomeText 欢迎语，文本类型，最大长度1000字符。欢迎语中如果传入占位符%NICKNAME%（大小写敏感），则该占位符会被替换为被私聊用户的会中昵称。一条消息中支持多个占位符。 (required)
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePostRequest(@NotNull Boolean enableWelcome, @NotNull String meetingId, @NotNull String operatorId, @NotNull Long operatorIdType, @NotNull String welcomeText) {
        this.enableWelcome = enableWelcome;
        this.meetingId = meetingId;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
        this.welcomeText = welcomeText;
    }

    /**
     * @param enableWelcome 是否开启等候室欢迎语能力。 (required)
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePostRequest enableWelcome(@NotNull Boolean enableWelcome) {
        this.enableWelcome = enableWelcome;
        return this;
    }
    /**
     * @return enableWelcome 是否开启等候室欢迎语能力。
     **/
    public Boolean getEnableWelcome() {
        return enableWelcome;
    }

    /**
     * @param enableWelcome 是否开启等候室欢迎语能力。 (required)
     */
    public void setEnableWelcome(Boolean enableWelcome) {
        this.enableWelcome = enableWelcome;
    }
    /**
     * @param meetingId 会议ID (required)
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePostRequest meetingId(@NotNull String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议ID
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议ID (required)
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param operatorId 操作者 ID，设置等候室欢迎语的用户。会议的创建者、主持人、联席主持人，企业管理平台有会控权限的用户可以设置。  operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID，设置等候室欢迎语的用户。会议的创建者、主持人、联席主持人，企业管理平台有会控权限的用户可以设置。  operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID，设置等候室欢迎语的用户。会议的创建者、主持人、联席主持人，企业管理平台有会控权限的用户可以设置。  operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1: 企业内用户 userid。 2: open_id (required)
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型： 1: 企业内用户 userid。 2: open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型： 1: 企业内用户 userid。 2: open_id (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param welcomeText 欢迎语，文本类型，最大长度1000字符。欢迎语中如果传入占位符%NICKNAME%（大小写敏感），则该占位符会被替换为被私聊用户的会中昵称。一条消息中支持多个占位符。 (required)
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePostRequest welcomeText(@NotNull String welcomeText) {
        this.welcomeText = welcomeText;
        return this;
    }
    /**
     * @return welcomeText 欢迎语，文本类型，最大长度1000字符。欢迎语中如果传入占位符%NICKNAME%（大小写敏感），则该占位符会被替换为被私聊用户的会中昵称。一条消息中支持多个占位符。
     **/
    public String getWelcomeText() {
        return welcomeText;
    }

    /**
     * @param welcomeText 欢迎语，文本类型，最大长度1000字符。欢迎语中如果传入占位符%NICKNAME%（大小写敏感），则该占位符会被替换为被私聊用户的会中昵称。一条消息中支持多个占位符。 (required)
     */
    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingSetWaitingRoomWelcomeMessagePostRequest v1MeetingSetWaitingRoomWelcomeMessagePostRequest = (V1MeetingSetWaitingRoomWelcomeMessagePostRequest) o;
        return Objects.equals(this.enableWelcome, v1MeetingSetWaitingRoomWelcomeMessagePostRequest.enableWelcome) &&
            Objects.equals(this.meetingId, v1MeetingSetWaitingRoomWelcomeMessagePostRequest.meetingId) &&
            Objects.equals(this.operatorId, v1MeetingSetWaitingRoomWelcomeMessagePostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingSetWaitingRoomWelcomeMessagePostRequest.operatorIdType) &&
            Objects.equals(this.welcomeText, v1MeetingSetWaitingRoomWelcomeMessagePostRequest.welcomeText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableWelcome, meetingId, operatorId, operatorIdType, welcomeText);
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
        sb.append("class V1MeetingSetWaitingRoomWelcomeMessagePostRequest {\n");
        sb.append("    enableWelcome: ").append(toIndentedString(enableWelcome)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    welcomeText: ").append(toIndentedString(welcomeText)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


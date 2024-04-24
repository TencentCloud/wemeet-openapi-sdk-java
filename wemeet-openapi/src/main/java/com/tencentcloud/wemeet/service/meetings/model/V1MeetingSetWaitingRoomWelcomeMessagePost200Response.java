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
 * V1MeetingSetWaitingRoomWelcomeMessagePost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingSetWaitingRoomWelcomeMessagePost200Response {
    @JsonProperty(value = "enable_welcome")
    private Boolean enableWelcome;

    @JsonProperty(value = "welcome_text")
    private String welcomeText;

    /**
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePost200Response() {
    }

    /**
     * @param enableWelcome 是否开启等候室欢迎语能力。
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePost200Response enableWelcome(Boolean enableWelcome) {
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
     * @param enableWelcome 是否开启等候室欢迎语能力。
     */
    public void setEnableWelcome(Boolean enableWelcome) {
        this.enableWelcome = enableWelcome;
    }
    /**
     * @param welcomeText 欢迎语，文本类型，最大长度1000字符。欢迎语中如果传入占位符%NICKNAME%（大小写敏感），则该占位符会被替换为被私聊用户的会中昵称。一条消息中支持多个占位符。
     */
    public V1MeetingSetWaitingRoomWelcomeMessagePost200Response welcomeText(String welcomeText) {
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
     * @param welcomeText 欢迎语，文本类型，最大长度1000字符。欢迎语中如果传入占位符%NICKNAME%（大小写敏感），则该占位符会被替换为被私聊用户的会中昵称。一条消息中支持多个占位符。
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
        V1MeetingSetWaitingRoomWelcomeMessagePost200Response v1MeetingSetWaitingRoomWelcomeMessagePost200Response = (V1MeetingSetWaitingRoomWelcomeMessagePost200Response) o;
        return Objects.equals(this.enableWelcome, v1MeetingSetWaitingRoomWelcomeMessagePost200Response.enableWelcome) &&
            Objects.equals(this.welcomeText, v1MeetingSetWaitingRoomWelcomeMessagePost200Response.welcomeText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableWelcome, welcomeText);
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
        sb.append("class V1MeetingSetWaitingRoomWelcomeMessagePost200Response {\n");
        sb.append("    enableWelcome: ").append(toIndentedString(enableWelcome)).append("\n");
        sb.append("    welcomeText: ").append(toIndentedString(welcomeText)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


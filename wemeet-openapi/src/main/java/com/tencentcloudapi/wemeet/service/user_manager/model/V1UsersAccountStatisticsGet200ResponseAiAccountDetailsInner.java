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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner {
    @JsonProperty(value = "ai_account_count")
    private Long aiAccountCount;

    @JsonProperty(value = "ai_account_type")
    private Long aiAccountType;

    @JsonProperty(value = "ai_account_used_count")
    private Long aiAccountUsedCount;

    /**
     */
    public V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner() {
    }

    /**
     * @param aiAccountCount 账号数
     */
    public V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner aiAccountCount(Long aiAccountCount) {
        this.aiAccountCount = aiAccountCount;
        return this;
    }
    /**
     * @return aiAccountCount 账号数
     **/
    public Long getAiAccountCount() {
        return aiAccountCount;
    }

    /**
     * @param aiAccountCount 账号数
     */
    public void setAiAccountCount(Long aiAccountCount) {
        this.aiAccountCount = aiAccountCount;
    }
    /**
     * @param aiAccountType ai账号类型，1:购买版 2:赠送版
     */
    public V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner aiAccountType(Long aiAccountType) {
        this.aiAccountType = aiAccountType;
        return this;
    }
    /**
     * @return aiAccountType ai账号类型，1:购买版 2:赠送版
     **/
    public Long getAiAccountType() {
        return aiAccountType;
    }

    /**
     * @param aiAccountType ai账号类型，1:购买版 2:赠送版
     */
    public void setAiAccountType(Long aiAccountType) {
        this.aiAccountType = aiAccountType;
    }
    /**
     * @param aiAccountUsedCount 已分配的账号数
     */
    public V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner aiAccountUsedCount(Long aiAccountUsedCount) {
        this.aiAccountUsedCount = aiAccountUsedCount;
        return this;
    }
    /**
     * @return aiAccountUsedCount 已分配的账号数
     **/
    public Long getAiAccountUsedCount() {
        return aiAccountUsedCount;
    }

    /**
     * @param aiAccountUsedCount 已分配的账号数
     */
    public void setAiAccountUsedCount(Long aiAccountUsedCount) {
        this.aiAccountUsedCount = aiAccountUsedCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner v1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner = (V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner) o;
        return Objects.equals(this.aiAccountCount, v1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner.aiAccountCount) &&
            Objects.equals(this.aiAccountType, v1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner.aiAccountType) &&
            Objects.equals(this.aiAccountUsedCount, v1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner.aiAccountUsedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiAccountCount, aiAccountType, aiAccountUsedCount);
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
        sb.append("class V1UsersAccountStatisticsGet200ResponseAiAccountDetailsInner {\n");
        sb.append("    aiAccountCount: ").append(toIndentedString(aiAccountCount)).append("\n");
        sb.append("    aiAccountType: ").append(toIndentedString(aiAccountType)).append("\n");
        sb.append("    aiAccountUsedCount: ").append(toIndentedString(aiAccountUsedCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


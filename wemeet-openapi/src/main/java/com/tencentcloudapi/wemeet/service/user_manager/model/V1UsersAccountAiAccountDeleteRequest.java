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
 * V1UsersAccountAiAccountDeleteRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersAccountAiAccountDeleteRequest {
    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "to_operator_id", required = true)
    private String toOperatorId;

    @JsonProperty(value = "to_operator_id_type", required = true)
    private Long toOperatorIdType;

    /**
     * @param operatorId 用户拥有企管用户管理权限 (required)
     * @param operatorIdType 1:userid (required)
     * @param toOperatorId  (required)
     * @param toOperatorIdType 1:userid (required)
     */
    public V1UsersAccountAiAccountDeleteRequest(@NotNull String operatorId, @NotNull Long operatorIdType, @NotNull String toOperatorId, @NotNull Long toOperatorIdType) {
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
        this.toOperatorId = toOperatorId;
        this.toOperatorIdType = toOperatorIdType;
    }

    /**
     * @param operatorId 用户拥有企管用户管理权限 (required)
     */
    public V1UsersAccountAiAccountDeleteRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 用户拥有企管用户管理权限
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 用户拥有企管用户管理权限 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 1:userid (required)
     */
    public V1UsersAccountAiAccountDeleteRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 1:userid
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 1:userid (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param toOperatorId  (required)
     */
    public V1UsersAccountAiAccountDeleteRequest toOperatorId(@NotNull String toOperatorId) {
        this.toOperatorId = toOperatorId;
        return this;
    }
    /**
     * @return toOperatorId 
     **/
    public String getToOperatorId() {
        return toOperatorId;
    }

    /**
     * @param toOperatorId  (required)
     */
    public void setToOperatorId(String toOperatorId) {
        this.toOperatorId = toOperatorId;
    }
    /**
     * @param toOperatorIdType 1:userid (required)
     */
    public V1UsersAccountAiAccountDeleteRequest toOperatorIdType(@NotNull Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
        return this;
    }
    /**
     * @return toOperatorIdType 1:userid
     **/
    public Long getToOperatorIdType() {
        return toOperatorIdType;
    }

    /**
     * @param toOperatorIdType 1:userid (required)
     */
    public void setToOperatorIdType(Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1UsersAccountAiAccountDeleteRequest v1UsersAccountAiAccountDeleteRequest = (V1UsersAccountAiAccountDeleteRequest) o;
        return Objects.equals(this.operatorId, v1UsersAccountAiAccountDeleteRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1UsersAccountAiAccountDeleteRequest.operatorIdType) &&
            Objects.equals(this.toOperatorId, v1UsersAccountAiAccountDeleteRequest.toOperatorId) &&
            Objects.equals(this.toOperatorIdType, v1UsersAccountAiAccountDeleteRequest.toOperatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatorId, operatorIdType, toOperatorId, toOperatorIdType);
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
        sb.append("class V1UsersAccountAiAccountDeleteRequest {\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    toOperatorId: ").append(toIndentedString(toOperatorId)).append("\n");
        sb.append("    toOperatorIdType: ").append(toIndentedString(toOperatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


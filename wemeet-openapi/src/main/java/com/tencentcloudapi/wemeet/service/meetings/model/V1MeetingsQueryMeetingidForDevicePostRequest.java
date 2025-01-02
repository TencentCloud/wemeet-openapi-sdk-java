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
 * V1MeetingsQueryMeetingidForDevicePostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsQueryMeetingidForDevicePostRequest {
    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param operatorId 操作者 ID，即查询者的信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     * @param operatorIdType 操作者 ID 的类型：  1：企业内用户 userid。JWT鉴权仅支持userid  (required)
     */
    public V1MeetingsQueryMeetingidForDevicePostRequest(@NotNull String operatorId, @NotNull Long operatorIdType) {
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param operatorId 操作者 ID，即查询者的信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public V1MeetingsQueryMeetingidForDevicePostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID，即查询者的信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID，即查询者的信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型：  1：企业内用户 userid。JWT鉴权仅支持userid  (required)
     */
    public V1MeetingsQueryMeetingidForDevicePostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型：  1：企业内用户 userid。JWT鉴权仅支持userid 
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型：  1：企业内用户 userid。JWT鉴权仅支持userid  (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsQueryMeetingidForDevicePostRequest v1MeetingsQueryMeetingidForDevicePostRequest = (V1MeetingsQueryMeetingidForDevicePostRequest) o;
        return Objects.equals(this.operatorId, v1MeetingsQueryMeetingidForDevicePostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingsQueryMeetingidForDevicePostRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatorId, operatorIdType);
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
        sb.append("class V1MeetingsQueryMeetingidForDevicePostRequest {\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


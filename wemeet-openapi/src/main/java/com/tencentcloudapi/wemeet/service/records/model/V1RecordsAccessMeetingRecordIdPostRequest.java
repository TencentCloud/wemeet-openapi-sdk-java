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

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RecordsAccessMeetingRecordIdPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsAccessMeetingRecordIdPostRequest {
    @JsonProperty(value = "access_members", required = true)
    private List<V1RecordsAccessMeetingRecordIdPostRequestAccessMembersInner> accessMembers;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param accessMembers 成员列表，一次最多传入200个，可以多次调用接口，累加型接口 (required)
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     * @param operatorIdType 操作者 ID 的类型： 1:userid 2:open_id (required)
     */
    public V1RecordsAccessMeetingRecordIdPostRequest(@NotNull List<V1RecordsAccessMeetingRecordIdPostRequestAccessMembersInner> accessMembers, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.accessMembers = accessMembers;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param accessMembers 成员列表，一次最多传入200个，可以多次调用接口，累加型接口 (required)
     */
    public V1RecordsAccessMeetingRecordIdPostRequest accessMembers(@NotNull List<V1RecordsAccessMeetingRecordIdPostRequestAccessMembersInner> accessMembers) {
        this.accessMembers = accessMembers;
        return this;
    }
    /**
     * @return accessMembers 成员列表，一次最多传入200个，可以多次调用接口，累加型接口
     **/
    public List<V1RecordsAccessMeetingRecordIdPostRequestAccessMembersInner> getAccessMembers() {
        return accessMembers;
    }

    /**
     * @param accessMembers 成员列表，一次最多传入200个，可以多次调用接口，累加型接口 (required)
     */
    public void setAccessMembers(List<V1RecordsAccessMeetingRecordIdPostRequestAccessMembersInner> accessMembers) {
        this.accessMembers = accessMembers;
    }
    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public V1RecordsAccessMeetingRecordIdPostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1:userid 2:open_id (required)
     */
    public V1RecordsAccessMeetingRecordIdPostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型： 1:userid 2:open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型： 1:userid 2:open_id (required)
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
        V1RecordsAccessMeetingRecordIdPostRequest v1RecordsAccessMeetingRecordIdPostRequest = (V1RecordsAccessMeetingRecordIdPostRequest) o;
        return Objects.equals(this.accessMembers, v1RecordsAccessMeetingRecordIdPostRequest.accessMembers) &&
            Objects.equals(this.operatorId, v1RecordsAccessMeetingRecordIdPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1RecordsAccessMeetingRecordIdPostRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessMembers, operatorId, operatorIdType);
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
        sb.append("class V1RecordsAccessMeetingRecordIdPostRequest {\n");
        sb.append("    accessMembers: ").append(toIndentedString(accessMembers)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


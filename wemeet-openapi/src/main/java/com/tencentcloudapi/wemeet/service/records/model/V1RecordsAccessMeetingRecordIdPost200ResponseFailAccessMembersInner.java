/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.4
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
 * V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner {
    @JsonProperty(value = "permission")
    private Long permission;

    @JsonProperty(value = "to_operator_id")
    private String toOperatorId;

    @JsonProperty(value = "to_operator_id_type")
    private Long toOperatorIdType;

    /**
     */
    public V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner() {
    }

    /**
     * @param permission 成员访问权限，默认为 0 ； 0：仅查看，1：可管理
     */
    public V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner permission(Long permission) {
        this.permission = permission;
        return this;
    }
    /**
     * @return permission 成员访问权限，默认为 0 ； 0：仅查看，1：可管理
     **/
    public Long getPermission() {
        return permission;
    }

    /**
     * @param permission 成员访问权限，默认为 0 ； 0：仅查看，1：可管理
     */
    public void setPermission(Long permission) {
        this.permission = permission;
    }
    /**
     * @param toOperatorId 被操作者ID，根据 to_operator_id_type 的值，使用不同的类型
     */
    public V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner toOperatorId(String toOperatorId) {
        this.toOperatorId = toOperatorId;
        return this;
    }
    /**
     * @return toOperatorId 被操作者ID，根据 to_operator_id_type 的值，使用不同的类型
     **/
    public String getToOperatorId() {
        return toOperatorId;
    }

    /**
     * @param toOperatorId 被操作者ID，根据 to_operator_id_type 的值，使用不同的类型
     */
    public void setToOperatorId(String toOperatorId) {
        this.toOperatorId = toOperatorId;
    }
    /**
     * @param toOperatorIdType 被操作者ID类型  1:userid  2:open_id  4:ms_open_id
     */
    public V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner toOperatorIdType(Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
        return this;
    }
    /**
     * @return toOperatorIdType 被操作者ID类型  1:userid  2:open_id  4:ms_open_id
     **/
    public Long getToOperatorIdType() {
        return toOperatorIdType;
    }

    /**
     * @param toOperatorIdType 被操作者ID类型  1:userid  2:open_id  4:ms_open_id
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
        V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner v1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner = (V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner) o;
        return Objects.equals(this.permission, v1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner.permission) &&
            Objects.equals(this.toOperatorId, v1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner.toOperatorId) &&
            Objects.equals(this.toOperatorIdType, v1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner.toOperatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, toOperatorId, toOperatorIdType);
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
        sb.append("class V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    toOperatorId: ").append(toIndentedString(toOperatorId)).append("\n");
        sb.append("    toOperatorIdType: ").append(toIndentedString(toOperatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


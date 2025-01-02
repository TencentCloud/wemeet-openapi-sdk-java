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
 * V1RecordsAccessMeetingRecordIdPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsAccessMeetingRecordIdPost200Response {
    @JsonProperty(value = "fail_access_members")
    private List<V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner> failAccessMembers;

    /**
     */
    public V1RecordsAccessMeetingRecordIdPost200Response() {
    }

    /**
     * @param failAccessMembers 未添加成功的成员列表
     */
    public V1RecordsAccessMeetingRecordIdPost200Response failAccessMembers(List<V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner> failAccessMembers) {
        this.failAccessMembers = failAccessMembers;
        return this;
    }
    /**
     * @return failAccessMembers 未添加成功的成员列表
     **/
    public List<V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner> getFailAccessMembers() {
        return failAccessMembers;
    }

    /**
     * @param failAccessMembers 未添加成功的成员列表
     */
    public void setFailAccessMembers(List<V1RecordsAccessMeetingRecordIdPost200ResponseFailAccessMembersInner> failAccessMembers) {
        this.failAccessMembers = failAccessMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RecordsAccessMeetingRecordIdPost200Response v1RecordsAccessMeetingRecordIdPost200Response = (V1RecordsAccessMeetingRecordIdPost200Response) o;
        return Objects.equals(this.failAccessMembers, v1RecordsAccessMeetingRecordIdPost200Response.failAccessMembers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failAccessMembers);
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
        sb.append("class V1RecordsAccessMeetingRecordIdPost200Response {\n");
        sb.append("    failAccessMembers: ").append(toIndentedString(failAccessMembers)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


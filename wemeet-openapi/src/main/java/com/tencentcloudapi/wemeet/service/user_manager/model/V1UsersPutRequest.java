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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1UsersPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersPutRequest {
    @JsonProperty(value = "avatar_url")
    private String avatarUrl;

    @JsonProperty(value = "department_list")
    private List<String> departmentList;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "entry_time")
    private Long entryTime;

    @JsonProperty(value = "job_title")
    private String jobTitle;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "phone")
    private String phone;

    @JsonProperty(value = "staff_id")
    private String staffId;

    @JsonProperty(value = "username")
    private String username;

    /**
     * @param operatorId 操作者ID (required)
     * @param operatorIdType 操作者ID类型，1:userid (required)
     */
    public V1UsersPutRequest(@NotNull String operatorId, @NotNull Long operatorIdType) {
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param avatarUrl 
     */
    public V1UsersPutRequest avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    /**
     * @return avatarUrl 
     **/
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl 
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    /**
     * @param departmentList 员工部门，暂只支持为用户分配1个部门。
     */
    public V1UsersPutRequest departmentList(List<String> departmentList) {
        this.departmentList = departmentList;
        return this;
    }
    /**
     * @return departmentList 员工部门，暂只支持为用户分配1个部门。
     **/
    public List<String> getDepartmentList() {
        return departmentList;
    }

    /**
     * @param departmentList 员工部门，暂只支持为用户分配1个部门。
     */
    public void setDepartmentList(List<String> departmentList) {
        this.departmentList = departmentList;
    }
    /**
     * @param email 
     */
    public V1UsersPutRequest email(String email) {
        this.email = email;
        return this;
    }
    /**
     * @return email 
     **/
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @param entryTime 
     */
    public V1UsersPutRequest entryTime(Long entryTime) {
        this.entryTime = entryTime;
        return this;
    }
    /**
     * @return entryTime 
     **/
    public Long getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime 
     */
    public void setEntryTime(Long entryTime) {
        this.entryTime = entryTime;
    }
    /**
     * @param jobTitle 
     */
    public V1UsersPutRequest jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
    /**
     * @return jobTitle 
     **/
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle 
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    /**
     * @param operatorId 操作者ID (required)
     */
    public V1UsersPutRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID类型，1:userid (required)
     */
    public V1UsersPutRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID类型，1:userid
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID类型，1:userid (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param phone 
     */
    public V1UsersPutRequest phone(String phone) {
        this.phone = phone;
        return this;
    }
    /**
     * @return phone 
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * @param staffId 
     */
    public V1UsersPutRequest staffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    /**
     * @return staffId 
     **/
    public String getStaffId() {
        return staffId;
    }

    /**
     * @param staffId 
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    /**
     * @param username 
     */
    public V1UsersPutRequest username(String username) {
        this.username = username;
        return this;
    }
    /**
     * @return username 
     **/
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1UsersPutRequest v1UsersPutRequest = (V1UsersPutRequest) o;
        return Objects.equals(this.avatarUrl, v1UsersPutRequest.avatarUrl) &&
            Objects.equals(this.departmentList, v1UsersPutRequest.departmentList) &&
            Objects.equals(this.email, v1UsersPutRequest.email) &&
            Objects.equals(this.entryTime, v1UsersPutRequest.entryTime) &&
            Objects.equals(this.jobTitle, v1UsersPutRequest.jobTitle) &&
            Objects.equals(this.operatorId, v1UsersPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1UsersPutRequest.operatorIdType) &&
            Objects.equals(this.phone, v1UsersPutRequest.phone) &&
            Objects.equals(this.staffId, v1UsersPutRequest.staffId) &&
            Objects.equals(this.username, v1UsersPutRequest.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avatarUrl, departmentList, email, entryTime, jobTitle, operatorId, operatorIdType, phone, staffId, username);
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
        sb.append("class V1UsersPutRequest {\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    departmentList: ").append(toIndentedString(departmentList)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
        sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

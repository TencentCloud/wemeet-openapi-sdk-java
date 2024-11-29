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
 * V1UsersUseridGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersUseridGet200Response {
    @JsonProperty(value = "account_type")
    private Long accountType;

    @JsonProperty(value = "account_version")
    private Long accountVersion;

    @JsonProperty(value = "ai_account_type")
    private Long aiAccountType;

    @JsonProperty(value = "area")
    private String area;

    @JsonProperty(value = "avatar_url")
    private String avatarUrl;

    @JsonProperty(value = "department_list")
    private List<V1UsersUseridGet200ResponseDepartmentListInner> departmentList;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "enable_ai_account")
    private Boolean enableAiAccount;

    @JsonProperty(value = "entry_time")
    private String entryTime;

    @JsonProperty(value = "job_title")
    private String jobTitle;

    @JsonProperty(value = "phone")
    private String phone;

    @JsonProperty(value = "phone_status")
    private Long phoneStatus;

    @JsonProperty(value = "role_code")
    private String roleCode;

    @JsonProperty(value = "role_name")
    private String roleName;

    @JsonProperty(value = "staff_id")
    private String staffId;

    @JsonProperty(value = "status")
    private String status;

    @JsonProperty(value = "update_time")
    private String updateTime;

    @JsonProperty(value = "user_account_type")
    private Long userAccountType;

    @JsonProperty(value = "userid")
    private String userid;

    @JsonProperty(value = "username")
    private String username;

    @JsonProperty(value = "uuid")
    private String uuid;

    /**
     */
    public V1UsersUseridGet200Response() {
    }

    /**
     * @param accountType 
     */
    public V1UsersUseridGet200Response accountType(Long accountType) {
        this.accountType = accountType;
        return this;
    }
    /**
     * @return accountType 
     **/
    public Long getAccountType() {
        return accountType;
    }

    /**
     * @param accountType 
     */
    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }
    /**
     * @param accountVersion 账号版本
     */
    public V1UsersUseridGet200Response accountVersion(Long accountVersion) {
        this.accountVersion = accountVersion;
        return this;
    }
    /**
     * @return accountVersion 账号版本
     **/
    public Long getAccountVersion() {
        return accountVersion;
    }

    /**
     * @param accountVersion 账号版本
     */
    public void setAccountVersion(Long accountVersion) {
        this.accountVersion = accountVersion;
    }
    /**
     * @param aiAccountType ai账号类型 1:购买版 2:赠送版
     */
    public V1UsersUseridGet200Response aiAccountType(Long aiAccountType) {
        this.aiAccountType = aiAccountType;
        return this;
    }
    /**
     * @return aiAccountType ai账号类型 1:购买版 2:赠送版
     **/
    public Long getAiAccountType() {
        return aiAccountType;
    }

    /**
     * @param aiAccountType ai账号类型 1:购买版 2:赠送版
     */
    public void setAiAccountType(Long aiAccountType) {
        this.aiAccountType = aiAccountType;
    }
    /**
     * @param area 
     */
    public V1UsersUseridGet200Response area(String area) {
        this.area = area;
        return this;
    }
    /**
     * @return area 
     **/
    public String getArea() {
        return area;
    }

    /**
     * @param area 
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     * @param avatarUrl 
     */
    public V1UsersUseridGet200Response avatarUrl(String avatarUrl) {
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
     * @param departmentList 
     */
    public V1UsersUseridGet200Response departmentList(List<V1UsersUseridGet200ResponseDepartmentListInner> departmentList) {
        this.departmentList = departmentList;
        return this;
    }
    /**
     * @return departmentList 
     **/
    public List<V1UsersUseridGet200ResponseDepartmentListInner> getDepartmentList() {
        return departmentList;
    }

    /**
     * @param departmentList 
     */
    public void setDepartmentList(List<V1UsersUseridGet200ResponseDepartmentListInner> departmentList) {
        this.departmentList = departmentList;
    }
    /**
     * @param email 
     */
    public V1UsersUseridGet200Response email(String email) {
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
     * @param enableAiAccount 是否有ai账号能力，true：有，false：无
     */
    public V1UsersUseridGet200Response enableAiAccount(Boolean enableAiAccount) {
        this.enableAiAccount = enableAiAccount;
        return this;
    }
    /**
     * @return enableAiAccount 是否有ai账号能力，true：有，false：无
     **/
    public Boolean getEnableAiAccount() {
        return enableAiAccount;
    }

    /**
     * @param enableAiAccount 是否有ai账号能力，true：有，false：无
     */
    public void setEnableAiAccount(Boolean enableAiAccount) {
        this.enableAiAccount = enableAiAccount;
    }
    /**
     * @param entryTime 
     */
    public V1UsersUseridGet200Response entryTime(String entryTime) {
        this.entryTime = entryTime;
        return this;
    }
    /**
     * @return entryTime 
     **/
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime 
     */
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }
    /**
     * @param jobTitle 
     */
    public V1UsersUseridGet200Response jobTitle(String jobTitle) {
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
     * @param phone 
     */
    public V1UsersUseridGet200Response phone(String phone) {
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
     * @param phoneStatus 手机号验证状态。 0：未知 1：已验证 2：未验证
     */
    public V1UsersUseridGet200Response phoneStatus(Long phoneStatus) {
        this.phoneStatus = phoneStatus;
        return this;
    }
    /**
     * @return phoneStatus 手机号验证状态。 0：未知 1：已验证 2：未验证
     **/
    public Long getPhoneStatus() {
        return phoneStatus;
    }

    /**
     * @param phoneStatus 手机号验证状态。 0：未知 1：已验证 2：未验证
     */
    public void setPhoneStatus(Long phoneStatus) {
        this.phoneStatus = phoneStatus;
    }
    /**
     * @param roleCode 
     */
    public V1UsersUseridGet200Response roleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    /**
     * @return roleCode 
     **/
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * @param roleCode 
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
    /**
     * @param roleName 
     */
    public V1UsersUseridGet200Response roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    /**
     * @return roleName 
     **/
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName 
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    /**
     * @param staffId 
     */
    public V1UsersUseridGet200Response staffId(String staffId) {
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
     * @param status 
     */
    public V1UsersUseridGet200Response status(String status) {
        this.status = status;
        return this;
    }
    /**
     * @return status 
     **/
    public String getStatus() {
        return status;
    }

    /**
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @param updateTime 
     */
    public V1UsersUseridGet200Response updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    /**
     * @return updateTime 
     **/
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime 
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    /**
     * @param userAccountType  1：高级账号  2：免费账号  3：免费账号100方 4:高级账号300方，5:高级账号500方，6：高级账号1000方，7:高级账号2000方
     */
    public V1UsersUseridGet200Response userAccountType(Long userAccountType) {
        this.userAccountType = userAccountType;
        return this;
    }
    /**
     * @return userAccountType  1：高级账号  2：免费账号  3：免费账号100方 4:高级账号300方，5:高级账号500方，6：高级账号1000方，7:高级账号2000方
     **/
    public Long getUserAccountType() {
        return userAccountType;
    }

    /**
     * @param userAccountType  1：高级账号  2：免费账号  3：免费账号100方 4:高级账号300方，5:高级账号500方，6：高级账号1000方，7:高级账号2000方
     */
    public void setUserAccountType(Long userAccountType) {
        this.userAccountType = userAccountType;
    }
    /**
     * @param userid 
     */
    public V1UsersUseridGet200Response userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param username 
     */
    public V1UsersUseridGet200Response username(String username) {
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
    /**
     * @param uuid 
     */
    public V1UsersUseridGet200Response uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    /**
     * @return uuid 
     **/
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid 
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1UsersUseridGet200Response v1UsersUseridGet200Response = (V1UsersUseridGet200Response) o;
        return Objects.equals(this.accountType, v1UsersUseridGet200Response.accountType) &&
            Objects.equals(this.accountVersion, v1UsersUseridGet200Response.accountVersion) &&
            Objects.equals(this.aiAccountType, v1UsersUseridGet200Response.aiAccountType) &&
            Objects.equals(this.area, v1UsersUseridGet200Response.area) &&
            Objects.equals(this.avatarUrl, v1UsersUseridGet200Response.avatarUrl) &&
            Objects.equals(this.departmentList, v1UsersUseridGet200Response.departmentList) &&
            Objects.equals(this.email, v1UsersUseridGet200Response.email) &&
            Objects.equals(this.enableAiAccount, v1UsersUseridGet200Response.enableAiAccount) &&
            Objects.equals(this.entryTime, v1UsersUseridGet200Response.entryTime) &&
            Objects.equals(this.jobTitle, v1UsersUseridGet200Response.jobTitle) &&
            Objects.equals(this.phone, v1UsersUseridGet200Response.phone) &&
            Objects.equals(this.phoneStatus, v1UsersUseridGet200Response.phoneStatus) &&
            Objects.equals(this.roleCode, v1UsersUseridGet200Response.roleCode) &&
            Objects.equals(this.roleName, v1UsersUseridGet200Response.roleName) &&
            Objects.equals(this.staffId, v1UsersUseridGet200Response.staffId) &&
            Objects.equals(this.status, v1UsersUseridGet200Response.status) &&
            Objects.equals(this.updateTime, v1UsersUseridGet200Response.updateTime) &&
            Objects.equals(this.userAccountType, v1UsersUseridGet200Response.userAccountType) &&
            Objects.equals(this.userid, v1UsersUseridGet200Response.userid) &&
            Objects.equals(this.username, v1UsersUseridGet200Response.username) &&
            Objects.equals(this.uuid, v1UsersUseridGet200Response.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType, accountVersion, aiAccountType, area, avatarUrl, departmentList, email, enableAiAccount, entryTime, jobTitle, phone, phoneStatus, roleCode, roleName, staffId, status, updateTime, userAccountType, userid, username, uuid);
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
        sb.append("class V1UsersUseridGet200Response {\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    accountVersion: ").append(toIndentedString(accountVersion)).append("\n");
        sb.append("    aiAccountType: ").append(toIndentedString(aiAccountType)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    departmentList: ").append(toIndentedString(departmentList)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    enableAiAccount: ").append(toIndentedString(enableAiAccount)).append("\n");
        sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
        sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    phoneStatus: ").append(toIndentedString(phoneStatus)).append("\n");
        sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    userAccountType: ").append(toIndentedString(userAccountType)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


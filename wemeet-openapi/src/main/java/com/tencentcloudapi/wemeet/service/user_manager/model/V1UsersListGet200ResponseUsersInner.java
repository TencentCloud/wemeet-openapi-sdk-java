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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1UsersListGet200ResponseUsersInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersListGet200ResponseUsersInner {
    @JsonProperty(value = "account_version")
    private Long accountVersion;

    @JsonProperty(value = "ai_account_type")
    private Long aiAccountType;

    @JsonProperty(value = "area")
    private String area;

    @JsonProperty(value = "avatar_url")
    private String avatarUrl;

    @JsonProperty(value = "department_list")
    private List<V1UsersListGet200ResponseUsersInnerDepartmentListInner> departmentList;

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
    public V1UsersListGet200ResponseUsersInner() {
    }

    /**
     * @param accountVersion 账号版本
     */
    public V1UsersListGet200ResponseUsersInner accountVersion(Long accountVersion) {
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
    public V1UsersListGet200ResponseUsersInner aiAccountType(Long aiAccountType) {
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
     * @param area 手机区号。
     */
    public V1UsersListGet200ResponseUsersInner area(String area) {
        this.area = area;
        return this;
    }
    /**
     * @return area 手机区号。
     **/
    public String getArea() {
        return area;
    }

    /**
     * @param area 手机区号。
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     * @param avatarUrl 用户图像地址。
     */
    public V1UsersListGet200ResponseUsersInner avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    /**
     * @return avatarUrl 用户图像地址。
     **/
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl 用户图像地址。
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    /**
     * @param departmentList 用户部门信息。
     */
    public V1UsersListGet200ResponseUsersInner departmentList(List<V1UsersListGet200ResponseUsersInnerDepartmentListInner> departmentList) {
        this.departmentList = departmentList;
        return this;
    }
    /**
     * @return departmentList 用户部门信息。
     **/
    public List<V1UsersListGet200ResponseUsersInnerDepartmentListInner> getDepartmentList() {
        return departmentList;
    }

    /**
     * @param departmentList 用户部门信息。
     */
    public void setDepartmentList(List<V1UsersListGet200ResponseUsersInnerDepartmentListInner> departmentList) {
        this.departmentList = departmentList;
    }
    /**
     * @param email 邮箱。
     */
    public V1UsersListGet200ResponseUsersInner email(String email) {
        this.email = email;
        return this;
    }
    /**
     * @return email 邮箱。
     **/
    public String getEmail() {
        return email;
    }

    /**
     * @param email 邮箱。
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @param enableAiAccount 是否有ai账号能力  true：有  false：无  教育版/企业版存在有ai账号，商业版都具有ai能力，其余为false
     */
    public V1UsersListGet200ResponseUsersInner enableAiAccount(Boolean enableAiAccount) {
        this.enableAiAccount = enableAiAccount;
        return this;
    }
    /**
     * @return enableAiAccount 是否有ai账号能力  true：有  false：无  教育版/企业版存在有ai账号，商业版都具有ai能力，其余为false
     **/
    public Boolean getEnableAiAccount() {
        return enableAiAccount;
    }

    /**
     * @param enableAiAccount 是否有ai账号能力  true：有  false：无  教育版/企业版存在有ai账号，商业版都具有ai能力，其余为false
     */
    public void setEnableAiAccount(Boolean enableAiAccount) {
        this.enableAiAccount = enableAiAccount;
    }
    /**
     * @param entryTime 入职时间。
     */
    public V1UsersListGet200ResponseUsersInner entryTime(String entryTime) {
        this.entryTime = entryTime;
        return this;
    }
    /**
     * @return entryTime 入职时间。
     **/
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime 入职时间。
     */
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }
    /**
     * @param jobTitle 员工职位。
     */
    public V1UsersListGet200ResponseUsersInner jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
    /**
     * @return jobTitle 员工职位。
     **/
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle 员工职位。
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    /**
     * @param phone 手机号。
     */
    public V1UsersListGet200ResponseUsersInner phone(String phone) {
        this.phone = phone;
        return this;
    }
    /**
     * @return phone 手机号。
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 手机号。
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * @param phoneStatus 手机号验证状态。 0：未知 1：已验证 2：未验证
     */
    public V1UsersListGet200ResponseUsersInner phoneStatus(Long phoneStatus) {
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
     * @param roleCode 角色类型。
     */
    public V1UsersListGet200ResponseUsersInner roleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    /**
     * @return roleCode 角色类型。
     **/
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * @param roleCode 角色类型。
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
    /**
     * @param roleName 角色名称。
     */
    public V1UsersListGet200ResponseUsersInner roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    /**
     * @return roleName 角色名称。
     **/
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName 角色名称。
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    /**
     * @param staffId String  员工工号。
     */
    public V1UsersListGet200ResponseUsersInner staffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    /**
     * @return staffId String  员工工号。
     **/
    public String getStaffId() {
        return staffId;
    }

    /**
     * @param staffId String  员工工号。
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    /**
     * @param status 账号状态： 1：正常 2：注销 3：未激活 4：禁用
     */
    public V1UsersListGet200ResponseUsersInner status(String status) {
        this.status = status;
        return this;
    }
    /**
     * @return status 账号状态： 1：正常 2：注销 3：未激活 4：禁用
     **/
    public String getStatus() {
        return status;
    }

    /**
     * @param status 账号状态： 1：正常 2：注销 3：未激活 4：禁用
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @param updateTime String  更新时间。
     */
    public V1UsersListGet200ResponseUsersInner updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    /**
     * @return updateTime String  更新时间。
     **/
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime String  更新时间。
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    /**
     * @param userAccountType 账号类型    1：高级账号 （企业版，教育版）  2：免费账号  （企业版，教育版，商业版）  3：免费账号100方 （商业版）  4：高级账号300方（商业版）  5：高级账号500方（商业版）  6：高级账号1000方（商业版）  7:高级账号2000方（商业版）
     */
    public V1UsersListGet200ResponseUsersInner userAccountType(Long userAccountType) {
        this.userAccountType = userAccountType;
        return this;
    }
    /**
     * @return userAccountType 账号类型    1：高级账号 （企业版，教育版）  2：免费账号  （企业版，教育版，商业版）  3：免费账号100方 （商业版）  4：高级账号300方（商业版）  5：高级账号500方（商业版）  6：高级账号1000方（商业版）  7:高级账号2000方（商业版）
     **/
    public Long getUserAccountType() {
        return userAccountType;
    }

    /**
     * @param userAccountType 账号类型    1：高级账号 （企业版，教育版）  2：免费账号  （企业版，教育版，商业版）  3：免费账号100方 （商业版）  4：高级账号300方（商业版）  5：高级账号500方（商业版）  6：高级账号1000方（商业版）  7:高级账号2000方（商业版）
     */
    public void setUserAccountType(Long userAccountType) {
        this.userAccountType = userAccountType;
    }
    /**
     * @param userid String  用户 userid。
     */
    public V1UsersListGet200ResponseUsersInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid String  用户 userid。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid String  用户 userid。
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param username 用户 name。
     */
    public V1UsersListGet200ResponseUsersInner username(String username) {
        this.username = username;
        return this;
    }
    /**
     * @return username 用户 name。
     **/
    public String getUsername() {
        return username;
    }

    /**
     * @param username 用户 name。
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @param uuid 用户身份 ID（腾讯会议颁发的用于开放平台的唯一用户 ID）。
     */
    public V1UsersListGet200ResponseUsersInner uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    /**
     * @return uuid 用户身份 ID（腾讯会议颁发的用于开放平台的唯一用户 ID）。
     **/
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid 用户身份 ID（腾讯会议颁发的用于开放平台的唯一用户 ID）。
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
        V1UsersListGet200ResponseUsersInner v1UsersListGet200ResponseUsersInner = (V1UsersListGet200ResponseUsersInner) o;
        return Objects.equals(this.accountVersion, v1UsersListGet200ResponseUsersInner.accountVersion) &&
            Objects.equals(this.aiAccountType, v1UsersListGet200ResponseUsersInner.aiAccountType) &&
            Objects.equals(this.area, v1UsersListGet200ResponseUsersInner.area) &&
            Objects.equals(this.avatarUrl, v1UsersListGet200ResponseUsersInner.avatarUrl) &&
            Objects.equals(this.departmentList, v1UsersListGet200ResponseUsersInner.departmentList) &&
            Objects.equals(this.email, v1UsersListGet200ResponseUsersInner.email) &&
            Objects.equals(this.enableAiAccount, v1UsersListGet200ResponseUsersInner.enableAiAccount) &&
            Objects.equals(this.entryTime, v1UsersListGet200ResponseUsersInner.entryTime) &&
            Objects.equals(this.jobTitle, v1UsersListGet200ResponseUsersInner.jobTitle) &&
            Objects.equals(this.phone, v1UsersListGet200ResponseUsersInner.phone) &&
            Objects.equals(this.phoneStatus, v1UsersListGet200ResponseUsersInner.phoneStatus) &&
            Objects.equals(this.roleCode, v1UsersListGet200ResponseUsersInner.roleCode) &&
            Objects.equals(this.roleName, v1UsersListGet200ResponseUsersInner.roleName) &&
            Objects.equals(this.staffId, v1UsersListGet200ResponseUsersInner.staffId) &&
            Objects.equals(this.status, v1UsersListGet200ResponseUsersInner.status) &&
            Objects.equals(this.updateTime, v1UsersListGet200ResponseUsersInner.updateTime) &&
            Objects.equals(this.userAccountType, v1UsersListGet200ResponseUsersInner.userAccountType) &&
            Objects.equals(this.userid, v1UsersListGet200ResponseUsersInner.userid) &&
            Objects.equals(this.username, v1UsersListGet200ResponseUsersInner.username) &&
            Objects.equals(this.uuid, v1UsersListGet200ResponseUsersInner.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountVersion, aiAccountType, area, avatarUrl, departmentList, email, enableAiAccount, entryTime, jobTitle, phone, phoneStatus, roleCode, roleName, staffId, status, updateTime, userAccountType, userid, username, uuid);
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
        sb.append("class V1UsersListGet200ResponseUsersInner {\n");
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


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
 * V1UsersPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersPostRequest {
    @JsonProperty(value = "add_on_largemeeting")
    private Long addOnLargemeeting;

    @JsonProperty(value = "add_on_webinar")
    private Long addOnWebinar;

    @JsonProperty(value = "area")
    private String area;

    @JsonProperty(value = "auto_invite")
    private Boolean autoInvite;

    @JsonProperty(value = "department_list")
    private List<String> departmentList;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "entry_time")
    private Long entryTime;

    @JsonProperty(value = "is_voov")
    private Long isVoov;

    @JsonProperty(value = "job_title")
    private String jobTitle;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "phone", required = true)
    private String phone;

    @JsonProperty(value = "staff_id")
    private String staffId;

    @JsonProperty(value = "user_account_type")
    private Long userAccountType;

    @JsonProperty(value = "userid", required = true)
    private String userid;

    @JsonProperty(value = "username", required = true)
    private String username;

    /**
     * @param operatorId 操作者ID (required)
     * @param operatorIdType 操作者ID类型，1:userid (required)
     * @param phone  (required)
     * @param userid  (required)
     * @param username  (required)
     */
    public V1UsersPostRequest(@NotNull String operatorId, @NotNull Long operatorIdType, @NotNull String phone, @NotNull String userid, @NotNull String username) {
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
        this.phone = phone;
        this.userid = userid;
        this.username = username;
    }

    /**
     * @param addOnLargemeeting 增强会议体验：房间规模升级许可。 0：回收房间规模升级许可 1：500方房间规模升级许可 2：1000方房间规模升级许可 3：2000方房间规模升级许可
     */
    public V1UsersPostRequest addOnLargemeeting(Long addOnLargemeeting) {
        this.addOnLargemeeting = addOnLargemeeting;
        return this;
    }
    /**
     * @return addOnLargemeeting 增强会议体验：房间规模升级许可。 0：回收房间规模升级许可 1：500方房间规模升级许可 2：1000方房间规模升级许可 3：2000方房间规模升级许可
     **/
    public Long getAddOnLargemeeting() {
        return addOnLargemeeting;
    }

    /**
     * @param addOnLargemeeting 增强会议体验：房间规模升级许可。 0：回收房间规模升级许可 1：500方房间规模升级许可 2：1000方房间规模升级许可 3：2000方房间规模升级许可
     */
    public void setAddOnLargemeeting(Long addOnLargemeeting) {
        this.addOnLargemeeting = addOnLargemeeting;
    }
    /**
     * @param addOnWebinar 增强会议体验：网络研讨会（Webinar）观众规模升级许可。 0：回收 Webinar 观众规模升级许可 1：Webinar 观众规模提升至 300 观众 2：Webinar 观众规模提升至 500 观众 3：Webinar 观众规模提升至 1000 观众 4：Webinar 观众规模提升至 2000 观众 5：Webinar 观众规模提升至 3000 观众 6：Webinar 观众规模提升至 5000 观众 7：Webinar 观众规模提升至 8000 观众 8：Webinar 观众规模提升至 10000 观众
     */
    public V1UsersPostRequest addOnWebinar(Long addOnWebinar) {
        this.addOnWebinar = addOnWebinar;
        return this;
    }
    /**
     * @return addOnWebinar 增强会议体验：网络研讨会（Webinar）观众规模升级许可。 0：回收 Webinar 观众规模升级许可 1：Webinar 观众规模提升至 300 观众 2：Webinar 观众规模提升至 500 观众 3：Webinar 观众规模提升至 1000 观众 4：Webinar 观众规模提升至 2000 观众 5：Webinar 观众规模提升至 3000 观众 6：Webinar 观众规模提升至 5000 观众 7：Webinar 观众规模提升至 8000 观众 8：Webinar 观众规模提升至 10000 观众
     **/
    public Long getAddOnWebinar() {
        return addOnWebinar;
    }

    /**
     * @param addOnWebinar 增强会议体验：网络研讨会（Webinar）观众规模升级许可。 0：回收 Webinar 观众规模升级许可 1：Webinar 观众规模提升至 300 观众 2：Webinar 观众规模提升至 500 观众 3：Webinar 观众规模提升至 1000 观众 4：Webinar 观众规模提升至 2000 观众 5：Webinar 观众规模提升至 3000 观众 6：Webinar 观众规模提升至 5000 观众 7：Webinar 观众规模提升至 8000 观众 8：Webinar 观众规模提升至 10000 观众
     */
    public void setAddOnWebinar(Long addOnWebinar) {
        this.addOnWebinar = addOnWebinar;
    }
    /**
     * @param area 
     */
    public V1UsersPostRequest area(String area) {
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
     * @param autoInvite 自动发送邀请，开启之后调用接口后自动发送激活邀请 true：开启，默认开启;false：关闭
     */
    public V1UsersPostRequest autoInvite(Boolean autoInvite) {
        this.autoInvite = autoInvite;
        return this;
    }
    /**
     * @return autoInvite 自动发送邀请，开启之后调用接口后自动发送激活邀请 true：开启，默认开启;false：关闭
     **/
    public Boolean getAutoInvite() {
        return autoInvite;
    }

    /**
     * @param autoInvite 自动发送邀请，开启之后调用接口后自动发送激活邀请 true：开启，默认开启;false：关闭
     */
    public void setAutoInvite(Boolean autoInvite) {
        this.autoInvite = autoInvite;
    }
    /**
     * @param departmentList 
     */
    public V1UsersPostRequest departmentList(List<String> departmentList) {
        this.departmentList = departmentList;
        return this;
    }
    /**
     * @return departmentList 
     **/
    public List<String> getDepartmentList() {
        return departmentList;
    }

    /**
     * @param departmentList 
     */
    public void setDepartmentList(List<String> departmentList) {
        this.departmentList = departmentList;
    }
    /**
     * @param email 
     */
    public V1UsersPostRequest email(String email) {
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
    public V1UsersPostRequest entryTime(Long entryTime) {
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
     * @param isVoov 是否为voov用户， 0:否  1:是
     */
    public V1UsersPostRequest isVoov(Long isVoov) {
        this.isVoov = isVoov;
        return this;
    }
    /**
     * @return isVoov 是否为voov用户， 0:否  1:是
     **/
    public Long getIsVoov() {
        return isVoov;
    }

    /**
     * @param isVoov 是否为voov用户， 0:否  1:是
     */
    public void setIsVoov(Long isVoov) {
        this.isVoov = isVoov;
    }
    /**
     * @param jobTitle 
     */
    public V1UsersPostRequest jobTitle(String jobTitle) {
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
    public V1UsersPostRequest operatorId(@NotNull String operatorId) {
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
    public V1UsersPostRequest operatorIdType(@NotNull Long operatorIdType) {
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
     * @param phone  (required)
     */
    public V1UsersPostRequest phone(@NotNull String phone) {
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
     * @param phone  (required)
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * @param staffId 
     */
    public V1UsersPostRequest staffId(String staffId) {
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
     * @param userAccountType 1：高级账号  2：免费账号  3：免费账号100方 4:高级账号300方，5:高级账号500方，6：高级账号1000方，7:高级账号2000方    8：高级账号100方（商业版） 9：高级账号（企业版/教育版/商业版）其中旧商业版：企业版/教育版：1，2 。免费组织 2。 商业版：2-7      新商业版：免费账号：2，高级账号：9。
     */
    public V1UsersPostRequest userAccountType(Long userAccountType) {
        this.userAccountType = userAccountType;
        return this;
    }
    /**
     * @return userAccountType 1：高级账号  2：免费账号  3：免费账号100方 4:高级账号300方，5:高级账号500方，6：高级账号1000方，7:高级账号2000方    8：高级账号100方（商业版） 9：高级账号（企业版/教育版/商业版）其中旧商业版：企业版/教育版：1，2 。免费组织 2。 商业版：2-7      新商业版：免费账号：2，高级账号：9。
     **/
    public Long getUserAccountType() {
        return userAccountType;
    }

    /**
     * @param userAccountType 1：高级账号  2：免费账号  3：免费账号100方 4:高级账号300方，5:高级账号500方，6：高级账号1000方，7:高级账号2000方    8：高级账号100方（商业版） 9：高级账号（企业版/教育版/商业版）其中旧商业版：企业版/教育版：1，2 。免费组织 2。 商业版：2-7      新商业版：免费账号：2，高级账号：9。
     */
    public void setUserAccountType(Long userAccountType) {
        this.userAccountType = userAccountType;
    }
    /**
     * @param userid  (required)
     */
    public V1UsersPostRequest userid(@NotNull String userid) {
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
     * @param userid  (required)
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param username  (required)
     */
    public V1UsersPostRequest username(@NotNull String username) {
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
     * @param username  (required)
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
        V1UsersPostRequest v1UsersPostRequest = (V1UsersPostRequest) o;
        return Objects.equals(this.addOnLargemeeting, v1UsersPostRequest.addOnLargemeeting) &&
            Objects.equals(this.addOnWebinar, v1UsersPostRequest.addOnWebinar) &&
            Objects.equals(this.area, v1UsersPostRequest.area) &&
            Objects.equals(this.autoInvite, v1UsersPostRequest.autoInvite) &&
            Objects.equals(this.departmentList, v1UsersPostRequest.departmentList) &&
            Objects.equals(this.email, v1UsersPostRequest.email) &&
            Objects.equals(this.entryTime, v1UsersPostRequest.entryTime) &&
            Objects.equals(this.isVoov, v1UsersPostRequest.isVoov) &&
            Objects.equals(this.jobTitle, v1UsersPostRequest.jobTitle) &&
            Objects.equals(this.operatorId, v1UsersPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1UsersPostRequest.operatorIdType) &&
            Objects.equals(this.phone, v1UsersPostRequest.phone) &&
            Objects.equals(this.staffId, v1UsersPostRequest.staffId) &&
            Objects.equals(this.userAccountType, v1UsersPostRequest.userAccountType) &&
            Objects.equals(this.userid, v1UsersPostRequest.userid) &&
            Objects.equals(this.username, v1UsersPostRequest.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addOnLargemeeting, addOnWebinar, area, autoInvite, departmentList, email, entryTime, isVoov, jobTitle, operatorId, operatorIdType, phone, staffId, userAccountType, userid, username);
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
        sb.append("class V1UsersPostRequest {\n");
        sb.append("    addOnLargemeeting: ").append(toIndentedString(addOnLargemeeting)).append("\n");
        sb.append("    addOnWebinar: ").append(toIndentedString(addOnWebinar)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    autoInvite: ").append(toIndentedString(autoInvite)).append("\n");
        sb.append("    departmentList: ").append(toIndentedString(departmentList)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
        sb.append("    isVoov: ").append(toIndentedString(isVoov)).append("\n");
        sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
        sb.append("    userAccountType: ").append(toIndentedString(userAccountType)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


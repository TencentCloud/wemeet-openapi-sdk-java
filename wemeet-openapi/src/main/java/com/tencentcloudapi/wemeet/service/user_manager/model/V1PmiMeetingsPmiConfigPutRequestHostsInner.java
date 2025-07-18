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
 * V1PmiMeetingsPmiConfigPutRequestHostsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1PmiMeetingsPmiConfigPutRequestHostsInner {
    @JsonProperty(value = "is_anonymous")
    private Boolean isAnonymous;

    @JsonProperty(value = "nick_name")
    private String nickName;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type")
    private Long operatorIdType;

    @JsonProperty(value = "profile_photo")
    private String profilePhoto;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     */
    public V1PmiMeetingsPmiConfigPutRequestHostsInner() {
    }

    /**
     * @param isAnonymous 用户是否匿名入会，缺省为 false，不匿名。 true：匿名 false：不匿名
     */
    public V1PmiMeetingsPmiConfigPutRequestHostsInner isAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
        return this;
    }
    /**
     * @return isAnonymous 用户是否匿名入会，缺省为 false，不匿名。 true：匿名 false：不匿名
     **/
    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    /**
     * @param isAnonymous 用户是否匿名入会，缺省为 false，不匿名。 true：匿名 false：不匿名
     */
    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }
    /**
     * @param nickName 用户匿名字符串。如果字段“is_anonymous”设置为“true”，但是无指定匿名字符串, 会议将分配缺省名称，例如 “会议用户xxxx”，其中“xxxx”为随机数字
     */
    public V1PmiMeetingsPmiConfigPutRequestHostsInner nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    /**
     * @return nickName 用户匿名字符串。如果字段“is_anonymous”设置为“true”，但是无指定匿名字符串, 会议将分配缺省名称，例如 “会议用户xxxx”，其中“xxxx”为随机数字
     **/
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName 用户匿名字符串。如果字段“is_anonymous”设置为“true”，但是无指定匿名字符串, 会议将分配缺省名称，例如 “会议用户xxxx”，其中“xxxx”为随机数字
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    /**
     * @param operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     */
    public V1PmiMeetingsPmiConfigPutRequestHostsInner operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID，根据operator_id_type的值，使用不同的类型
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID的类型：1:userid  2:openid 3:rooms_id  4: ms_open_id
     */
    public V1PmiMeetingsPmiConfigPutRequestHostsInner operatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID的类型：1:userid  2:openid 3:rooms_id  4: ms_open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID的类型：1:userid  2:openid 3:rooms_id  4: ms_open_id
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param profilePhoto 头像地址
     */
    public V1PmiMeetingsPmiConfigPutRequestHostsInner profilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
        return this;
    }
    /**
     * @return profilePhoto 头像地址
     **/
    public String getProfilePhoto() {
        return profilePhoto;
    }

    /**
     * @param profilePhoto 头像地址
     */
    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
    /**
     * @param userid 
     */
    public V1PmiMeetingsPmiConfigPutRequestHostsInner userid(String userid) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1PmiMeetingsPmiConfigPutRequestHostsInner v1PmiMeetingsPmiConfigPutRequestHostsInner = (V1PmiMeetingsPmiConfigPutRequestHostsInner) o;
        return Objects.equals(this.isAnonymous, v1PmiMeetingsPmiConfigPutRequestHostsInner.isAnonymous) &&
            Objects.equals(this.nickName, v1PmiMeetingsPmiConfigPutRequestHostsInner.nickName) &&
            Objects.equals(this.operatorId, v1PmiMeetingsPmiConfigPutRequestHostsInner.operatorId) &&
            Objects.equals(this.operatorIdType, v1PmiMeetingsPmiConfigPutRequestHostsInner.operatorIdType) &&
            Objects.equals(this.profilePhoto, v1PmiMeetingsPmiConfigPutRequestHostsInner.profilePhoto) &&
            Objects.equals(this.userid, v1PmiMeetingsPmiConfigPutRequestHostsInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAnonymous, nickName, operatorId, operatorIdType, profilePhoto, userid);
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
        sb.append("class V1PmiMeetingsPmiConfigPutRequestHostsInner {\n");
        sb.append("    isAnonymous: ").append(toIndentedString(isAnonymous)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    profilePhoto: ").append(toIndentedString(profilePhoto)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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
 * V1UsersInviteActivatePost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersInviteActivatePost200Response {
    @JsonProperty(value = "inactivate_user_list")
    private List<V1UsersInviteActivatePost200ResponseInactivateUserListInner> inactivateUserList;

    /**
     */
    public V1UsersInviteActivatePost200Response() {
    }

    /**
     * @param inactivateUserList 未激活用户对象列表
     */
    public V1UsersInviteActivatePost200Response inactivateUserList(List<V1UsersInviteActivatePost200ResponseInactivateUserListInner> inactivateUserList) {
        this.inactivateUserList = inactivateUserList;
        return this;
    }
    /**
     * @return inactivateUserList 未激活用户对象列表
     **/
    public List<V1UsersInviteActivatePost200ResponseInactivateUserListInner> getInactivateUserList() {
        return inactivateUserList;
    }

    /**
     * @param inactivateUserList 未激活用户对象列表
     */
    public void setInactivateUserList(List<V1UsersInviteActivatePost200ResponseInactivateUserListInner> inactivateUserList) {
        this.inactivateUserList = inactivateUserList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1UsersInviteActivatePost200Response v1UsersInviteActivatePost200Response = (V1UsersInviteActivatePost200Response) o;
        return Objects.equals(this.inactivateUserList, v1UsersInviteActivatePost200Response.inactivateUserList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inactivateUserList);
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
        sb.append("class V1UsersInviteActivatePost200Response {\n");
        sb.append("    inactivateUserList: ").append(toIndentedString(inactivateUserList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


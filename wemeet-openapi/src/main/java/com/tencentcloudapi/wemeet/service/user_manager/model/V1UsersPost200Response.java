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
 * V1UsersPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersPost200Response {
    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "phone")
    private String phone;

    @JsonProperty(value = "userid")
    private String userid;

    @JsonProperty(value = "username")
    private String username;

    @JsonProperty(value = "uuid")
    private String uuid;

    /**
     */
    public V1UsersPost200Response() {
    }

    /**
     * @param email 
     */
    public V1UsersPost200Response email(String email) {
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
     * @param phone 
     */
    public V1UsersPost200Response phone(String phone) {
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
     * @param userid 
     */
    public V1UsersPost200Response userid(String userid) {
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
    public V1UsersPost200Response username(String username) {
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
    public V1UsersPost200Response uuid(String uuid) {
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
        V1UsersPost200Response v1UsersPost200Response = (V1UsersPost200Response) o;
        return Objects.equals(this.email, v1UsersPost200Response.email) &&
            Objects.equals(this.phone, v1UsersPost200Response.phone) &&
            Objects.equals(this.userid, v1UsersPost200Response.userid) &&
            Objects.equals(this.username, v1UsersPost200Response.username) &&
            Objects.equals(this.uuid, v1UsersPost200Response.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phone, userid, username, uuid);
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
        sb.append("class V1UsersPost200Response {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * userid
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1PmiMeetingsPmiConfigGet200ResponseHostsInner {
    @JsonProperty(value = "userid")
    private String userid;

    /**
     */
    public V1PmiMeetingsPmiConfigGet200ResponseHostsInner() {
    }

    /**
     * @param userid 
     */
    public V1PmiMeetingsPmiConfigGet200ResponseHostsInner userid(String userid) {
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
        V1PmiMeetingsPmiConfigGet200ResponseHostsInner v1PmiMeetingsPmiConfigGet200ResponseHostsInner = (V1PmiMeetingsPmiConfigGet200ResponseHostsInner) o;
        return Objects.equals(this.userid, v1PmiMeetingsPmiConfigGet200ResponseHostsInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid);
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
        sb.append("class V1PmiMeetingsPmiConfigGet200ResponseHostsInner {\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

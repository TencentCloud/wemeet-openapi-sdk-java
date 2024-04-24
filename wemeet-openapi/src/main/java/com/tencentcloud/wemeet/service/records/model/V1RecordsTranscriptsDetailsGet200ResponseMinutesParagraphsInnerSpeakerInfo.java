/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.0.70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloud.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * 发言人信息对象。
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo {
    @JsonProperty(value = "userid")
    private String userid;

    @JsonProperty(value = "username")
    private String username;

    /**
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo() {
    }

    /**
     * @param userid 同企业返回企业用户 userid。
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 同企业返回企业用户 userid。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 同企业返回企业用户 userid。
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param username 昵称
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo username(String username) {
        this.username = username;
        return this;
    }
    /**
     * @return username 昵称
     **/
    public String getUsername() {
        return username;
    }

    /**
     * @param username 昵称
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
        V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo = (V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo) o;
        return Objects.equals(this.userid, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo.userid) &&
            Objects.equals(this.username, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, username);
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
        sb.append("class V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSpeakerInfo {\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


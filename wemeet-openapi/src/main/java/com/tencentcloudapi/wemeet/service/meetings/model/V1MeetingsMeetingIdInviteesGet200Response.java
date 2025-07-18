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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdInviteesGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdInviteesGet200Response {
    @JsonProperty(value = "has_remaining")
    private Boolean hasRemaining;

    @JsonProperty(value = "invitees")
    private List<V1MeetingsMeetingIdInviteesGet200ResponseInviteesInner> invitees;

    @JsonProperty(value = "next_pos")
    private Long nextPos;

    /**
     */
    public V1MeetingsMeetingIdInviteesGet200Response() {
    }

    /**
     * @param hasRemaining 是否还存在受邀成员需要继续查询。
     */
    public V1MeetingsMeetingIdInviteesGet200Response hasRemaining(Boolean hasRemaining) {
        this.hasRemaining = hasRemaining;
        return this;
    }
    /**
     * @return hasRemaining 是否还存在受邀成员需要继续查询。
     **/
    public Boolean getHasRemaining() {
        return hasRemaining;
    }

    /**
     * @param hasRemaining 是否还存在受邀成员需要继续查询。
     */
    public void setHasRemaining(Boolean hasRemaining) {
        this.hasRemaining = hasRemaining;
    }
    /**
     * @param invitees 会议邀请的参会者
     */
    public V1MeetingsMeetingIdInviteesGet200Response invitees(List<V1MeetingsMeetingIdInviteesGet200ResponseInviteesInner> invitees) {
        this.invitees = invitees;
        return this;
    }
    /**
     * @return invitees 会议邀请的参会者
     **/
    public List<V1MeetingsMeetingIdInviteesGet200ResponseInviteesInner> getInvitees() {
        return invitees;
    }

    /**
     * @param invitees 会议邀请的参会者
     */
    public void setInvitees(List<V1MeetingsMeetingIdInviteesGet200ResponseInviteesInner> invitees) {
        this.invitees = invitees;
    }
    /**
     * @param nextPos 当has_remaining为true时，下次查询时输入参数pos的值
     */
    public V1MeetingsMeetingIdInviteesGet200Response nextPos(Long nextPos) {
        this.nextPos = nextPos;
        return this;
    }
    /**
     * @return nextPos 当has_remaining为true时，下次查询时输入参数pos的值
     **/
    public Long getNextPos() {
        return nextPos;
    }

    /**
     * @param nextPos 当has_remaining为true时，下次查询时输入参数pos的值
     */
    public void setNextPos(Long nextPos) {
        this.nextPos = nextPos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdInviteesGet200Response v1MeetingsMeetingIdInviteesGet200Response = (V1MeetingsMeetingIdInviteesGet200Response) o;
        return Objects.equals(this.hasRemaining, v1MeetingsMeetingIdInviteesGet200Response.hasRemaining) &&
            Objects.equals(this.invitees, v1MeetingsMeetingIdInviteesGet200Response.invitees) &&
            Objects.equals(this.nextPos, v1MeetingsMeetingIdInviteesGet200Response.nextPos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasRemaining, invitees, nextPos);
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
        sb.append("class V1MeetingsMeetingIdInviteesGet200Response {\n");
        sb.append("    hasRemaining: ").append(toIndentedString(hasRemaining)).append("\n");
        sb.append("    invitees: ").append(toIndentedString(invitees)).append("\n");
        sb.append("    nextPos: ").append(toIndentedString(nextPos)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


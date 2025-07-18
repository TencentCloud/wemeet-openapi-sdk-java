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

package com.tencentcloudapi.wemeet.service.application_group.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1AppToolkitPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AppToolkitPostRequest {
    @JsonProperty(value = "auto_open_sdkid")
    private String autoOpenSdkid;

    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "meeting_id", required = true)
    private String meetingId;

    @JsonProperty(value = "tool_list", required = true)
    private List<V1AppToolkitPostRequestToolListInner> toolList;

    @JsonProperty(value = "toolbar_sdkid")
    private String toolbarSdkid;

    @JsonProperty(value = "userid", required = true)
    private String userid;

    /**
     * @param instanceid 用户的终端设备类型： 1 - PC 2 - Mac 3 - Android 4 - iOS 5 - Web 6 - iPad 7 - Android Pad 8 - 小程序  (required)
     * @param meetingId 会议id (required)
     * @param toolList 工具箱应用列表 (required)
     * @param userid 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0鉴权用户请使用openId） 企业唯一用户标识说明： 1、 企业对接SSO时使用的员工唯一标识ID 2、 企业调用创建用户接口时传递的userid参数 (required)
     */
    public V1AppToolkitPostRequest(@NotNull Long instanceid, @NotNull String meetingId, @NotNull List<V1AppToolkitPostRequestToolListInner> toolList, @NotNull String userid) {
        this.instanceid = instanceid;
        this.meetingId = meetingId;
        this.toolList = toolList;
        this.userid = userid;
    }

    /**
     * @param autoOpenSdkid 自动打开应用的id
     */
    public V1AppToolkitPostRequest autoOpenSdkid(String autoOpenSdkid) {
        this.autoOpenSdkid = autoOpenSdkid;
        return this;
    }
    /**
     * @return autoOpenSdkid 自动打开应用的id
     **/
    public String getAutoOpenSdkid() {
        return autoOpenSdkid;
    }

    /**
     * @param autoOpenSdkid 自动打开应用的id
     */
    public void setAutoOpenSdkid(String autoOpenSdkid) {
        this.autoOpenSdkid = autoOpenSdkid;
    }
    /**
     * @param instanceid 用户的终端设备类型： 1 - PC 2 - Mac 3 - Android 4 - iOS 5 - Web 6 - iPad 7 - Android Pad 8 - 小程序  (required)
     */
    public V1AppToolkitPostRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 1 - PC 2 - Mac 3 - Android 4 - iOS 5 - Web 6 - iPad 7 - Android Pad 8 - 小程序 
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 1 - PC 2 - Mac 3 - Android 4 - iOS 5 - Web 6 - iPad 7 - Android Pad 8 - 小程序  (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param meetingId 会议id (required)
     */
    public V1AppToolkitPostRequest meetingId(@NotNull String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议id
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议id (required)
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param toolList 工具箱应用列表 (required)
     */
    public V1AppToolkitPostRequest toolList(@NotNull List<V1AppToolkitPostRequestToolListInner> toolList) {
        this.toolList = toolList;
        return this;
    }
    /**
     * @return toolList 工具箱应用列表
     **/
    public List<V1AppToolkitPostRequestToolListInner> getToolList() {
        return toolList;
    }

    /**
     * @param toolList 工具箱应用列表 (required)
     */
    public void setToolList(List<V1AppToolkitPostRequestToolListInner> toolList) {
        this.toolList = toolList;
    }
    /**
     * @param toolbarSdkid 外显在会中工具栏的应用id（需要保证在tool_list列表中，且列表中的可见范围对此设置也生效）
     */
    public V1AppToolkitPostRequest toolbarSdkid(String toolbarSdkid) {
        this.toolbarSdkid = toolbarSdkid;
        return this;
    }
    /**
     * @return toolbarSdkid 外显在会中工具栏的应用id（需要保证在tool_list列表中，且列表中的可见范围对此设置也生效）
     **/
    public String getToolbarSdkid() {
        return toolbarSdkid;
    }

    /**
     * @param toolbarSdkid 外显在会中工具栏的应用id（需要保证在tool_list列表中，且列表中的可见范围对此设置也生效）
     */
    public void setToolbarSdkid(String toolbarSdkid) {
        this.toolbarSdkid = toolbarSdkid;
    }
    /**
     * @param userid 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0鉴权用户请使用openId） 企业唯一用户标识说明： 1、 企业对接SSO时使用的员工唯一标识ID 2、 企业调用创建用户接口时传递的userid参数 (required)
     */
    public V1AppToolkitPostRequest userid(@NotNull String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0鉴权用户请使用openId） 企业唯一用户标识说明： 1、 企业对接SSO时使用的员工唯一标识ID 2、 企业调用创建用户接口时传递的userid参数
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0鉴权用户请使用openId） 企业唯一用户标识说明： 1、 企业对接SSO时使用的员工唯一标识ID 2、 企业调用创建用户接口时传递的userid参数 (required)
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
        V1AppToolkitPostRequest v1AppToolkitPostRequest = (V1AppToolkitPostRequest) o;
        return Objects.equals(this.autoOpenSdkid, v1AppToolkitPostRequest.autoOpenSdkid) &&
            Objects.equals(this.instanceid, v1AppToolkitPostRequest.instanceid) &&
            Objects.equals(this.meetingId, v1AppToolkitPostRequest.meetingId) &&
            Objects.equals(this.toolList, v1AppToolkitPostRequest.toolList) &&
            Objects.equals(this.toolbarSdkid, v1AppToolkitPostRequest.toolbarSdkid) &&
            Objects.equals(this.userid, v1AppToolkitPostRequest.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoOpenSdkid, instanceid, meetingId, toolList, toolbarSdkid, userid);
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
        sb.append("class V1AppToolkitPostRequest {\n");
        sb.append("    autoOpenSdkid: ").append(toIndentedString(autoOpenSdkid)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    toolList: ").append(toIndentedString(toolList)).append("\n");
        sb.append("    toolbarSdkid: ").append(toIndentedString(toolbarSdkid)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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

package com.tencentcloudapi.wemeet.service.layout.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdApplyingLayoutPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdApplyingLayoutPutRequest {
    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "layout_id")
    private String layoutId;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "user_list")
    private List<V1MeetingsMeetingIdApplyingLayoutPutRequestUserListInner> userList;

    /**
     * @param instanceid 设备类型 ID 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     * @param operatorId 操作人ID (required)
     * @param operatorIdType 操作人id类型，1 :userid，4 :ms_open_id (required)
     */
    public V1MeetingsMeetingIdApplyingLayoutPutRequest(@NotNull Long instanceid, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.instanceid = instanceid;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param instanceid 设备类型 ID 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     */
    public V1MeetingsMeetingIdApplyingLayoutPutRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 设备类型 ID 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 设备类型 ID 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param layoutId 选择应用的布局 ID （若送空\&quot;\&quot;，表示恢复成当前会议的默认布局）  备注：应用布局的优先级从高到低为： ● 个性布局 ● 自定义布局 ● 默认布局（MRA不支持同框模式， 如果会议设置为同框模式， MRA应用默认布局））
     */
    public V1MeetingsMeetingIdApplyingLayoutPutRequest layoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    /**
     * @return layoutId 选择应用的布局 ID （若送空\&quot;\&quot;，表示恢复成当前会议的默认布局）  备注：应用布局的优先级从高到低为： ● 个性布局 ● 自定义布局 ● 默认布局（MRA不支持同框模式， 如果会议设置为同框模式， MRA应用默认布局））
     **/
    public String getLayoutId() {
        return layoutId;
    }

    /**
     * @param layoutId 选择应用的布局 ID （若送空\&quot;\&quot;，表示恢复成当前会议的默认布局）  备注：应用布局的优先级从高到低为： ● 个性布局 ● 自定义布局 ● 默认布局（MRA不支持同框模式， 如果会议设置为同框模式， MRA应用默认布局））
     */
    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }
    /**
     * @param operatorId 操作人ID (required)
     */
    public V1MeetingsMeetingIdApplyingLayoutPutRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作人ID
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作人ID (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作人id类型，1 :userid，4 :ms_open_id (required)
     */
    public V1MeetingsMeetingIdApplyingLayoutPutRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作人id类型，1 :userid，4 :ms_open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作人id类型，1 :userid，4 :ms_open_id (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param userList 用户列表对象数组。如果该字段为空， 为会议设置高级自定义布局；如果该字段携带用户， 则只为指定用户设置个性布局。 单次最多支持20个用户。
     */
    public V1MeetingsMeetingIdApplyingLayoutPutRequest userList(List<V1MeetingsMeetingIdApplyingLayoutPutRequestUserListInner> userList) {
        this.userList = userList;
        return this;
    }
    /**
     * @return userList 用户列表对象数组。如果该字段为空， 为会议设置高级自定义布局；如果该字段携带用户， 则只为指定用户设置个性布局。 单次最多支持20个用户。
     **/
    public List<V1MeetingsMeetingIdApplyingLayoutPutRequestUserListInner> getUserList() {
        return userList;
    }

    /**
     * @param userList 用户列表对象数组。如果该字段为空， 为会议设置高级自定义布局；如果该字段携带用户， 则只为指定用户设置个性布局。 单次最多支持20个用户。
     */
    public void setUserList(List<V1MeetingsMeetingIdApplyingLayoutPutRequestUserListInner> userList) {
        this.userList = userList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdApplyingLayoutPutRequest v1MeetingsMeetingIdApplyingLayoutPutRequest = (V1MeetingsMeetingIdApplyingLayoutPutRequest) o;
        return Objects.equals(this.instanceid, v1MeetingsMeetingIdApplyingLayoutPutRequest.instanceid) &&
            Objects.equals(this.layoutId, v1MeetingsMeetingIdApplyingLayoutPutRequest.layoutId) &&
            Objects.equals(this.operatorId, v1MeetingsMeetingIdApplyingLayoutPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingsMeetingIdApplyingLayoutPutRequest.operatorIdType) &&
            Objects.equals(this.userList, v1MeetingsMeetingIdApplyingLayoutPutRequest.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceid, layoutId, operatorId, operatorIdType, userList);
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
        sb.append("class V1MeetingsMeetingIdApplyingLayoutPutRequest {\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


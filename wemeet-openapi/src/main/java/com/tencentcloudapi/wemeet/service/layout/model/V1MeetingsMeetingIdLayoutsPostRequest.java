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

package com.tencentcloudapi.wemeet.service.layout.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdLayoutsPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdLayoutsPostRequest {
    @JsonProperty(value = "default_layout_order")
    private Long defaultLayoutOrder;

    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "layout_list", required = true)
    private List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner> layoutList;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param instanceid 用户的终端设备类型：1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     * @param layoutList 布局对象列表 (required)
     * @param operatorId 操作者ID  (required)
     * @param operatorIdType 操作者id的类型，1:userid (required)
     */
    public V1MeetingsMeetingIdLayoutsPostRequest(@NotNull Long instanceid, @NotNull List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner> layoutList, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.instanceid = instanceid;
        this.layoutList = layoutList;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param defaultLayoutOrder 布局列表中会议需要应用的布局序号，从1开始计数（首次添加时若该参数不送，则默认选中第一个布局作为会议应用的布局）
     */
    public V1MeetingsMeetingIdLayoutsPostRequest defaultLayoutOrder(Long defaultLayoutOrder) {
        this.defaultLayoutOrder = defaultLayoutOrder;
        return this;
    }
    /**
     * @return defaultLayoutOrder 布局列表中会议需要应用的布局序号，从1开始计数（首次添加时若该参数不送，则默认选中第一个布局作为会议应用的布局）
     **/
    public Long getDefaultLayoutOrder() {
        return defaultLayoutOrder;
    }

    /**
     * @param defaultLayoutOrder 布局列表中会议需要应用的布局序号，从1开始计数（首次添加时若该参数不送，则默认选中第一个布局作为会议应用的布局）
     */
    public void setDefaultLayoutOrder(Long defaultLayoutOrder) {
        this.defaultLayoutOrder = defaultLayoutOrder;
    }
    /**
     * @param instanceid 用户的终端设备类型：1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public V1MeetingsMeetingIdLayoutsPostRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型：1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型：1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param layoutList 布局对象列表 (required)
     */
    public V1MeetingsMeetingIdLayoutsPostRequest layoutList(@NotNull List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner> layoutList) {
        this.layoutList = layoutList;
        return this;
    }
    /**
     * @return layoutList 布局对象列表
     **/
    public List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner> getLayoutList() {
        return layoutList;
    }

    /**
     * @param layoutList 布局对象列表 (required)
     */
    public void setLayoutList(List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner> layoutList) {
        this.layoutList = layoutList;
    }
    /**
     * @param operatorId 操作者ID  (required)
     */
    public V1MeetingsMeetingIdLayoutsPostRequest operatorId(@NotNull String operatorId) {
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
     * @param operatorId 操作者ID  (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者id的类型，1:userid (required)
     */
    public V1MeetingsMeetingIdLayoutsPostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者id的类型，1:userid
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者id的类型，1:userid (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdLayoutsPostRequest v1MeetingsMeetingIdLayoutsPostRequest = (V1MeetingsMeetingIdLayoutsPostRequest) o;
        return Objects.equals(this.defaultLayoutOrder, v1MeetingsMeetingIdLayoutsPostRequest.defaultLayoutOrder) &&
            Objects.equals(this.instanceid, v1MeetingsMeetingIdLayoutsPostRequest.instanceid) &&
            Objects.equals(this.layoutList, v1MeetingsMeetingIdLayoutsPostRequest.layoutList) &&
            Objects.equals(this.operatorId, v1MeetingsMeetingIdLayoutsPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingsMeetingIdLayoutsPostRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultLayoutOrder, instanceid, layoutList, operatorId, operatorIdType);
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
        sb.append("class V1MeetingsMeetingIdLayoutsPostRequest {\n");
        sb.append("    defaultLayoutOrder: ").append(toIndentedString(defaultLayoutOrder)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    layoutList: ").append(toIndentedString(layoutList)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


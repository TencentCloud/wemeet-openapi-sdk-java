/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meeting_control.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RealControlMeetingsMeetingIdAsrPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RealControlMeetingsMeetingIdAsrPutRequest {
    @JsonProperty(value = "instance_id", required = true)
    private Long instanceId;

    @JsonProperty(value = "is_open", required = true)
    private Boolean isOpen;

    @JsonProperty(value = "open_asr_view")
    private Long openAsrView;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type")
    private Long operatorIdType;

    /**
     * @param instanceId 用户的终端设备类型：  0：PSTN  1：PC  2：Mac  3：Android  4：iOS  5：Web  6：iPad  7：Android Pad  8：小程序  9：voip、sip 设备  10：Linux  20：Rooms for Touch Windows  21：Rooms for Touch MacOS  22：Rooms for Touch Android  30：Controller for Touch Windows  32：Controller for Touch Android  33：Controller for Touch iOS (required)
     * @param isOpen 开启/关闭实时转写 true：开启实时转写 false：关闭实时转写 (required)
     */
    public V1RealControlMeetingsMeetingIdAsrPutRequest(@NotNull Long instanceId, @NotNull Boolean isOpen) {
        this.instanceId = instanceId;
        this.isOpen = isOpen;
    }

    /**
     * @param instanceId 用户的终端设备类型：  0：PSTN  1：PC  2：Mac  3：Android  4：iOS  5：Web  6：iPad  7：Android Pad  8：小程序  9：voip、sip 设备  10：Linux  20：Rooms for Touch Windows  21：Rooms for Touch MacOS  22：Rooms for Touch Android  30：Controller for Touch Windows  32：Controller for Touch Android  33：Controller for Touch iOS (required)
     */
    public V1RealControlMeetingsMeetingIdAsrPutRequest instanceId(@NotNull Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    /**
     * @return instanceId 用户的终端设备类型：  0：PSTN  1：PC  2：Mac  3：Android  4：iOS  5：Web  6：iPad  7：Android Pad  8：小程序  9：voip、sip 设备  10：Linux  20：Rooms for Touch Windows  21：Rooms for Touch MacOS  22：Rooms for Touch Android  30：Controller for Touch Windows  32：Controller for Touch Android  33：Controller for Touch iOS
     **/
    public Long getInstanceId() {
        return instanceId;
    }

    /**
     * @param instanceId 用户的终端设备类型：  0：PSTN  1：PC  2：Mac  3：Android  4：iOS  5：Web  6：iPad  7：Android Pad  8：小程序  9：voip、sip 设备  10：Linux  20：Rooms for Touch Windows  21：Rooms for Touch MacOS  22：Rooms for Touch Android  30：Controller for Touch Windows  32：Controller for Touch Android  33：Controller for Touch iOS (required)
     */
    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * @param isOpen 开启/关闭实时转写 true：开启实时转写 false：关闭实时转写 (required)
     */
    public V1RealControlMeetingsMeetingIdAsrPutRequest isOpen(@NotNull Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    /**
     * @return isOpen 开启/关闭实时转写 true：开启实时转写 false：关闭实时转写
     **/
    public Boolean getIsOpen() {
        return isOpen;
    }

    /**
     * @param isOpen 开启/关闭实时转写 true：开启实时转写 false：关闭实时转写 (required)
     */
    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }
    /**
     * @param openAsrView 是否自动打开转写侧边栏，仅在is_open 为 true 时生效，默认为 0， 0：打开实时转写页面 。1：不打开实时转写页面
     */
    public V1RealControlMeetingsMeetingIdAsrPutRequest openAsrView(Long openAsrView) {
        this.openAsrView = openAsrView;
        return this;
    }
    /**
     * @return openAsrView 是否自动打开转写侧边栏，仅在is_open 为 true 时生效，默认为 0， 0：打开实时转写页面 。1：不打开实时转写页面
     **/
    public Long getOpenAsrView() {
        return openAsrView;
    }

    /**
     * @param openAsrView 是否自动打开转写侧边栏，仅在is_open 为 true 时生效，默认为 0， 0：打开实时转写页面 。1：不打开实时转写页面
     */
    public void setOpenAsrView(Long openAsrView) {
        this.openAsrView = openAsrView;
    }
    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     */
    public V1RealControlMeetingsMeetingIdAsrPutRequest operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid
     */
    public V1RealControlMeetingsMeetingIdAsrPutRequest operatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型： 1：userid
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid
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
        V1RealControlMeetingsMeetingIdAsrPutRequest v1RealControlMeetingsMeetingIdAsrPutRequest = (V1RealControlMeetingsMeetingIdAsrPutRequest) o;
        return Objects.equals(this.instanceId, v1RealControlMeetingsMeetingIdAsrPutRequest.instanceId) &&
            Objects.equals(this.isOpen, v1RealControlMeetingsMeetingIdAsrPutRequest.isOpen) &&
            Objects.equals(this.openAsrView, v1RealControlMeetingsMeetingIdAsrPutRequest.openAsrView) &&
            Objects.equals(this.operatorId, v1RealControlMeetingsMeetingIdAsrPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1RealControlMeetingsMeetingIdAsrPutRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, isOpen, openAsrView, operatorId, operatorIdType);
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
        sb.append("class V1RealControlMeetingsMeetingIdAsrPutRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
        sb.append("    openAsrView: ").append(toIndentedString(openAsrView)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


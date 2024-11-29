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
 * V1RealControlMeetingsMeetingIdDocPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RealControlMeetingsMeetingIdDocPutRequest {
    @JsonProperty(value = "enable_upload_doc", required = true)
    private Boolean enableUploadDoc;

    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type")
    private Long operatorIdType;

    @JsonProperty(value = "uuid")
    private String uuid;

    /**
     * @param enableUploadDoc 是否允许全员上传文档  true：是 false：否 (required)
     * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public V1RealControlMeetingsMeetingIdDocPutRequest(@NotNull Boolean enableUploadDoc, @NotNull Long instanceid) {
        this.enableUploadDoc = enableUploadDoc;
        this.instanceid = instanceid;
    }

    /**
     * @param enableUploadDoc 是否允许全员上传文档  true：是 false：否 (required)
     */
    public V1RealControlMeetingsMeetingIdDocPutRequest enableUploadDoc(@NotNull Boolean enableUploadDoc) {
        this.enableUploadDoc = enableUploadDoc;
        return this;
    }
    /**
     * @return enableUploadDoc 是否允许全员上传文档  true：是 false：否
     **/
    public Boolean getEnableUploadDoc() {
        return enableUploadDoc;
    }

    /**
     * @param enableUploadDoc 是否允许全员上传文档  true：是 false：否 (required)
     */
    public void setEnableUploadDoc(Boolean enableUploadDoc) {
        this.enableUploadDoc = enableUploadDoc;
    }
    /**
     * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public V1RealControlMeetingsMeetingIdDocPutRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param operatorId 操作者 ID。 1：operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 2：接口输入参数如果需要传用户 ID 时，operator_id 和 uuid 不可以同时为空，两个参数如果都传了以 operator_id 为准。 3：如果 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。
     */
    public V1RealControlMeetingsMeetingIdDocPutRequest operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。 1：operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 2：接口输入参数如果需要传用户 ID 时，operator_id 和 uuid 不可以同时为空，两个参数如果都传了以 operator_id 为准。 3：如果 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。 1：operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 2：接口输入参数如果需要传用户 ID 时，operator_id 和 uuid 不可以同时为空，两个参数如果都传了以 operator_id 为准。 3：如果 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID的类型：  2:openid  4: ms_open_id
     */
    public V1RealControlMeetingsMeetingIdDocPutRequest operatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID的类型：  2:openid  4: ms_open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID的类型：  2:openid  4: ms_open_id
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param uuid 操作者用户唯一身份 ID，仅支持主持人和联席主持人，且只适用于单场会议。即将废弃，推荐使用ms_open_id。
     */
    public V1RealControlMeetingsMeetingIdDocPutRequest uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    /**
     * @return uuid 操作者用户唯一身份 ID，仅支持主持人和联席主持人，且只适用于单场会议。即将废弃，推荐使用ms_open_id。
     **/
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid 操作者用户唯一身份 ID，仅支持主持人和联席主持人，且只适用于单场会议。即将废弃，推荐使用ms_open_id。
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
        V1RealControlMeetingsMeetingIdDocPutRequest v1RealControlMeetingsMeetingIdDocPutRequest = (V1RealControlMeetingsMeetingIdDocPutRequest) o;
        return Objects.equals(this.enableUploadDoc, v1RealControlMeetingsMeetingIdDocPutRequest.enableUploadDoc) &&
            Objects.equals(this.instanceid, v1RealControlMeetingsMeetingIdDocPutRequest.instanceid) &&
            Objects.equals(this.operatorId, v1RealControlMeetingsMeetingIdDocPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1RealControlMeetingsMeetingIdDocPutRequest.operatorIdType) &&
            Objects.equals(this.uuid, v1RealControlMeetingsMeetingIdDocPutRequest.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableUploadDoc, instanceid, operatorId, operatorIdType, uuid);
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
        sb.append("class V1RealControlMeetingsMeetingIdDocPutRequest {\n");
        sb.append("    enableUploadDoc: ").append(toIndentedString(enableUploadDoc)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


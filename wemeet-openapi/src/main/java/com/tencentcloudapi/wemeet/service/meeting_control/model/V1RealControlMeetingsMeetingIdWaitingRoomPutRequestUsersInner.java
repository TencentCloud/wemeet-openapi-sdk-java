/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.10
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
 * V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner {
    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "to_operator_id")
    private String toOperatorId;

    @JsonProperty(value = "to_operator_id_type")
    private Long toOperatorIdType;

    @JsonProperty(value = "uuid")
    private String uuid;

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS 说明：请与被操作者的设备类型保持一致，否则不生效。 (required)
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner(@NotNull Long instanceid) {
        this.instanceid = instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS 说明：请与被操作者的设备类型保持一致，否则不生效。 (required)
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS 说明：请与被操作者的设备类型保持一致，否则不生效。
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS 说明：请与被操作者的设备类型保持一致，否则不生效。 (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param toOperatorId 用户ID，根据to_operator_id_type的值，使用不同的类型
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner toOperatorId(String toOperatorId) {
        this.toOperatorId = toOperatorId;
        return this;
    }
    /**
     * @return toOperatorId 用户ID，根据to_operator_id_type的值，使用不同的类型
     **/
    public String getToOperatorId() {
        return toOperatorId;
    }

    /**
     * @param toOperatorId 用户ID，根据to_operator_id_type的值，使用不同的类型
     */
    public void setToOperatorId(String toOperatorId) {
        this.toOperatorId = toOperatorId;
    }
    /**
     * @param toOperatorIdType 用户ID的类型：  4: ms_open_id
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner toOperatorIdType(Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
        return this;
    }
    /**
     * @return toOperatorIdType 用户ID的类型：  4: ms_open_id
     **/
    public Long getToOperatorIdType() {
        return toOperatorIdType;
    }

    /**
     * @param toOperatorIdType 用户ID的类型：  4: ms_open_id
     */
    public void setToOperatorIdType(Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
    }
    /**
     * @param uuid 用户的唯一标识uuid
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    /**
     * @return uuid 用户的唯一标识uuid
     **/
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid 用户的唯一标识uuid
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
        V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner v1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner = (V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner) o;
        return Objects.equals(this.instanceid, v1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner.instanceid) &&
            Objects.equals(this.toOperatorId, v1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner.toOperatorId) &&
            Objects.equals(this.toOperatorIdType, v1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner.toOperatorIdType) &&
            Objects.equals(this.uuid, v1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceid, toOperatorId, toOperatorIdType, uuid);
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
        sb.append("class V1RealControlMeetingsMeetingIdWaitingRoomPutRequestUsersInner {\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    toOperatorId: ").append(toIndentedString(toOperatorId)).append("\n");
        sb.append("    toOperatorIdType: ").append(toIndentedString(toOperatorIdType)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


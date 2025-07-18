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

package com.tencentcloudapi.wemeet.service.meeting_control.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RealControlMeetingsMeetingIdWaitingRoomPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RealControlMeetingsMeetingIdWaitingRoomPutRequest {
    @JsonProperty(value = "allow_rejoin")
    private Boolean allowRejoin;

    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "operate_type", required = true)
    private Long operateType;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type")
    private Long operatorIdType;

    @JsonProperty(value = "users", required = true)
    private List<V1RealControlMeetingsMeetingIdMutesPutRequestUser> users;

    /**
     * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     * @param operateType 操作类型： 1：主持人将等候室成员移入会议  2：主持人将会中成员移入等候室  3：主持人将等候室成员移出等候室 (required)
     * @param users 被操作用户对象信息列表 (required)
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequest(@NotNull Long instanceid, @NotNull Long operateType, @NotNull List<V1RealControlMeetingsMeetingIdMutesPutRequestUser> users) {
        this.instanceid = instanceid;
        this.operateType = operateType;
        this.users = users;
    }

    /**
     * @param allowRejoin 移出后是否允许再次加入会议  true：允许 false：不允许  说明：操作类型参数 operete_type &#x3D; 3 时才允许设置
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequest allowRejoin(Boolean allowRejoin) {
        this.allowRejoin = allowRejoin;
        return this;
    }
    /**
     * @return allowRejoin 移出后是否允许再次加入会议  true：允许 false：不允许  说明：操作类型参数 operete_type &#x3D; 3 时才允许设置
     **/
    public Boolean getAllowRejoin() {
        return allowRejoin;
    }

    /**
     * @param allowRejoin 移出后是否允许再次加入会议  true：允许 false：不允许  说明：操作类型参数 operete_type &#x3D; 3 时才允许设置
     */
    public void setAllowRejoin(Boolean allowRejoin) {
        this.allowRejoin = allowRejoin;
    }
    /**
     * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch Mac 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch Iphone (required)
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequest instanceid(@NotNull Long instanceid) {
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
     * @param operateType 操作类型： 1：主持人将等候室成员移入会议  2：主持人将会中成员移入等候室  3：主持人将等候室成员移出等候室 (required)
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequest operateType(@NotNull Long operateType) {
        this.operateType = operateType;
        return this;
    }
    /**
     * @return operateType 操作类型： 1：主持人将等候室成员移入会议  2：主持人将会中成员移入等候室  3：主持人将等候室成员移出等候室
     **/
    public Long getOperateType() {
        return operateType;
    }

    /**
     * @param operateType 操作类型： 1：主持人将等候室成员移入会议  2：主持人将会中成员移入等候室  3：主持人将等候室成员移出等候室 (required)
     */
    public void setOperateType(Long operateType) {
        this.operateType = operateType;
    }
    /**
     * @param operatorId 操作者 ID。 1：operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 2：接口输入参数如果需要传用户 ID 时，operator_id 和 uuid 不可以同时为空，两个参数如果都传了以 operator_id 为准。 3：如果 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequest operatorId(String operatorId) {
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
     * @param operatorIdType 操作者ID的类型： 2:openid 4: ms_open_id
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequest operatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID的类型： 2:openid 4: ms_open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID的类型： 2:openid 4: ms_open_id
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param users 被操作用户对象信息列表 (required)
     */
    public V1RealControlMeetingsMeetingIdWaitingRoomPutRequest users(@NotNull List<V1RealControlMeetingsMeetingIdMutesPutRequestUser> users) {
        this.users = users;
        return this;
    }
    /**
     * @return users 被操作用户对象信息列表
     **/
    public List<V1RealControlMeetingsMeetingIdMutesPutRequestUser> getUsers() {
        return users;
    }

    /**
     * @param users 被操作用户对象信息列表 (required)
     */
    public void setUsers(List<V1RealControlMeetingsMeetingIdMutesPutRequestUser> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RealControlMeetingsMeetingIdWaitingRoomPutRequest v1RealControlMeetingsMeetingIdWaitingRoomPutRequest = (V1RealControlMeetingsMeetingIdWaitingRoomPutRequest) o;
        return Objects.equals(this.allowRejoin, v1RealControlMeetingsMeetingIdWaitingRoomPutRequest.allowRejoin) &&
            Objects.equals(this.instanceid, v1RealControlMeetingsMeetingIdWaitingRoomPutRequest.instanceid) &&
            Objects.equals(this.operateType, v1RealControlMeetingsMeetingIdWaitingRoomPutRequest.operateType) &&
            Objects.equals(this.operatorId, v1RealControlMeetingsMeetingIdWaitingRoomPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1RealControlMeetingsMeetingIdWaitingRoomPutRequest.operatorIdType) &&
            Objects.equals(this.users, v1RealControlMeetingsMeetingIdWaitingRoomPutRequest.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowRejoin, instanceid, operateType, operatorId, operatorIdType, users);
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
        sb.append("class V1RealControlMeetingsMeetingIdWaitingRoomPutRequest {\n");
        sb.append("    allowRejoin: ").append(toIndentedString(allowRejoin)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


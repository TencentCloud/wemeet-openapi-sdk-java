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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1UsersDeleteTransferPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersDeleteTransferPostRequest {
    @JsonProperty(value = "data_process")
    private String dataProcess;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "receiver_id")
    private String receiverId;

    @JsonProperty(value = "receiver_id_type")
    private Long receiverIdType;

    @JsonProperty(value = "to_operator_id", required = true)
    private String toOperatorId;

    @JsonProperty(value = "to_operator_id_type", required = true)
    private Long toOperatorIdType;

    @JsonProperty(value = "transfer_data")
    private String transferData;

    /**
     * @param operatorId 操作者 ID。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。 (required)
     * @param operatorIdType 操作者 ID 的类型： 1：userid 2：open_id (required)
     * @param toOperatorId 被操作者 ID，根据 to_operator_id_type 的值，使用不同的类型，这里指被删除的用户。 (required)
     * @param toOperatorIdType 被操作者 ID 的类型： 1：userid 2：open_id (required)
     */
    public V1UsersDeleteTransferPostRequest(@NotNull String operatorId, @NotNull Long operatorIdType, @NotNull String toOperatorId, @NotNull Long toOperatorIdType) {
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
        this.toOperatorId = toOperatorId;
        this.toOperatorIdType = toOperatorIdType;
    }

    /**
     * @param dataProcess 删除用户的数据处理方式： 1&#x3D;彻底删除； 2&#x3D;转移给指定成员；
     */
    public V1UsersDeleteTransferPostRequest dataProcess(String dataProcess) {
        this.dataProcess = dataProcess;
        return this;
    }
    /**
     * @return dataProcess 删除用户的数据处理方式： 1&#x3D;彻底删除； 2&#x3D;转移给指定成员；
     **/
    public String getDataProcess() {
        return dataProcess;
    }

    /**
     * @param dataProcess 删除用户的数据处理方式： 1&#x3D;彻底删除； 2&#x3D;转移给指定成员；
     */
    public void setDataProcess(String dataProcess) {
        this.dataProcess = dataProcess;
    }
    /**
     * @param operatorId 操作者 ID。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。 (required)
     */
    public V1UsersDeleteTransferPostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid 2：open_id (required)
     */
    public V1UsersDeleteTransferPostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型： 1：userid 2：open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid 2：open_id (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param receiverId 数据接收者的ID，根据receiver_id_type的值，使用不同的类型。； data_process为2时生效； 该userid不存在时，将报错；
     */
    public V1UsersDeleteTransferPostRequest receiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    /**
     * @return receiverId 数据接收者的ID，根据receiver_id_type的值，使用不同的类型。； data_process为2时生效； 该userid不存在时，将报错；
     **/
    public String getReceiverId() {
        return receiverId;
    }

    /**
     * @param receiverId 数据接收者的ID，根据receiver_id_type的值，使用不同的类型。； data_process为2时生效； 该userid不存在时，将报错；
     */
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
    /**
     * @param receiverIdType 数据接收者 ID 的类型：  1：userid  2：open_id
     */
    public V1UsersDeleteTransferPostRequest receiverIdType(Long receiverIdType) {
        this.receiverIdType = receiverIdType;
        return this;
    }
    /**
     * @return receiverIdType 数据接收者 ID 的类型：  1：userid  2：open_id
     **/
    public Long getReceiverIdType() {
        return receiverIdType;
    }

    /**
     * @param receiverIdType 数据接收者 ID 的类型：  1：userid  2：open_id
     */
    public void setReceiverIdType(Long receiverIdType) {
        this.receiverIdType = receiverIdType;
    }
    /**
     * @param toOperatorId 被操作者 ID，根据 to_operator_id_type 的值，使用不同的类型，这里指被删除的用户。 (required)
     */
    public V1UsersDeleteTransferPostRequest toOperatorId(@NotNull String toOperatorId) {
        this.toOperatorId = toOperatorId;
        return this;
    }
    /**
     * @return toOperatorId 被操作者 ID，根据 to_operator_id_type 的值，使用不同的类型，这里指被删除的用户。
     **/
    public String getToOperatorId() {
        return toOperatorId;
    }

    /**
     * @param toOperatorId 被操作者 ID，根据 to_operator_id_type 的值，使用不同的类型，这里指被删除的用户。 (required)
     */
    public void setToOperatorId(String toOperatorId) {
        this.toOperatorId = toOperatorId;
    }
    /**
     * @param toOperatorIdType 被操作者 ID 的类型： 1：userid 2：open_id (required)
     */
    public V1UsersDeleteTransferPostRequest toOperatorIdType(@NotNull Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
        return this;
    }
    /**
     * @return toOperatorIdType 被操作者 ID 的类型： 1：userid 2：open_id
     **/
    public Long getToOperatorIdType() {
        return toOperatorIdType;
    }

    /**
     * @param toOperatorIdType 被操作者 ID 的类型： 1：userid 2：open_id (required)
     */
    public void setToOperatorIdType(Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
    }
    /**
     * @param transferData 转移的具体数据； 0&#x3D;全部； 1&#x3D;云录制； 2&#x3D;会议列表； data_process为2时生效； 不传时默认为0；
     */
    public V1UsersDeleteTransferPostRequest transferData(String transferData) {
        this.transferData = transferData;
        return this;
    }
    /**
     * @return transferData 转移的具体数据； 0&#x3D;全部； 1&#x3D;云录制； 2&#x3D;会议列表； data_process为2时生效； 不传时默认为0；
     **/
    public String getTransferData() {
        return transferData;
    }

    /**
     * @param transferData 转移的具体数据； 0&#x3D;全部； 1&#x3D;云录制； 2&#x3D;会议列表； data_process为2时生效； 不传时默认为0；
     */
    public void setTransferData(String transferData) {
        this.transferData = transferData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1UsersDeleteTransferPostRequest v1UsersDeleteTransferPostRequest = (V1UsersDeleteTransferPostRequest) o;
        return Objects.equals(this.dataProcess, v1UsersDeleteTransferPostRequest.dataProcess) &&
            Objects.equals(this.operatorId, v1UsersDeleteTransferPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1UsersDeleteTransferPostRequest.operatorIdType) &&
            Objects.equals(this.receiverId, v1UsersDeleteTransferPostRequest.receiverId) &&
            Objects.equals(this.receiverIdType, v1UsersDeleteTransferPostRequest.receiverIdType) &&
            Objects.equals(this.toOperatorId, v1UsersDeleteTransferPostRequest.toOperatorId) &&
            Objects.equals(this.toOperatorIdType, v1UsersDeleteTransferPostRequest.toOperatorIdType) &&
            Objects.equals(this.transferData, v1UsersDeleteTransferPostRequest.transferData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataProcess, operatorId, operatorIdType, receiverId, receiverIdType, toOperatorId, toOperatorIdType, transferData);
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
        sb.append("class V1UsersDeleteTransferPostRequest {\n");
        sb.append("    dataProcess: ").append(toIndentedString(dataProcess)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
        sb.append("    receiverIdType: ").append(toIndentedString(receiverIdType)).append("\n");
        sb.append("    toOperatorId: ").append(toIndentedString(toOperatorId)).append("\n");
        sb.append("    toOperatorIdType: ").append(toIndentedString(toOperatorIdType)).append("\n");
        sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


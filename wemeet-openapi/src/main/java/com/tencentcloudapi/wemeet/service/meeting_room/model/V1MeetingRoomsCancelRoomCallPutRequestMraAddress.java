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

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * MRA 对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsCancelRoomCallPutRequestMraAddress {
    @JsonProperty(value = "dial_string", required = true)
    private String dialString;

    @JsonProperty(value = "protocol", required = true)
    private Long protocol;

    /**
     * @param dialString 信令地址。 如果是 H.323 类型，输入 IP 地址或 E.164 号码。 如果是 SIP 类型，输入 IP 地址或 URI。 (required)
     * @param protocol 信令协议。 1：SIP 2：H.323 (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequestMraAddress(@NotNull String dialString, @NotNull Long protocol) {
        this.dialString = dialString;
        this.protocol = protocol;
    }

    /**
     * @param dialString 信令地址。 如果是 H.323 类型，输入 IP 地址或 E.164 号码。 如果是 SIP 类型，输入 IP 地址或 URI。 (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequestMraAddress dialString(@NotNull String dialString) {
        this.dialString = dialString;
        return this;
    }
    /**
     * @return dialString 信令地址。 如果是 H.323 类型，输入 IP 地址或 E.164 号码。 如果是 SIP 类型，输入 IP 地址或 URI。
     **/
    public String getDialString() {
        return dialString;
    }

    /**
     * @param dialString 信令地址。 如果是 H.323 类型，输入 IP 地址或 E.164 号码。 如果是 SIP 类型，输入 IP 地址或 URI。 (required)
     */
    public void setDialString(String dialString) {
        this.dialString = dialString;
    }
    /**
     * @param protocol 信令协议。 1：SIP 2：H.323 (required)
     */
    public V1MeetingRoomsCancelRoomCallPutRequestMraAddress protocol(@NotNull Long protocol) {
        this.protocol = protocol;
        return this;
    }
    /**
     * @return protocol 信令协议。 1：SIP 2：H.323
     **/
    public Long getProtocol() {
        return protocol;
    }

    /**
     * @param protocol 信令协议。 1：SIP 2：H.323 (required)
     */
    public void setProtocol(Long protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsCancelRoomCallPutRequestMraAddress v1MeetingRoomsCancelRoomCallPutRequestMraAddress = (V1MeetingRoomsCancelRoomCallPutRequestMraAddress) o;
        return Objects.equals(this.dialString, v1MeetingRoomsCancelRoomCallPutRequestMraAddress.dialString) &&
            Objects.equals(this.protocol, v1MeetingRoomsCancelRoomCallPutRequestMraAddress.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialString, protocol);
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
        sb.append("class V1MeetingRoomsCancelRoomCallPutRequestMraAddress {\n");
        sb.append("    dialString: ").append(toIndentedString(dialString)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


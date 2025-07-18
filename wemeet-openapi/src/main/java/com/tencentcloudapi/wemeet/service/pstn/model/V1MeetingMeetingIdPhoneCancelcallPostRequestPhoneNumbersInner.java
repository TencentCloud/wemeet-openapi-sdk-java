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

package com.tencentcloudapi.wemeet.service.pstn.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner {
    @JsonProperty(value = "area", required = true)
    private Long area;

    @JsonProperty(value = "extension_number")
    private String extensionNumber;

    @JsonProperty(value = "phone", required = true)
    private String phone;

    /**
     * @param area 国家/地区代码。（例如：中国是86） (required)
     * @param phone 电话号码或固定电话总机号。 (required)
     */
    public V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner(@NotNull Long area, @NotNull String phone) {
        this.area = area;
        this.phone = phone;
    }

    /**
     * @param area 国家/地区代码。（例如：中国是86） (required)
     */
    public V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner area(@NotNull Long area) {
        this.area = area;
        return this;
    }
    /**
     * @return area 国家/地区代码。（例如：中国是86）
     **/
    public Long getArea() {
        return area;
    }

    /**
     * @param area 国家/地区代码。（例如：中国是86） (required)
     */
    public void setArea(Long area) {
        this.area = area;
    }
    /**
     * @param extensionNumber 固定电话分机号。
     */
    public V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    /**
     * @return extensionNumber 固定电话分机号。
     **/
    public String getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * @param extensionNumber 固定电话分机号。
     */
    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }
    /**
     * @param phone 电话号码或固定电话总机号。 (required)
     */
    public V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner phone(@NotNull String phone) {
        this.phone = phone;
        return this;
    }
    /**
     * @return phone 电话号码或固定电话总机号。
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 电话号码或固定电话总机号。 (required)
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner v1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner = (V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner) o;
        return Objects.equals(this.area, v1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner.area) &&
            Objects.equals(this.extensionNumber, v1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner.extensionNumber) &&
            Objects.equals(this.phone, v1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, extensionNumber, phone);
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
        sb.append("class V1MeetingMeetingIdPhoneCancelcallPostRequestPhoneNumbersInner {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    extensionNumber: ").append(toIndentedString(extensionNumber)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


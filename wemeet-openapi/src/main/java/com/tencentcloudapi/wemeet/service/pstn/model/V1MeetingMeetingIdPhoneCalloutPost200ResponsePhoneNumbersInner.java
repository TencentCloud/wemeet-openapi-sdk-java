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
 * 电话号码对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner {
    @JsonProperty(value = "area")
    private Long area;

    @JsonProperty(value = "extension_number")
    private String extensionNumber;

    @JsonProperty(value = "phone")
    private String phone;

    @JsonProperty(value = "status")
    private String status;

    /**
     */
    public V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner() {
    }

    /**
     * @param area 电话区号
     */
    public V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner area(Long area) {
        this.area = area;
        return this;
    }
    /**
     * @return area 电话区号
     **/
    public Long getArea() {
        return area;
    }

    /**
     * @param area 电话区号
     */
    public void setArea(Long area) {
        this.area = area;
    }
    /**
     * @param extensionNumber 
     */
    public V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    /**
     * @return extensionNumber 
     **/
    public String getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * @param extensionNumber 
     */
    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }
    /**
     * @param phone 
     */
    public V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner phone(String phone) {
        this.phone = phone;
        return this;
    }
    /**
     * @return phone 
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * @param status 
     */
    public V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner status(String status) {
        this.status = status;
        return this;
    }
    /**
     * @return status 
     **/
    public String getStatus() {
        return status;
    }

    /**
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner v1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner = (V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner) o;
        return Objects.equals(this.area, v1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner.area) &&
            Objects.equals(this.extensionNumber, v1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner.extensionNumber) &&
            Objects.equals(this.phone, v1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner.phone) &&
            Objects.equals(this.status, v1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, extensionNumber, phone, status);
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
        sb.append("class V1MeetingMeetingIdPhoneCalloutPost200ResponsePhoneNumbersInner {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    extensionNumber: ").append(toIndentedString(extensionNumber)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner {
    @JsonProperty(value = "customer_data")
    private String customerData;

    @JsonProperty(value = "meeting_short_url")
    private String meetingShortUrl;

    /**
     */
    public V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner() {
    }

    /**
     * @param customerData 用户专属信息字段，用户自定义参数customerData
     */
    public V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner customerData(String customerData) {
        this.customerData = customerData;
        return this;
    }
    /**
     * @return customerData 用户专属信息字段，用户自定义参数customerData
     **/
    public String getCustomerData() {
        return customerData;
    }

    /**
     * @param customerData 用户专属信息字段，用户自定义参数customerData
     */
    public void setCustomerData(String customerData) {
        this.customerData = customerData;
    }
    /**
     * @param meetingShortUrl 根据customerData生成的专属参会链接
     */
    public V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner meetingShortUrl(String meetingShortUrl) {
        this.meetingShortUrl = meetingShortUrl;
        return this;
    }
    /**
     * @return meetingShortUrl 根据customerData生成的专属参会链接
     **/
    public String getMeetingShortUrl() {
        return meetingShortUrl;
    }

    /**
     * @param meetingShortUrl 根据customerData生成的专属参会链接
     */
    public void setMeetingShortUrl(String meetingShortUrl) {
        this.meetingShortUrl = meetingShortUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner v1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner = (V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner) o;
        return Objects.equals(this.customerData, v1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner.customerData) &&
            Objects.equals(this.meetingShortUrl, v1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner.meetingShortUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerData, meetingShortUrl);
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
        sb.append("class V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner {\n");
        sb.append("    customerData: ").append(toIndentedString(customerData)).append("\n");
        sb.append("    meetingShortUrl: ").append(toIndentedString(meetingShortUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


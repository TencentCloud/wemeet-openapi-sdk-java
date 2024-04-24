/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.0.70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloud.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsCustomerShortUrlPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsCustomerShortUrlPost200Response {
    @JsonProperty(value = "meeting_short_url_customer_data")
    private V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData meetingShortUrlCustomerData;

    /**
     */
    public V1MeetingsCustomerShortUrlPost200Response() {
    }

    /**
     * @param meetingShortUrlCustomerData 
     */
    public V1MeetingsCustomerShortUrlPost200Response meetingShortUrlCustomerData(V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData meetingShortUrlCustomerData) {
        this.meetingShortUrlCustomerData = meetingShortUrlCustomerData;
        return this;
    }
    /**
     * @return meetingShortUrlCustomerData 
     **/
    public V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData getMeetingShortUrlCustomerData() {
        return meetingShortUrlCustomerData;
    }

    /**
     * @param meetingShortUrlCustomerData 
     */
    public void setMeetingShortUrlCustomerData(V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData meetingShortUrlCustomerData) {
        this.meetingShortUrlCustomerData = meetingShortUrlCustomerData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsCustomerShortUrlPost200Response v1MeetingsCustomerShortUrlPost200Response = (V1MeetingsCustomerShortUrlPost200Response) o;
        return Objects.equals(this.meetingShortUrlCustomerData, v1MeetingsCustomerShortUrlPost200Response.meetingShortUrlCustomerData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingShortUrlCustomerData);
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
        sb.append("class V1MeetingsCustomerShortUrlPost200Response {\n");
        sb.append("    meetingShortUrlCustomerData: ").append(toIndentedString(meetingShortUrlCustomerData)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


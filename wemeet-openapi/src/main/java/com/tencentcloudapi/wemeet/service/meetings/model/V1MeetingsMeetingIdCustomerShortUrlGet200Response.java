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
 * V1MeetingsMeetingIdCustomerShortUrlGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdCustomerShortUrlGet200Response {
    @JsonProperty(value = "meeting_short_url_customer_data")
    private List<V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner> meetingShortUrlCustomerData;

    /**
     */
    public V1MeetingsMeetingIdCustomerShortUrlGet200Response() {
    }

    /**
     * @param meetingShortUrlCustomerData 用户专属参会链接对象。
     */
    public V1MeetingsMeetingIdCustomerShortUrlGet200Response meetingShortUrlCustomerData(List<V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner> meetingShortUrlCustomerData) {
        this.meetingShortUrlCustomerData = meetingShortUrlCustomerData;
        return this;
    }
    /**
     * @return meetingShortUrlCustomerData 用户专属参会链接对象。
     **/
    public List<V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner> getMeetingShortUrlCustomerData() {
        return meetingShortUrlCustomerData;
    }

    /**
     * @param meetingShortUrlCustomerData 用户专属参会链接对象。
     */
    public void setMeetingShortUrlCustomerData(List<V1MeetingsMeetingIdCustomerShortUrlGet200ResponseMeetingShortUrlCustomerDataInner> meetingShortUrlCustomerData) {
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
        V1MeetingsMeetingIdCustomerShortUrlGet200Response v1MeetingsMeetingIdCustomerShortUrlGet200Response = (V1MeetingsMeetingIdCustomerShortUrlGet200Response) o;
        return Objects.equals(this.meetingShortUrlCustomerData, v1MeetingsMeetingIdCustomerShortUrlGet200Response.meetingShortUrlCustomerData);
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
        sb.append("class V1MeetingsMeetingIdCustomerShortUrlGet200Response {\n");
        sb.append("    meetingShortUrlCustomerData: ").append(toIndentedString(meetingShortUrlCustomerData)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


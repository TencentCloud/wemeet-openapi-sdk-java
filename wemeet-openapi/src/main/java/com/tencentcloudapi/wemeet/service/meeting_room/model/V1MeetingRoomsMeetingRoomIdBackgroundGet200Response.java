/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1MeetingRoomsMeetingRoomIdBackgroundGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsMeetingRoomIdBackgroundGet200Response {
    @JsonProperty(value = "background_image")
    private String backgroundImage;

    /**
     */
    public V1MeetingRoomsMeetingRoomIdBackgroundGet200Response() {
    }

    /**
     * @param backgroundImage 背景图片地址
     */
    public V1MeetingRoomsMeetingRoomIdBackgroundGet200Response backgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }
    /**
     * @return backgroundImage 背景图片地址
     **/
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * @param backgroundImage 背景图片地址
     */
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsMeetingRoomIdBackgroundGet200Response v1MeetingRoomsMeetingRoomIdBackgroundGet200Response = (V1MeetingRoomsMeetingRoomIdBackgroundGet200Response) o;
        return Objects.equals(this.backgroundImage, v1MeetingRoomsMeetingRoomIdBackgroundGet200Response.backgroundImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backgroundImage);
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
        sb.append("class V1MeetingRoomsMeetingRoomIdBackgroundGet200Response {\n");
        sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

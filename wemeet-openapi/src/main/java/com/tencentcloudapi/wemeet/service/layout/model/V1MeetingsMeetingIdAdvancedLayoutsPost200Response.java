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

package com.tencentcloudapi.wemeet.service.layout.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdAdvancedLayoutsPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdAdvancedLayoutsPost200Response {
    @JsonProperty(value = "layout_list")
    private List<V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInner> layoutList;

    /**
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPost200Response() {
    }

    /**
     * @param layoutList 布局对象列表
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPost200Response layoutList(List<V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInner> layoutList) {
        this.layoutList = layoutList;
        return this;
    }
    /**
     * @return layoutList 布局对象列表
     **/
    public List<V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInner> getLayoutList() {
        return layoutList;
    }

    /**
     * @param layoutList 布局对象列表
     */
    public void setLayoutList(List<V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInner> layoutList) {
        this.layoutList = layoutList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdAdvancedLayoutsPost200Response v1MeetingsMeetingIdAdvancedLayoutsPost200Response = (V1MeetingsMeetingIdAdvancedLayoutsPost200Response) o;
        return Objects.equals(this.layoutList, v1MeetingsMeetingIdAdvancedLayoutsPost200Response.layoutList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layoutList);
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
        sb.append("class V1MeetingsMeetingIdAdvancedLayoutsPost200Response {\n");
        sb.append("    layoutList: ").append(toIndentedString(layoutList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


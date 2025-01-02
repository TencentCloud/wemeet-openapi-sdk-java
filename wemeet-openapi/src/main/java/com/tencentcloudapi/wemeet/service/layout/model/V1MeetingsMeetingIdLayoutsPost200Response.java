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

package com.tencentcloudapi.wemeet.service.layout.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdLayoutsPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdLayoutsPost200Response {
    @JsonProperty(value = "layout_list")
    private List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner> layoutList;

    @JsonProperty(value = "layout_number")
    private Long layoutNumber;

    @JsonProperty(value = "selected_layout_id")
    private String selectedLayoutId;

    /**
     */
    public V1MeetingsMeetingIdLayoutsPost200Response() {
    }

    /**
     * @param layoutList 布局对象列表
     */
    public V1MeetingsMeetingIdLayoutsPost200Response layoutList(List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner> layoutList) {
        this.layoutList = layoutList;
        return this;
    }
    /**
     * @return layoutList 布局对象列表
     **/
    public List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner> getLayoutList() {
        return layoutList;
    }

    /**
     * @param layoutList 布局对象列表
     */
    public void setLayoutList(List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner> layoutList) {
        this.layoutList = layoutList;
    }
    /**
     * @param layoutNumber 布局数量
     */
    public V1MeetingsMeetingIdLayoutsPost200Response layoutNumber(Long layoutNumber) {
        this.layoutNumber = layoutNumber;
        return this;
    }
    /**
     * @return layoutNumber 布局数量
     **/
    public Long getLayoutNumber() {
        return layoutNumber;
    }

    /**
     * @param layoutNumber 布局数量
     */
    public void setLayoutNumber(Long layoutNumber) {
        this.layoutNumber = layoutNumber;
    }
    /**
     * @param selectedLayoutId 会议应用的布局ID
     */
    public V1MeetingsMeetingIdLayoutsPost200Response selectedLayoutId(String selectedLayoutId) {
        this.selectedLayoutId = selectedLayoutId;
        return this;
    }
    /**
     * @return selectedLayoutId 会议应用的布局ID
     **/
    public String getSelectedLayoutId() {
        return selectedLayoutId;
    }

    /**
     * @param selectedLayoutId 会议应用的布局ID
     */
    public void setSelectedLayoutId(String selectedLayoutId) {
        this.selectedLayoutId = selectedLayoutId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdLayoutsPost200Response v1MeetingsMeetingIdLayoutsPost200Response = (V1MeetingsMeetingIdLayoutsPost200Response) o;
        return Objects.equals(this.layoutList, v1MeetingsMeetingIdLayoutsPost200Response.layoutList) &&
            Objects.equals(this.layoutNumber, v1MeetingsMeetingIdLayoutsPost200Response.layoutNumber) &&
            Objects.equals(this.selectedLayoutId, v1MeetingsMeetingIdLayoutsPost200Response.selectedLayoutId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layoutList, layoutNumber, selectedLayoutId);
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
        sb.append("class V1MeetingsMeetingIdLayoutsPost200Response {\n");
        sb.append("    layoutList: ").append(toIndentedString(layoutList)).append("\n");
        sb.append("    layoutNumber: ").append(toIndentedString(layoutNumber)).append("\n");
        sb.append("    selectedLayoutId: ").append(toIndentedString(selectedLayoutId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


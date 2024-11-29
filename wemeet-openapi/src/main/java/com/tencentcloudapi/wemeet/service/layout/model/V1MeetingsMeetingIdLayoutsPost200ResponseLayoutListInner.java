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

package com.tencentcloudapi.wemeet.service.layout.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner {
    @JsonProperty(value = "layout_id")
    private String layoutId;

    @JsonProperty(value = "page_list")
    private List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner> pageList;

    /**
     */
    public V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner() {
    }

    /**
     * @param layoutId 
     */
    public V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner layoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    /**
     * @return layoutId 
     **/
    public String getLayoutId() {
        return layoutId;
    }

    /**
     * @param layoutId 
     */
    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }
    /**
     * @param pageList 布局单页对象列表
     */
    public V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner pageList(List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner> pageList) {
        this.pageList = pageList;
        return this;
    }
    /**
     * @return pageList 布局单页对象列表
     **/
    public List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner> getPageList() {
        return pageList;
    }

    /**
     * @param pageList 布局单页对象列表
     */
    public void setPageList(List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner> pageList) {
        this.pageList = pageList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner v1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner = (V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner) o;
        return Objects.equals(this.layoutId, v1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner.layoutId) &&
            Objects.equals(this.pageList, v1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner.pageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layoutId, pageList);
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
        sb.append("class V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInner {\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    pageList: ").append(toIndentedString(pageList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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

package com.tencentcloudapi.wemeet.service.application_group.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * 可见列表对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AppToolkitPostRequestToolListInnerVisibleListInner {
    @JsonProperty(value = "visible_appid")
    private String visibleAppid;

    @JsonProperty(value = "visible_openid")
    private String visibleOpenid;

    @JsonProperty(value = "visible_userid")
    private String visibleUserid;

    /**
     */
    public V1AppToolkitPostRequestToolListInnerVisibleListInner() {
    }

    /**
     * @param visibleAppid 对哪个企业的用户可见
     */
    public V1AppToolkitPostRequestToolListInnerVisibleListInner visibleAppid(String visibleAppid) {
        this.visibleAppid = visibleAppid;
        return this;
    }
    /**
     * @return visibleAppid 对哪个企业的用户可见
     **/
    public String getVisibleAppid() {
        return visibleAppid;
    }

    /**
     * @param visibleAppid 对哪个企业的用户可见
     */
    public void setVisibleAppid(String visibleAppid) {
        this.visibleAppid = visibleAppid;
    }
    /**
     * @param visibleOpenid 可见用户openid，OAuth2.0鉴权用户请用此字段（visible_userid和visible_openid二者选一，同时存在时以visible_openid为准）
     */
    public V1AppToolkitPostRequestToolListInnerVisibleListInner visibleOpenid(String visibleOpenid) {
        this.visibleOpenid = visibleOpenid;
        return this;
    }
    /**
     * @return visibleOpenid 可见用户openid，OAuth2.0鉴权用户请用此字段（visible_userid和visible_openid二者选一，同时存在时以visible_openid为准）
     **/
    public String getVisibleOpenid() {
        return visibleOpenid;
    }

    /**
     * @param visibleOpenid 可见用户openid，OAuth2.0鉴权用户请用此字段（visible_userid和visible_openid二者选一，同时存在时以visible_openid为准）
     */
    public void setVisibleOpenid(String visibleOpenid) {
        this.visibleOpenid = visibleOpenid;
    }
    /**
     * @param visibleUserid 可见用户userid，若不填则对该企业下所有用户可见
     */
    public V1AppToolkitPostRequestToolListInnerVisibleListInner visibleUserid(String visibleUserid) {
        this.visibleUserid = visibleUserid;
        return this;
    }
    /**
     * @return visibleUserid 可见用户userid，若不填则对该企业下所有用户可见
     **/
    public String getVisibleUserid() {
        return visibleUserid;
    }

    /**
     * @param visibleUserid 可见用户userid，若不填则对该企业下所有用户可见
     */
    public void setVisibleUserid(String visibleUserid) {
        this.visibleUserid = visibleUserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1AppToolkitPostRequestToolListInnerVisibleListInner v1AppToolkitPostRequestToolListInnerVisibleListInner = (V1AppToolkitPostRequestToolListInnerVisibleListInner) o;
        return Objects.equals(this.visibleAppid, v1AppToolkitPostRequestToolListInnerVisibleListInner.visibleAppid) &&
            Objects.equals(this.visibleOpenid, v1AppToolkitPostRequestToolListInnerVisibleListInner.visibleOpenid) &&
            Objects.equals(this.visibleUserid, v1AppToolkitPostRequestToolListInnerVisibleListInner.visibleUserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibleAppid, visibleOpenid, visibleUserid);
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
        sb.append("class V1AppToolkitPostRequestToolListInnerVisibleListInner {\n");
        sb.append("    visibleAppid: ").append(toIndentedString(visibleAppid)).append("\n");
        sb.append("    visibleOpenid: ").append(toIndentedString(visibleOpenid)).append("\n");
        sb.append("    visibleUserid: ").append(toIndentedString(visibleUserid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * 会议的直播配置（会议创建人才有权限查询）
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig {
    @JsonProperty(value = "enable_live_im")
    private Boolean enableLiveIm;

    @JsonProperty(value = "enable_live_password")
    private Boolean enableLivePassword;

    @JsonProperty(value = "enable_live_replay")
    private Boolean enableLiveReplay;

    @JsonProperty(value = "live_password")
    private String livePassword;

    @JsonProperty(value = "live_subject")
    private String liveSubject;

    @JsonProperty(value = "live_summary")
    private String liveSummary;

    @JsonProperty(value = "live_watermark")
    private V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfigLiveWatermark liveWatermark;

    /**
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig() {
    }

    /**
     * @param enableLiveIm 是否开启直播互动
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig enableLiveIm(Boolean enableLiveIm) {
        this.enableLiveIm = enableLiveIm;
        return this;
    }
    /**
     * @return enableLiveIm 是否开启直播互动
     **/
    public Boolean getEnableLiveIm() {
        return enableLiveIm;
    }

    /**
     * @param enableLiveIm 是否开启直播互动
     */
    public void setEnableLiveIm(Boolean enableLiveIm) {
        this.enableLiveIm = enableLiveIm;
    }
    /**
     * @param enableLivePassword 是否开启直播密码，默认值false. true：开启, false：不开启
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig enableLivePassword(Boolean enableLivePassword) {
        this.enableLivePassword = enableLivePassword;
        return this;
    }
    /**
     * @return enableLivePassword 是否开启直播密码，默认值false. true：开启, false：不开启
     **/
    public Boolean getEnableLivePassword() {
        return enableLivePassword;
    }

    /**
     * @param enableLivePassword 是否开启直播密码，默认值false. true：开启, false：不开启
     */
    public void setEnableLivePassword(Boolean enableLivePassword) {
        this.enableLivePassword = enableLivePassword;
    }
    /**
     * @param enableLiveReplay 是否开启直播回放
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig enableLiveReplay(Boolean enableLiveReplay) {
        this.enableLiveReplay = enableLiveReplay;
        return this;
    }
    /**
     * @return enableLiveReplay 是否开启直播回放
     **/
    public Boolean getEnableLiveReplay() {
        return enableLiveReplay;
    }

    /**
     * @param enableLiveReplay 是否开启直播回放
     */
    public void setEnableLiveReplay(Boolean enableLiveReplay) {
        this.enableLiveReplay = enableLiveReplay;
    }
    /**
     * @param livePassword 直播密码
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig livePassword(String livePassword) {
        this.livePassword = livePassword;
        return this;
    }
    /**
     * @return livePassword 直播密码
     **/
    public String getLivePassword() {
        return livePassword;
    }

    /**
     * @param livePassword 直播密码
     */
    public void setLivePassword(String livePassword) {
        this.livePassword = livePassword;
    }
    /**
     * @param liveSubject 直播主题
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig liveSubject(String liveSubject) {
        this.liveSubject = liveSubject;
        return this;
    }
    /**
     * @return liveSubject 直播主题
     **/
    public String getLiveSubject() {
        return liveSubject;
    }

    /**
     * @param liveSubject 直播主题
     */
    public void setLiveSubject(String liveSubject) {
        this.liveSubject = liveSubject;
    }
    /**
     * @param liveSummary 直播简介
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig liveSummary(String liveSummary) {
        this.liveSummary = liveSummary;
        return this;
    }
    /**
     * @return liveSummary 直播简介
     **/
    public String getLiveSummary() {
        return liveSummary;
    }

    /**
     * @param liveSummary 直播简介
     */
    public void setLiveSummary(String liveSummary) {
        this.liveSummary = liveSummary;
    }
    /**
     * @param liveWatermark 
     */
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig liveWatermark(V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfigLiveWatermark liveWatermark) {
        this.liveWatermark = liveWatermark;
        return this;
    }
    /**
     * @return liveWatermark 
     **/
    public V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfigLiveWatermark getLiveWatermark() {
        return liveWatermark;
    }

    /**
     * @param liveWatermark 
     */
    public void setLiveWatermark(V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfigLiveWatermark liveWatermark) {
        this.liveWatermark = liveWatermark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig v1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig = (V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig) o;
        return Objects.equals(this.enableLiveIm, v1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig.enableLiveIm) &&
            Objects.equals(this.enableLivePassword, v1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig.enableLivePassword) &&
            Objects.equals(this.enableLiveReplay, v1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig.enableLiveReplay) &&
            Objects.equals(this.livePassword, v1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig.livePassword) &&
            Objects.equals(this.liveSubject, v1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig.liveSubject) &&
            Objects.equals(this.liveSummary, v1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig.liveSummary) &&
            Objects.equals(this.liveWatermark, v1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig.liveWatermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableLiveIm, enableLivePassword, enableLiveReplay, livePassword, liveSubject, liveSummary, liveWatermark);
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
        sb.append("class V1MeetingsPost200ResponseMeetingInfoListInnerLiveConfig {\n");
        sb.append("    enableLiveIm: ").append(toIndentedString(enableLiveIm)).append("\n");
        sb.append("    enableLivePassword: ").append(toIndentedString(enableLivePassword)).append("\n");
        sb.append("    enableLiveReplay: ").append(toIndentedString(enableLiveReplay)).append("\n");
        sb.append("    livePassword: ").append(toIndentedString(livePassword)).append("\n");
        sb.append("    liveSubject: ").append(toIndentedString(liveSubject)).append("\n");
        sb.append("    liveSummary: ").append(toIndentedString(liveSummary)).append("\n");
        sb.append("    liveWatermark: ").append(toIndentedString(liveWatermark)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


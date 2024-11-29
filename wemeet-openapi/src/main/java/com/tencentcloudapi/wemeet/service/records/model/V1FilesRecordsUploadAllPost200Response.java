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

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1FilesRecordsUploadAllPost200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1FilesRecordsUploadAllPost200Response {
    @JsonProperty(value = "job_id")
    private String jobId;

    /**
     */
    public V1FilesRecordsUploadAllPost200Response() {
    }

    /**
     * @param jobId 任务ID
     */
    public V1FilesRecordsUploadAllPost200Response jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    /**
     * @return jobId 任务ID
     **/
    public String getJobId() {
        return jobId;
    }

    /**
     * @param jobId 任务ID
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1FilesRecordsUploadAllPost200Response v1FilesRecordsUploadAllPost200Response = (V1FilesRecordsUploadAllPost200Response) o;
        return Objects.equals(this.jobId, v1FilesRecordsUploadAllPost200Response.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId);
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
        sb.append("class V1FilesRecordsUploadAllPost200Response {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}


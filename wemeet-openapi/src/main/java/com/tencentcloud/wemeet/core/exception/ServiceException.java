package com.tencentcloud.wemeet.core.exception;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tencentcloud.wemeet.core.Constants;
import com.tencentcloud.wemeet.core.xhttp.ApiResponse;

import java.io.IOException;

public class ServiceException extends Exception {

    private ErrorInfo errorInfo;

    private final ApiResponse apiResp;

    public ServiceException(ApiResponse apiResp) {
        this.apiResp = apiResp;
        try {
            this.errorInfo = Constants.JSON_SERIALIZER.Deserialize(apiResp.getRawBody(), ErrorInfo.class);
        } catch (Exception ignored) {}
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public ApiResponse getApiResp() {
        return apiResp;
    }

    @Override
    public String toString() {
        StringBuilder sb =
                new StringBuilder(String.format("http status code: %d", this.apiResp.getStatusCode()));
        if (this.errorInfo != null) {
            sb.append(", error code: ").append(this.errorInfo.errorCode)
                .append(", new error code: ").append(this.errorInfo.newErrorCode)
                .append(", message: ").append(this.errorInfo.message);
        } else {
            sb.append(", response body: ").append(new String(this.apiResp.getRawBody()));
        }
        return String.format("[wemeet service error] %s", sb);
    }

    @JsonDeserialize(using = ErrorInfo.Deserializer.class)
    public static class ErrorInfo {
        @JsonProperty("error_code")
        private Integer errorCode;
        @JsonProperty("new_error_code")
        private Integer newErrorCode;
        @JsonProperty("message")
        private String message;

        public Integer getErrorCode() {
            return errorCode;
        }

        public Integer getNewErrorCode() {
            return newErrorCode;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public String toString() {
            return "ErrorInfo{" +
                    "errorCode=" + errorCode +
                    ", newErrorCode=" + newErrorCode +
                    ", message='" + message + '\'' +
                    '}';
        }

        public static class Deserializer extends JsonDeserializer<ErrorInfo> {
            @Override
            public ErrorInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
                JsonNode root = p.getCodec().readTree(p);
                JsonNode info = root.get("error_info");
                if (info == null) return null;

                ErrorInfo instance = new ErrorInfo();
                instance.errorCode = info.get("error_code").asInt();
                instance.newErrorCode = info.get("new_error_code").asInt();
                instance.message = info.get("message").asText();
                return instance;
            }
        }
    }
}

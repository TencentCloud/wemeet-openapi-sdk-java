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

package com.tencentcloudapi.wemeet.service.meeting_guest.api;

import com.tencentcloudapi.wemeet.core.Config;
import com.tencentcloudapi.wemeet.core.Constants;
import com.tencentcloudapi.wemeet.core.authenticator.AuthenticatorBuilder;
import com.tencentcloudapi.wemeet.core.xhttp.*;
import com.tencentcloudapi.wemeet.core.exception.*;
import com.tencentcloudapi.wemeet.service.meeting_guest.model.*;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import java.io.File;


public class MeetingGuestApi {

    private final Config config;

    public MeetingGuestApi(Config config) {
        this.config = config;
    }

    public static class ApiV1GuestsMeetingIdGetRequest {
    
        /**
         * meetingId  (required)
         */
        private String meetingId;

        /**
         * userid 用户的 ID（企业内部请使用企业唯一用户标识，OAuth2.0 鉴权用户请使用 openId）。 (required)
         */
        private String userid;

        /**
         * instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序。9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
         */
        private String instanceid;
        private Object body;

        private ApiV1GuestsMeetingIdGetRequest() {}

        private ApiV1GuestsMeetingIdGetRequest(Builder builder) {
            
            this.meetingId = builder.meetingId;
            

            this.userid = builder.userid;
            

            this.instanceid = builder.instanceid;
            

            this.body = builder.body;
        }

        public static class Builder {
            
            /**
             * meetingId  (required)
             */
            private final String meetingId;
            

            /**
             * userid 用户的 ID（企业内部请使用企业唯一用户标识，OAuth2.0 鉴权用户请使用 openId）。 (required)
             */
            private String userid;
            

            /**
             * instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序。9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
             */
            private String instanceid;
            

            private Object body;

            /**
             * @param meetingId 
             */
            public Builder(String meetingId) {
                this.meetingId = meetingId;
            }
            
            
            /**
             * @param userid 用户的 ID（企业内部请使用企业唯一用户标识，OAuth2.0 鉴权用户请使用 openId）。 (required)
             */
            public Builder userid(String userid) {
                this.userid = userid;
                return this;
            }
            
            
            /**
             * @param instanceid 用户的终端设备类型： 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序。9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
             */
            public Builder instanceid(String instanceid) {
                this.instanceid = instanceid;
                return this;
            }
            
                        public Builder body(Object body) {
                this.body = body;
                return this;
            }

            public ApiV1GuestsMeetingIdGetRequest build() {
                return new ApiV1GuestsMeetingIdGetRequest(this);
            }
        }
        
        public String getMeetingId() {
            return this.meetingId;
        }
        

        public String getUserid() {
            return this.userid;
        }
        

        public String getInstanceid() {
            return this.instanceid;
        }
        

        public Object getBody() {
            return this.body;
        }
    }

    public static class ApiV1GuestsMeetingIdGetResponse extends ApiResponse {
        private final V1GuestsMeetingIdGet200Response data;
        public ApiV1GuestsMeetingIdGetResponse(ApiResponse apiRsp) throws ClientException {
            super(apiRsp);
            try {
                this.data = apiRsp.translate(V1GuestsMeetingIdGet200Response.class);
            } catch (Exception e) {
                throw new ClientException(String.format("http status code: %d, response: %s, err: %s",
                this.getStatusCode(), new String(this.getRawBody()), e.getMessage()), e);
            }
        }
        public V1GuestsMeetingIdGet200Response getData() {
            return this.data;
        }
    }

    public static class ApiV1GuestsMeetingIdPutRequest {
    
        /**
         * meetingId  (required)
         */
        private String meetingId;
        private V1GuestsMeetingIdPutRequest body;

        private ApiV1GuestsMeetingIdPutRequest() {}

        private ApiV1GuestsMeetingIdPutRequest(Builder builder) {
            
            this.meetingId = builder.meetingId;
            

            this.body = builder.body;
        }

        public static class Builder {
            
            /**
             * meetingId  (required)
             */
            private final String meetingId;
            

            private V1GuestsMeetingIdPutRequest body;

            /**
             * @param meetingId 
             */
            public Builder(String meetingId) {
                this.meetingId = meetingId;
            }
            
                        public Builder body(V1GuestsMeetingIdPutRequest body) {
                this.body = body;
                return this;
            }

            public ApiV1GuestsMeetingIdPutRequest build() {
                return new ApiV1GuestsMeetingIdPutRequest(this);
            }
        }
        
        public String getMeetingId() {
            return this.meetingId;
        }
        

        public V1GuestsMeetingIdPutRequest getBody() {
            return this.body;
        }
    }

    public static class ApiV1GuestsMeetingIdPutResponse extends ApiResponse {
        private final Object data;
        public ApiV1GuestsMeetingIdPutResponse(ApiResponse apiRsp) throws ClientException {
            super(apiRsp);
            try {
                this.data = apiRsp.translate(Object.class);
            } catch (Exception e) {
                throw new ClientException(String.format("http status code: %d, response: %s, err: %s",
                this.getStatusCode(), new String(this.getRawBody()), e.getMessage()), e);
            }
        }
        public Object getData() {
            return this.data;
        }
    }

    /**
     * v1GuestsMeetingIdGet 查询会议嘉宾列表（通过会议 ID 查询）[/v1/guests/{meeting_id} - GET]
     * <p>通过会议 ID 查询会议嘉宾列表，只有会议创建人才有权限查询，支持 OAuth2.0 鉴权访问。  &gt; 注意 &gt; 只有商业版、企业版或教育版用户可以使用会议嘉宾功能，个人版尚无此功能。<p/>
     * @param req ApiV1GuestsMeetingIdGetRequest
     * @param serializer The serializer for HTTP request's body. (Optional)
     * @param builders The authenticator's builder for create the api authenticator which can add special authentication HTTP request's headers. (Optional)
     * @return ApiV1GuestsMeetingIdGetResponse
     * @throws ClientException If fail to serialize the request body object or some parameter's exception
     * @throws ServiceException If fail to call the api service
     */
    public ApiV1GuestsMeetingIdGetResponse v1GuestsMeetingIdGet(ApiV1GuestsMeetingIdGetRequest req, Serializable serializer, AuthenticatorBuilder<?>... builders) throws ClientException, ServiceException {
        try {
            // 构造 authenticators
            Authentication[] authenticators = new Authentication[builders.length];
            for (int index = 0; index < authenticators.length; index++) {
                authenticators[index] = builders[index].build(this.config);
            }
            
            
            ApiRequest apiReq = new ApiRequest.Builder("/v1/guests/{meeting_id}")
                    .body(req.getBody())
                    .serializer(serializer)
                    .authenticators(authenticators)
                    .build();

            // verify the required parameter 'meetingId' is set
            if (req.getMeetingId() == null) {
                throw new IllegalArgumentException("'meetingId' is required and must be specified");
            }
            

            // verify the required parameter 'userid' is set
            if (req.getUserid() == null) {
                throw new IllegalArgumentException("'userid' is required and must be specified");
            }
            

            // verify the required parameter 'instanceid' is set
            if (req.getInstanceid() == null) {
                throw new IllegalArgumentException("'instanceid' is required and must be specified");
            }
            

            
            // path 参数
            apiReq.getPathParams().set("meeting_id", req.getMeetingId());
            // query 参数
            if (req.getUserid() != null) {
                apiReq.getQueryParams().set("userid", req.getUserid());
            }
            if (req.getInstanceid() != null) {
                apiReq.getQueryParams().set("instanceid", req.getInstanceid());
            }
            // 增加 SDK Version 标识
            apiReq.getAuthenticators().add(Constants.DEFAULT_AUTHENTICATOR);

            ApiResponse apiRsp = this.config.getClt().get(apiReq);

            if (apiRsp.getStatusCode() >= 300) {
                throw new ServiceException(apiRsp);
            }
            return new ApiV1GuestsMeetingIdGetResponse(apiRsp);
        } catch (ServiceException | ClientException e) {
            throw e;
        } catch (Exception e) {
            throw new ClientException(e);
        }
    }

   /**
    * v1GuestsMeetingIdGet 查询会议嘉宾列表（通过会议 ID 查询）[/v1/guests/{meeting_id} - GET]
    * <p>通过会议 ID 查询会议嘉宾列表，只有会议创建人才有权限查询，支持 OAuth2.0 鉴权访问。  &gt; 注意 &gt; 只有商业版、企业版或教育版用户可以使用会议嘉宾功能，个人版尚无此功能。<p/>
    * @param req ApiV1GuestsMeetingIdGetRequest
    * @param builders The authenticator's builder for create the api authenticator which can add special authentication HTTP request's headers. (Optional)
    * @return ApiV1GuestsMeetingIdGetResponse
    * @throws ClientException If fail to serialize the request body object or some parameter's exception
    * @throws ServiceException If fail to call the api service
    */
    public ApiV1GuestsMeetingIdGetResponse v1GuestsMeetingIdGet(ApiV1GuestsMeetingIdGetRequest req, AuthenticatorBuilder<?>... builders) throws ClientException, ServiceException {
        return v1GuestsMeetingIdGet(req, null, builders);
    }
    /**
     * v1GuestsMeetingIdPut 修改会议嘉宾列表（通过会议 ID 修改）[/v1/guests/{meeting_id} - PUT]
     * <p>通过会议 ID 修改会议嘉宾列表，只有会议创建人才有权限修改，支持 OAuth2.0 鉴权访问。  *  &gt; 注意 &gt; 只有商业版、企业版或教育版用户可以使用会议嘉宾功能，个人版尚无此功能。<p/>
     * @param req ApiV1GuestsMeetingIdPutRequest
     * @param serializer The serializer for HTTP request's body. (Optional)
     * @param builders The authenticator's builder for create the api authenticator which can add special authentication HTTP request's headers. (Optional)
     * @return ApiV1GuestsMeetingIdPutResponse
     * @throws ClientException If fail to serialize the request body object or some parameter's exception
     * @throws ServiceException If fail to call the api service
     */
    public ApiV1GuestsMeetingIdPutResponse v1GuestsMeetingIdPut(ApiV1GuestsMeetingIdPutRequest req, Serializable serializer, AuthenticatorBuilder<?>... builders) throws ClientException, ServiceException {
        try {
            // 构造 authenticators
            Authentication[] authenticators = new Authentication[builders.length];
            for (int index = 0; index < authenticators.length; index++) {
                authenticators[index] = builders[index].build(this.config);
            }
            
            
            ApiRequest apiReq = new ApiRequest.Builder("/v1/guests/{meeting_id}")
                    .body(req.getBody())
                    .serializer(serializer)
                    .authenticators(authenticators)
                    .build();

            // verify the required parameter 'meetingId' is set
            if (req.getMeetingId() == null) {
                throw new IllegalArgumentException("'meetingId' is required and must be specified");
            }
            

            
            // path 参数
            apiReq.getPathParams().set("meeting_id", req.getMeetingId());
            // query 参数
            // 增加 SDK Version 标识
            apiReq.getAuthenticators().add(Constants.DEFAULT_AUTHENTICATOR);

            ApiResponse apiRsp = this.config.getClt().put(apiReq);

            if (apiRsp.getStatusCode() >= 300) {
                throw new ServiceException(apiRsp);
            }
            return new ApiV1GuestsMeetingIdPutResponse(apiRsp);
        } catch (ServiceException | ClientException e) {
            throw e;
        } catch (Exception e) {
            throw new ClientException(e);
        }
    }

   /**
    * v1GuestsMeetingIdPut 修改会议嘉宾列表（通过会议 ID 修改）[/v1/guests/{meeting_id} - PUT]
    * <p>通过会议 ID 修改会议嘉宾列表，只有会议创建人才有权限修改，支持 OAuth2.0 鉴权访问。  *  &gt; 注意 &gt; 只有商业版、企业版或教育版用户可以使用会议嘉宾功能，个人版尚无此功能。<p/>
    * @param req ApiV1GuestsMeetingIdPutRequest
    * @param builders The authenticator's builder for create the api authenticator which can add special authentication HTTP request's headers. (Optional)
    * @return ApiV1GuestsMeetingIdPutResponse
    * @throws ClientException If fail to serialize the request body object or some parameter's exception
    * @throws ServiceException If fail to call the api service
    */
    public ApiV1GuestsMeetingIdPutResponse v1GuestsMeetingIdPut(ApiV1GuestsMeetingIdPutRequest req, AuthenticatorBuilder<?>... builders) throws ClientException, ServiceException {
        return v1GuestsMeetingIdPut(req, null, builders);
    }
}


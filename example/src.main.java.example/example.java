package com.tencentcloudapi.wemeet.example;

import com.tencentcloudapi.wemeet.Client;
import core.com.tencentcloudapi.wemeet.Constants;
import authenticator.core.com.tencentcloudapi.wemeet.AuthenticatorBuilder;
import authenticator.core.com.tencentcloudapi.wemeet.JWTAuthenticator;
import exception.core.com.tencentcloudapi.wemeet.ClientException;
import exception.core.com.tencentcloudapi.wemeet.ServiceException;
import xhttp.core.com.tencentcloudapi.wemeet.DefaultHttpClient;
import xhttp.core.com.tencentcloudapi.wemeet.HttpClient;
import api.meetings.service.com.tencentcloudapi.wemeet.MeetingsApi;
import model.meetings.service.com.tencentcloudapi.wemeet.V1MeetingsPostRequest;

import java.security.SecureRandom;

public class Example {

    public static void main(String[] args) {

        // 1.构造 client 客户端(jwt 鉴权需要配置 appId sdkId secretID 和 secretKey)
        Client client = new Client.Builder()
                .withAppId("2****46").withSdkId("2****50")
                .withSecret("Zk*****J8h",
                        "Y2z*****WRsVksn")
                .build();

        // 2.构造请求体
        V1MeetingsPostRequest body = new V1MeetingsPostRequest()
                .instanceid(1)
                .meetingType(0)
                .subject("测试会议")
                .type(1)
                .userid("userid")
                .startTime(String.valueOf(System.currentTimeMillis() / 1000L))
                .endTime(String.valueOf(System.currentTimeMillis() / 1000L + 3600));
        MeetingsApi.ApiV1MeetingsPostRequest request =
                new MeetingsApi.ApiV1MeetingsPostRequest.Builder().body(body).build();

        // 3.构造 JWT 鉴权器
        // 随机数
        BigInteger nonce = BigInteger.valueOf(Math.abs((new SecureRandom()).nextInt()));
        // 当前时间戳
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000L);
        AuthenticatorBuilder<JWTAuthenticator> authenticatorBuilder =
                new JWTAuthenticator.Builder().nonce(nonce).timestamp(timestamp);

        // 4.发送对应的请求
        try {
            MeetingsApi.ApiV1MeetingsPostResponse response =
                    client.meetings().v1MeetingsPost(request, authenticatorBuilder);
            // response from `V1MeetingsPost`: V1MeetingsPostResponse200
            System.out.printf( "Response from `MeetingsApi.V1MeetingsPost`: \nheader: %s\n%s\n",
                    response.getHeader(), response.getData());
        } catch (ClientException e) {
            System.out.printf("Error when calling `MeetingsApi.V1MeetingsPost`: %s\n", e);
            throw new RuntimeException(e);
        } catch (ServiceException e) {
            System.out.printf("Error when calling `MeetingsApi.V1MeetingsPost`: %s\n", e);
            System.out.printf("Full HTTP response: %s\n", new String(e.getApiResp().getRawBody()));
            throw new RuntimeException(e);
        }

    }

}
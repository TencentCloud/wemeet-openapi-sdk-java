package com.tencentcloudapi.wemeet.demo;

import com.tencentcloudapi.wemeet.Client;
import com.tencentcloudapi.wemeet.core.authenticator.AuthenticatorBuilder;
import com.tencentcloudapi.wemeet.core.authenticator.JWTAuthenticator;
import com.tencentcloudapi.wemeet.core.exception.ClientException;
import com.tencentcloudapi.wemeet.core.exception.ServiceException;
import com.tencentcloudapi.wemeet.service.meetings.model.V1MeetingsPostRequest;
import com.tencentcloudapi.wemeet.service.meetings.api.MeetingsApi;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Demo {

    public static void main(String[] args) {
        // 1.构造 client 客户端(jwt 鉴权需要配置 appId sdkId secretID 和 secretKey)
        Client client = new Client.Builder()
                .withAppId("20****8").withSdkId("26****2")
                .withSecret("Fb****E",
                        "Df****D")
                .build();

        // 2.构造请求体
        String endTime = String.valueOf(System.currentTimeMillis() / 1000L + 3600);
        Long instanceid = 1L;
        String startTime = String.valueOf(System.currentTimeMillis() / 1000L);
        String subject = "测试会议";
        Long type = 1L;
        String userid = "userid";
        V1MeetingsPostRequest body = new V1MeetingsPostRequest(
                endTime, instanceid, startTime, subject, type, userid
        );
        MeetingsApi.ApiV1MeetingsPostRequest request =
                new MeetingsApi.ApiV1MeetingsPostRequest.Builder()
                        .body(body).build();
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
            System.out.printf("Response from `MeetingsApi.V1MeetingsPost`: \nheader: %s\n%s\n",
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

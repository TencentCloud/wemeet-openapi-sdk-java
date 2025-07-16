# 简介
欢迎使用腾讯会议开发者工具套件（SDK），为方便 JAVA 开发者调试和接入腾讯云会议 API，这里向您介绍适用于 Java 的腾讯会议开发工具包，并提供首次使用开发工具包的简单示例。让您快速获取腾讯会议 Java SDK 并开始调用。
# 依赖环境
1. 依赖环境：JDK 8 版本及以上。
2. 购买腾讯会议企业版获取 SecretID、SecretKey，接入的企业 AppId。

# 获取安装
安装 Java SDK 前，先获取安全凭证。在第一次使用云API之前，用户首先需要在腾讯云控制台上申请安全凭证，安全凭证包括 SecretID 和 SecretKey，SecretID 是用于标识 API 调用者的身份，SecretKey 是用于加密签名字符串和服务器端验证签名字符串的密钥 SecretKey 必须严格保管，避免泄露。

## 通过源码包安装
1. 前往 [Github 代码托管地址](https://github.com/TencentCloud/wemeet-openapi-sdk-java) 下载源码压缩包；
2. 解压源码包到您项目合适的位置；
3. 引用方法可参考示例。

# 示例

以创建会议接口为例：


```java
package com.tencentcloudapi.wemeet.example;

import com.tencentcloudapi.wemeet.Client;
import com.tencentcloudapi.wemeet.core.authenticator.AuthenticatorBuilder;
import com.tencentcloudapi.wemeet.core.authenticator.JWTAuthenticator;
import com.tencentcloudapi.wemeet.core.exception.ClientException;
import com.tencentcloudapi.wemeet.core.exception.ServiceException;
import com.tencentcloudapi.wemeet.service.meetings.api.MeetingsApi;
import com.tencentcloudapi.wemeet.service.meetings.model.V1MeetingsPostRequest;

import java.security.SecureRandom;

public class CreateMeetingDemo {

    public class MeetingRequest {
        public static void main(String[] args) {

            // 1.构造 client 客户端(jwt 鉴权需要配置 appId sdkId secretID 和 secretKey)
            Client client = new Client.Builder()
                    .withAppId("2****46").withSdkId("2****50")
                    .withSecret("Zk*****J8h",
                            "Y2z*****WRsVksn")
                    .build();

            // 2.构造请求体
            String endTime = String.valueOf(System.currentTimeMillis() / 1000L + 3600);
            Long instanceid = 1L;
            String startTime = String.valueOf(System.currentTimeMillis() / 1000L);
            String subject = "测试会议";
            Long type = 1L;
            String userid = "userid";
            V1MeetingsPostRequest body = new V1MeetingsPostRequest(endTime, instanceid, startTime, subject, type, userid);
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
}

```

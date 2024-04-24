package com.tencentcloud.wemeet.core.utils;

import java.math.BigInteger;
import java.util.Random;

public class NonceUtil {

        public static BigInteger GenerateTimestampRandom() {
            // 获取当前毫秒级时间戳
            long timestamp = System.currentTimeMillis();

            // 生成一个 0 到 999999 之间的随机数
            Random random = new Random();
            int randomNumber = random.nextInt(1000000);

            // 将时间戳和随机数拼接成字符串
            return new BigInteger(timestamp + String.format("%06d", randomNumber));
        }
}

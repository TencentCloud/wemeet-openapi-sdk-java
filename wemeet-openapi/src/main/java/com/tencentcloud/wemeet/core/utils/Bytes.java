package com.tencentcloud.wemeet.core.utils;

public final class Bytes {

    public static char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static String toHexString(byte[] data) {
        char[] buf = new char[data.length * 2];
        int index = 0;
        for (byte b : data) {
            buf[index++] = HEX_CHAR[b >>> 4 & 0xf];
            buf[index++] = HEX_CHAR[b & 0xf];
        }

        return new String(buf);
    }
}

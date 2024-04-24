package com.tencentcloud.wemeet.core.xhttp;

/**
 * Serializable 序列化能力
 */
public interface Serializable {
    String Name();
    String ContentType();
    byte[] Serialize(Object v) throws Exception;
    <T> T Deserialize(byte[] data, Class<T> clz) throws Exception;
}

package com.tencentcloud.wemeet.core.serializor;

import com.tencentcloud.wemeet.core.Constants;
import com.tencentcloud.wemeet.core.xhttp.Serializable;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JSONSerializer json 序列化器
 */
public class JSONSerializer implements Serializable {

    private final ObjectMapper objectMapper;
    public JSONSerializer() {
        this.objectMapper = new ObjectMapper();
    }
    @Override
    public String Name() {
        return "JSONSerializer";
    }

    @Override
    public String ContentType() {
        return Constants.APPLICATION_JSON;
    }

    @Override
    public byte[] Serialize(Object v) throws Exception {
        return this.objectMapper.writeValueAsBytes(v);
    }

    @Override
    public <T> T Deserialize(byte[] data, Class<T> clz) throws Exception {
        return this.objectMapper.readValue(data, clz);
    }
}

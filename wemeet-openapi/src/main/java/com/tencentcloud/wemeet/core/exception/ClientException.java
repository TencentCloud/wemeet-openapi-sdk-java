package com.tencentcloud.wemeet.core.exception;

public class ClientException extends Exception {

    public ClientException(String msg) {
        super(msg);
    }

    public ClientException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ClientException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return String.format("[wemeet client error] %s", super.getMessage());
    }
}
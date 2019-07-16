package com.ssh.network;

public class HttpException {

    public int code;
    public Exception e;
    public String errMsg;

    public HttpException() {
    }

    public HttpException(int code, Exception e, String errMsg) {
        this.code = code;
        this.e = e;
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "HttpException{" +
                "code=" + code +
                ", e=" + e +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }
}
package com.ssh.network;

public interface IResponseListener {
    void onResponse(String response, int code);

    void onFail(HttpException httpException);
}

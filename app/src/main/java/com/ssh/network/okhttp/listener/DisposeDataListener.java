package com.ssh.network.okhttp.listener;


import com.ssh.network.okhttp.exception.OkHttpException;

public interface DisposeDataListener<T> {

    public void onSuccess(T t);

    public void onFailure(OkHttpException e);

}

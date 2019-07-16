package com.ssh.network;

import android.content.Context;


import java.util.Map;

public interface NetRequest {

    void init(Context context);

    void doGet(String url, final Map<String, String> paramsMap, final IResponseListener iResponseListener);

    void doGet(String url, final Map<String, String> paramsMap, NetworkOption networkOption, final IResponseListener iResponseListener);


    void doPost(String url, final Map<String, String> paramsMap, final IResponseListener iResponseListener);

    void doPost(String url, final Map<String, String> paramsMap, NetworkOption networkOption,
                final IResponseListener iResponseListener);

    void cancel(Object tag);

}

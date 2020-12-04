package com.windmillweather.android;

import javax.security.auth.callback.Callback;

import okhttp3.OkHttpClient;
import okhttp3.Request;

class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue((okhttp3.Callback) callback);
    }
}

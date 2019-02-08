package com.example.admin.retrofittestdemo.Retrofit;

import com.example.admin.retrofittestdemo.Pojo.NotificationListpojo;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST(Url.NEW)
    Call<NotificationListpojo> getNotificationList(@Body Map<String, String> body);



}

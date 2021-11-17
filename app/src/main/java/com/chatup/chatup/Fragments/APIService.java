package com.chatup.chatup.Fragments;



import com.chatup.chatup.Notifications.MyResponse;
import com.chatup.chatup.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                        // change this key
                    "Authorization:key="
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

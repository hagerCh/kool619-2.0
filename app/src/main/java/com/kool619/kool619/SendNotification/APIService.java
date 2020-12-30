package com.kool619.kool619.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAQCpN1IM:APA91bFCiEhtPbGlXG88_bF46SZc2TnEH1axoMI8IPRfvIt8VtlaCdQr_saQdWJ7f0HnUBKX2LxQMwadp7otxDXjmKEN-O3Eh5uX-KcXcewEdHZJSBGzHpYnWhxgoc1TmL_fIPSjwuR_"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}

package com.example.celebi.retrofithttp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<Data> getData();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<Data> getData(@Query("tagged") String tags);
}

package com.example.celebi.retrofithttp;

public class ApiUtils {
    private static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static ApiInterface getBaseUrl() {
        return ApiClient.getRetrofit(BASE_URL).create(ApiInterface.class);
    }
}

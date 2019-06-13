package com.example.recyclerview;

public class APIUtils {
    public static final String baseUrl = "https://huynhvantoanitc.000webhostapp.com";

    public static APIService getAPIService(){
        return RetrofitClient.getClient(baseUrl).create(APIService.class);
    }
}

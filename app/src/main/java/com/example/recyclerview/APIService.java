package com.example.recyclerview;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("/getsanphammoinhat.php")
    Call<List<Product>> getProduct();
}

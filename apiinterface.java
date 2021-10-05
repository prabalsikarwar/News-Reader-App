package com.example.newsreaderapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface apiinterface {
    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<Mainnews>getNews(
            @Query("country") String Country,
            @Query("pagesize")int pagesize,
            @Query("apikey") String apikey




    );
    @GET("top-headlines")
    Call<Mainnews>getNewscategory(
            @Query("country") String Country,
            @Query("category") String category,
            @Query("pagesize")int pagesize,
            @Query("apiKey") String apikey

    );


}

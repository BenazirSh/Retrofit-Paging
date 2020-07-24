package com.example.android.retrofit;

import org.w3c.dom.Comment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface JSONPlaceHolderApi {


    @GET("v2/list")
    Call<String> STRING_CALL(@Query("page") int page, @Query("limit") int limit);


}

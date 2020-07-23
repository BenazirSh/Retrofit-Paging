package com.example.android.retrofit;

import org.w3c.dom.Comment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface JSONPlaceHolderApi {
    @GET("list?page=0&limit=100")
    Call<List<Post>> getPosts();

}

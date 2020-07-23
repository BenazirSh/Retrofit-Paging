package com.example.android.retrofit;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int id;
    private String author;
    private String download_url;

    public Post(int id, String title, String download_url) {
        this.id = id;
        this.author = title;
        this.download_url = download_url;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }


    public String getDownload_url() {
        return download_url;
    }
}

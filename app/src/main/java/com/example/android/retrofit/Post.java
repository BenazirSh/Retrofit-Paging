package com.example.android.retrofit;

import com.google.gson.annotations.SerializedName;

public class Post {
    private String author;
    private String download_url;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }
}

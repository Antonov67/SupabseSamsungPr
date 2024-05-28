package com.example.samsungsupabase.model.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseSignUser {
    @SerializedName("access_token")
    @Expose
    private String accessToken;

    @SerializedName("user")
    @Expose
    private User user;

    public String getAccessToken() {
        return accessToken;
    }

    public User getUser() {
        return user;
    }
}



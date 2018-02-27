package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by muhtadi on 2/19/18.
 */

public class Thumbs {
    @SerializedName("url")
    private String url;

    public Thumbs(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

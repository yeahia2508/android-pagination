package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by muhtadi on 2/19/18.
 */

public class Pictures {
    @SerializedName("url")
    private String url;
    @SerializedName("thumb")
    private Thumbs thumb;

    public Pictures(String url, Thumbs thumb) {
        this.url = url;
        this.thumb = thumb;
    }

    public String getUrl() {
        return url;
    }

    public Thumbs getThumb() {
        return thumb;
    }

    public void setThumb(Thumbs thumb) {
        this.thumb = thumb;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}

package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by muhtadi on 2/19/18.
 */

public class DealType {
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;

    public DealType(String id,String title){
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


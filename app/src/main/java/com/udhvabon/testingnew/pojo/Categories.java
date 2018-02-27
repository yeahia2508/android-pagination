package com.udhvabon.testingnew.pojo;

/**
 * Created by muhtadi on 2/19/18.
 */

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Categories implements Serializable {
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("category_type")
    private String category_type;
    @SerializedName("picture")
    private Pictures picture;


    public Categories(String id, String title, String category_type, Pictures picture) {
        this.id = id;
        this.title = title;
        this.category_type = category_type;
        this.picture = picture;
    }

    public Pictures getPicture() {
        return picture;
    }

    public String getCategory_type() {
        return category_type;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPicture(Pictures picture) {
        this.picture = picture;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

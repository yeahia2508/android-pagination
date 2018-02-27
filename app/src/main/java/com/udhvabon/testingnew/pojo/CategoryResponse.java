package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by muhtadi on 2/19/18.
 */

public class CategoryResponse {
    @SerializedName("categories")
    private List<Categories> categories;

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }
}

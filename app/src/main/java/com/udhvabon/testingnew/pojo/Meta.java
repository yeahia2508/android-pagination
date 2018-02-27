package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by muhtadi on 2/23/18.
 */

public class Meta {
    @SerializedName("current_page")
    private int current_page;

    @SerializedName("next_page")
    private int next_page;

    @SerializedName("prev_page")
    private int prev_page;

    @SerializedName("per_page")
    private int per_page;

    @SerializedName("total_pages")
    private int total_pages;

    @SerializedName("total_count")
    private int total_count;

    public Meta(int current_page, int next_page, int prev_page, int per_page, int total_pages, int total_count) {
        this.current_page = current_page;
        this.next_page = next_page;
        this.per_page = per_page;
        this.prev_page = prev_page;
        this.total_count = total_count;
        this.total_pages = total_pages;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public int getNext_page() {
        return next_page;
    }

    public int getPer_page() {
        return per_page;
    }

    public int getPrev_page() {
        return prev_page;
    }

    public int getTotal_count() {
        return total_count;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public void setNext_page(int next_page) {
        this.next_page = next_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public void setPrev_page(int prev_page) {
        this.prev_page = prev_page;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

}

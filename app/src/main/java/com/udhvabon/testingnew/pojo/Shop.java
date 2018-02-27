package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by muhtadi on 2/19/18.
 */

public class Shop {
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("phone_number")
    private String phone_number;
    @SerializedName("website")
    private String website;
    @SerializedName("fb_page_link")
    private String fb_page_link;
    @SerializedName("activated")
    private Boolean isActivated;
    @SerializedName("picture")
    private Pictures picture;

    public Shop(String id, String title, String phone_number, String website, String fb_page_link, boolean isActivated, Pictures picture) {
        this.fb_page_link = fb_page_link;
        this.id = id;
        this.isActivated = isActivated;
        this.phone_number = phone_number;
        this.picture = picture;
        this.title = title;
        this.website = website;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getFb_page_link() {
        return fb_page_link;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public Boolean getActivated() {
        return isActivated;
    }

    public Pictures getPicture() {
        return picture;
    }

    public String getWebsite() {
        return website;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPicture(Pictures picture) {
        this.picture = picture;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setActivated(Boolean activated) {
        isActivated = activated;
    }

    public void setFb_page_link(String fb_page_link) {
        this.fb_page_link = fb_page_link;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


}

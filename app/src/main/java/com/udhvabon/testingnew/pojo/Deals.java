package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by muhtadi on 2/19/18.
 */

public class Deals {
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("phone_number")
    private String phone_number;
    @SerializedName("rating")
    private String rating;
    @SerializedName("picture")
    private Pictures picture;
    @SerializedName("start_date")
    private String start_date;
    @SerializedName("end_date")
    private String end_date;
    @SerializedName("shop")
    private Shop shop;
    @SerializedName("deal_type")
    private DealType dealType;

    @SerializedName("shop_locations")
    private List<ShopLocations> shop_locations;

    public Deals(String id, String title, String description, String phone_number, String rating, Pictures picture,
                 String start_date, String end_date,Shop shop,DealType dealType) {
        this.title = title;
        this.description = description;
        this.end_date = end_date;
        this.id = id;
        this.phone_number = phone_number;
        this.picture = picture;
        this.rating = rating;
        this.start_date = start_date;
        this.shop =shop;
        this.dealType = dealType;
    }

    public DealType getDealType() {
        return dealType;
    }

    public void setDealType(DealType dealType) {
        this.dealType = dealType;
    }

    public List<ShopLocations> getShop_locations() {
        return shop_locations;
    }

    public void setShop_locations(List<ShopLocations> shop_locations) {
        this.shop_locations = shop_locations;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Pictures getPicture() {
        return picture;
    }

    public String getDescription() {
        return description;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getRating() {
        return rating;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPicture(Pictures picture) {
        this.picture = picture;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}


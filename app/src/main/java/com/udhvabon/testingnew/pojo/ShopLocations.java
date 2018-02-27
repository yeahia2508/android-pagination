package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by muhtadi on 2/19/18.
 */

public class ShopLocations {
    @SerializedName("id")
    private String id;
    @SerializedName("address")
    private String address;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("phone_number")
    private String phone_number;
    @SerializedName("open")
    private Boolean isOpen;

    public ShopLocations(String id, String address, String latitude, String longitude, String phone_number, Boolean isOpen) {
        this.address = address;
        this.id = id;
        this.isOpen = isOpen;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phone_number = phone_number;
    }

    public String getId() {
        return id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public Boolean isOpen() {
        return isOpen;
    }

    public String getAddress() {
        return address;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }
}


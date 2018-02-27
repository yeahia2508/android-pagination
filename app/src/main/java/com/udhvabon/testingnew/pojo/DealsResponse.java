package com.udhvabon.testingnew.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by muhtadi on 2/19/18.
 */

public class DealsResponse {
    @SerializedName("deals")
    private List<Deals> deals;



    @SerializedName("meta")
    private Meta meta;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Deals> getDeals() {
        return deals;
    }

    public void setDeals(List<Deals> deals) {
        this.deals = deals;
    }


}

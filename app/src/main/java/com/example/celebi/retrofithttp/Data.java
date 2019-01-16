package com.example.celebi.retrofithttp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("items")
    @Expose
    private List<Items> items;

    @SerializedName("has_more")
    @Expose
    private boolean hasMore;

    @SerializedName("quota_max")
    @Expose
    private Integer quotaMax;

    @SerializedName("quota_remaining")
    @Expose
    private Integer quotaRemaining;

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }

    public void setQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public List<Items> getItems() {

        return items;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public Integer getQuotaMax() {
        return quotaMax;
    }

    public Integer getQuotaRemaining() {
        return quotaRemaining;
    }
}

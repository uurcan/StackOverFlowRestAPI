package com.example.celebi.retrofithttp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {
    @SerializedName("user_id")
    @Expose
    private Integer userId;

    @SerializedName("user_type")
    @Expose
    private String userType;

    @SerializedName("profile_image")
    @Expose
    private String profileImage;

    @SerializedName("display_name")
    @Expose
    private String displayName;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("accept_rate")
    @Expose
    private Integer acceptRate;

    @SerializedName("reputation")
    @Expose
    private Integer reputation;

    public Integer getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getLink() {
        return link;
    }

    public Integer getAcceptRate() {
        return acceptRate;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }
}


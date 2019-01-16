package com.example.celebi.retrofithttp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items {
    @SerializedName("owner")
    @Expose
    private Owner owner;

    @SerializedName("is_accepted")
    @Expose
    private boolean isAccepted;

    @SerializedName("score")
    @Expose
    private Integer score;

    @SerializedName("last_activity_date")
    @Expose
    private Integer lastActivityDate;

    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;

    @SerializedName("answer_id")
    @Expose
    private Integer answerId;

    @SerializedName("question_id")
    @Expose
    private Integer questionId;

    @SerializedName("last_edit_date")
    @Expose
    private Integer last_edit_date;

    public Owner getOwner() {
        return owner;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getLastActivityDate() {
        return lastActivityDate;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public Integer getLast_edit_date() {
        return last_edit_date;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public void setLast_edit_date(Integer last_edit_date) {
        this.last_edit_date = last_edit_date;
    }
}


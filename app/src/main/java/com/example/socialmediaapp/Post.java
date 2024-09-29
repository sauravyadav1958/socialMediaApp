package com.example.socialmediaapp;

import java.util.Date;
import java.util.List;

public class Post {

    private String pid;
    private String postText;
    private String createdBy;
    private Date createdAt;
    private List<String> likedBy;

    public Post(List<String> likedBy, Date createdAt, String createdBy, String postText) {
        this.likedBy = likedBy;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.postText = postText;
    }

    public String getPid() {
        return pid;
    }


    public List<String> getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(List<String> likedBy) {
        this.likedBy = likedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}

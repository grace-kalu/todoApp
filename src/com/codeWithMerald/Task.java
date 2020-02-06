package com.codeWithMerald;

import java.util.Date;

public class Task {
    private static int idCounter;
    private int id;
    private String title;
    private String description;
    private Status status;
    private Date createdAt;
    private Date updatedAt;
    private Date completedAt;

    public Task(String title, String description) {
        this.id = ++idCounter;
        this.title = title;
        this.description = description;
        this.status = new Status();
        this.createdAt = new Date();
        this.updatedAt = new Date();
        this.completedAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCompletedAt() {
        return this.completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }
}

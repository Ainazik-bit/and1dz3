package com.example.and1dz3.models;

public class TitleModel {

    private String title;
    private String description;

    public TitleModel() {
    }

    public TitleModel(String title, String description) {
        this.title = title;
        this.description = description;
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
}

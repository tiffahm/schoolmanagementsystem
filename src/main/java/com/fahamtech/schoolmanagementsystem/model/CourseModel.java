package com.fahamtech.schoolmanagementsystem.model;

public class CourseModel {
    private String  title;
    private String code;

    public CourseModel(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public CourseModel() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

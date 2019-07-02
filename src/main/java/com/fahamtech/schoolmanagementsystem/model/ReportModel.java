package com.fahamtech.schoolmanagementsystem.model;

public class ReportModel {
    private String code;
    private String title;
    private String grade;
    private String status;
    private String credit;

    public ReportModel(String code, String title, String grade, String status, String credit) {
        this.code = code;
        this.title = title;
        this.grade = grade;
        this.status = status;
        this.credit = credit;
    }

    public ReportModel() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}

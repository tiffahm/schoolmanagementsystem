package com.fahamtech.schoolmanagementsystem.model;

import java.util.Date;
import java.util.List;

public class StudentModel extends UserModel {
    private List<CourseModel> courses;
    private ReportModel report;
    private int yearOfStudy;
    private String role = "STUDENT";

    public StudentModel(String id, Date createdAt, Date updatedAt, String name, String regNumber, String email,
                        String password, List<CourseModel> courses, ReportModel report, int yearOfStudy) {
        super(id, createdAt, updatedAt, name, regNumber, email, password);
        this.courses = courses;
        this.report = report;
        this.yearOfStudy = yearOfStudy;
    }

    public StudentModel() {

    }

    public String getRole() {
        return role;
    }

    public List<CourseModel> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseModel> courses) {
        this.courses = courses;
    }

    public ReportModel getReport() {
        return report;
    }

    public void setReport(ReportModel report) {
        this.report = report;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}

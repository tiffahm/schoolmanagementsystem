package com.fahamtech.schoolmanagementsystem.model;

import java.util.Date;

public class InstructorModel extends UserModel {
    private String department;
    private String course;
    private String role = "INSTRUCTOR";

    public InstructorModel(String id, Date createdAt, Date updatedAt, String name, String regNumber, String email,
                           String password, String department, String course) {
        super(id, createdAt, updatedAt, name, regNumber, email, password);
        this.department = department;
        this.course = course;
    }

    public InstructorModel(){

    }

    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

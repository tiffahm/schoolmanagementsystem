package com.fahamtech.schoolmanagementsystem.model;

import java.util.Date;

public abstract class UserModel extends CommonModel {
    private String name;
    private String regNumber;
    private String email;
    private String password;

    public UserModel(String id, Date createdAt, Date updatedAt, String name, String regNumber, String email, String password) {
        super(id, createdAt, updatedAt);
        this.name = name;
        this.regNumber = regNumber;
        this.email = email;
        this.password = password;
    }

//    public UserModel(String name, String regNumber, String email, String password) {
//        this.name = name;
//        this.regNumber = regNumber;
//        this.email = email;
//        this.password = password;
//    }

    public UserModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

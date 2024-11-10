package com.jdbc.demo;

public class User {

    private String username;

    private String name;

    private String email_id;

    private int  phone;

    private String password;


    public User(String username, String name, String email_id, int phone, String password) {
        this.username = username;
        this.name = name;
        this.email_id = email_id;
        this.phone = phone;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


package com.example.nguyenhuuhoang_btvn160724;

public class Employee {
    private String id;
    private String fullName;
    private String gender;

    public Employee() {
    }

    public Employee(String id, String fullName, String gender) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

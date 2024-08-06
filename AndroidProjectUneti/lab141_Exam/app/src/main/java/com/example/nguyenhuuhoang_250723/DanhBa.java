package com.example.nguyenhuuhoang_250723;

public class DanhBa {
    private String name;
    private String phoneNumbers;

    public DanhBa() {
    }

    public DanhBa(String name, String phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return name + " - " + phoneNumbers;
    }
}

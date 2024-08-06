package com.example.nguyenhuuhoang_listview_base2;

public class Phone {
    private String name; // Tên
    private String phoneNumbers; // Số điện thoại

    public Phone() {
    }

    public Phone(String name, String phoneNumbers) {
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
}

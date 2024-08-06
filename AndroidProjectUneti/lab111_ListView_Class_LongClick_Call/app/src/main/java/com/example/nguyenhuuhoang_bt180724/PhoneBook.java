package com.example.nguyenhuuhoang_bt180724;

public class PhoneBook {
    private String fullName; // họ và tên
    private String phoneNumbers; // số điện thoại

    public PhoneBook() {
    }

    public PhoneBook(String fullName, String phoneNumbers) {
        this.fullName = fullName;
        this.phoneNumbers = phoneNumbers;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

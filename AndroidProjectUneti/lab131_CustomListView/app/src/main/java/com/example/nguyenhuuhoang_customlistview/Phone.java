package com.example.nguyenhuuhoang_customlistview;

public class Phone {
    private int phoneImage; // ảnh nằm trong res quản lý thông qua id
    private String phoneName;

    public Phone() {
    }

    public Phone(int phoneImage, String phoneName) {
        this.phoneImage = phoneImage;
        this.phoneName = phoneName;
    }

    public int getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(int phoneImage) {
        this.phoneImage = phoneImage;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
}

package com.example.nguyenhuuhoang_btvn210724;

public class Phone {
    private int imagePhone;
    private String phoneName;

    public Phone() {
    }

    public Phone(int imagePhone, String phoneName) {
        this.imagePhone = imagePhone;
        this.phoneName = phoneName;
    }

    public int getImagePhone() {
        return imagePhone;
    }

    public void setImagePhone(int imagePhone) {
        this.imagePhone = imagePhone;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
}

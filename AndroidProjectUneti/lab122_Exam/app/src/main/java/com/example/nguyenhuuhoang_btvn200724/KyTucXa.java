package com.example.nguyenhuuhoang_btvn200724;

public class KyTucXa {
    private String diaChi;

    public KyTucXa() {
    }

    public KyTucXa(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return diaChi;
    }
}

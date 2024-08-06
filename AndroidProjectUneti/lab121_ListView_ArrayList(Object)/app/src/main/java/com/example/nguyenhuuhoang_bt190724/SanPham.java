package com.example.nguyenhuuhoang_bt190724;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String donGia;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return maSanPham + "-" +tenSanPham + "-" + donGia;
    }
}

package com.example.nguyenhuuhoang_bt260724;

public class Music {
    private String tenBaiHat;
    private String tenCaSi;

    public Music() {
    }

    public Music(String tenBaiHat, String tenCaSi) {
        this.tenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    @Override
    public String toString() {
        return tenBaiHat + " - " + tenCaSi;
    }
}

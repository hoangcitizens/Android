package com.example.nguyenhuuhoang_dangnhap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThongTinDangNhap extends AppCompatActivity {
    TextView tvTenDangNhap, tvMatKhau;
    Button btnQuayLai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_thong_tin_dang_nhap);

        tvTenDangNhap = findViewById(R.id.tvTenDangNhap);
        tvMatKhau = findViewById(R.id.tvMatKhau);
        btnQuayLai = findViewById(R.id.btnQuayLai);

        Intent myintent = getIntent();
        // Lấy bundle ra khỏi intent
        Bundle mybundle = myintent.getBundleExtra("mypackage1");
        String a = mybundle.getString("tendangnhap1");
        String b = mybundle.getString("matkhau1");

        tvTenDangNhap.setText(a + "");
        tvMatKhau.setText(b + "");

        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
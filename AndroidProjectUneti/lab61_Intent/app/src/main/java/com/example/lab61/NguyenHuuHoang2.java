package com.example.lab61;

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

public class NguyenHuuHoang2 extends AppCompatActivity {
    TextView tvTenDangNhap, tvMatKhau, tvEmailSDT;
    Button btnTiep, btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang2);

        tvTenDangNhap = findViewById(R.id.tvTenDangNhap);
        tvMatKhau = findViewById(R.id.tvMatKhau);
        tvEmailSDT = findViewById(R.id.tvEmailSDT);
        btnTiep = findViewById(R.id.btnTiep);
        btnThoat = findViewById(R.id.btnThoat);

        Intent myintent = getIntent();
        // Lấy bundle ra khỏi intent
        Bundle mybundle = myintent.getBundleExtra("mypackage");
        String a = mybundle.getString("tendangnhap");
        String b = mybundle.getString("matkhau");
        String c = mybundle.getString("sdt");

        tvTenDangNhap.setText(a+"");
        tvMatKhau.setText(b+"");
        tvEmailSDT.setText(c+"");

        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
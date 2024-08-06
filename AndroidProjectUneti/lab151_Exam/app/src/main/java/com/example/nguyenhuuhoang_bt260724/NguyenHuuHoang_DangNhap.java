package com.example.nguyenhuuhoang_bt260724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NguyenHuuHoang_DangNhap extends AppCompatActivity {
    EditText edtTenDangNhap, edtMatKhau;
    Button btnDangNhap, btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_dang_nhap);

        edtTenDangNhap = findViewById(R.id.edtTenDangNhap);
        edtMatKhau = findViewById(R.id.edtMatKhau);
        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnThoat = findViewById(R.id.btnThoat);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtTenDangNhap.getText().toString().equals("DHTIN15") == true && edtMatKhau.getText().toString().equals("123456") == true)
                {
                    Intent myIntent = new Intent(NguyenHuuHoang_DangNhap.this, NguyenHuuHoang_BaiHat.class);
                    startActivity(myIntent);
                }
                else
                {
                    Toast.makeText(NguyenHuuHoang_DangNhap.this, "Bạn nhập sai tài khoản hoặc mật khẩu ! Vui lòng nhập lại !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}
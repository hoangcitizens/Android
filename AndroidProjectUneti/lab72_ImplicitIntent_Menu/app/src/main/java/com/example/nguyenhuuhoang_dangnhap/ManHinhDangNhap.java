package com.example.nguyenhuuhoang_dangnhap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ManHinhDangNhap extends AppCompatActivity {
    EditText edtTenDangNhap, edtMatKhau;
    Button btnDangNhap, btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_hinh_dang_nhap);

        edtTenDangNhap = findViewById(R.id.edtTenDangNhap);
        edtMatKhau = findViewById(R.id.edtMatKhau);
        btnThoat = findViewById(R.id.btnThoat);
        btnDangNhap = findViewById(R.id.btnDangNhap);

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtTenDangNhap.getText().toString();
                String password = edtMatKhau.getText().toString();
                if (username.equals("cnttk15") == true && password.equals("123456") == true) {
                    Toast.makeText(ManHinhDangNhap.this, "Đăng nhâp thành công", Toast.LENGTH_SHORT).show();
                    Intent myintent = new Intent(ManHinhDangNhap.this, ManHinhMenu.class);
                    Bundle mybundle = new Bundle();
                    mybundle.putString("tendangnhap", username);
                    mybundle.putString("matkhau", password);
                    // Đưa bundle vào intent để truyển đi
                    myintent.putExtra("mypackage", mybundle);
                    startActivity(myintent);
                } else {
                    Toast.makeText(ManHinhDangNhap.this, "Đăng nhập thất bại ! " +
                            "Vui lòng kiểm tra lại Tên đăng nhập hoặc mật khẩu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
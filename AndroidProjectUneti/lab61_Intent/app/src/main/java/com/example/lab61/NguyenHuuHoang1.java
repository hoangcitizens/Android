package com.example.lab61;

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

public class NguyenHuuHoang1 extends AppCompatActivity {
    EditText edtTenCuaBan, edtTenDangNhap, edtMatKhau, edtSDT;
    Button btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang1);
        edtTenCuaBan = findViewById(R.id.edtTenCuaBan);
        edtTenDangNhap = findViewById(R.id.edtTenDangNhap);
        edtMatKhau = findViewById(R.id.edtMatKhau);
        edtSDT = findViewById(R.id.edtSDT);
        btnDangKy = findViewById(R.id.btnDangKy);

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenCuaBan = edtTenCuaBan.getText().toString();
                String tenDangNhap = edtTenDangNhap.getText().toString();
                String matKhau = edtMatKhau.getText().toString();
                String sdt = edtSDT.getText().toString();
                if (tenCuaBan.isEmpty() || tenDangNhap.isEmpty() || matKhau.isEmpty() || sdt.isEmpty())
                {
                    Toast.makeText(NguyenHuuHoang1.this, "Nhập lại ! Vui lòng nhập đủ thông tin !", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent myintent = new Intent(NguyenHuuHoang1.this,NguyenHuuHoang2.class);
                    Bundle mybundle = new Bundle();
                    mybundle.putString("tencuaban",tenCuaBan);
                    mybundle.putString("tendangnhap", tenDangNhap);
                    mybundle.putString("matkhau", matKhau);
                    mybundle.putString("sdt", sdt);

                    // Đưa bundle vào intent để truyển đi
                    myintent.putExtra("mypackage",mybundle);
                    // gọi Intent
                    startActivity(myintent);
                }
            }
        });
    }
}
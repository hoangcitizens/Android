package com.example.nguyenhuuhoang_bt120724;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChiTietSanPham extends AppCompatActivity {
    EditText edtMaSanPham, edtTenSanPham, edtDonGia;
    Button btnBack, btnXoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chi_tiet_san_pham);

        // Hiển thị thông tin sản phẩm
        edtMaSanPham = findViewById(R.id.edtMaSanPham);
        edtTenSanPham = findViewById(R.id.edtTenSanPham);
        edtDonGia = findViewById(R.id.edtDonGia);
        btnBack = findViewById(R.id.btnBack);

        String maSanPham = getIntent().getStringExtra("MaSanPham");
        String tenSanPham = getIntent().getStringExtra("TenSanPham");
        String giaBan = getIntent().getStringExtra("GiaBan");

        edtMaSanPham.setText(maSanPham);
        edtTenSanPham.setText(tenSanPham);
        edtDonGia.setText(giaBan);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
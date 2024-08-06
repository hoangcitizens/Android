package com.example.nguyenhuuhoang_bt190724;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NguyenHuuHoang_CTSP extends AppCompatActivity {
    EditText edtMaSanPham, edtTenSanPham, edtDonGia;
    Button btnXoa, btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_ctsp);

        edtMaSanPham = findViewById(R.id.edtMaSanPham);
        edtTenSanPham = findViewById(R.id.edtTenSanPham);
        edtDonGia = findViewById(R.id.edtDonGia);
        btnXoa = findViewById(R.id.btnXoa);
        btnBack = findViewById(R.id.btnBack);

        String masanpham = getIntent().getStringExtra("masanpham");
        String tensanpham = getIntent().getStringExtra("tensanpham");
        String dongia = getIntent().getStringExtra("dongia");

        edtMaSanPham.setText(masanpham);
        edtTenSanPham.setText(tensanpham);
        edtDonGia.setText(dongia);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
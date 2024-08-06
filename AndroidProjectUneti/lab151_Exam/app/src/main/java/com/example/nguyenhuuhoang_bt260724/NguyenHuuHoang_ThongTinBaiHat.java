package com.example.nguyenhuuhoang_bt260724;

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

public class NguyenHuuHoang_ThongTinBaiHat extends AppCompatActivity {
    TextView tvTenBaiHat, tvTenCaSi;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_thong_tin_bai_hat);

        tvTenBaiHat = findViewById(R.id.tvTenBaiHat);
        tvTenCaSi = findViewById(R.id.tvTenCaSi);
        btnBack = findViewById(R.id.btnBack);

        Intent myIntent = getIntent();
        String baihat = myIntent.getStringExtra("tenbaihat");
        String casi = myIntent.getStringExtra("tencasi");
        tvTenBaiHat.setText(baihat);
        tvTenCaSi.setText(casi);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
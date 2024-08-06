package com.example.lab5;

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
    TextView tvHoTen, tvCMND, tvBangCap, tvSoThich, tvBoSung;
    Button btnTiep, btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang2);

        tvHoTen = findViewById(R.id.tvHoTen);
        tvCMND = findViewById(R.id.tvCMND);
        tvBangCap = findViewById(R.id.tvBangCap);
        tvSoThich = findViewById(R.id.tvSoThich);
        tvBoSung = findViewById(R.id.tvBoSung);
        btnTiep = findViewById(R.id.btnTiep);
        btnThoat = findViewById(R.id.btnThoat);

        Intent myintent = getIntent();
        // Lấy bundle ra khỏi intent
        Bundle mybundle = myintent.getBundleExtra("mypackage");
        String a = mybundle.getString("hoten");
        String b = mybundle.getString("cmnd");
        String c = mybundle.getString("bangcap");
        String d = mybundle.getString("sothich");
        String e = mybundle.getString("dabong");

        tvHoTen.setText(a+"");
        tvCMND.setText(b+"");
        tvBangCap.setText(c+"");
        tvSoThich.setText(d+"");
        tvBoSung.setText(e+"");
        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
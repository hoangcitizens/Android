package com.example.nguyenhuuhoang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NguyenHuuHoang1 extends AppCompatActivity {
    Button btnPhone, btnSMS, btnBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang1);

        btnPhone = findViewById(R.id.btnPhone);
        btnSMS = findViewById(R.id.btnSMS);
        btnBrowser = findViewById(R.id.btnBrowser);

        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(NguyenHuuHoang1.this, NguyenHuuHoang2.class);
                startActivity(myintent);
            }
        });
        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(NguyenHuuHoang1.this, NguyenHuuHoang3.class);
                startActivity(myintent);
            }
        });
        btnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(NguyenHuuHoang1.this, NguyenHuuHoang4.class);
                startActivity(myintent);
            }
        });

    }
}
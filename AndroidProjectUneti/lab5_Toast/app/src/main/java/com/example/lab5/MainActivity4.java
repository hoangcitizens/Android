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

public class MainActivity4 extends AppCompatActivity {
    // Khai báo các biến giao diện
    TextView edtKQ;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        edtKQ = findViewById(R.id.edtKQ);
        btnBack = findViewById(R.id.btnBack);

        // Nhận intent được gửi từ trang MainActivity3
        Intent myintent = getIntent();
        // Lấy bundle ra khỏi intent
        Bundle mybundle = myintent.getBundleExtra("mypackage");

        // Lấy dữ liệu ra khỏi bundle
        int a = mybundle.getInt("soA");
        int b = mybundle.getInt("soB");

        // Tính tổng
        int tong = a + b;
        // Hiển thị tổng lên textview
        edtKQ.setText(tong + "");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
package com.example.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button btnCon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        btnCon = findViewById(R.id.btnCon);
        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cách 1: dùng intent
//                Intent myintent = new Intent(MainActivity2.this, MainActivity.class);
//                // Khởi động intent
//                startActivity(myintent);
                // Cách 2: dùng finish ( tắt màn hình đang chạy về màn hình trước)
                finish();
            }
        });
    }
}
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

public class MainActivity extends AppCompatActivity {
    Button btnCha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnCha = findViewById(R.id.btnCha);
        btnCha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Khai báo intent
                Intent myintent = new Intent(MainActivity.this, MainActivity2.class);
                // Khởi động intent
                startActivity(myintent);
            }
        });

    }
}
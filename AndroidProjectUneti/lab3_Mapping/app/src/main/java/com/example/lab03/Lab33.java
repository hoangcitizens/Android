package com.example.lab03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab33 extends AppCompatActivity {
    EditText edtA, edtB, edtKQ;
    Button btnGiai, btnTiep, btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab33);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtKQ);
        btnGiai = findViewById(R.id.btnGiai);
        btnTiep = findViewById(R.id.btnTiep);
        btnThoat = findViewById(R.id.btnThoat);

        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(edtA.getText().toString());
                double b = Double.parseDouble(edtB.getText().toString());

                if (a == 0) {
                    if (b == 0) {
                        edtKQ.setText("Phương trình vô số nghiệm");
                    }
                    else {
                        edtKQ.setText("Phương trình vô nghiệm");
                    }
                }
                else {
                    double x = -b / a;
                    edtKQ.setText("Phương trình có 1 nghiệm x = " + x);
                }
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}
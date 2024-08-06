package com.example.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    EditText edtA, edtB;
    Button btnKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        btnKQ = findViewById(R.id.btnKQ);

        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu được nhập vào từ các ô edit text
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                // Khai báo Intent
                Intent myintent = new Intent(MainActivity3.this,MainActivity4.class);
                // Tạo bundle để đóng gói dữ liệu trước khi truyển đi
                Bundle mybundle = new Bundle();
                // Đưa dữ liệu cần truyền đi vào bundle
                mybundle.putInt("soA",a);
                mybundle.putInt("soB",b);
                // Đưa bundle vào intent để truyển đi
                myintent.putExtra("mypackage",mybundle);
                // gọi Intent
                startActivity(myintent);


            }
        });

    }
}
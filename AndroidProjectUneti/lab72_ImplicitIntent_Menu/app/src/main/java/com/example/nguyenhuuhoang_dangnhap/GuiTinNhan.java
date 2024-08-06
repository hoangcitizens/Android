package com.example.nguyenhuuhoang_dangnhap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GuiTinNhan extends AppCompatActivity {
    EditText edtSMS;
    ImageButton imageButton;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gui_tin_nhan);

        edtSMS = findViewById(R.id.edtSMS);
        imageButton = findViewById(R.id.imageButton);
        btnBack = findViewById(R.id.btnBack);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto: " + edtSMS.getText().toString()));
                startActivity(myintent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
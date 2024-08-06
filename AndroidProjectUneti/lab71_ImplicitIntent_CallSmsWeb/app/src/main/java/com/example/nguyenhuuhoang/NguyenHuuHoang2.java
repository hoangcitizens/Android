package com.example.nguyenhuuhoang;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class NguyenHuuHoang2 extends AppCompatActivity {
    EditText edtCall;
    ImageButton imageButton3;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang2);

        edtCall = findViewById(R.id.edtCall);
        imageButton3 = findViewById(R.id.imageButton3);
        btnBack = findViewById(R.id.btnBack);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: " + edtCall.getText().toString()));
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
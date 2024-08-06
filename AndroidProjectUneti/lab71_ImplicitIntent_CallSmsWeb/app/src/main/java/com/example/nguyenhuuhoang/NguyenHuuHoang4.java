package com.example.nguyenhuuhoang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NguyenHuuHoang4 extends AppCompatActivity {
    EditText edtWeb;
    ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang4);

        edtWeb = findViewById(R.id.edtWeb);
        imageButton2 = findViewById(R.id.imageButton2);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + edtWeb.getText().toString()));
                startActivity(myintent);
            }
        });
    }
}
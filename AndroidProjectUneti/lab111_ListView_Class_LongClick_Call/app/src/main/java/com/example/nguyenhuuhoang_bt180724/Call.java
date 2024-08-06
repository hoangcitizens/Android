package com.example.nguyenhuuhoang_bt180724;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Call extends AppCompatActivity {
    TextView tvFullName, tvPhoneNumbers;
    ImageButton ibCall, ibSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_call);

        tvFullName = findViewById(R.id.tvFullName);
        tvPhoneNumbers = findViewById(R.id.tvPhoneNumbers);
        ibCall = findViewById(R.id.ibCall);
        ibSms = findViewById(R.id.ibSms);

        String hoten = getIntent().getStringExtra("fullName");
        String sdt = getIntent().getStringExtra("phoneNumbers");

        tvFullName.setText(hoten);
        tvPhoneNumbers.setText(sdt);
        ibCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: " + tvPhoneNumbers.getText().toString()));
//                if (ActivityCompat.checkSelfPermission(Call.this,
//                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(Call.this, new
//                            String[]{android.Manifest.permission.CALL_PHONE}, 1);
//                    return;
//                }
                    startActivity(myintent);
            }
        });
        ibSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto: " + tvPhoneNumbers.getText().toString()));
                startActivity(myintent);
            }
        });
    }
}
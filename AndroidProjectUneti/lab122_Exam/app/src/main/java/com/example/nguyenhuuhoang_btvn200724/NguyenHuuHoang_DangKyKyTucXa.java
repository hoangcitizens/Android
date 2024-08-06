package com.example.nguyenhuuhoang_btvn200724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NguyenHuuHoang_DangKyKyTucXa extends AppCompatActivity {
    RadioButton rab1giuong, rab2giuong, rab3giuong, rab4giuong;
    CheckBox cbBaiDoXe, cbWifi;
    Button btnChoose, btnExit, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_dang_ky_ky_tuc_xa);

        rab1giuong = findViewById(R.id.rab1giuong);
        rab2giuong = findViewById(R.id.rab2giuong);
        rab3giuong = findViewById(R.id.rab3giuong);
        rab4giuong = findViewById(R.id.rab4giuong);
        cbBaiDoXe = findViewById(R.id.cbBaiDoXe);
        cbWifi = findViewById(R.id.cbWifi);
        btnChoose = findViewById(R.id.btnChoose);
        btnExit = findViewById(R.id.btnExit);
        btnNext = findViewById(R.id.btnNext);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rab1giuong.isChecked() == true) {
                    if (cbBaiDoXe.isChecked() == true && cbWifi.isChecked() == true) {
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab1giuong.getText() + " dịch vụ " + cbBaiDoXe.getText() + " và " + cbWifi.getText(), Toast.LENGTH_SHORT).show();
                    } else if (cbBaiDoXe.isChecked() == true)
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab1giuong.getText() + " dịch vụ " + cbBaiDoXe.getText(), Toast.LENGTH_SHORT).show();
                    else if (cbWifi.isChecked() == true) {
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab1giuong.getText() + " dịch vụ " + cbWifi.getText(), Toast.LENGTH_SHORT).show();
                    }
                } else if (rab2giuong.isChecked() == true) {
                    if (cbBaiDoXe.isChecked() == true && cbWifi.isChecked() == true) {
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab2giuong.getText() + " dịch vụ " + cbBaiDoXe.getText() + " và " + cbWifi.getText(), Toast.LENGTH_SHORT).show();
                    } else if (cbBaiDoXe.isChecked() == true)
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab2giuong.getText() + " dịch vụ " + cbBaiDoXe.getText(), Toast.LENGTH_SHORT).show();
                    else if (cbWifi.isChecked() == true) {
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab2giuong.getText() + " dịch vụ " + cbWifi.getText(), Toast.LENGTH_SHORT).show();
                    }
                } else if (rab3giuong.isChecked() == true) {
                    if (cbBaiDoXe.isChecked() == true && cbWifi.isChecked() == true) {
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab3giuong.getText() + " dịch vụ " + cbBaiDoXe.getText() + " và " + cbWifi.getText(), Toast.LENGTH_SHORT).show();
                    } else if (cbBaiDoXe.isChecked() == true)
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab3giuong.getText() + " dịch vụ " + cbBaiDoXe.getText(), Toast.LENGTH_SHORT).show();
                    else if (cbWifi.isChecked() == true) {
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab3giuong.getText() + " dịch vụ " + cbWifi.getText(), Toast.LENGTH_SHORT).show();
                    }
                } else if (rab4giuong.isChecked() == true) {
                    if (cbBaiDoXe.isChecked() == true && cbWifi.isChecked() == true) {
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab4giuong.getText() + " dịch vụ " + cbBaiDoXe.getText() + " và " + cbWifi.getText(), Toast.LENGTH_SHORT).show();
                    } else if (cbBaiDoXe.isChecked() == true)
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab4giuong.getText() + " dịch vụ " + cbBaiDoXe.getText(), Toast.LENGTH_SHORT).show();
                    else if (cbWifi.isChecked() == true) {
                        Toast.makeText(NguyenHuuHoang_DangKyKyTucXa.this, "Bạn đang chọn loại " + rab4giuong.getText() + " dịch vụ " + cbWifi.getText(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(NguyenHuuHoang_DangKyKyTucXa.this, NguyenHuuHoang_CoSoKyTucXa.class);
                startActivity(myIntent);
            }
        });
    }
}
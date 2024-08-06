package com.example.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NguyenHuuHoang1 extends AppCompatActivity {
    EditText edtHoTen, edtCMND;
    RadioButton rbTrungCap, rbCaoDang, rbDaiHoc;
    CheckBox cbDocSach, cbDocBao, cbCoding;
    Button btnGui;
    TextView dabong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang1);

        edtHoTen = findViewById(R.id.edtHoTen);
        edtCMND = findViewById(R.id.edtCMND);
        rbTrungCap = findViewById(R.id.rabTrungCap);
        rbCaoDang = findViewById(R.id.rabCaoDang);
        rbDaiHoc = findViewById(R.id.rabDaiHoc);
        cbDocSach = findViewById(R.id.cbDocSach);
        cbDocBao = findViewById(R.id.cbDocBao);
        cbCoding = findViewById(R.id.cbCoding);
        btnGui = findViewById(R.id.btnGui);
        dabong = findViewById(R.id.textView23);

        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoTen = edtHoTen.getText().toString();
                String cmnd = edtCMND.getText().toString();
                boolean isTrungCap = rbTrungCap.isChecked();
                boolean isCaoDang = rbCaoDang.isChecked();
                boolean isDaiHoc = rbDaiHoc.isChecked();
                boolean isDocSach = cbDocSach.isChecked();
                boolean isDocBao = cbDocBao.isChecked();
                boolean isCoding = cbCoding.isChecked();

                String bangcap = "";
                if (isTrungCap) {
                    bangcap = "Trung cấp";
                } else if (isCaoDang) {
                    bangcap = "Cao Đẳng";
                } else if (isDaiHoc) {
                    bangcap = "Đại học";
                }

                String sothich = "";
                if (isDocSach && isDocBao && isCoding) {
                    sothich = "Đọc sách-Đọc báo-Coding";
                } else if (isDocSach && isDocBao) {
                    sothich = "Đọc sách-Đọc báo";
                } else if (isDocSach && isCoding) {
                    sothich = "Đọc sách-Coding";
                } else if (isDocBao && isCoding) {
                    sothich = "Đọc báo-Coding";
                } else if (isDocSach) {
                    sothich = "Đọc sách";
                } else if (isDocBao) {
                    sothich = "Đọc báo";
                } else if (isCoding) {
                    sothich = "Coding";
                }
                String daBong = dabong.getText().toString();

                if (hoTen.isEmpty() && cmnd.isEmpty() && !isTrungCap && !isCaoDang && !isDaiHoc && !isDocSach && !isDocBao && !isCoding) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin hộ tên, cmnd, chọn trình độ học vấn, chọn ít nhất 1 Sở thích", Toast.LENGTH_SHORT).show();
                } else if (cmnd.isEmpty() && !isTrungCap && !isCaoDang && !isDaiHoc && !isDocSach && !isDocBao && !isCoding) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin cmnd, chọn trình độ học vấn, chọn ít nhất 1 Sở thích", Toast.LENGTH_SHORT).show();
                } else if (hoTen.isEmpty() && !isTrungCap && !isCaoDang && !isDaiHoc && !isDocSach && !isDocBao && !isCoding) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin họ tên, chọn trình độ học vấn, chọn ít nhất 1 Sở thích", Toast.LENGTH_SHORT).show();
                } else if (!isTrungCap && !isCaoDang && !isDaiHoc && !isDocSach && !isDocBao && !isCoding) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng chọn trình độ học vấn và chọn ít nhất 1 Sở thích", Toast.LENGTH_SHORT).show();
                } else if (hoTen.isEmpty() && !isTrungCap && !isCaoDang && !isDaiHoc) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin hộ tên và chọn trình độ học vấn", Toast.LENGTH_SHORT).show();
                } else if (hoTen.isEmpty() && !isDocSach && !isDocBao && !isCoding) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin hộ tên và chọn ít nhất 1 sở thích", Toast.LENGTH_SHORT).show();
                } else if (cmnd.isEmpty() && !isTrungCap && !isCaoDang && !isDaiHoc) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin cmnd và chọn trình độ học vấn", Toast.LENGTH_SHORT).show();
                } else if (cmnd.isEmpty() && !isDocSach && !isDocBao && !isCoding) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin cmnd và chọn ít nhất 1 sở thích", Toast.LENGTH_SHORT).show();
                } else if (hoTen.isEmpty() && cmnd.isEmpty()) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin hộ tên và cmnd", Toast.LENGTH_SHORT).show();
                } else if (hoTen.isEmpty()) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin họ tên", Toast.LENGTH_SHORT).show();
                } else if (cmnd.isEmpty()) {
                    Toast.makeText(NguyenHuuHoang1.this, "Vui lòng nhập thông tin cmnd", Toast.LENGTH_SHORT).show();
                } else if (!isTrungCap && !isCaoDang && !isDaiHoc) {
                    Toast.makeText(getApplicationContext(), "Vui lòng chọn Trình độ học vấn", Toast.LENGTH_SHORT).show();
                } else if (!isDocSach && !isDocBao && !isCoding) {
                    Toast.makeText(getApplicationContext(), "Vui lòng chọn ít nhất 1 Sở thích", Toast.LENGTH_SHORT).show();
                } else {
                    Intent myintent = new Intent(NguyenHuuHoang1.this, NguyenHuuHoang2.class);
                    Bundle mybundle = new Bundle();
                    mybundle.putString("hoten",hoTen);
                    mybundle.putString("cmnd",cmnd);
                    mybundle.putString("bangcap", bangcap);
                    mybundle.putString("sothich", sothich);
                    mybundle.putString("dabong", daBong);
                    // Đưa bundle vào intent để truyển đi
                    myintent.putExtra("mypackage",mybundle);
                    // gọi Intent
                    startActivity(myintent);
                }
            }
        });
    }
}
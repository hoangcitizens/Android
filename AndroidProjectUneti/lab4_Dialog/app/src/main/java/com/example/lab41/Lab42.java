package com.example.lab41;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab42 extends AppCompatActivity {
    EditText edtTenCuaBan, edtTenDangNhap, edtMatKhau, edtSDT;
    Button btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab42);

        edtTenCuaBan = findViewById(R.id.edtTenCuaBan);
        edtTenDangNhap = findViewById(R.id.edtTenDangNhap);
        edtMatKhau = findViewById(R.id.edtMatKhau);
        edtSDT = findViewById(R.id.edtSDT);
        btnDangKy = findViewById(R.id.btnDangKy);

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenCuaBan = edtTenCuaBan.getText().toString();
                String tenDangNhap = edtTenDangNhap.getText().toString();
                String matKhau = edtMatKhau.getText().toString();
                String SDT = edtSDT.getText().toString();
                if (tenCuaBan.equals("") || tenDangNhap.equals("") || matKhau.equals("") || SDT.equals(""))
                {
                    Toast.makeText(Lab42.this, "Nhập lại ! Vui lòng nhập đủ thông tin !", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Lab42.this, "Tên của bạn là: " + tenCuaBan + "Tên đăng nhập là: " + tenDangNhap + "Mật khẩu là: " + matKhau + "SDT là " + SDT, Toast.LENGTH_SHORT).show();
                }
                // Tạo Dialog
                AlertDialog.Builder dialog = new AlertDialog.Builder(Lab42.this);
                // Đặt tên tiêu đề Dialog
                dialog.setTitle("THÔNG TIN TÀI KHOẢN");
                // Hiển thị nội dung của Dialog
                dialog.setMessage("Tên của bạn là: " + tenCuaBan + "\nTên đăng nhập là: " + tenDangNhap + "\nMật khẩu là: " + matKhau + "\nSDT là: " + SDT);
                // Tạo nút đóng
                dialog.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                dialog.create().show();
            }
        });
    }
}
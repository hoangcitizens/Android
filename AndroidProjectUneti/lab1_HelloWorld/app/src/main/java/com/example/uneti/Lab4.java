package com.example.uneti;

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

public class Lab4 extends AppCompatActivity {
    EditText edtTen;
    Button btnHienThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab4);
        edtTen = findViewById(R.id.edtTen);
        btnHienThi = findViewById(R.id.btnHienThi);

        btnHienThi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = edtTen.getText().toString();
                Toast.makeText(Lab4.this, "Tên vừa nhập là: " + ten, Toast.LENGTH_SHORT).show();
                // Tạo Dialog
                AlertDialog.Builder dialog = new AlertDialog.Builder(Lab4.this);
                // tạo tiêu đề cho Dialog
                dialog.setTitle("THÔNG TIN SINH VIÊN");
                // Hiển thị nội dung của Dialog
                dialog.setMessage("Tên sinh viên vừa nhập là: " + ten);
                // Tạo nút đóng
                dialog.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                // Hiển thị dialog
                dialog.create().show();
            }
        });
    }
}
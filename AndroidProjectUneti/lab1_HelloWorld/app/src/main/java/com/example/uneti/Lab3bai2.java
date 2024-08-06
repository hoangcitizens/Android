package com.example.uneti;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab3bai2 extends AppCompatActivity {
    // Khai báo các biến giao diện
    EditText edtA, edtB, edtKQ;
    Button btnTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab3bai2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Ánh xạ các biến giao diện chương trình
        edtA = findViewById(R.id.edtA); // biến R lưu trữ toàn bộ các biến chương trình
        edtB = findViewById(R.id.edtB); // edtB trước là biến giao diện, sau là biến id
        edtKQ = findViewById(R.id.edtKQ);
        btnTong = findViewById(R.id.btnTong);

        // Xử lý sự kiện khi người dùng kích chuột vào nút tính tổng
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu được nhập từ các EditText
                int a = Integer.parseInt((edtA.getText().toString()));
                int b = Integer.parseInt(edtB.getText().toString());
                int kq = a + b;
                // Hiển thị kết quả
                edtKQ.setText(kq + " Nguyễn Hữu Hoàng");

            }
        });

    }
}
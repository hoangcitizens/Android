package com.example.nguyenhuuhoang1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    EditText edtHoTen, edtThangTruoc, edtThangNay, edtThanhTien;
    Button btnTinhTien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        edtHoTen = findViewById(R.id.edtHoTen);
        edtThangTruoc = findViewById(R.id.edtThangTruoc);
        edtThangNay = findViewById(R.id.edtThangNay);
        edtThanhTien = findViewById(R.id.edtThanhTien);
        btnTinhTien = findViewById(R.id.btnTinhTien);

        btnTinhTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thangtruoc = Integer.parseInt((edtThangTruoc.getText().toString()));
                int thangnay = Integer.parseInt(edtThangNay.getText().toString());

                if (thangnay <= thangtruoc) {
                    edtThanhTien.setText("Tháng này không được nhỏ hơn tháng trước!");
                } else {
                    double tienDien = (double) (thangnay - thangtruoc) * 2500;
                    double thue = tienDien * 0.1;
                    double thanhtien = tienDien + thue;
                    edtThanhTien.setText(thanhtien+" ");
                }
            }
        });
    }
}
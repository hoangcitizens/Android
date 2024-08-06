package com.example.nguyenhuuhoang_btvn120724;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class QuanLySoDienThoai extends AppCompatActivity {
    EditText edtSDT;
    Button btnThem, btnGoiDien, btnTiep;
    ListView lvSDT;
    // Khai báo ArrayList lưu danh sách các sdt
    ArrayList<String> danhSachSDT;
    // Khai báo ArrayAdapter
    ArrayAdapter adapterSDT;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quan_ly_so_dien_thoai);

        // Ánh xạ các id vào các biến giao diện
        edtSDT = findViewById(R.id.edtSDT);
        btnThem = findViewById(R.id.btnThem);
        btnGoiDien = findViewById(R.id.btnGoiDien);
        btnTiep = findViewById(R.id.btnTiep);
        lvSDT = findViewById(R.id.lvSDT);

        // Tạo ArrayList và thêm các phần tử vào ArrayList
        danhSachSDT = new ArrayList<>();
        danhSachSDT.add("0366898984");
        danhSachSDT.add("0344965742");
        danhSachSDT.add("0985432762");
        // Tạo ArrayAdapter và thực hiện gán ArrayList lên ArrayAdapter
        adapterSDT = new ArrayAdapter<>(QuanLySoDienThoai.this, android.R.layout.simple_list_item_1,danhSachSDT);
        // Gán ArrayAdapter lên ListView
        lvSDT.setAdapter(adapterSDT);

        // Viết sự kiện kick chuột vào một đối tượng trên ListView
        lvSDT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy sdt được chọn trên ListView
                String sdt = danhSachSDT.get(i);
                // Lấy vị trí sdt bạn vừa chọn
                index = i;
                // Gán sdt lên EditText
                edtSDT.setText(sdt);
            }
        });

        // Viết sự kiện kick chuột sự kiện nút thêm
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy sdt nhập từ EditText
                String sdt = edtSDT.getText().toString();
                // Đưa sdt vừa nhập vào ArrayList
                danhSachSDT.add(sdt);
                // Cập nhật lại ArrayAdapter
                adapterSDT.notifyDataSetChanged();
            }
        });
        // Viết sự kiện kick chuột sự kiện nút gọi điện
        btnGoiDien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callintent = new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:"+edtSDT.getText().toString()));
                // Yêu cầu người dùng đồng ý quyền truy cập vào tính năng gọi điện
                if (ActivityCompat.checkSelfPermission(QuanLySoDienThoai.this,
                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(QuanLySoDienThoai.this, new
                            String[]{android.Manifest.permission.CALL_PHONE},1);
                    return;
                }
                startActivity(callintent);

            }
        });
        // Viết sự kiện kick chuột sự kiện nút tiếp
        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
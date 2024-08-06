package com.example.nguyenhuuhoang_bt190724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class NguyenHuuHoang_DSSP extends AppCompatActivity {
    ListView lv;
    Button btnChiTiet, btnThoat, btnThem, btnSua, btnXoa;
    ArrayList <SanPham> arrayListSanPham;
    ArrayAdapter arrayAdapterSanPham;
    EditText edtMaSP, edtTenSP, edtDG;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_dssp);

        lv = findViewById(R.id.lv);
        edtMaSP = findViewById(R.id.edtMaSP);
        edtTenSP = findViewById(R.id.edtTenSP);
        edtDG = findViewById(R.id.edtDG);
        btnChiTiet = findViewById(R.id.btnChiTiet);
        btnThoat = findViewById(R.id.btnThoat);
        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnXoaa);

        // Tạo ArrayList và thêm các phần tử vào ArrayList
        arrayListSanPham = new ArrayList<>();
        // Tạo các đối tươợng thuộc lớp SanPham
        SanPham sp1 = new SanPham("VT001","Vertu Constellation","100000");
        SanPham sp2 = new SanPham("SS002","SamSung S24","200000");
        SanPham sp3 = new SanPham("IP003","Iphone 15","300000");
        SanPham sp4 = new SanPham("RD004","Redmi Note 13","150000");
        // Thêm các phần tử vào ArrayList
        arrayListSanPham.add(sp1);
        arrayListSanPham.add(sp2);
        arrayListSanPham.add(sp3);
        arrayListSanPham.add(sp4);
        // Tạo ArrayAdapter và gắn ArrayList lên ArrayAdapter
        arrayAdapterSanPham = new ArrayAdapter<>(NguyenHuuHoang_DSSP.this, android.R.layout.simple_list_item_1,arrayListSanPham);
        // Đưa ArrayAdapter lên ListView
        lv.setAdapter(arrayAdapterSanPham);
        // Viết lút  kiên kích chuột vào ListView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy vị trí của phần tử được chon
                index = i;
                // Trả về phần tử được chọn
                Toast.makeText(NguyenHuuHoang_DSSP.this, "Sản phẩm đang chọn " + arrayListSanPham.get(i).getMaSanPham() + "-" + arrayListSanPham.get(i).getTenSanPham() + "-" + arrayListSanPham.get(i).getDonGia(), Toast.LENGTH_SHORT).show();
            }
        });
        btnChiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ ListView
                SanPham sp = arrayListSanPham.get(index);
                Intent myIntent = new Intent(NguyenHuuHoang_DSSP.this,NguyenHuuHoang_CTSP.class);
                myIntent.putExtra("masanpham", sp.getMaSanPham());
                myIntent.putExtra("tensanpham", sp.getTenSanPham());
                myIntent.putExtra("dongia", sp.getDonGia());
                startActivity(myIntent);
            }
        });
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SanPham sp = new SanPham(edtMaSP.getText().toString(),edtTenSP.getText().toString(),edtDG.getText().toString());
                arrayListSanPham.add(sp);
                arrayAdapterSanPham.notifyDataSetChanged();
            }
        });
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SanPham sp = new SanPham(edtMaSP.getText().toString(),edtTenSP.getText().toString(),edtDG.getText().toString());
                arrayListSanPham.set(index,sp);
                arrayAdapterSanPham.notifyDataSetChanged();
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListSanPham.remove(arrayListSanPham.get(index));
                arrayAdapterSanPham.notifyDataSetChanged();
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}
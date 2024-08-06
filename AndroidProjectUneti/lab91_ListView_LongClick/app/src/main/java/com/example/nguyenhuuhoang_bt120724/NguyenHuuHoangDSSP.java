package com.example.nguyenhuuhoang_bt120724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class NguyenHuuHoangDSSP extends AppCompatActivity {
    // Khai báo biến
    ListView lvSanPham;
    // Khai báo ArrayList lưu danh sách sản phẩm
    ArrayList<String> danhSachSanPham;
    // Khai báo ArrayAdapter
    ArrayAdapter adapterSanPham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_dssp);

        // Ánh xạ các id vào các biến giao diện
        lvSanPham = findViewById(R.id.lvSanPham);
        // Tạo ArrayList và thêm các phần tử vào ArrayList
        danhSachSanPham = new ArrayList<>();
        danhSachSanPham.add("Vertu Constellation");
        danhSachSanPham.add("IPhone");
        danhSachSanPham.add("Nokia Lumia 925");
        danhSachSanPham.add("SamSung Galaxy S4");
        danhSachSanPham.add("Redmi Note 13+");

        // Tạo ArrayAdapter và thực hiện gán ArrayList lên ArrayAdapter
        adapterSanPham = new ArrayAdapter<>(NguyenHuuHoangDSSP.this, android.R.layout.simple_list_item_1,danhSachSanPham);
        // Gán ArrayAdapter lên ListView
        lvSanPham.setAdapter(adapterSanPham);
        lvSanPham.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(NguyenHuuHoangDSSP.this, "Sản phẩm đang chọn tại vị trí " + (i+1), Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(NguyenHuuHoangDSSP.this,ChiTietSanPham.class);
                Random random = new Random();
                // Tạo chuỗi ký tự ngẫu nhiên
                char randomChar = (char) (random.nextInt(26) + 'a');
                myIntent.putExtra("MaSanPham",randomChar + "");
                myIntent.putExtra("TenSanPham",danhSachSanPham.get(i));
                // Tạo một số ngẫu nhiên từ 1 đến 10
                int randomNumber = random.nextInt(10) + 1;
                myIntent.putExtra("GiaBan", String.valueOf(randomNumber*100000));
                startActivity(myIntent);
                return true;
            }
        });
    }
}
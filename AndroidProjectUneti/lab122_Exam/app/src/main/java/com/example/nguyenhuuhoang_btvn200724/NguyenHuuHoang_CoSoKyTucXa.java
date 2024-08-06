package com.example.nguyenhuuhoang_btvn200724;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class NguyenHuuHoang_CoSoKyTucXa extends AppCompatActivity {
    ListView lv;
    Button btnNext2;
    ArrayList<KyTucXa> arrayListKyTucXa;
    ArrayAdapter arrayAdapterKyTucXa;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_co_so_ky_tuc_xa);

        lv = findViewById(R.id.lv);
        btnNext2 = findViewById(R.id.button);

        // Tạo ArrayList và thêm các phần tử vào ArrayList
        arrayListKyTucXa = new ArrayList<>();
        // Tạo các đối tươợng thuộc lớp KyTucXa
        KyTucXa ktx1 = new KyTucXa("Lĩnh Nam");
        KyTucXa ktx2 = new KyTucXa("Minh Khai");
        KyTucXa ktx3 = new KyTucXa("Nam Định");
        KyTucXa ktx4 = new KyTucXa("Mỹ Xá");
        // Thêm các phần tử vào ArrayList
        arrayListKyTucXa.add(ktx1);
        arrayListKyTucXa.add(ktx2);
        arrayListKyTucXa.add(ktx3);
        arrayListKyTucXa.add(ktx4);
        // Tạo ArrayAdapter và gắn ArrayList lên ArrayAdapter
        arrayAdapterKyTucXa = new ArrayAdapter<>(NguyenHuuHoang_CoSoKyTucXa.this, android.R.layout.simple_list_item_1,arrayListKyTucXa);
        // Đưa ArrayAdapter lên ListView
        lv.setAdapter(arrayAdapterKyTucXa);
        // Viết lút  kiên kích chuột vào ListView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy vị trí của phần tử được chon
                index = i;
                // Trả về phần tử được chọn
                Toast.makeText(NguyenHuuHoang_CoSoKyTucXa.this, "Cơ sở ký túc xá đang chọn " + arrayListKyTucXa.get(i).getDiaChi(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
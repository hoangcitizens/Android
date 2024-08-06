package com.example.nguyenhuuhoang_bt260724;

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

public class NguyenHuuHoang_BaiHat extends AppCompatActivity {
    EditText edtTenBaiHat, edtTenCaSi;
    Button btnThem, btnSua, btnXoa;
    ListView lv;
    ArrayList <Music> arrayListMusic;
    ArrayAdapter arrayAdapterMusic;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_bai_hat);

        edtTenBaiHat = findViewById(R.id.edtTenBaiHat);
        edtTenCaSi = findViewById(R.id.edtTenCaSi);
        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnXoa);
        lv = findViewById(R.id.lv);

        arrayListMusic = new ArrayList<>();
        Music m1 = new Music("Con cò be bé","Xuân Mai");
        Music m2 = new Music("Mẹ yêu không nào","Bào ngư");
        Music m3 = new Music("Đi học về","Mỹ Tâm");
        arrayListMusic.add(m1);
        arrayListMusic.add(m2);
        arrayListMusic.add(m3);
        arrayAdapterMusic = new ArrayAdapter<>(NguyenHuuHoang_BaiHat.this,android.R.layout.simple_list_item_1,arrayListMusic);
        lv.setAdapter(arrayAdapterMusic);
        Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                index = i;
                edtTenBaiHat.setText(arrayListMusic.get(i).getTenBaiHat());
                edtTenCaSi.setText(arrayListMusic.get(i).getTenCaSi());
                Intent myIntent = new Intent(NguyenHuuHoang_BaiHat.this, NguyenHuuHoang_ThongTinBaiHat.class);
                myIntent.putExtra("tenbaihat",edtTenBaiHat.getText().toString());
                myIntent.putExtra("tencasi",edtTenCaSi.getText().toString());
                startActivity(myIntent);
            }
        });
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Music m = new Music(edtTenBaiHat.getText().toString(),edtTenCaSi.getText().toString());
                arrayListMusic.add(m);
                Toast.makeText(NguyenHuuHoang_BaiHat.this, "Thêm bài hát " + edtTenBaiHat.getText().toString() + " thành công !", Toast.LENGTH_SHORT).show();
                arrayAdapterMusic.notifyDataSetChanged();
            }
        });
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Music m = new Music(edtTenBaiHat.getText().toString(),edtTenCaSi.getText().toString());
                arrayListMusic.set(index,m);
                arrayAdapterMusic.notifyDataSetChanged();
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListMusic.remove(index);
                arrayAdapterMusic.notifyDataSetChanged();
            }
        });
    }
}
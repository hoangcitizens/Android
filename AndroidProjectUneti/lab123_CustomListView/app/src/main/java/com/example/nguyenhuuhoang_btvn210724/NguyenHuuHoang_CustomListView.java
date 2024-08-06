package com.example.nguyenhuuhoang_btvn210724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class NguyenHuuHoang_CustomListView extends AppCompatActivity {
    int imagePhone[] = {R.drawable.iphone,R.drawable.samsung,R.drawable.xiaomi,R.drawable.realme,R.drawable.oppo,R.drawable.vivo};
    String phoneName[] = {"Điện thoại Iphone", "Điện thoại SamSung", "Điện thoại Xiaomi", "Điện thoại Realme", "Điện thoại Oppo","Điện thoại Vivo"};
    ArrayList<Phone> mylist; // Khai báo mảng chính
    MyArrayAdapter myadapter; //Khai báo Adapter
    ListView lv; //Khai báo Listview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_custom_list_view);
        lv = findViewById(R.id.lv);
        mylist = new ArrayList<>();
        for (int i = 0; i < phoneName.length;i++) {
            mylist.add(new Phone(imagePhone[i],phoneName[i]));
        }
        myadapter = new MyArrayAdapter(this,R.layout.layout_item,mylist);
        lv.setAdapter(myadapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(NguyenHuuHoang_CustomListView.this, "Bạn đang chọn " + phoneName[i], Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(NguyenHuuHoang_CustomListView.this,SubActivity.class);
                myintent.putExtra("name",phoneName[i]);
                startActivity(myintent);
            }
        });
    }
}
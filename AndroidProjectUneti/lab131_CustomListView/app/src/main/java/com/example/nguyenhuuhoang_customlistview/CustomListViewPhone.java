package com.example.nguyenhuuhoang_customlistview;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CustomListViewPhone extends AppCompatActivity {
    // Khai báo biến
    ListView lv;
    // Khai báo ArrayList
    ArrayList<Phone> arrayListPhone;
    // Khai báo ArrayAdapter
    ArrayAdapter arrayAdapterPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list_view_phone);

        // Ánh xạ
        lv = findViewById(R.id.lv);
        // Tạo ArrayList
        arrayListPhone = new ArrayList<>();
        // Thêm các phần tử vào ArrayList
        Phone phone1 = new Phone(R.drawable.samsung,"SamSung S24+ Ultra");
        Phone phone2 = new Phone(R.drawable.iphone,"IPhone 15 Pro Max");
        Phone phone3 = new Phone(R.drawable.xiaomi,"Redmi Note 13");
        Phone phone4 = new Phone(R.drawable.realme,"Realme Q5 Pro");
        Phone phone5 = new Phone(R.drawable.oppo,"Oppo A79");
        arrayListPhone.add(phone1);
        arrayListPhone.add(phone2);
        arrayListPhone.add(phone3);
        arrayListPhone.add(phone4);
        arrayListPhone.add(phone5);

        // Tạo ArrayAdapter
        arrayAdapterPhone = new ArrayAdapter<Phone>(CustomListViewPhone.this,0,arrayListPhone)
        {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                // Kết nối file giao diện Item Phone
                LayoutInflater myInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                // Gán các đối tượng trên file giao diện item_phone vào convertView
                convertView = myInflater.inflate(R.layout.item_phone,null);
                // Ánh xạ id của TextView
                TextView tvPhoneName = convertView.findViewById(R.id.tvPhoneName);
                ImageView ivPhoneImage = convertView.findViewById(R.id.ivPhoneImage);
                // Lấy 1 phần tử trong ArrayList
                Phone phone = arrayListPhone.get(position);
                // Hiển thị lên TextView
                tvPhoneName.setText(phone.getPhoneName());
                // Hiển thị lên ImageView
                ivPhoneImage.setImageResource(phone.getPhoneImage());
                return convertView;
            }
        };

        // Gán ArrayAdapter lên ListView
        lv.setAdapter(arrayAdapterPhone);
    }
}
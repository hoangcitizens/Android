package com.example.nguyenhuuhoang_bt180724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class NguyenHuuHoang_DanhBa extends AppCompatActivity {
    ListView lv;
    ArrayList <String> arrayListPhoneNumbers;
    ArrayAdapter arrayAdapterPhoneNumbers;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_danh_ba);

        lv = findViewById(R.id.lv);
        arrayListPhoneNumbers = new ArrayList<>();
        PhoneBook phoneBook1 = new PhoneBook("Nguyễn Hữu Hoàng","0366898984");
        PhoneBook phoneBook2 = new PhoneBook("Đặng Trần Đức","0344945621");
        PhoneBook phoneBook3 = new PhoneBook("Phạm Xuân Ẩn","0985124366");
        PhoneBook phoneBook4 = new PhoneBook("Nguyễn Chí Vịnh","0348463245");
        PhoneBook phoneBook5 = new PhoneBook("Nguyễn Quốc Hương","0982332534");
        arrayListPhoneNumbers.add(phoneBook1.getFullName() + " - " + phoneBook1.getPhoneNumbers());
        arrayListPhoneNumbers.add(phoneBook2.getFullName() + " - " + phoneBook2.getPhoneNumbers());
        arrayListPhoneNumbers.add(phoneBook3.getFullName() + " - " + phoneBook3.getPhoneNumbers());
        arrayListPhoneNumbers.add(phoneBook4.getFullName() + " - " + phoneBook4.getPhoneNumbers());
        arrayListPhoneNumbers.add(phoneBook5.getFullName() + " - " + phoneBook5.getPhoneNumbers());

        arrayAdapterPhoneNumbers = new ArrayAdapter(NguyenHuuHoang_DanhBa.this, android.R.layout.simple_list_item_1,arrayListPhoneNumbers);
        lv.setAdapter(arrayAdapterPhoneNumbers);

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                String[] str = arrayListPhoneNumbers.get(i).split(" - "); // Tách chuỗi theo dấu
                index = i;
                String name = str[0];
                String phone = str[1];
                Toast.makeText(NguyenHuuHoang_DanhBa.this, "Đang nhấn giữ sđt " + phone , Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(NguyenHuuHoang_DanhBa.this,Call.class);
                myIntent.putExtra("fullName", name);
                myIntent.putExtra("phoneNumbers", phone);
                startActivity(myIntent);
                return true;
            }
        });


    }
}
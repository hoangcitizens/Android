package com.example.nguyenhuuhoang_dangnhap;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ManHinhMenu extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_hinh_menu);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuGuiTinNhan) {
            Intent myintent1 = new Intent(ManHinhMenu.this, GuiTinNhan.class);
            startActivity(myintent1);
        } else if (item.getItemId() == R.id.menuJSON) {
            Intent myintent2 = new Intent(ManHinhMenu.this, ThongTinDangNhap.class);

            //Lấy dữ liệu khỏi Intent
            Intent myintent3 = getIntent();
            Bundle mybundle = myintent3.getBundleExtra("mypackage");
            String a = mybundle.getString("tendangnhap");
            String b = mybundle.getString("matkhau");

            // Truyền Bundle
            Bundle mybundle2 = new Bundle();
            mybundle2.putString("tendangnhap1",a);
            mybundle2.putString("matkhau1", b);
            // Đưa bundle vào intent để truyển đi
            myintent2.putExtra("mypackage1",mybundle2);
            startActivity(myintent2);
        }else if (item.getItemId() == R.id.menuThoat) {
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}
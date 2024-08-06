package com.example.nguyenhuuhoang_btvn120724;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NguyenHuuHoang_menu extends AppCompatActivity {
    Toolbar toolbar;
    MenuItem menuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_menu);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuHoaDon) {
            Toast.makeText(this, "Chức năng này chưa được cập nhật", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuSDT) {
            Intent myintent = new Intent(NguyenHuuHoang_menu.this,QuanLySoDienThoai.class);
            startActivity(myintent);
        } else if (item.getItemId() == R.id.menuChamSoc) {
            Toast.makeText(this, "Chức năng này chưa được cập nhật", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuThoat) {
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}
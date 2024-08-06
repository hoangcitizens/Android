package com.example.nguyenhuuhoang1;

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
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.demo, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuHoaDon) {
            Intent myintent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(myintent);
        } else if (item.getItemId() == R.id.menuChamSoc) {
            Toast.makeText(MainActivity.this, "Chức năng này chưa được cập nhật", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuLienHe) {
            Toast.makeText(MainActivity.this, "Chức năng này chưa được cập nhật", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuThoat) {
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}
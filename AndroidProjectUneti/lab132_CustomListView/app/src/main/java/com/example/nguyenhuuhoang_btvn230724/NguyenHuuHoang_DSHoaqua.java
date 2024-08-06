package com.example.nguyenhuuhoang_btvn230724;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class NguyenHuuHoang_DSHoaqua extends AppCompatActivity {
    // Khai báo biến
    ListView lv;
    // Khai báo ArrayList
    ArrayList<Fruit> arrayListFruit;
    // Khai báo ArrayAdapter
    ArrayAdapter arrayAdapterFruit;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_dshoaqua);

        // Ánh xạ
        lv = findViewById(R.id.lv);
        // Tạo ArrayList
        arrayListFruit = new ArrayList<>();
        // Thêm các phần tử vào ArrayList
        Fruit fruit1 = new Fruit(R.drawable.apple,"Apple",5000);
        Fruit fruit2 = new Fruit(R.drawable.banana,"Banana",6000);
        Fruit fruit3 = new Fruit(R.drawable.grape,"Grape",4000);
        Fruit fruit4 = new Fruit(R.drawable.guava,"Guava",2500);
        arrayListFruit.add(fruit1);
        arrayListFruit.add(fruit2);
        arrayListFruit.add(fruit3);
        arrayListFruit.add(fruit4);
        arrayAdapterFruit = new ArrayAdapter<Fruit>(NguyenHuuHoang_DSHoaqua.this,0,arrayListFruit)
        {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                // Kết nối file giao diện Item Fruit
                LayoutInflater myInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                // Gán các đối tượng trên file giao diện item_Fruit vào convertView
                convertView = myInflater.inflate(R.layout.item_fruit,null);
                // Ánh xạ id của TextView
                TextView tvFruitName = convertView.findViewById(R.id.tvFruitName);
                TextView tvFruitPrice = convertView.findViewById(R.id.tvFruitPrice);
                ImageView ivFruitImage = convertView.findViewById(R.id.imageView2);
                // Lấy 1 phần tử trong ArrayList
                Fruit Fruit1 = arrayListFruit.get(position);
                // Hiển thị lên TextView
                tvFruitName.setText(Fruit1.getFruitName());
                tvFruitPrice.setText("Đơn giá: " + Fruit1.getPrice());
                // Hiển thị lên ImageView
                ivFruitImage.setImageResource(Fruit1.getFruitImage());
                return convertView;
            }
        };
        // Gán ArrayAdapter lên ListView
        lv.setAdapter(arrayAdapterFruit);
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Check if it's the last item
                if (i == arrayListFruit.size() - 1) {
                    Fruit removedFruit = arrayListFruit.remove(i);
                    arrayAdapterFruit.notifyDataSetChanged();
                    Toast.makeText(NguyenHuuHoang_DSHoaqua.this, "Bạn vừa xóa " + removedFruit.getFruitName() + " đơn giá: " +  removedFruit.getPrice(), Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }
}
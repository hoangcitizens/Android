package com.example.nguyenhuuhoang_250723;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class NguyenHuuHoang_danhba250724 extends AppCompatActivity {
    EditText edtTen, edtSDT;
    Button btnThem, btnSua, btnXoa;
    ListView lv;
    ArrayList<DanhBa> arrayListDanhBa;
    ArrayAdapter arrayAdapterDanhBa;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_danhba250724);

        edtTen = findViewById(R.id.edtTen);
        edtSDT = findViewById(R.id.edtSDT);
        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnXoa);
        lv = findViewById(R.id.lv);

        arrayListDanhBa = new ArrayList<>();
        DanhBa db1 = new DanhBa("Nguyễn Hữu Hoàng","0366898984");
        DanhBa db2 = new DanhBa("Trần Quốc Hương","0832543732");
        DanhBa db3 = new DanhBa("Phạm Đức Anh","0985342424");
        DanhBa db4 = new DanhBa("Nguyễn Chí Vịnh","0344854124");
        arrayListDanhBa.add(db1);
        arrayListDanhBa.add(db2);
        arrayListDanhBa.add(db3);
        arrayListDanhBa.add(db4);

        arrayAdapterDanhBa = new ArrayAdapter(NguyenHuuHoang_danhba250724.this, android.R.layout.simple_list_item_1,arrayListDanhBa);
        lv.setAdapter(arrayAdapterDanhBa);

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                edtTen.setText(arrayListDanhBa.get(i).getName());
                edtSDT.setText(arrayListDanhBa.get(i).getPhoneNumbers());
                index = i;
                Intent myIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + arrayListDanhBa.get(i).getPhoneNumbers()));
//                                if (ActivityCompat.checkSelfPermission(NguyenHuuHoang_danhba250724.this,
//                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(NguyenHuuHoang_danhba250724.this, new
//                            String[]{android.Manifest.permission.CALL_PHONE}, 1);
//                    return true;
//                }
                Toast.makeText(NguyenHuuHoang_danhba250724.this, "Bạn đang gọi tới số " + arrayListDanhBa.get(i).getPhoneNumbers(), Toast.LENGTH_SHORT).show();
                startActivity(myIntent);
                return true;
            }
        });
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DanhBa db = new DanhBa(edtTen.getText().toString(),edtSDT.getText().toString());
                arrayListDanhBa.add(db);
                Toast.makeText(NguyenHuuHoang_danhba250724.this, "Bạn đã thêm " + db.getPhoneNumbers() + " vào danh bạ", Toast.LENGTH_SHORT).show();
                arrayAdapterDanhBa.notifyDataSetChanged();
            }
        });

    }
}
package com.example.nguyenhuuhoang_listview_base2;

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

public class NguyenHuuHoang_DanhBaDienThoai extends AppCompatActivity {
    // Khai báo biến
    ListView lv;
    Button btnThem, btnSua, btnXoa;
    EditText edtName, edtPhoneNumbers;
    // Khai báo ArrayList
    ArrayList <String> arrayListPhone;
    // Khai báo ArrayAdapter
    ArrayAdapter arrayAdapterPhone;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_danh_ba_dien_thoai);

        // Ánh xạ
        lv = findViewById(R.id.lv);
        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnXoa);
        edtName = findViewById(R.id.edtName);
        edtPhoneNumbers= findViewById(R.id.edtPhoneNumbers);

        // Tạo ArrayList và thêm các phần tử vào ArrayList
        arrayListPhone = new ArrayList<>();
        // Tạo một đối tượng thuộc lớp Phone
        Phone phone1 = new Phone("Nguyễn Hữu Hoàng","0366898984");
        Phone phone2 = new Phone("Trần Hồng Hà","0344945631");
        arrayListPhone.add(phone1.getName() + " - " + phone1.getPhoneNumbers());
        arrayListPhone.add(phone2.getName() + " - " + phone2.getPhoneNumbers());
        // Tạo ArrayAdapter và gán ArrayList lên ArrayAdapter
        arrayAdapterPhone = new ArrayAdapter(NguyenHuuHoang_DanhBaDienThoai.this, android.R.layout.simple_list_item_1,arrayListPhone);
        // Đưa ArrayAdapter lên listView
        lv.setAdapter(arrayAdapterPhone);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy sdt được chọn trên ListView
                String s = arrayListPhone.get(i);
                // Lấy vị trí môn hoc bạn vừa chọn
                index = i;
                int x = s.indexOf("-");
                int y = s.lastIndexOf(" ");
                String name= s.substring(0,x);
                String phoneNumbers = s.substring(y+1,s.length());
                // Gán môn học lên EditText
                edtName.setText(name);
                edtPhoneNumbers.setText(phoneNumbers);
            }
        });
        // Thêm tên và sđt
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy sdt nhập từ EditText
                String s = edtName.getText().toString() + " - " + edtPhoneNumbers.getText().toString();
                // Đưa sdt vừa nhập vào ArrayList
                arrayListPhone.add(s);
                // Cập nhật lại ArrayAdapter
                arrayAdapterPhone.notifyDataSetChanged();
                Toast.makeText(NguyenHuuHoang_DanhBaDienThoai.this, "Thêm " + s + " thành công", Toast.LENGTH_SHORT).show();
            }
        });
        // Sửa tên và sdt
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy sdt nhập từ EditText
                String s = edtName.getText().toString() + " - " + edtPhoneNumbers.getText().toString();
                // Cập nhật lại ArrayList
                arrayListPhone.set(index,s);
                // Cập nhật ArrayAdapter
                arrayAdapterPhone.notifyDataSetChanged();
                Toast.makeText(NguyenHuuHoang_DanhBaDienThoai.this, "Sửa " + s + " thành công", Toast.LENGTH_SHORT).show();
            }
        });
        // Thêm tên và sdt
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy sdt nhập từ EditText
                String s = edtName.getText().toString() + " - " + edtPhoneNumbers.getText().toString();
                // Xóa vị trí trong ArrayList
                arrayListPhone.remove(index);
                edtName.setText("");
                edtPhoneNumbers.setText("");
                // Cập nhật ArrayAdapter
                arrayAdapterPhone.notifyDataSetChanged();
                Toast.makeText(NguyenHuuHoang_DanhBaDienThoai.this, "Xóa " + s + " thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
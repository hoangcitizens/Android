package com.example.nguyenhuuhoang_monhoc;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NguyenHuuHoangMonhoc extends AppCompatActivity {
    // Khai báo biến
    ListView lvMonHoc;
    EditText edtTenMonHoc;
    Button btnThem, btnSua, btnXoa;
    // Khai báo ArrayList lưu danh sách các môn học
    ArrayList<String> danhSachMonHoc;
    // Khai báo ArrayAdapter
    ArrayAdapter adapterMonHoc;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_monhoc);
        // Ánh xạ các id vào các biến giao diện
        lvMonHoc = findViewById(R.id.lvMonHoc);
        edtTenMonHoc = findViewById(R.id.edtTenMonHoc);
        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnXoa);

        // Tạo ArrayList và thêm các phần tử vào ArrayList
        danhSachMonHoc = new ArrayList<>();
        danhSachMonHoc.add("Toán rời rạc");
        danhSachMonHoc.add("Cấu trúc dữ liệu và giải thuật");
        danhSachMonHoc.add("Phân tích thiết kế hệ thống");
        // Tạo ArrayAdapter và thực hiện gán ArrayList lên ArrayAdapter
        adapterMonHoc = new ArrayAdapter<>(NguyenHuuHoangMonhoc.this, android.R.layout.simple_list_item_1,danhSachMonHoc);
        // Gán ArrayAdapter lên ListView
        lvMonHoc.setAdapter(adapterMonHoc);
        // Viết sự kiện kick chuột vào một đối tượng trên ListView
        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy môn học được chọn trên ListView
                String mh = danhSachMonHoc.get(i);
                // Lấy vị trí môn hoc bạn vừa chọn
                index = i;
                // Gán môn học lên TextView
                //tvSDT.setText("Số điện thoại vừa chọn là: " + mh + " tại vị trí thứ " + (index+1));
                // Gán môn học lên EditText
                edtTenMonHoc.setText(mh);
            }
        });
        // Viết sự kiện kick chuột sự kiện nút thêm
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy môn học nhập từ EditText
                String mh = edtTenMonHoc.getText().toString();
                // Đưa môn học vừa nhập vào ArrayList
                danhSachMonHoc.add(mh);
                // Cập nhật lại ArrayAdapter
                adapterMonHoc.notifyDataSetChanged();
            }
        });
        // Viết sự kiện kick chuột sự kiện nút sửa
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy môn học đã sửa từ EditText
                String mh = edtTenMonHoc.getText().toString();
                // Cập nhật lại ArrayList
                danhSachMonHoc.set(index,mh);
                // Cập nhật ArrayAdapter
                adapterMonHoc.notifyDataSetChanged();
            }
        });
        // Viết sự kiện kick chuột sự kiện nút xóa
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy môn học nhập từ EditText
                String mh = edtTenMonHoc.getText().toString();
                // Xóa vị trí trong ArrayList
                danhSachMonHoc.remove(index);
                edtTenMonHoc.setText("");
                // Cập nhật ArrayAdapter
                adapterMonHoc.notifyDataSetChanged();
            }
        });
    }
}
package com.example.nguyenhuuhoang_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListViewBase extends AppCompatActivity {
    // Khai báo biến
    ListView lvSDT;
    TextView tvSDT;
    EditText edtSDT;
    Button btnThem, btnSua, btnXoa;
    // Khai báo ArrayList lưu danh sách các số điện thoại
    ArrayList <String> danhSachSDT;
    // Khai báo ArrayAdapter
    ArrayAdapter adapterSDT;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_base);

        // ánh xạ các id vào các biến giao diện
        tvSDT = findViewById(R.id.tvSDT);
        lvSDT = findViewById(R.id.lvSDT);
        edtSDT = findViewById(R.id.edtSDT);
        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnXoa);

        // Tạo ArrayList và thêm các phần tử vào ArrayList
        danhSachSDT = new ArrayList<>();
        danhSachSDT.add("0366898984");
        danhSachSDT.add("0344945631");
        danhSachSDT.add("0985145465");
        danhSachSDT.add("0368423636");
        // Tạo ArrayAdapter và thực hiện gán ArrayList lên ArrayAdapter
        adapterSDT = new ArrayAdapter<>(ListViewBase.this, android.R.layout.simple_list_item_1,danhSachSDT);
        // Gán ArrayAdapter lên ListView
        lvSDT.setAdapter(adapterSDT);
        // Viết sự kiện kick chuột vào một đối tượng trên ListView
        lvSDT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy số điện thoại được chọn trên ListView
                String sdt = danhSachSDT.get(i);
                // Lấy vị trí SDT vừa chọn
                index = i;
                // Gán số điện thoại lên TextView
                //tvSDT.setText("Số điện thoại vừa chọn là: " + sdt + " tại vị trí thứ " + (index+1));
                // Gán số điện thoại lên EditText
                edtSDT.setText(sdt);
            }
        });
        // Viết sự kiện kick chuột sự kiện nút thêm
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy SDT nhập từ EditText
                String sdt = edtSDT.getText().toString();
                // Đưa SDT vừa nhập vào ArrayList
                danhSachSDT.add(sdt);
                // Cập nhật lại ArrayAdapter
                adapterSDT.notifyDataSetChanged();
            }
        });
        // Viết sự kiện kick chuột sự kiện nút sửa
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy SDT đã sửa từ EditText
                String sdt = edtSDT.getText().toString();
                // Cập nhật lại ArrayList
                danhSachSDT.set(index,sdt);
                // Cập nhật ArrayAdapter
                adapterSDT.notifyDataSetChanged();
            }
        });
        // Viết sự kiện kick chuột sự kiện nút xóa
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy SDT nhập từ EditText
                String sdt = edtSDT.getText().toString();
                // Xóa vị trí trong ArrayList
                danhSachSDT.remove(index);
                edtSDT.setText("");
                // Cập nhật ArrayAdapter
                adapterSDT.notifyDataSetChanged();
            }
        });
    }
}
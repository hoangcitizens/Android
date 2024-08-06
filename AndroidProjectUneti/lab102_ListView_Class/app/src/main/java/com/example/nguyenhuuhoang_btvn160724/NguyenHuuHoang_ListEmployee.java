package com.example.nguyenhuuhoang_btvn160724;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class NguyenHuuHoang_ListEmployee extends AppCompatActivity {
    EditText edtID, edtName;
    RadioButton rabNam, rabNu;
    Button btnThem, btnSua, btnXoa;
    ListView lv;
    ArrayList <String> arrayListEmployee;
    ArrayAdapter arrayAdapterEmployee;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nguyen_huu_hoang_list_employee);

        edtID = findViewById(R.id.edtID);
        edtName = findViewById(R.id.edtName);
        rabNam = findViewById(R.id.rabNam);
        rabNu = findViewById(R.id.rabNu);
        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnXoa);
        lv = findViewById(R.id.lv);

        // Tạo ArrayList và thêm các phần tử vào ArrayList
        arrayListEmployee = new ArrayList<>();
        Employee employee1 = new Employee("001","Nguyễn Hữu Hoàng","Nam");
        Employee employee2 = new Employee("002","Trần Hồng Anh","Nữ");
        arrayListEmployee.add(employee1.getId() + " - " + employee1.getFullName() + " - " + employee1.getGender());
        arrayListEmployee.add(employee2.getId() + " - " + employee2.getFullName() + " - " + employee2.getGender());

        // Tạo ArrayAdapter và gán ArrayList lên ArrayAdapter
        arrayAdapterEmployee = new ArrayAdapter<>(NguyenHuuHoang_ListEmployee.this, android.R.layout.simple_list_item_1, arrayListEmployee);
        // Đưa ArrayAdapter lên listView
        lv.setAdapter(arrayAdapterEmployee);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String[] str = arrayListEmployee.get(i).split(" - "); // Tách chuỗi theo dấu
                index = i;
                edtID.setText(str[0]);
                edtName.setText(str[1]);
                if (str[2].equals("Nam") == true)
                    rabNam.setChecked(true);
                else
                    rabNu.setChecked(true);
            }
        });
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender = "";
                if (rabNam.isChecked() == true)
                    gender = " - Nam";
                else if (rabNu.isChecked() == true)
                    gender = " - Nữ";
                String str = edtID.getText().toString() + " - " + edtName.getText().toString() + gender;
                arrayListEmployee.add(str);
                arrayAdapterEmployee.notifyDataSetChanged();
            }
        });
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender = "";
                if (rabNam.isChecked() == true)
                    gender = " - Nam";
                else if (rabNu.isChecked() == true)
                    gender = " - Nữ";
                String str = edtID.getText().toString() + " - " + edtName.getText().toString() + gender;
                arrayListEmployee.set(index,str);
                arrayAdapterEmployee.notifyDataSetChanged();
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender = "";
                if (rabNam.isChecked() == true)
                    gender = "Nam";
                else if (rabNu.isChecked() == true)
                    gender = "Nữ";
                String str = edtID.getText().toString() + " - " + edtName.getText().toString() + gender;
                arrayListEmployee.remove(index);
                edtID.setText("");
                edtName.setText("");
                rabNam.isFocused();
                rabNu.isFocused();
                arrayAdapterEmployee.notifyDataSetChanged();
            }
        });
    }
}
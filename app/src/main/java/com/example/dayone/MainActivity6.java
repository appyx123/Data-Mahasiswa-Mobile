package com.example.dayone;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    EditText input1, input2;
    RadioGroup radioGroup;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        input1 = findViewById(R.id.Input1);
        input2 = findViewById(R.id.input2);
        radioGroup = findViewById(R.id.radioGroup);
        txtHasil = findViewById(R.id.txtHasil);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> hitung());
    }

    private void hitung() {
        String s1 = input1.getText().toString();
        String s2 = input2.getText().toString();

        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)) {
            txtHasil.setText("Isi kedua angka.");
            return;
        }

        double angka1 = Double.parseDouble(s1);
        double angka2 = Double.parseDouble(s2);
        double hasil;

        int id = radioGroup.getCheckedRadioButtonId();

        if (id == R.id.rbTambah) {
            hasil = angka1 + angka2;
        } else if (id == R.id.rbKurang) {
            hasil = angka1 - angka2;
        } else if (id == R.id.rbKali) {
            hasil = angka1 * angka2;
        } else if (id == R.id.rbBagi) {
            if (angka2 == 0) {
                txtHasil.setText("Tidak bisa dibagi 0.");
                return;
            }
            hasil = angka1 / angka2;
        } else {
            txtHasil.setText("Pilih operasi.");
            return;
        }

        txtHasil.setText("Hasil: " + hasil);
    }
}

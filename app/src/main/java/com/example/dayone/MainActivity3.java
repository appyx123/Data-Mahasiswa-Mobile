package com.example.dayone;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {


    private CheckBox chkSatu, chkDua, chkTiga;
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        chkSatu = findViewById(R.id.chk_satu);
        chkDua = findViewById(R.id.chk_dua);
        chkTiga = findViewById(R.id.chk_tiga);
        hasil = findViewById(R.id.hasil);
    }

    public void btnOKClick(View view) {

        String hasil = "HASIL :\n\n";
        if (chkSatu.isChecked()) {
            hasil += "- Software Engineering\n";
        }
        if (chkDua.isChecked()) {
            hasil += "- Artificial Intelligence\n";
        }
        if (chkTiga.isChecked()) {
            hasil += "- Computer Networks\n";
        }
        if (hasil.isEmpty()) {
            hasil = "Tidak ada mata kuliah yang dipilih";
        }
        this.hasil.setText(hasil);

    }

    public void btnResetClick(View view) {
        chkSatu.setChecked(false);
        chkDua.setChecked(false);
        chkTiga.setChecked(false);
        hasil.setText("");
    }

    public void btnAllClick(View view) {
        chkSatu.setChecked(true);
        chkDua.setChecked(true);
        chkTiga.setChecked(true);
    }




}
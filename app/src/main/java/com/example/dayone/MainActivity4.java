package com.example.dayone;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    public RadioGroup radioGroup;

    public TextView txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        radioGroup = findViewById(R.id.radioGroup);
        txthasil = findViewById(R.id.txtHasil);
    }

    private void tampil(View view){
        String hasil = "HASIL: \n";

        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == -1) {
            hasil += "Tidak ada pilihan yang dipilih.";
        } else {
            if (checkedRadioButtonId == R.id.radioButton1) {
                hasil += "Pilihan 1";
            } else if (checkedRadioButtonId == R.id.radioButton2) {
                hasil += "Pilihan 2";
            } else if (checkedRadioButtonId == R.id.radioButton3) {
                hasil += "Pilihan 3";
            } else {
                hasil += "Pilihan tidak dikenali.";
            }
        }

        txthasil.setText(hasil); // Jangan lupa tampilkan hasilnya di TextView
    }

}
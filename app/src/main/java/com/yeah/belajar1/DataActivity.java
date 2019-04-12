package com.yeah.belajar1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    //Deklarasi variabel TextView
    TextView tvNama, tvNim, tvKelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        //Memanggil id XML kedalam variabel
        tvNama = findViewById(R.id.tvNama);
        tvNim = findViewById(R.id.tvNim);
        tvKelas = findViewById(R.id.tvKelas);

        //Membuat intent untuk mengambil semua data yang dibawa oleh intent
        Intent intent = getIntent();

        //Merubah text pada textview berdasarkan data yang ada pada intent sesuai nama datanya
        tvNama.setText(intent.getStringExtra("dataNama"));
        tvNim.setText(intent.getStringExtra("nim"));
        tvKelas.setText(intent.getStringExtra("kelas"));
    }
}

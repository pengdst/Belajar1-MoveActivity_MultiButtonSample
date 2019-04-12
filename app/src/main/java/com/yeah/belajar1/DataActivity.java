package com.yeah.belajar1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView tvNama, tvNim, tvKelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvNama = findViewById(R.id.tvNama);
        tvNim = findViewById(R.id.tvNim);
        tvKelas = findViewById(R.id.tvKelas);

        Intent intent = getIntent();

        tvNama.setText(intent.getStringExtra("dataNama"));
        tvNim.setText(intent.getStringExtra("nim"));
        tvKelas.setText(intent.getStringExtra("kelas"));
    }
}

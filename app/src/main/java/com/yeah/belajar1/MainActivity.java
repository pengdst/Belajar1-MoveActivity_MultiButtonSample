package com.yeah.belajar1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button, berubah;
    EditText etNama, etNim, etKelas;
    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.berubah);
        berubah = findViewById(R.id.merubahhellow);

        etNama = findViewById(R.id.etNama);
        etNim = findViewById(R.id.etNim);
        etKelas = findViewById(R.id.etKelas);
        hello = findViewById(R.id.hellow);

        button.setOnClickListener(this);
        berubah.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.berubah:
                String strNama = etNama.getText().toString();
                String strNim = etNim.getText().toString();
                String strkelas = etKelas.getText().toString();

                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                intent.putExtra("dataNama", strNama);
                intent.putExtra("nim", strNim);
                intent.putExtra("kelas", strkelas);

                startActivity(intent);
                break;
            case R.id.merubahhellow:
                hello.setText("Udah dirubah");
                break;
        }
    }
}

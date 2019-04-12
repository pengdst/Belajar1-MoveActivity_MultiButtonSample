package com.yeah.belajar1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Deklarasi variabel
    Button button, berubah;
    EditText etNama, etNim, etKelas;
    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Memanggil id XML kedalam variabel
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
        //Memisahkan button berdasarkan id XML
        switch (v.getId()){
            case R.id.berubah:
                //Membuat variabel string untuk menampung data dari edittext
                String strNama = etNama.getText().toString();
                String strNim = etNim.getText().toString();
                String strkelas = etKelas.getText().toString();

                //Membuat intent untuk berpindah activity
                Intent intent = new Intent(MainActivity.this, DataActivity.class);

                //Menitipkan data pada intent yang sudah dibuat
                intent.putExtra("dataNama", strNama);
                intent.putExtra("nim", strNim);
                intent.putExtra("kelas", strkelas);

                //Menjalankan perpindahan Activity sesuai intent yang telah dibuat
                startActivity(intent);
                break;
            case R.id.merubahhellow:
                hello.setText("Udah dirubah");
                break;
        }
    }
}

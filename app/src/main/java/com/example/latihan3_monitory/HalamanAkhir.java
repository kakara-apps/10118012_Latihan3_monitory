package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

//Nama : Moch Rizki Maulana N
//NIM : 10118012
//Kelas : IF-1
//Tanggal Pengerjaan : 7 mei 2021

public class HalamanAkhir extends AppCompatActivity {

    private TextView nama;
    private String Nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_akhir);

        nama = findViewById(R.id.txt_nama);

        Intent i = getIntent();
        Nama = i.getStringExtra("dataNama");


        nama.setText(Nama);

    }
}
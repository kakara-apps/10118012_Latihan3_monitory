package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Nama : Moch Rizki Maulana N
//NIM : 10118012
//Kelas : IF-1
//Tanggal Pengerjaan : 7 mei 2021

public class Kodekeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kodekeluarga);

        Button masuk = findViewById(R.id.btn_masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kodekeluarga.this,Nama_umur.class);
                startActivity(i);
                finish();
            }
        });
    }
}
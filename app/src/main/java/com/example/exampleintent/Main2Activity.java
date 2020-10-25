package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView ad, sifre, cinsiyet;
    String adi,sifresi,cinsiyeti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initialize();
        al();
    }

    void initialize() {
        ad = findViewById(R.id.isim);
        sifre = findViewById(R.id.sifre);
        cinsiyet = findViewById(R.id.cinsiyet);
    }

    void al() {
        Bundle intent = getIntent().getExtras();
        adi = intent.getString("name");
        sifresi = intent.getString("password");
        cinsiyeti = intent.getString("gender");

        ad.setText(ad.getText() + " " + adi);
        sifre.setText(sifre.getText() + " " + sifresi);
        cinsiyet.setText(cinsiyet.getText() + " " + cinsiyeti);
    }
}

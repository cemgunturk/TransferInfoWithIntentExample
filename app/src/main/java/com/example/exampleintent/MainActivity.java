package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    RadioGroup radioGroup;
    EditText kAdi, kSifre;
    String ad,sifre,cinsiyet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        gonder();
    }


    public void initialize(){
        kAdi = findViewById(R.id.kullaniciAdi);
        kSifre = findViewById(R.id.kullaniciSifre);
        button = findViewById(R.id.gonderButton);
        radioGroup = findViewById(R.id.radioGroup);
    }

    void degerAl(){
        ad = kAdi.getText().toString();
        sifre = kSifre.getText().toString();
        cinsiyet = ( (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
    }

    void gonder(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerAl();
                //Log.i("degerler" ," "+ad +" "+sifre+" "+cinsiyet); //log ekranından kontrol sağlamak için. çok kıymetli.
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",ad);
                intent.putExtra("password",sifre);
                intent.putExtra("gender",cinsiyet);
                startActivity(intent);
            }
        });
    }
}

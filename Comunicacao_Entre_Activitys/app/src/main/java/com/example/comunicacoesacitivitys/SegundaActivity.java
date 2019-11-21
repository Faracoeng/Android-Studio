package com.example.comunicacoesacitivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    public void botao01(View view) {
//        Uri uri = Uri.parse("https://www.google.com/");
//        Intent it = new Intent(Intent.ACTION_VIEW,uri);
//        startActivity(it);
        Intent menssagemIntent = new Intent(this,MainActivity.class);
        startActivity(menssagemIntent);
    }

    public void botao03(View view) {
//        Uri uri = Uri.parse("tel:3381800");
//        Intent it = new Intent(Intent.ACTION_DIAL,uri);
//        startActivity(it);
        Intent menssagemIntent = new Intent(this,TerceiraActivity.class);
        startActivity(menssagemIntent);

    }
}

package com.example.comunicacoesacitivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
    }

    public void botao01(View view) {
        Intent menssagemIntent = new Intent(this,MainActivity.class);
        startActivity(menssagemIntent);
    }

    public void botao03(View view) {
        Intent menssagemIntent = new Intent(this,TerceiraActivity.class);
        startActivity(menssagemIntent);
    }
}

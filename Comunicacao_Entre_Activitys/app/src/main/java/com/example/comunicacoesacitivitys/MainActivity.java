package com.example.comunicacoesacitivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botao02(View view) {
        Intent menssagemIntent = new Intent(this,SegundaActivity.class);
        //mandar varias informações em  HashMap
        Bundle extras = new Bundle();
        extras.putInt("contador",1);
        menssagemIntent.putExtras(extras);

        startActivity(menssagemIntent);
    }

    public void botao03(View view) {
        Intent menssagemIntent = new Intent(this,TerceiraActivity.class);
        startActivity(menssagemIntent);
    }
}

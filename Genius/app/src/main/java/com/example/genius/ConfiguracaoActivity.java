package com.example.genius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.genius.MainActivity.VALOR_REQUEST;

public class ConfiguracaoActivity extends AppCompatActivity {
    public final static int VALOR_REQUEST = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);


    }

    public void dificuldadeDificil(View view) {

        // neste botao mandar atributo 10 que define a dificuldade Facil

        Intent menssagemIntent = new Intent(this,GeniusActivity.class);

        //mandar varias informações em  HashMap
        //----------------------------------------------------------------------------------------------------

        Bundle extras = new Bundle();
        extras.putInt("dificuldade",30); // pode dar erro aqui se jogar mais de uma vez
        menssagemIntent.putExtras(extras);

        //----------------------------------------------------------------------------------------------------

        startActivityForResult(menssagemIntent,VALOR_REQUEST);

    }

    public void dificuldadeModerado(View view) {
        // mandar atributo 20 que define a dificuldade Moderado

        Intent menssagemIntent = new Intent(this,GeniusActivity.class);

        Bundle extras = new Bundle();
        extras.putInt("dificuldade",20); // pode dar erro aqui se jogar mais de uma vez
        menssagemIntent.putExtras(extras);
        startActivityForResult(menssagemIntent,VALOR_REQUEST);
    }

    public void dificuldadeFacil(View view) {

        // mandar atributo 30 que define a dificuldade Dificil

        Intent menssagemIntent = new Intent(this,GeniusActivity.class);

        Bundle extras = new Bundle();
        extras.putInt("dificuldade",10); // pode dar erro aqui se jogar mais de uma vez
        menssagemIntent.putExtras(extras);
        startActivityForResult(menssagemIntent,VALOR_REQUEST);
    }
}

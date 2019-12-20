package com.example.genius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class GeniusActivity extends AppCompatActivity {

    public final static int VALOR_REQUEST = 3;
    private int nivelDeDifiuldade = 0;
    private int sequenciaAleatoria[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genius);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        this.nivelDeDifiuldade = extras.getInt("dificuldade");
        //TextView view = findViewById(R.id.mostrarDificuldade);
        //view.setText(this.nivelDeDifiuldade + " rodadas");

        if (extras != null) {
            //this.nivelDeDifiuldade = 20;
            //int contador = extras.getInt("Facil");
//            TextView view = findViewById(R.id.textView2);
//            view.setText(""+contador);

// ------------gerar sequencia aleatoria------------------------------------------------------------
            this.sequenciaAleatoria = new int[this.nivelDeDifiuldade];
            this.gerarSequenciaAleatoria(this.nivelDeDifiuldade);
// ----------------------------acender botoes indicando inicio do jogo------------------------------
//            this.trocaImagem(R.id.vermelhor_apagado, R.drawable.ic_vermelhorapagado, R.drawable.ic_vermelhoraceso);
//            this.trocaImagem(R.id.azul_apagado, R.drawable.ic_azulapagado, R.drawable.ic_azulaceso);
//            this.trocaImagem(R.id.verde_apagado, R.drawable.ic_verdeapagado, R.drawable.ic_verdeaceso);
//            this.trocaImagem(R.id.amarelo_apagado, R.drawable.ic_amareloapagado, R.drawable.ic_amareloaceso);
        }
    }
//-------------------Gerar sequencia aleatoria em vetor---------------------------------------------
    private void gerarSequenciaAleatoria(int tamanho) {
        Random gerador = new Random();

        for (int i = 0; i < tamanho; i++) {
            this.sequenciaAleatoria[i] = gerador.nextInt(4); //ok debugado, esta funcionando
            // corretamente
        }
    }


    public void iniciarPartida(View view) {
    }

    public void corVermelha(View view) {
    }

    public void corAzul(View view) {
    }

    public void corVerde(View view) {
    }
}

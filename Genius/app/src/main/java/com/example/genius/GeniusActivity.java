package com.example.genius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import static java.lang.Thread.sleep;

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
            this.trocaImagem(R.id.vermelho_apagado, R.drawable.vermelho_apagado, R.drawable.vermelho_aceso);
            this.trocaImagem(R.id.azul_apagado, R.drawable.azul_apagado, R.drawable.azul_aceso);
            this.trocaImagem(R.id.verde_apagado, R.drawable.verde_apagado, R.drawable.verde_aceso);
            this.trocaImagem(R.id.amarelo_apagado, R.drawable.amarelo_apagado, R.drawable.amarelo_aceso);
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

    // ----------------- piscar luzes do jogo-------------------------------------------------------
    private void trocaImagem(int corBotao, final int apagada, final int acesa) {
        final ImageView imageView = findViewById(corBotao);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    imageView.setImageResource(acesa);
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                imageView.setImageResource(apagada);
            }
        }).start();
    }
// ---------------------------------------------------------------------------------------------


    public void iniciarPartida(View view) {
    }

    public void corVermelha(View view) {
    }

    public void corAzul(View view) {
    }

    public void corVerde(View view) {
    }
}

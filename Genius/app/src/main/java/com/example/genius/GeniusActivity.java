package com.example.genius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
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
// --------------------tocar som--------------------------------------------------------------------
    // definir musica por numero que define  a cor dos botoes
    private void tocarSom(int qualSom) {
        MediaPlayer mp;
        switch (qualSom) {
            case 1:
                    mp = MediaPlayer.create(GeniusActivity.this, R.raw.mi);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                    @Override
                    public void onCompletion(MediaPlayer mp) {

                        mp.release();
                    }

                    });
                    mp.start();
                    break;
            case 2:
                     mp = MediaPlayer.create(GeniusActivity.this, R.raw.re);
                     mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                    @Override
                    public void onCompletion(MediaPlayer mp) {

                        mp.release();
                        }

                     });
                    mp.start();
                    break;
            case 3:
                    mp = MediaPlayer.create(GeniusActivity.this, R.raw.si);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                    @Override
                    public void onCompletion(MediaPlayer mp) {

                        mp.release();
                        }

                });
                    mp.start();
                    break;

            case 4:
                    mp = MediaPlayer.create(GeniusActivity.this, R.raw.sol);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                    @Override
                    public void onCompletion(MediaPlayer mp) {

                        mp.release();
                        }

                });
                    mp.start();
                    break;
        }
    }
// -------------------------------------------------------------------------------------------------


    public void iniciarPartida(View view) {

    }

    public void corVermelha(View view) {
        trocaImagem(view.getId(),R.drawable.vermelho_apagado,R.drawable.vermelho_aceso);
        tocarSom(1);

    }

    public void corAzul(View view) {
        trocaImagem(view.getId(),R.drawable.azul_apagado,R.drawable.azul_aceso);
        tocarSom(2);
    }

    public void corVerde(View view) {
        trocaImagem(view.getId(),R.drawable.verde_apagado,R.drawable.verde_aceso);
        tocarSom(3);
    }

    public void corAmarela(View view) {
        trocaImagem(view.getId(),R.drawable.amarelo_apagado,R.drawable.amarelo_aceso);
        tocarSom(4);
    }

}

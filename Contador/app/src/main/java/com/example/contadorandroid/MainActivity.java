package com.example.contadorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.contador = 0;
    }

    public void decrementar(View view) {
        // Decrementar contador
        this.contador -= 1;
        // Colocando mensagem na tela de saida
        TextView mensagem = findViewById(R.id.telaContagem);
        mensagem.setText(this.contador+"");
    }

    public void incrementar(View view) {
        // Incrementar contador
        this.contador += 1;
        // Colocando mensagem na tela de saida
        TextView mensagem = findViewById(R.id.telaContagem);
        mensagem.setText(this.contador+"");
    }

    public void zerar(View view) {
        // Incrementar contador
        this.contador = 0;
        // Colocando mensagem na tela de saida
        TextView mensagem = findViewById(R.id.telaContagem);
        mensagem.setText(this.contador+"");
    }
}

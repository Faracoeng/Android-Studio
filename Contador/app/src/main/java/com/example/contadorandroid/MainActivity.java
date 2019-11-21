package com.example.contadorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.contador = 0;
        if(savedInstanceState != null){
            this.contador = savedInstanceState.getInt("contador");
            TextView mensagem = findViewById(R.id.telaContagem);
            mensagem.setText(""+this.contador);
        }
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
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("contador",this.contador);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "startada");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "stopada");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "destruida");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "pausada");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "continuada");
    }
}

package com.example.app_teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Aplicação iniciada");
    }

    public void alterarTexto(View view) {
        // Pegar o texto da caixaDeTexto
        EditText caixa = findViewById(R.id.caixaTexto); //R significa RESOURCES, são os recursos da Tela que estamos criando
        String texto = caixa.getText().toString();
        // Colocando mensagem na tela de saida
        TextView mensagem = findViewById(R.id.mensagemTela);
        mensagem.setText(texto);
    }
}

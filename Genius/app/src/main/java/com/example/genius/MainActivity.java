package com.example.genius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public final static int VALOR_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Um Intent é um objeto que fornece vínculos de tempo de execução entre componentes
    // separados, como duas atividades. O Intent representa uma “intenção de fazer algo”
    // do aplicativo. Você pode usar intents para uma ampla variedade de tarefas, mas,
    // nesta lição, o intent iniciará outra atividade.
    public void novoJogo(View view) {

        Intent menssagemIntent = new Intent(this,ConfiguracaoActivity.class);
        startActivityForResult(menssagemIntent,VALOR_REQUEST);
    }

    public void ranking(View view) {
    }


}

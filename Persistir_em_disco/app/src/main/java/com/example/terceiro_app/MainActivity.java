package com.example.terceiro_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String sSharadPreFile = "br.edu.ifsc.sj.minhaspreferencias";
    private SharedPreferences mSharedPreferences;
    private int mContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mSharedPreferences = getSharedPreferences(sSharadPreFile,MODE_PRIVATE);
        // mContador = 0;
        mContador = mSharedPreferences.getInt("contador",0);
        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }

    // incrementando a textView
    public void decrementar(View view) {

        this.mContador--;
        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);


    }

    // decrementando a textView

    public void incrementar(View view) {
        this.mContador++;
        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor prefsEditor = mSharedPreferences.edit();

        prefsEditor.putInt("contador", mContador); // HasMap, utilizar no proj03 para armazenar placar, nome do jogador  e tempo , ou dificuldade

        prefsEditor.apply();

    }

    public void zerar(View view) {

        SharedPreferences.Editor prefsEditor = mSharedPreferences.edit();
        prefsEditor.clear();
        prefsEditor.apply();

        this.mContador = 0;

        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }
}

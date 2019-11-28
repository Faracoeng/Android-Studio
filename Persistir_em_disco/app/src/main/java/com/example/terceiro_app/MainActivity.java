package com.example.terceiro_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String sSharadPreFile = "br.edu.ifsc.sj.minhaspreferencias";
    private SharedPreferences mSharedPreferences;
    private int mContador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mSharedPreferences = getSharedPreferences(sSharadPreFile,MODE_PRIVATE);
        mContador = 0;
        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }

    public void decrementar(View view) {
        this.mContador--;
        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }

    public void incrementar(View view) {
        this.mContador++;
        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }
}

package com.example.comunicacoesacitivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
    }

//    public void botao01(View view) {
//        Intent menssagemIntent = new Intent(this,MainActivity.class);
//        startActivity(menssagemIntent);
//    }
//
//    public void botao02(View view) {
//        Intent menssagemIntent = new Intent(this,SegundaActivity.class);
//        startActivity(menssagemIntent);
//    }


    public void voltar(View view){
        Intent retorno = new Intent();
        Bundle extras = new Bundle();

        Button b = (Button) view;
        String rotulo = b.getText().toString();

        extras.putInt("contador",Integer.parseInt(rotulo));

        retorno.putExtras(extras);
        setResult(RESULT_OK,retorno);
        finish();
    }
}

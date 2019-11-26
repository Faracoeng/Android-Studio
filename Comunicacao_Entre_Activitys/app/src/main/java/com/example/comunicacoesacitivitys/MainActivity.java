package com.example.comunicacoesacitivitys;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public final static int VALOR_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botao02(View view) {
        Intent menssagemIntent = new Intent(this,SegundaActivity.class);
        //mandar varias informações em  HashMap
        Bundle extras = new Bundle();
        extras.putInt("contador",1);
        menssagemIntent.putExtras(extras);

        startActivity(menssagemIntent);
    }

    public void botao03(View view) {
        Intent menssagemIntent = new Intent(this,TerceiraActivity.class);
        startActivityForResult(menssagemIntent,VALOR_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VALOR_REQUEST){
            if (resultCode == RESULT_OK){
                Bundle extras = data.getExtras();

                int valor = extras.getInt("contador");

                //Todo colocar na TextView
                TextView view = findViewById(R.id.textView);
                view.setText(""+valor);
            }
        }
    }
}

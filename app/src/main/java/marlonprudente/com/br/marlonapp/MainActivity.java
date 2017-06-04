package marlonprudente.com.br.marlonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoiniciar = (Button)findViewById(R.id.botaoiniciar);
        Log.i("Main", "Main iniciada, botão criado!");
        botaoiniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar_pagina(v);
            }
        });
    }

    public void mostrar_pagina(View v){
        Intent it = new Intent(MainActivity.this, Calculadora.class);
        startActivity(it);
    }


}

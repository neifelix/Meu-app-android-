package com.meuapp.android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    private TextView textoTitulo;
    private Button botaoClicar;
    private int contador = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textoTitulo = findViewById(R.id.textoTitulo);
        botaoClicar = findViewById(R.id.botaoClicar);
        
        botaoClicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                textoTitulo.setText("Você clicou " + contador + " vezes!");
                Toast.makeText(MainActivity.this, "Clique número " + contador, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

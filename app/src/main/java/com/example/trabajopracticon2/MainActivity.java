package com.example.trabajopracticon2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSumar, btnResta, btnZoomMas, btnZoomMenos, btnOcultar, btnReiniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSumar = findViewById(R.id.btnSumar);
        btnResta = findViewById(R.id.btnResta);
        btnZoomMas = findViewById(R.id.btnZoomMas);
        btnZoomMenos = findViewById(R.id.btnZoomMenos);
        btnOcultar = findViewById(R.id.btnOcultar);
        btnReiniciar = findViewById(R.id.btnReiniciar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Funciona Sumar", Toast.LENGTH_SHORT).show();
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Funciona Resta", Toast.LENGTH_SHORT).show();
            }
        });

        btnZoomMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Funciona Zoom +", Toast.LENGTH_SHORT).show();
            }
        });

        btnZoomMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Funciona Zoom -", Toast.LENGTH_SHORT).show();
            }
        });

        btnOcultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Funciona Ocultar", Toast.LENGTH_SHORT).show();
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Funciona Reiniciar", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

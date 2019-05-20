package com.example.appgrupo;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    Button btnInicio,btnMas,btnCalendario,btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        findViewById(R.id.btnhome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Inicio.this.startActivity(new Intent(Inicio.this,Inicio.class));
            }
        });
        findViewById(R.id.btncalendario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Inicio.this.startActivity(new Intent(Inicio.this,Calendario.class));
            }
        });
        findViewById(R.id.btnmas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Inicio.this.startActivity(new Intent(Inicio.this,Mas.class));
            }
        });
        findViewById(R.id.btninfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Inicio.this.startActivity(new Intent(Inicio.this, Informacion.class));
            }
        });


    }
}

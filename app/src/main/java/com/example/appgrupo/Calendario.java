package com.example.appgrupo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Calendario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        findViewById(R.id.btnhome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendario.this.startActivity(new Intent(Calendario.this,Inicio.class));
            }
        });
        findViewById(R.id.btncalendario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendario.this.startActivity(new Intent(Calendario.this,Calendario.class));
            }
        });
        findViewById(R.id.btnmas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendario.this.startActivity(new Intent(Calendario.this,Mas.class));
            }
        });
        findViewById(R.id.btninfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendario.this.startActivity(new Intent(Calendario.this, Informacion.class));
            }
        });
    }
}

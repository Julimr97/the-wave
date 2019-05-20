package com.example.appgrupo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas);
        findViewById(R.id.btnhome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mas.this.startActivity(new Intent(Mas.this,Inicio.class));
            }
        });
        findViewById(R.id.btncalendario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mas.this.startActivity(new Intent(Mas.this,Calendario.class));
            }
        });
        findViewById(R.id.btnmas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mas.this.startActivity(new Intent(Mas.this,Mas.class));
            }
        });
        findViewById(R.id.btninfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mas.this.startActivity(new Intent(Mas.this, Informacion.class));
            }
        });
    }
}

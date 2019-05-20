package com.example.appgrupo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Informacion extends AppCompatActivity {

    Button button;
    TextView textView;
    ImageView imageView;
    Button button2;
    Button button3;
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        findViewById(R.id.btnhome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Informacion.this.startActivity(new Intent(Informacion.this,Inicio.class));
            }
        });
        findViewById(R.id.btncalendario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Informacion.this.startActivity(new Intent(Informacion.this,Calendario.class));
            }
        });
        findViewById(R.id.btnmas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Informacion.this.startActivity(new Intent(Informacion.this,Mas.class));
            }
        });
        findViewById(R.id.btninfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Informacion.this.startActivity(new Intent(Informacion.this, Informacion.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textview);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        imageView = findViewById(R.id.imagen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("HOLA PREDICCION");
                textView.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.GONE);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ciclo));
                textView.setVisibility(View.GONE);
                imageView.setVisibility(View.VISIBLE);
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ciclo));
                textView.setVisibility(View.GONE);
                imageView.setVisibility(View.VISIBLE);
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("HOLA PREDICCION");
                textView.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.GONE);
            }

        });
    }
}
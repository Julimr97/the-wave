package com.example.appgrupo;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    Button btnInicio,btnMas,btnCalendario,btnInfo;

    Button btnFechaInicio, btnFechaFin;
    EditText HoraTxt, HoraTxt2;
    private int dia,mes,ano;

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

        btnFechaInicio=(Button)findViewById(R.id.btnFechaInicio);
        btnFechaFin=(Button)findViewById(R.id.btnFechaFin);
        HoraTxt=(EditText)findViewById(R.id.HoraTxt);
        HoraTxt2=(EditText)findViewById(R.id.HoraTxt2);
        btnFechaInicio.setOnClickListener(this);
        btnFechaFin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnFechaInicio){
            final Calendar c= Calendar.getInstance();
            dia= c.get(Calendar.DAY_OF_MONTH);
            mes= c.get(Calendar.MONTH);
            ano= c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    HoraTxt.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
                }
            }
            ,dia,mes,ano);
            datePickerDialog.show();
        }
        if (v==btnFechaFin){
            final Calendar c= Calendar.getInstance();
            dia= c.get(Calendar.DAY_OF_MONTH);
            mes= c.get(Calendar.MONTH);
            ano= c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    HoraTxt2.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
                }
            }
                    ,dia,mes,ano);
            datePickerDialog.show();
        }

    }
}

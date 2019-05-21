package com.example.appgrupo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
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
                textView.setText(
                        "Hay mayores probabilidad de que seas irregular si:" + Html.fromHtml("<br />") +
                        "➢ Eres adolescente(menor a 20 años)" + Html.fromHtml("<br />") +
                        "➢ Estuviste recientemente embarazada" + Html.fromHtml("<br />") +
                        "➢ Estás amamantando" + Html.fromHtml("<br />") +
                        "➢ Eres una mujer perimenopáusica(45 años o más)" + Html.fromHtml("<br />") +
                        "➢ Tienes una condición médica que afecta el ciclo menstrual(por ejemplo, síndrome de ovario poliquístico(SOP), desorden de la tiroides o endometriosis)");
                textView.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.GONE);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(
                        "La ventana de fertilidad nunca se mostrará para aquellos ciclos en los que " +
                                " indicado en The Wave que estás usando anticonceptivos hormonales(píldora, anillo vaginal, parche, DIU o implante)."+ Html.fromHtml("<br />") +
                        "Tener la ventana de fertilidad de fertilidad activada para tus otros ciclos puede ser útil si:" + Html.fromHtml("<br />") +
                                "➢Deseas ver tu ventana de fertilidad estimada para tu ciclo actual, así como para los anteriores y los siguientes " + Html.fromHtml("<br />") +
                                "➢Ovulos" + Html.fromHtml("<br />") +
                                "➢Tus ciclos son lo suficientemente regulares como para hacer predicciones útiles");
                textView.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.GONE);
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
                textView.setText("Política de Privacidad para aplicaciones\n" +
                        "móviles.\n" + Html.fromHtml("<br />") +
                        "La información que tienen la obligación de incluir las apps en su política\n" +
                        "de privacidad debe ser lo más clara y completa posible. Un ejemplo de\n" +
                        "política de privacidad utilizada en aplicaciones debería incluir los\n" +
                        "siguientes apartados:\n" + Html.fromHtml("<br />") +
                        "➢Recogida y tratamiento de datos de carácter personal\n" +
                        "➢Los datos de carácter personal son los que pueden ser utilizados para\n" +
                        "identificar a una persona o ponerse en contacto con ella.\n");
                textView.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.GONE);
            }

        });
    }
}
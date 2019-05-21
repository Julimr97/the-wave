package com.example.appgrupo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;

public class MainActivity extends AppCompatActivity {

    HorizontalScrollMenuView menu;
    TextView textView;
   // Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ARREGLAR QUE SE QUITA LA PANTALLA DE LOGIN Y SALE LA DE INICIO DIRECTAMENTE
        //CREO QUE SE ARREGLARIA CON UN ONCLICK BOTON LOGIN Y UN IF
        setContentView(R.layout.activity_main);

        Button btnlogin = (Button) findViewById(R.id.entrar);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario=((EditText) findViewById(R.id.usuario)).getText().toString();
                String pass=((EditText) findViewById(R.id.password)).getText().toString();
                if (usuario.equals("grupo")&& pass.equals("wave"))
                {
                    startActivity(new Intent(MainActivity.this, Inicio.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario y/o Contraseña Incorrecto/s",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

  /*
        setContentView(R.layout.activity_inicio);

       menu = (HorizontalScrollMenuView)findViewById(R.id.menu) ;
        textView = (TextView)findViewById(R.id.txtText);

        //creamos un metodo para añadir el menu
        initMenu();
    }

    private void initMenu() {
        menu.addItem("Inicio",R.drawable.inicio);
        menu.addItem("Calendario",R.drawable.ic_action_name);
        menu.addItem("Añadir",R.drawable.mas);
        menu.addItem("Informacion",R.drawable.informacion);

        menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener() {
            @Override
            public void onHSMClick(MenuItem menuItem, int position) {
                Toast.makeText(MainActivity.this, ""+menuItem.getText(), Toast.LENGTH_SHORT).show();
               // textView.setText(menuItem.getText());
            }
        });
        */
    }







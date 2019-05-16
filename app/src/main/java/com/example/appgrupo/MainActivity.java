package com.example.appgrupo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;

public class MainActivity extends AppCompatActivity {

    HorizontalScrollMenuView menu;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ARREGLAR QUE SE QUITA LA PANTALLA DE LOGIN Y SALE LA DE INICIO DIRECTAMENTE
        //CREO QUE SE ARREGLARIA CON UN ONCLICK BOTON LOGIN Y UN IF
        setContentView(R.layout.activity_main);


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
                textView.setText(menuItem.getText());
            }
        });
    }





    public String uid;
    public String nombre;
    public String contraseña;

    public MainActivity() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

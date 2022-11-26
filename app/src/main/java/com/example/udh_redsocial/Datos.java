package com.example.udh_redsocial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Datos extends AppCompatActivity {
    private TextView txtcorreo, txtpassword, txtnombre, txtapellido, txtedad, txttelefono, txtdireccion;
    Button retroceder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Datos");

        txtcorreo = (TextView) findViewById(R.id.txtcorreo);
        txtpassword = (TextView) findViewById(R.id.txtpassword);
        txtnombre = (TextView) findViewById(R.id.txtnombre);
        txtapellido = (TextView) findViewById(R.id.txtapellido);
        txtedad = (TextView) findViewById(R.id.txtedad);
        txttelefono = (TextView) findViewById(R.id.txttelefono);
        txtdireccion = (TextView) findViewById(R.id.txtdireccion);

        String correo = getIntent().getStringExtra("correo");
        txtcorreo.setText(correo);
        String password = getIntent().getStringExtra("password");
        txtpassword.setText(password);
        String nombre = getIntent().getStringExtra("nombres");
        txtnombre.setText(nombre);
        String apellido = getIntent().getStringExtra("apellidos");
        txtapellido.setText(apellido);
        String edad = getIntent().getStringExtra("edad");
        txtedad.setText(edad);
        String telefono = getIntent().getStringExtra("telefono");
        txttelefono.setText(telefono);
        String direccion = getIntent().getStringExtra("direccion");
        txtdireccion.setText(direccion);

    }


    public void volver(View view) {
        Intent i = new Intent(this, Inicio.class);
        startActivity(i);

    }
}
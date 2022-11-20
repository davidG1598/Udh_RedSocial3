package com.example.udh_redsocial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    EditText texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null; //DECIMOS QUE EL TITULO NO ES NULL
        actionBar.setTitle("Inicio");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        texto =(EditText)findViewById(R.id.correo);



    }

    public void datosUser(View view) {
        startActivity(new Intent(Inicio.this, Datos.class));
        Toast.makeText(this, "Tus datos", Toast.LENGTH_SHORT).show();
    }
}
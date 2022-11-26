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

        texto =(EditText)findViewById(R.id.correo);

    }

    public void datosUser(View view) {
        startActivity(new Intent(this, Datos.class));
        Toast.makeText(this, "Tus datos", Toast.LENGTH_SHORT).show();
    }

    public void crearPost(View view) {
        startActivity(new Intent(this, CrearPost.class));
        Toast.makeText(this, "Redacta tu post", Toast.LENGTH_SHORT).show();
    }

    public void ver_post(View view) {
        startActivity(new Intent(this, VerPost.class));
        Toast.makeText(this, "Vista de post", Toast.LENGTH_SHORT).show();
    }
}
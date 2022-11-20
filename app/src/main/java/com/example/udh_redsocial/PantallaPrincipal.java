package com.example.udh_redsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        //tiempo de carga
        final int duracion = 2500;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // aqui se ejecuta pasados los segundos detenminados
                Intent intent = new Intent(PantallaPrincipal.this, MainActivity.class);
                startActivity(intent);
                //Redirige al sigueinte activity
            }
        },duracion);

    }
}
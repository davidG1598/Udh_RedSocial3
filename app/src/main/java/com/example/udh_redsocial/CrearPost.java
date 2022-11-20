package com.example.udh_redsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CrearPost extends AppCompatActivity {
    TextView correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_post);
        correo =(EditText)findViewById(R.id.correo);
    }
}
package com.example.udh_redsocial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.firestore.FirebaseFirestore;

public class Registro extends AppCompatActivity {
    EditText correo, password, nombres, apellidos,edad,telefono,direccion;
    Button REGISTRARUSUARIO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        correo =(EditText)findViewById(R.id.correo);
        password =(EditText)findViewById(R.id.password);
        nombres =(EditText)findViewById(R.id.nombres);
        apellidos =(EditText)findViewById(R.id.apellidos);
        edad =(EditText)findViewById(R.id.edad);
        telefono =(EditText)findViewById(R.id.telefono);
        direccion =(EditText)findViewById(R.id.direccion);


    }

    public void regitrarme(View view) {
        Intent i = new Intent(this, Datos.class);
        i.putExtra("correo",correo.getText().toString());
        i.putExtra("password",password.getText().toString());
        i.putExtra("nombres",nombres.getText().toString());
        i.putExtra("apellidos",apellidos.getText().toString());
        i.putExtra("edad",edad.getText().toString());
        i.putExtra("telefono",telefono.getText().toString());
        i.putExtra("direccion",direccion.getText().toString());

        startActivity(i);

    }

}
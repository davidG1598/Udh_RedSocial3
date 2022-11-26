package com.example.udh_redsocial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Registro extends AppCompatActivity {
    EditText correo, password, nombres, apellidos,edad,telefono,direccion;

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        //PONER TITULO EN EL TOOLBAR
        ActionBar actionBar = getSupportActionBar();
        assert actionBar !=null;
        actionBar.setTitle("Registro");

        db = FirebaseFirestore.getInstance();

        /* ********************************************************* */

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
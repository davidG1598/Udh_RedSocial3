package com.example.udh_redsocial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class Login extends AppCompatActivity {
    FirebaseFirestore db;
    EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Login");

        user = findViewById(R.id.correoLogin);
        pass = findViewById(R.id.passLogin);
    }

    public void accesoLogin(View view) {
        String username = user.getText().toString();
        String password = pass.getText().toString();

        db = FirebaseFirestore.getInstance();

        db.collection("estudiante")
                .whereEqualTo("nombre", username)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            String passwordDB="";
                            int count = 0;

                            for (QueryDocumentSnapshot document : task.getResult()) {
                                passwordDB = document.get("password").toString();
                                count ++;
                            }
                            Intent intent = new Intent(Login.this, Inicio.class);
                            startActivity(intent);
                            Toast.makeText(Login.this, "ACCESO EXITOSO", Toast.LENGTH_SHORT).show();

                        } else {
                            Log.w("TAG2", "Error getting documents.", task.getException());
                        }
                    }
                });


    }
}
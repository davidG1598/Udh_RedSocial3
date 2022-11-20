package com.example.udh_redsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore db;
    Button loginBTN, registrarBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBTN = findViewById(R.id.loginBTN);
        registrarBTN = findViewById(R.id.registrarBTN);

        db = FirebaseFirestore.getInstance();

        db.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d("TAG", document.getId() + " => " + document.getData());
                            }
                        } else {
                            Log.w("TAG2", "Error getting documents.", task.getException());
                        }
                    }
                });
    }











    public void logueo(View view) {
        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
       // startActivity(new Intent(MainActivity.this, Login.class));
        Toast.makeText(this, "Accede con tu cuenta UDH", Toast.LENGTH_SHORT).show();

    }

    public void registro(View view) {
        startActivity(new Intent(MainActivity.this, Registro.class));
        Toast.makeText(this, "Registra tus datos", Toast.LENGTH_SHORT).show();
    }
}
package com.example.udh_redsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class PantallaPrincipal extends AppCompatActivity {
    FirebaseFirestore db;

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

        /*

        db = FirebaseFirestore.getInstance();

        db.collection("idEstudiante")
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
                }); */


    }
}
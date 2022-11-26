package com.example.udh_redsocial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VerPost extends AppCompatActivity {
     TextView txtVista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_post);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Vista_Post");

        txtVista = (TextView) findViewById(R.id.txtVista);

        String vista = getIntent().getStringExtra("etpost");
        txtVista.setText(vista);
    }
}
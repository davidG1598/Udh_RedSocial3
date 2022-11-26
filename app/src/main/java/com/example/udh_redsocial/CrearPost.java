package com.example.udh_redsocial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CrearPost extends AppCompatActivity {
    EditText etpost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_post);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Post");
        etpost =(EditText)findViewById(R.id.etpost);
    }
    public void bntcrearpost(View view) {
        Intent i = new Intent(this, VerPost.class);
        i.putExtra("etpost",etpost.getText().toString());
        startActivity(i);

    }
}
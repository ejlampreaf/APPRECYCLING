package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class activity_cerrarSesion extends AppCompatActivity {

    private Button mcerrarSesion;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerrar_sesion);

        mAuth = FirebaseAuth.getInstance();
        mcerrarSesion =(Button) findViewById(R.id.cerrarSesion);
        mcerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Toast.makeText(getApplicationContext(), "Cerrando sesión.", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(activity_cerrarSesion.this, Loginactivity.class));
                finish();
            }
        });
    }


}
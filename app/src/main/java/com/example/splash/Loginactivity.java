package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Loginactivity extends AppCompatActivity {

    private EditText n, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT > 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        setContentView(R.layout.activity_loginactivity);


        n = (EditText)findViewById(R.id.camponombreis);
        p = (EditText)findViewById(R.id.campopasswordis);
    }

    public void ingresar (View view){
        String nombre = n.getText().toString();
        String contrasena = p.getText().toString();

        if (nombre.length() == 0){
            Toast.makeText(this, "Ingresa un nombre", Toast.LENGTH_LONG).show();
        } if (contrasena.length() == 0){
            Toast.makeText(this, "Ingresa una contraseña", Toast.LENGTH_LONG).show();
        } if (nombre.length() != 0 && contrasena.length() != 0 ){
            Toast.makeText(this, "Ingresando al home", Toast.LENGTH_LONG).show();
        }
    }

    public void registrarme(View view){
        Intent registrarse = new Intent(this, registroActivity.class);
        startActivity(registrarse);
    }
}
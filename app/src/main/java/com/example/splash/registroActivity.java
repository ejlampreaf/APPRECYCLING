package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class registroActivity extends AppCompatActivity {

    private EditText email, pass, nom, ape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT > 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(R.layout.activity_registro);

        email = (EditText)findViewById(R.id.campocorreor);
        pass = (EditText)findViewById(R.id.campopassr);
        nom = (EditText)findViewById(R.id.camponombrer);
        ape = (EditText)findViewById(R.id.campoapellidor);
    }

    public void already(View view){
        Intent alcuenta = new Intent(this, Loginactivity.class);
        startActivity(alcuenta);
    }

    public void registro(View view){
        String correo = email.getText().toString();
        String password = pass.getText().toString();
        String name = nom.getText().toString();
        String lastname = ape.getText().toString();

        if (correo.length() == 0){
            Toast.makeText(this, "Ingresa un correo", Toast.LENGTH_LONG).show();
        } if (password.length() == 0){
            Toast.makeText(this, "Ingresa una contraseña", Toast.LENGTH_LONG).show();
        } if (name.length() == 0){
            Toast.makeText(this, "Ingresa un nombre", Toast.LENGTH_LONG).show();
        }if (lastname.length() == 0){
            Toast.makeText(this, "Ingresa un apellido", Toast.LENGTH_LONG).show();
        }

        if (correo.length() != 0 && password.length() != 0 && name.length() != 0 && lastname.length() != 0){
            Intent doner = new Intent(this, mensaje.class);
            startActivity(doner);
        }
    }
}
    package com.example.splash;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

    public class Loginactivity extends AppCompatActivity{

    EditText nombre;
    EditText password;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT > 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        setContentView(R.layout.activity_loginactivity);
        initViews();
    }

    private void initViews(){

        mAuth = FirebaseAuth.getInstance();
        nombre = (EditText)findViewById(R.id.camponombreis);
        password = (EditText)findViewById(R.id.campopasswordis);
    }

    public void btnr(View view){
        Intent register = new Intent(this, registroActivity.class);
        startActivity(register);

    }


    public void IngresarL(View view) {

        if (TextUtils.isEmpty(nombre.getText()) || TextUtils.isEmpty(password.getText())){
            Toast.makeText(this, "Campos incompletos", Toast.LENGTH_LONG).show();
        }else {
            String email = nombre.getText().toString();
            String pass = password.getText().toString();
            acceder(email, pass);
        }
    }

    private void acceder(String email, String password){
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                            startActivity(i);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "Datos incorrectos, intenta de nuevo", Toast.LENGTH_LONG).show();
                        }

                        // ...
                    }
                });
    }

        public void recuperarcontrasena(View view) {



        if (TextUtils.isEmpty(nombre.getText())){
            Toast.makeText(this, "Introduce un correo en el campo correo y vuelve a presionar este botón", Toast.LENGTH_LONG).show();
        }else {
            String email= nombre.getText().toString();

            mAuth.sendPasswordResetEmail(email)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(getApplicationContext(), "Se ha enviado un correo para restablecer la contraseña", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }

        }
    }
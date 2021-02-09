package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class registroActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText email, pass, nom, ape;

    private Button btnregistrarme;

    dUsuario du;

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
        btnregistrarme=(Button)findViewById(R.id.btnregistrarme);

        btnregistrarme.setOnClickListener(this);
        du = new dUsuario(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnregistrarme:
                    Usuario u= new Usuario();

                    u.setCorreo(email.getText().toString());
                    u.setContrasena(pass.getText().toString());
                    u.setNombre(nom.getText().toString());
                    u.setApellido(ape.getText().toString());


                    if (!u.isNull()){
                        Toast.makeText(this,"Error Campos vacios", Toast.LENGTH_LONG).show();
                    }else if (du.insertUsuario(u)){
                        Intent registrarme = new Intent(this, Loginactivity.class);
                        Toast.makeText(this,"Registrado correctamente", Toast.LENGTH_LONG).show();
                        startActivity(registrarme);
                        finish();
                    }else {
                        Toast.makeText(this,"Usuario ya registrado", Toast.LENGTH_LONG).show();
                    }


                break;
        }
    }
}
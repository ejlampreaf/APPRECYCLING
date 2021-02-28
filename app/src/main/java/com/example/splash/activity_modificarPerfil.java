package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_modificarPerfil extends AppCompatActivity {

    private EditText IngNombre, IngEdad, IngSexo, IngCiudad, IngPensamiento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_perfil);

        IngNombre = (EditText)findViewById(R.id.IngNombre);
        IngEdad = (EditText)findViewById(R.id.IngEdad);
        IngSexo = (EditText)findViewById(R.id.IngSexo);
        IngCiudad = (EditText)findViewById(R.id.IngCiudad);
        IngPensamiento = (EditText)findViewById(R.id.IngPensamiento);


    }

    //Metodo para el boton guardar
    public void Enviar(View view) {


        Intent i = new Intent(this, activity_verPerfil.class);
        i.putExtra ("dato", IngNombre.getText().toString());
        i.putExtra ("dato1", IngEdad.getText().toString());
        i.putExtra ("dato2", IngSexo.getText().toString());
        i.putExtra ("dato3", IngCiudad.getText().toString());
        i.putExtra ("dato4", IngPensamiento.getText().toString());
        startActivity(i);
    }
}
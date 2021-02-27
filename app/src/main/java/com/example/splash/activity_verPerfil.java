package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_verPerfil extends AppCompatActivity {
    TextView perf_nombre, perf_edad, perf_sexo, perf_ciudad, perf_pensamiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_perfil);

        perf_nombre = (TextView)findViewById(R.id.perf_nombre) ;
        perf_edad = (TextView)findViewById(R.id.perf_edad) ;
        perf_sexo = (TextView)findViewById(R.id.perf_sexo) ;
        perf_ciudad = (TextView)findViewById(R.id.perf_ciudad) ;
        perf_pensamiento = (TextView)findViewById(R.id.perf_pensamiento) ;


        String midato, midato1, midato2, midato3, midato4;
        Intent intent = getIntent();

        midato = intent.getStringExtra("dato");
        midato1 = intent.getStringExtra("dato1");
        midato2 = intent.getStringExtra("dato2");
        midato3 = intent.getStringExtra("dato3");
        midato4 = intent.getStringExtra("dato4");

        perf_nombre.setText(midato);
        perf_edad.setText(midato1);
        perf_sexo.setText(midato2);
        perf_ciudad.setText(midato3);
        perf_pensamiento.setText(midato4);
    }
}
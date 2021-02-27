package com.example.splash;

import android.Manifest;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.dynamic.IFragmentWrapper;


public class verPerfil extends AppCompatActivity {

    private TextView perf_nombre, perf_edad, perf_sexo, perf_ciudad, perf_pensamiento;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_perfil);

        perf_nombre = (TextView)findViewById(R.id.perf_nombre) ;
        perf_edad = (TextView)findViewById(R.id.perf_edad) ;
        perf_sexo = (TextView)findViewById(R.id.perf_sexo) ;
        perf_ciudad = (TextView)findViewById(R.id.perf_ciudad) ;
        perf_pensamiento = (TextView)findViewById(R.id.perf_pensamiento) ;

        String dato = getIntent().getStringExtra("dato") ;
        perf_nombre.setText(dato);
        String dato1 = getIntent().getStringExtra("dato1") ;
        perf_edad.setText(dato1);
        String dato2 = getIntent().getStringExtra("dato2") ;
        perf_sexo.setText(dato2);
        String dato3 = getIntent().getStringExtra("dato3") ;
        perf_ciudad.setText(dato3);
        String dato4 = getIntent().getStringExtra("dato4") ;
        perf_pensamiento.setText(dato4);
    }






}








package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Info_TiposDescripcionActivity extends AppCompatActivity {

    public TextView textViewtiposdescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__tipos_descripcion);
        textViewtiposdescripcion = (TextView)findViewById(R.id.textviewtiposdescripcion);


    }

}
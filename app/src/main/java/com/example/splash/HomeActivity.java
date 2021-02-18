package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.splash.ui.MapsActivityLugares;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        
        
        

      }

    private void StartActivity(Intent intent) {
    }

    //Metodo para ir a la actvity informacion
    public void Informacion(View view){
        Intent informacion = new Intent(this, InfoActivity.class);
        startActivity(informacion);
    }

    //Metodo para ir a la Activity Beneficios
    public void Beneficios (View view){
        Intent beneficios = new Intent (this, BeneficiosActivity.class);
        startActivity(beneficios);
            }

    //Metodo para ir a la Activity Lugares
    public void Lugares (View view) {
        Intent lugares = new Intent(this, activity_lugares.class);
        startActivity(lugares);

    }








}
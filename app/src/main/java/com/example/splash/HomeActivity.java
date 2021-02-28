package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.splash.ui.MapsActivityLugares;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
      }

    private void StartActivity(Intent intent) {
    }

    //Metodo para ir a la actvity Informacion
    public void Informacion(View view){
        Intent informacion = new Intent(this, InfoActivity.class);
        startActivity(informacion);
    }

    //Metodo para ir a la actvity Daños
    public void Danos(View view){
        Intent danos = new Intent(this, Info_DanosActivity.class);
        startActivity(danos);
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

    //Logica para incorporar el menu overfloat a la aplicación

    //Metodo para mostrar los botones de accion
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.overflow2, menu);
        return true;
    }

    //Metodo para asignar las funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.verPerfil:
                Intent intent1 = new Intent(this, activity_verPerfil.class);
                startActivity(intent1);
                return true;
            case R.id.comoReciclar:
                Intent intent2 = new Intent(this, activity_comoReciclar.class);
                startActivity(intent2);
                return true;
            case R.id.Simbolos:
                Intent intent3 = new Intent(this, activity_simbolos.class);
                startActivity(intent3);
                return true;
            case R.id.modificarPerfil:
                Intent intent4 = new Intent(this, activity_modificarPerfil.class);
                startActivity(intent4);
                return true;
            case R.id.miAyuda:
                Intent intent5 = new Intent(this, activity_miAyuda.class);
                startActivity(intent5);
                return true;


        }
        return super.onOptionsItemSelected(item);

    }








}
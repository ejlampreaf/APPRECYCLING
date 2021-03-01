package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
            case R.id.volver:
                Intent intent6 = new Intent(this, HomeActivity.class);
                startActivity(intent6);
                return true;
            case R.id.cerrarSesion:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
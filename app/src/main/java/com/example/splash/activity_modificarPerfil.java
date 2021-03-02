package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        IngNombre.setText(preferences.getString("nombre", ""));
        IngEdad.setText(preferences.getString("edad", ""));
        IngSexo.setText(preferences.getString("sexo", ""));
        IngCiudad.setText(preferences.getString("ciudad", ""));
        IngPensamiento.setText(preferences.getString("pensamiento", ""));
    }

    //Metodo para el boton guardar
    public void Enviar(View view) {

        Intent i = new Intent(this, activity_verPerfil.class);
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferencias.edit();
        Obj_editor.putString("nombre", IngNombre.getText().toString());
        Obj_editor.putString("edad", IngEdad.getText().toString());
        Obj_editor.putString("sexo", IngSexo.getText().toString());
        Obj_editor.putString("ciudad", IngCiudad.getText().toString());
        Obj_editor.putString("pensamiento", IngPensamiento.getText().toString());
        Obj_editor.commit();

        startActivity(i);
    }





    private void StartActivity(Intent intent) {
    }

    //Metodo para ir a la actvity Informacion
    public void Informacion(View view){
        Intent informacion = new Intent(this, InfoActivity.class);
        startActivity(informacion);
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
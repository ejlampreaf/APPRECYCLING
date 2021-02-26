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

    //Metodo para mostrar los botones de accion
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.overflow2, menu);
        return true;
    }

    //Metodo para asignar las funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id==R.id.verPerfil){
            Toast.makeText(this, "ver el perfil", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.comoReciclar){
            Toast.makeText(this, "ver como reciclar", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.Simbolos){
            Toast.makeText(this, "ver los simbolos", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.modificarPerfil){
            Toast.makeText(this, "ver modificar perfil", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.miAyuda){
            Toast.makeText(this, "ver la ayuda", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);

    }








}
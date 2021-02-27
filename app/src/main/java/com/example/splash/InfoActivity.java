package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    //Metodo para ir a la actvity Info_TiposActivity
    public void Tipos (View view){
        Intent tipos = new Intent(this, Info_TiposActivity.class);
        startActivity(tipos);
    }

    //Metodo para ir a la Activity ElementosReciclablesActivity
    public void Elementos (View view){
        Intent elementos = new Intent (this, Info_ElementosReciclablesActivity.class);
        startActivity(elementos);
    }

    //Metodo para ir a la Activity Info_CuidadosAmbientales
    public void Cuidados (View view) {
        Intent cuidados = new Intent(this, Info_CuidadosAmbientales.class);
        startActivity(cuidados);
    }




    //Metodo para mostrar los botones de accion
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menuacciones, menu);
        return true;
    }

    //Metodo para agregar acciones basicas a los botones

    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();

        if(id == R.id.itemcompartir){
            Intent regresar = new Intent(this, HomeActivity.class);
            startActivity(regresar);
            return true;
        }
        else
        if(id == R.id.itemdescargar){
            Intent regresar = new Intent(this, HomeActivity.class);
            startActivity(regresar);
            return true;
        }
        else
        if(id == R.id.itemhome) {
            Intent regresar = new Intent(this, HomeActivity.class);
            startActivity(regresar);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}



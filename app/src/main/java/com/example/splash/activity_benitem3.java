package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class activity_benitem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benitem3);
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
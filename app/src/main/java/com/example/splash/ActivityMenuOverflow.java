package com.example.splash;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMenuOverflow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    //Metodo para mostrar y ocultar el menu overfloat2
    public boolean onCreateOptionsMenu(Menu menu){
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

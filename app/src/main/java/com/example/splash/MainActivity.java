package com.example.splash;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT > 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        setContentView(R.layout.activity_main);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent   intent = new Intent(MainActivity.this, Loginactivity.class);
                startActivity(intent);

                finish();
            }
        };

        Timer tiempo = new Timer();

        tiempo.schedule(tarea, 4000);
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
        else if (id==R.id.cerrarSesion){
            Toast.makeText(this, "cerrar Sesión", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);

    }





}
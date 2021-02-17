package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BeneficiosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficios);
    }

    //Metodos para ir a la Activity de de cada uno de los items de beneficios
    public void Benitem1 (View view){
        Intent benitem1 = new Intent (this, activity_benitem1.class);
        startActivity(benitem1);
    }

    public void Benitem2 (View view){
        Intent benitem2 = new Intent (this, activity_benitem2.class);
        startActivity(benitem2);
    }

    public void Benitem3 (View view){
        Intent benitem3 = new Intent (this, activity_benitem3.class);
        startActivity(benitem3);
    }

    public void Benitem4 (View view){
        Intent benitem4 = new Intent (this, activity_benitem4.class);
        startActivity(benitem4);
    }
    public void Benitem5 (View view){
        Intent benitem5 = new Intent (this, activity_benitem5.class);
        startActivity(benitem5);
    }

    public void Benitem6 (View view){
        Intent benitem6 = new Intent (this, activity_benitem6.class);
        startActivity(benitem6);
    }

    public void Benitem7 (View view){
        Intent benitem7 = new Intent (this, activity_benitem7.class);
        startActivity(benitem7);
    }
}
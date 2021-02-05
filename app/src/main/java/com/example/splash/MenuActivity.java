package com.example.splash;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ClipData;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    // hacemos referencia a lo creado para el toolbar
    DrawerLayout mDraverLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mDraverLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        getSupportFragmentManager().beginTransaction().add(R.id.content, new HomeFragment()).commit();
        setTitle("Inicio");

        //Setup toolbar
        setSupportActionBar(toolbar);

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        selectItemNav(item);
        return false;
    }

    private void selectItemNav(MenuItem item) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        switch (item.getItemId()){
            case R.id.nav_home:
                ft.replace(R.id.content, new HomeFragment()).commit();
                break;
            case R.id.nav_comoreciclar:
                ft.replace(R.id.content, new ComoreciclarFragment()).commit();
                break;
            case R.id.nav_simbologia:
                ft.replace(R.id.content, new SimbologiaFragment()).commit();
                break;
            case R.id.nav_perfil:
                ft.replace(R.id.content, new PerfilFragment()).commit();
                break;
            case R.id.nav_miayuda:
                ft.replace(R.id.content, new AyudaFragment()).commit();
                break;
        }
        setTitle(item.getTitle());
        mDraverLayout.closeDrawer();
    }
}
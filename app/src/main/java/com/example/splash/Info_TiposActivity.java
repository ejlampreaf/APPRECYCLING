package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Info_TiposActivity extends AppCompatActivity {

    private ListView listviewtipos;
    private TextView textViewtipos;

    private String [][]datos = {
            {"Reciclaje de papel y cartón", "Descripcion - Reciclaje de papel y cartón"},
            {"Reciclaje de vidrio", "Descripcion - Reciclaje de vidrio"},
            {"Reciclaje de textil y calzado", "Descripcion - Reciclaje de textil y calzado"},
            {"Reciclaje de residuos orgánicos (biorresiduos)", "Descripcion - Reciclaje de residuos orgánicos (biorresiduos)"},
            {"Reciclaje de pilas y baterías", "Descripcion - Reciclaje de pilas y baterías"},
            {"Reciclaje de chatarra o metales", "Descripcion - Reciclaje de chatarra o metales"},
            {"Reciclaje de tierras y escombros", "Descripcion - Reciclaje de tierras y escombros"},
            {"Reciclaje de agua", "Descripcion - Reciclaje de papel y cartón"},
            {"Reciclaje de aparatos eléctricos y electrónicos", "Descripcion - Reciclaje de aparatos eléctricos y electrónicos"},
            {"Reciclaje de basura", "Descripcion - Reciclaje de basura"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tipos);


        }


        }




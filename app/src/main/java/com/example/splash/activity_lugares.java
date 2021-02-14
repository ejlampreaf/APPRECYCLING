package com.example.splash;

/**********************************************/
/****Deiner Ariza feb-13-2021******************/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class activity_lugares extends AppCompatActivity {

    //Declaracion de arrays que contienen los valores de las localidades y direcciones
    //son dos arrays localidad y ubicacion
    private String[] localidad = {"Engativa", "Kennedy", "Fontibon", "Antonio Nariño","Chapinero"};
    private String[] ubicacion = {"C. C Titan Plaza, Cra72 80-94", "Tranv 71d # 6-94Sur", "AV Ciudad de Cali con AV Ferrocarril, cl20 #82-52", "C Comercial Centro Mayor AV. NQS # cra38a sur",
            "C Comercial 93, Carrera 15 # 93-60"};
    //Se definen los objetos tipo textview y listview
    private TextView tv1;
    private ListView list1;

    //Sobre el evento create se configura (ser adapter) el array localidad para ser configurado en el objeto listview


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);

        tv1 = (TextView)findViewById(R.id.tv1);
        list1 = (ListView)findViewById(R.id.list1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,localidad);
        list1.setAdapter(adapter);
        //Configuracion del evento clic para mostrar la informacion del listview en el textview
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long id) {
                tv1.setText(" Centro de reciclado localidad " + list1.getItemAtPosition(i) + " direccion " + ubicacion[i]);
            }
        });


    }
}
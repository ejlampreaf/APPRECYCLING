package com.example.splash;

/**********************************************/
/****Deiner Ariza feb-13-2021******************/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.splash.ui.MapsActivityLugares;

public class activity_lugares extends AppCompatActivity {

    //Declaracion de arrays que contienen los valores de las localidades y direcciones
    //son dos arrays localidad y ubicacion
    private String[] localidad = {"Engativa", "Kennedy", "Fontibon", "Antonio Nariño","Chapinero",
                                  "Tunjuelito","Puente Aranda","Ciudad Bolívar","Teusaquillo","San Cristóbal",
                                  "Bosa","Rafael Uribe","Santa Fe"};
    private String[] ubicacion = {"C. C Titan Plaza, Cra72 80-94", "Tranv 71d # 6-94Sur", "AV Ciudad de Cali con AV Ferrocarril, cl20 #82-52", "C Comercial Centro Mayor AV. NQS # cra38a sur", "C Comercial 93, Carrera 15 # 93-60",
                                  "Dile Tunjuelito,CL 48B Sur No. 27-80","Puente Aranda,GASEOSA LUX Calle 5C # 53D-12","INDUSEL,Autopista (AC 57R) Sur No. 67-59","Secretaría de Educación,Cll 26 No.66-63 BloqueB","SUPERCADE,20 de Julio\n" +
                                  "Carrera 5A # 30D-20SUR","SUPERCADE Bosa,Av. Calle 57 R Sur #72D-12","Alcaldía Local de Rafael Uribe Uribe,CALLE 32 SUR 23 62","EDIFICIO BACHUE 2 PISO,CARRERA 10 #27-00"};
    //Se definen los objetos tipo textview y listview
    private TextView tv1;
    private ListView list1;

    //Se declara la actividad tipo boton

    //Button btmapa;
    ImageButton imbutton1;


    //Sobre el evento create se configura (ser adapter) el array localidad para ser configurado en el objeto listview
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);

        tv1 = (TextView)findViewById(R.id.tv1);
        list1 = (ListView)findViewById(R.id.list1);
        imbutton1 = (ImageButton) findViewById(R.id.imbutton1);

        imbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapsActivityLugares.class);
                startActivity(intent);
            }
        });




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
package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Info_ElementosReciclablesActivity<findViewById> extends AppCompatActivity implements View.OnClickListener {

    String opcion;
    ImageButton papelsi, papelno, plasticosi, plasticono, vidriosi, vidriono, metalsi, metalno;


    private String Titdescripcion;
    private String descripcion;
    private int datosimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_elementos_reciclables);
        papelsi = (ImageButton)findViewById(R.id.imgbuttonpapelsi);
        papelno = (ImageButton)findViewById(R.id.imgbuttonpapelno);
        plasticosi = (ImageButton)findViewById(R.id.imgbuttonplasticosi);
        plasticono = (ImageButton)findViewById(R.id.imgbuttonplasticono);
        vidriosi = (ImageButton)findViewById(R.id.imgbuttonvidriosi);
        vidriono = (ImageButton)findViewById(R.id.imgbuttonvidriono);
        metalsi = (ImageButton)findViewById(R.id.imgbuttonmetalsi);
        metalno = (ImageButton)findViewById(R.id.imgbuttonmetalno);

        papelsi.setOnClickListener(this);
        papelno.setOnClickListener(this);
        plasticosi.setOnClickListener(this);
        plasticono.setOnClickListener(this);
        vidriosi.setOnClickListener(this);
        vidriono.setOnClickListener(this);
        metalsi.setOnClickListener(this);
        metalno.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgbuttonpapelsi:
                Intent intent = new Intent(Info_ElementosReciclablesActivity.this, Info_TiposDescripcionActivity.class);
                //asignacion parametros
                Titdescripcion = "Papel";
                descripcion = "dbasbBavsdbansdbA";
                datosimg = R.drawable.elementospapel;
                // Envio de parametros
                intent.putExtra("Titulo_Descripcion", Titdescripcion);
                intent.putExtra("Descripcion", descripcion);
                intent.putExtra("Image_Descripcion", datosimg);
                startActivity(intent);
                break;
        }


    }
}
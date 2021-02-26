package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Info_CuidadosAmbientales extends AppCompatActivity {

    private Spinner spinner;
    private TextView txttips;
    private ImageView imgtips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_cuidados_ambientales);

        txttips = (TextView) findViewById(R.id.txtviewtips);
        spinner = (Spinner) findViewById(R.id.spinnertips);
        imgtips = (ImageView) findViewById(R.id.imgviewtips);

        String[] opciones = {"-- Selecciona --", "1. El agua", "2. La basura", "3. El plastico", "4. El transporte", "5. La energía", "6. La actitud"};
        String seleccion = null;

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    txttips.setText("--Selecciona--");
                    imgtips.setImageResource(R.drawable.cuidadopregunta);
                }
                if (position == 1) {
                    txttips.setText("Ahorra agua");
                    imgtips.setImageResource(R.drawable.cuidadoagua);
                }
                if (position == 2) {
                    txttips.setText("Separa la basura");
                    imgtips.setImageResource(R.drawable.cuidadobasura);
                }
                if (position == 3) {
                    txttips.setText("Evita el uso innecesario de plástico");
                    imgtips.setImageResource(R.drawable.cuidadosplastico);
                }
                if (position == 4) {
                    txttips.setText("Utiliza medios de transporte colectivos o con cero emisiones de CO2");
                    imgtips.setImageResource(R.drawable.cuidadostransporte);
                }
                if (position == 5) {
                    txttips.setText("Disminuye el consumo de energía");
                    imgtips.setImageResource(R.drawable.cuidadosenergia);
                }
                if (position == 6) {
                    txttips.setText("Ten una actitud responsable");
                    imgtips.setImageResource(R.drawable.cuidadoactitud);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });
    }

}
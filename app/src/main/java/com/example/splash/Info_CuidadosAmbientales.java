package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class Info_CuidadosAmbientales extends AppCompatActivity {

    private Spinner spinner;
    private TextView txttips;
    private ImageView imgtips;
    private Button btndescripcion;

    private String Titdescripcion;
    private String descripcion;
    private String tip1;
    private String tip2;
    private String tip3;
    private String tip4;
    private int datosimg;
    private int seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_cuidados_ambientales);

        txttips = (TextView) findViewById(R.id.txtviewtips);
        spinner = (Spinner) findViewById(R.id.spinnertips);
        imgtips = (ImageView) findViewById(R.id.imgviewtips);
        btndescripcion = (Button) findViewById(R.id.btndescripciontips);


        String[] opciones = {"-- Selecciona --", "1. El agua", "2. La basura", "3. El plastico", "4. El transporte", "5. La energía", "6. La actitud"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    txttips.setText("--Selecciona--");
                    imgtips.setImageResource(R.drawable.cuidadopregunta);
                    seleccion=position;
                }
                if (position == 1) {
                    txttips.setText("Ahorra agua");
                    imgtips.setImageResource(R.drawable.cuidadoagua);
                    seleccion=position;
                }
                if (position == 2) {
                    txttips.setText("Separa la basura");
                    imgtips.setImageResource(R.drawable.cuidadobasura);
                    seleccion=position;
                }
                if (position == 3) {
                    txttips.setText("Evita el uso innecesario de plástico");
                    imgtips.setImageResource(R.drawable.cuidadosplastico);
                    seleccion=position;
                }
                if (position == 4) {
                    txttips.setText("Utiliza medios de transporte colectivos o con cero emisiones de CO2");
                    imgtips.setImageResource(R.drawable.cuidadostransporte);
                    seleccion=position;
                }
                if (position == 5) {
                    txttips.setText("Disminuye el consumo de energía");
                    imgtips.setImageResource(R.drawable.cuidadosenergia);
                    seleccion=position;
                }
                if (position == 6) {
                    txttips.setText("Ten una actitud responsable");
                    imgtips.setImageResource(R.drawable.cuidadoactitud);
                    seleccion=position;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        btndescripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seleccion == 0) {
                    Toast.makeText(getApplicationContext(), "Selecciona primero una opcion", Toast.LENGTH_LONG).show();
                }
                if (seleccion != 0) {
                    if (seleccion == 1) {
                        Titdescripcion = txttips.getText().toString();
                        descripcion = "El recurso hídrico es fundamental, un ser humano lo necesita porque regula la temperatura, elimina los desechos a través de las evacuaciones intestinales, transpiración y orina. Así mismo, el agua permite el transporte de nutrientes a nuestras células y es esencial para los ecosistemas naturales.\n\n•  Utiliza un vaso al lavarte los dientes, así no gastarás agua dejando el grifo abierto.\n\n•  Asegúrate que la carga de la lavadora esté lleno a la hora de lavar la ropa.\n\n•  Lava los platos en una cubeta.\n\n•  Pon una botella de agua llena en el inodoro, así gastaras menos agua al descargar la cisterna.";
                        datosimg = R.drawable.cuidadoagua;
                    }
                    if (seleccion == 2) {
                        Titdescripcion = txttips.getText().toString();
                        descripcion = "Al hacerlo disminuimos la cantidad de residuos, de la misma forma podemos rescatar los materiales que podemos reutilizar, también podemos separar los residuos que pueden ser contaminantes dañinos para las personas. \n\n•  Los residuos orgánicos como las pieles de las frutas y verduras, más los alimentos crudos, deben ir en una misma bolsa.\n\n•  El papel, el cartón, el vidrio, y el metal van en otra bolsa.\n\n•  El papel higiénico, las servilletas sucias, residuos de comida preparada, etc, se agruparán.\n\n•  Lleva a centros especializados de reciclaje cosas como: aceite, baterías, cartuchos de impresora, electrodomésticos, entre otros.";
                        datosimg = R.drawable.cuidadobasura;
                    }
                    if (seleccion == 3) {
                        Titdescripcion = txttips.getText().toString();
                        descripcion = "Ocho millones de toneladas de plástico terminan en el océano, si reutilizas evitarás ese impacto.\n\n•  Si llevas agua contigo evita comprar botellas nuevas, ten un contenedor especial para tu agua. \n\n•  En un restaurante procura no usar pitillos, cubiertos de bambú o acero son una opción que ayuda al medio ambiente. \n\n•  Usa bolsas de tela para ir al supermercado.\n\n•  Ten un vaso propio para tus bebidas calientes.";
                        datosimg = R.drawable.cuidadosplastico;
                    }
                    if (seleccion == 4) {
                        Titdescripcion = txttips.getText().toString();
                        descripcion = "Haciendo esto puedes reducir tu huella personal de carbono. Si cada uno usa su vehículo las emisiones de CO2 afectarán al planeta.\n\n•  Usa los servicios de bus de tu ciudad.\n\n•  Usa la bicicleta.\n\n•  Camina.\n\n•  Usa medios de transporte eléctricos.";
                        datosimg = R.drawable.cuidadostransporte;
                    }
                    if (seleccion == 5) {
                        Titdescripcion = txttips.getText().toString();
                        descripcion = "El uso de combustibles destinados a crear electricidad será menor.\n\n•  Compra bombillos que ahorren luz, el ahorro será cercano a un 80%.\n\n•  Apaga tus dispositivos si no los necesitas.\n\n•  Desconecta tus aparatos electrónicos.\n\n•  Consigue un termostato si usas calefacción o aire acondicionado.";
                        datosimg = R.drawable.cuidadosenergia;
                    }
                    if (seleccion == 6) {
                        Titdescripcion = txttips.getText().toString();
                        descripcion = "El medio ambiente es responsabilidad de todos, con pequeñas acciones podemos hacer la diferencia.\n\n•  Dale un segundo uso a tu ropa puedes ser creativo y usar retazos de ella para otros propósitos.\n\n•  Evita el consumo masivo de tecnología, no necesitas cambiar el celular o el televisor cada año.\n\n•  Practica el turismo sostenible.\n\n•  Comparte con alguien alguno de estos tips.";
                        datosimg = R.drawable.cuidadoactitud;
                    }
                    // Envio de parametros
                    Intent intent = new Intent(Info_CuidadosAmbientales.this, Info_TiposDescripcionActivity.class);
                    intent.putExtra("Titulo_Descripcion", Titdescripcion);
                    intent.putExtra("Descripcion", descripcion);
                    intent.putExtra("Image_Descripcion", datosimg);
                    startActivity(intent);
                }
            }
        });

    }

}
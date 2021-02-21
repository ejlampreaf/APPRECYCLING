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
    private String [] lista = {"Reciclaje de papel y cartón", "Reciclaje de vidrio", "Reciclaje de textil y calzado", "Reciclaje de residuos orgánicos (biorresiduos)", "Reciclaje de pilas y baterías", "Reciclaje de chatarra o metales", "Reciclaje de tierras y escombros", "Reciclaje de agua", "Reciclaje de aparatos eléctricos y electrónicos", "Reciclaje de basura"};
    private String [] Titdescripcion = {"Reciclaje de papel y cartón", "Descripcion - Reciclaje de vidrio", "Descripcion - Reciclaje de textil y calzado", "Descripcion - Reciclaje de residuos orgánicos (biorresiduos)", "Descripcion - Reciclaje de pilas y baterías", "Descripcion - Reciclaje de chatarra o metales", "Descripcion - Reciclaje de tierras y escombros", "Descripcion - Reciclaje de agua", "Descripcion - Reciclaje de aparatos eléctricos y electrónicos", "Descripcion - Reciclaje de basura"};
    private String [] descripcion = {"El objetivo es recuperar residuos para con ellos crear nuevos. El proceso consiste en almacenar la mayor cantidad de residuos, se mezclan con agua y aditivos y se retiran residuos e impurezas. Por medio de procesos industriales se limpian, refinan y blanquean, posteriormente se genera una pulpa amorfa a la cual se le da forma y luego de un proceso de secado tendremos nuevo papel.", "Una de las principales ventajas del vidrio es que puede ser reciclado y reutilizado tantas veces como sea necesario gracias a que no pierde características ni propiedades. Cuando llega a las fábricas que se encargan de su reciclaje se separa por color, normalmente verde, marrón y transparente. Después, se separa de todo material impropio como por ejemplo etiquetas y tapones, posteriormente se realiza la trituración del material en polvo, que se llama calcín, y una vez sometido a altas temperaturas y añadido arena, hidróxido de sodio y caliza, se consigue fabricar nuevos productos.", "Descripcion - Reciclaje de textil y calzado", "Descripcion - Reciclaje de residuos orgánicos (biorresiduos)", "Descripcion - Reciclaje de pilas y baterías", "Descripcion - Reciclaje de chatarra o metales", "Descripcion - Reciclaje de tierras y escombros", "Descripcion - Reciclaje de agua", "Descripcion - Reciclaje de aparatos eléctricos y electrónicos", "Descripcion - Reciclaje de basura"};
    private int [] datosimg = {R.drawable.tipospapel, R.drawable.tiposvidrio, R.drawable.descarga,R.drawable.compartir};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tipos);
        //Nuevo adaptador
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_tipos, lista);
        // Conexion parte logica y grafica
        listviewtipos = (ListView)findViewById(R.id.listviewtipos);
        //Conexion Adaptador y listview
        listviewtipos.setAdapter(adapter);
        //Generacion de actividad al dar clic en items de la lista
        listviewtipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Conexion a la activity descripcion
                Intent intent = new Intent(Info_TiposActivity.this, Info_TiposDescripcionActivity.class);
                // Envio de parametros
                intent.putExtra("Titulo_Descripcion", Titdescripcion[position]);
                intent.putExtra("Descripcion", descripcion[position]);
                intent.putExtra("Image_Descripcion", datosimg[position]);
                startActivity(intent);
            }
        });
    }
}




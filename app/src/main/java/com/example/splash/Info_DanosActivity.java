package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Info_DanosActivity extends AppCompatActivity {

    private ListView listviewdanos;
    private String [] lista = {"Deforestación","Acumulación de basura","Contaminación de los océanos","Efecto invernadero","Contaminación atmosférica","Especies en peligro de extinción","Escasez de agua"};
    private String [] Titdescripcion = {"Deforestación","Acumulación de basura","Contaminación de los océanos","Efecto invernadero","Contaminación atmosférica","Especies en peligro de extinción","Escasez de agua"};
    private String [] descripcion = {"Debido a las actividades humanas, los árboles se han visto afectados. Su tala tiene propósitos enfocados a la utilización de la madera, plantación de cultivos, o la presencia de nuevos grupos urbanos en zonas verdes. Los árboles son fundamentales para la purificación del aire ya que atrapan el CO2, con la deforestación se dañan los ecosistemas, lo cual produce la perdida de especies nativas necesarias. Adicionalmente esta práctica produce erosión y hace que las tierras se conviertan en tierras no productivas.","La falta de educación en las personas con respecto a la clasificación de las basuras se ha convertido en un daño inminente para el medio ambiente. La mala gestión de los residuos previene que materiales sean reutilizados y convertidos en potenciales materias primas. Los bosques, los océanos, entre otros escenarios, se han convertido en las canecas del mundo. La descomposición de las basuras genera sustancias tóxicas que afectan los suelos, el recurso hídrico y el aire, que al estar en contacto con un ser humano puede afectar su salud.","Los océanos son de gran importancia, estos tienen la capacidad de absorber CO2 de manera natural, también son la fuente de alimento, minerales a través de las especies marinas, sin embargo, se han convertido en muchas ocasiones en vertederos humanos. Los plásticos, hidrocarburos, plaguicidas, productos químicos, entre otros, llegan a las aguas perjudicando la vida marina. Ya se han encontrado islas de plástico, falta de oxigeno debido a la proliferación de las algas, y pérdida de la biodiversidad.","Gases que quedan retenidos en la atmosfera y están afectando la temperatura del planeta, esto se debe a las fábricas industriales, ganadería, manejo de desperdicios inadecuado, uso de combustibles fósiles, alto consumo de electricidad, transporte contaminante, y deforestación. Todo esto afecta los ecosistemas, se produce un cambio climático, sequías o lluvias intensas donde no solía haber, glaciales que se derriten, desminuciòn de la fertilidad de la tierra y más.","La polusión que puede traer efectos contaminantes para las personas y el medio en el que se desenvuelven, una de las razones para esta contaminaciòn son las erupciones volcánicas que altera la composición natural de los gases, también el humo y gases de los incendios, la minería, la deforestación, así como el uso de pesticidas que afecta el suelo y produce acumulación de gases en el aire. La contaminación tiene consecuencias que afectan a la población, entre ellas las enfermedades respiratorias, cardiovasculares o dermatológicas; también las ciudades se ven afectadas con polusión, cambio climático, disminución de la capa de ozono, entre otras cosas.","De las más de 47 mil especies se considera que aproximadamente 36% están en peligro de extinción, esto se debe al mal manejo de los recursos y el medio natural, la contaminación, la introducción de especies exóticas, y los efectos del cambio climático. Cada especie tiene sus funciones en los ecosistemas, hay peces que mantienen los ríos limpios, de faltar se produciría un desequilibrio. Las cadenas alimenticias se ven directamente afectadas cuando una especie desaparece, además hay unas especies que dependen de otras, la colaboración entre ella nos permite tener uin planeta sano.","El agua es indispensable para los seres vivos, cosechas, industria, e higiene. Su escacez se debe al aumento de la población mundial que requiere el consumo de agua dulce, la destrucción de fuentes naturales de agua, altos patrones de consumo, cambio climático, contaminación del agua, extraccióm indostenible del bien hídrico, entre otras cosas.  La amenaza de escacez de agua puede traer conflictos entre naciones,  riesgos en la salud de aguas mal tratadas, dificultad en la población para la abastecerse."};
    private int [] datosimg = {R.drawable.danosdeforestacion, R.drawable.danosacumulacion, R.drawable.danosoceanos,R.drawable.danosinvernadero,R.drawable.danosatmosferica,R.drawable.danosespecies,R.drawable.danosescasez};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_danos);
        //Nuevo adaptador
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_danos, lista);
        // Conexion parte logica y grafica
        listviewdanos = (ListView)findViewById(R.id.listviewdanos);
        //Conexion Adaptador y listview
        listviewdanos.setAdapter(adapter);
        //Generacion de actividad al dar clic en items de la lista
        listviewdanos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Conexion a la activity descripcion
                Intent intent = new Intent(Info_DanosActivity.this, Info_TiposDescripcionActivity.class);
                // Envio de parametros
                intent.putExtra("Titulo_Descripcion", Titdescripcion[position]);
                intent.putExtra("Descripcion", descripcion[position]);
                intent.putExtra("Image_Descripcion", datosimg[position]);
                startActivity(intent);
            }
        });
    }
}




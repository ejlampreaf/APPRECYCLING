package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Info_TiposActivity extends AppCompatActivity {

    private ListView listviewtipos;
    private String [] lista = {"Reciclaje de papel y cartón", "Reciclaje de vidrio", "Reciclaje de textil y calzado", "Reciclaje de residuos orgánicos (biorresiduos)", "Reciclaje de pilas y baterías", "Reciclaje de chatarra o metales", "Reciclaje de tierras y escombros", "Reciclaje de agua", "Reciclaje de aparatos eléctricos y electrónicos", "Reciclaje de basura"};
    private String [] Titdescripcion = {"Reciclaje de papel y cartón", "Reciclaje de vidrio", "Reciclaje de textil y calzado", "Reciclaje de residuos orgánicos (biorresiduos)", "Reciclaje de pilas y baterías", "Reciclaje de chatarra o metales", "Reciclaje de tierras y escombros", "Reciclaje de agua", "Reciclaje de aparatos eléctricos y electrónicos", "Reciclaje de basura"};
    private String [] descripcion = {"El objetivo es recuperar residuos para con ellos crear nuevos. El proceso consiste en almacenar la mayor cantidad de residuos, se mezclan con agua y aditivos y se retiran residuos e impurezas. Por medio de procesos industriales se limpian, refinan y blanquean, posteriormente se genera una pulpa amorfa a la cual se le da forma y luego de un proceso de secado tendremos nuevo papel.", "Una de las principales ventajas del vidrio es que puede ser reciclado y reutilizado tantas veces como sea necesario gracias a que no pierde características ni propiedades. Cuando llega a las fábricas que se encargan de su reciclaje se separa por color, normalmente verde, marrón y transparente. Después, se separa de todo material impropio como por ejemplo etiquetas y tapones, posteriormente se realiza la trituración del material en polvo, que se llama calcín, y una vez sometido a altas temperaturas y añadido arena, hidróxido de sodio y caliza, se consigue fabricar nuevos productos.", "No es un tipo de reciclaje muy común, pero si causa un gran impacto medioambiental ya que la industria textil es una de las más contaminantes y necesita gran cantidad de recursos para su producción. El objetivo está en poder generar aquí también una economía circular y no lineal, cuyo alcance es transformar un recurso en producto y obtener un residuo que se transforme en recurso reciclado. Productos recogidos y que no pueden ser reutilizados se tratan para formar parte de otros productos y en caso de que esto no sea posible, su destino es incineración con recuperación de energía o su depósito final en vertedero.", "Son todos los residuos biodegradables que podemos encontrarnos en los sectores doméstico y comercial o industrial y que pueden ser de origen animal o vegetal: restos de alimentos y cocina, restos vegetales de jardinería y poda de mayor tamaño y de tipo leñoso. Su reciclaje es totalmente biológico y se busca estabilizar toda la materia y su higienización en el escenario en el que el tratamiento es anaeróbico, parte de la materia orgánica de los residuos orgánicos se transforma, mediante la acción de los microorganismos, en una mezcla de gases, o aeróbico, en el que transforma los residuos orgánicos degradables en un producto estable e higienizado llamado compost, que se puede utilizar como abono orgánico. Con estos procesos se degradan los residuos y se transforman en un residuo mezclado o compost homogéneo con valor para la agricultura.", "Estos residuos son potencialmente muy peligrosos y contaminantes debido a la presencia de metales pesados, su reciclaje permite el aprovechamiento de las materias primas secundarias que se obtienen de los residuos, que pueden en algunos casos reintroducirse de nuevo en el proceso productivo de pilas y baterías o utilizarse para la fabricación de otros productos. Su tratamiento se basa en la clasificación de acuerdo con su composición y se llevan a tratamientos a altas que permiten recuperar los metales contenidos en las pilas y baterías por su gasificación, posterior depuración y sedimentación o tratamientos fisicoquímicos que recuperan los metales a través de procesos de disolución con aditivos y posterior concentración o purificación.", "El reciclaje de chatarra se basa en la separación entre los diferentes metales para su destino final. Se trata de varias etapas de trituración, cribado y separación para conseguir cada metal por un lado y la fracción resto como plásticos y textiles, por otro. Puede ser una mezcla de metales férricos, que contienen hierro como el acero y no férricos, que no contienen hierro como son el aluminio, el cobre, entre otros. Su proceso de reciclaje es mecánico, mediante separaciones, cribados y corrientes de Foucault para separar los diferentes residuos, luego de ello se trituran y ya están listos.", "Estos residuos tienen un gran potencial para su reciclaje y aprovechamiento: se generan en grandes cantidades y no es muy difícil su clasificación. Generalmente proceden de obras de construcción, edificaciones, minería y movimientos de tierras, dentro de lo más particular están la construcción y reformas o mantenimiento de edificios, viviendas, carreteras. Su reciclaje comienza con la separación de materiales por tamaño, en especial los voluminosos, posteriormente se quitan pequeños residuos impropios, y en este paso se utilizan chorros de aire para separarlos según su densidad, por lo general papel y plástico, después pasa por un imán que separará todos los materiales férricos del resto y, por último, se tritura el residuo consiguiendo un material homogéneo.", "Es un proceso muy importante ya que el agua contaminada, sin proceso, tarde o temprano termina en los ríos o mares, generando una gran problemática a nivel mundial. Para este proceso se utilizan diferentes tratamientos físico-químicos y biológicos que ayudan a su limpieza. El primer paso es retirar los residuos sólidos y grandes que se encuentran, mediante rejas y tamices: se eliminan plásticos, papeles, grasas y aceites flotantes. El siguiente paso es tratar al agua con reactivos químicos para eliminar los sólidos que por su pequeño tamaño no han podido eliminarse. El próximo paso consiste en introducir bacterias en el agua para que conviertan la materia orgánica disuelta en ella en flóculos, que sí pueden ser separados mediante decantación. Posteriormente, se aplica un especial tratamiento químico para eliminar del agua los restos de fosfatos, virus y gérmenes. Y por último, se realiza desinfección, que prepara el agua para su uso y consumo.", "Es importante que busquemos lugares apropiados para la recolección de estos residuos, el objetivo principal de este tipo de reciclaje es descontaminar y aprovechar los materiales que contienen y mejorar la protección ambiental y fomentar su posible reutilización. La mayoría de estos residuos reciben un tratamiento mecánico que consiste en separar los diferentes materiales para su clasificación y valorización, algunas fracciones pueden ser recuperadas directamente, Sin embargo, algunos materiales no han sido todavía separados de forma que su recuperación sea posible. Para estos, se deben hacer tratamientos posteriores de recuperación. La dificultad se encuentra en aquellos aparatos que contienen fluidos o sustancias que son muy contaminantes para el Medio Ambiente y sobre todo con la capa de ozono, como neveras, congeladores, aparatos de frío que pueden contener compuestos orgánicos volátiles.", "El reciclaje de la basura es importante porque debido a la gran cantidad que generamos y su propia composición, constituye uno de los principales impactos ambientales que producimos. La basura comprende al residuo generado en el ámbito doméstico, comercial, industrial y público y que se tira sin, en muchos casos, separación previa. La gestión de estos residuos incluye la recogida, que se da en la mayoría de los casos en los puntos ubicados en la ciudad y en la recolección que realiza a diario la empresa local de recolección, el transporte, que se realiza por medio de camiones hasta los destinos intermedios o finales y el tratamiento de los residuos, que se enfoca en eliminar o reducir las sustancias tóxicas que contienen, recuperar materia prima, ser utilizado como fuente de energía o ser adecuado para su depósito en vertedero."};
    private int [] datosimg = {R.drawable.tipospapel, R.drawable.tiposvidrio, R.drawable.tipostextil,R.drawable.tiposorganicos,R.drawable.tipospilas,R.drawable.tiposchatarra,R.drawable.tipostierras,R.drawable.tiposagua,R.drawable.tiposelectricos,R.drawable.tiposbasura};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tipos);
        //Nuevo adaptador
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_tipos, lista);
        // Conexion parte logica y grafica
        listviewtipos = (ListView)findViewById(R.id.listviewdanos);
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




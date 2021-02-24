package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Info_ElementosReciclablesActivity<findViewById> extends AppCompatActivity implements View.OnClickListener {

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
                //asignacion parametros
                Titdescripcion = "Qué debemos reciclar";
                descripcion = "Revistas, periódicos, cajas de cartón, papel, calendarios, sobres, afiches, o cajas Tetrapak. Recuerda que siempre es mejor que estos estén libres residuos, o grasa.  ¿Sabías que si reciclas papel reduces la cantidad de árboles que son talados? Es que cada tonelada de papel y cartón reciclado evita la tala de aproximadamente 18 árboles. Estos, son fundamentales para el planeta pues absorben el CO2 y purifican el aire, realmente los necesitamos.";
                datosimg = R.drawable.elementospapel;
                break;
            case R.id.imgbuttonpapelno:
                //asignacion parametros
                Titdescripcion = "Qué no debemos reciclar";
                descripcion = "Papel plastificado, servilletas sucias, papel higiénico, papel metalizado, o papel de carbón. Por ejemplo, el papel higiénico o las servilletas usadas que ya han sido manipuladas, pueden contaminar el papel; el papel metalizado por su parte, tienen procesos que lo hacen más afín a las latas.dbasbBavsdbansdbAnbskjalfbkajasdA";
                datosimg = R.drawable.elementometal;
                break;
            case R.id.imgbuttonplasticosi:
                //asignacion parametros
                Titdescripcion = "Qué debemos reciclar";
                descripcion = "Bolsas, botellas de gaseosa y agua, vasos de yogurt, tapas, envases de shampoo, de lavaplatos, juguetes, contenedores, tuberías, bolsas de leche, de detergente, de suero, etc. Estos generalmente tienen un símbolo de reciclaje en el fondo.  ¿Sabía que el plástico puede tardar entre cien y mil años en degradarse? Reciclando plástico evitamos el consumo inadecuado de materias primas, recursos naturales, y recursos energéticos no renovables. Los océanos se han visto afectados por el plástico, acabando con la vida animal y el medio ambiente.";
                datosimg = R.drawable.elementospapel;
                break;
            case R.id.imgbuttonplasticono:
                //asignacion parametros
                Titdescripcion = "Qué no debemos reciclar";
                descripcion = "Bolsas no biodegradables, envases larga vida, envolturas de celofán o plástico, plásticos marcados con la palabra “PLA”. Te en cuenta que los plásticos mezclados con material que contenga pegamento son difíciles de separar por lo tanto no son aptos para reciclaje.";
                datosimg = R.drawable.elementospapel;
                break;
            case R.id.imgbuttonvidriosi:
                //asignacion parametros
                Titdescripcion = "Qué debemos reciclar";
                descripcion = "Recicla todas las botellas, frascos y objetos de vidrio que no tengan colores de recubrimiento son aptas para reciclar, preferiblemente limpias. ¿Sabías que 1kg de material reciclado de vidrio ahorra 1,2 kg de materiales como, carbonato de sodio, arena, y piedra? Al reciclarlo reducimos las necesidades de extracción de estos materiales y ahorramos materias primas.";
                datosimg = R.drawable.elementospapel;
                break;
            case R.id.imgbuttonvidriono:
                //asignacion parametros
                Titdescripcion = "Qué no debemos reciclar";
                descripcion = "Espejos, vidrios de ventanas, vidrios de carros, platos, bombillos o ampollas de medicinas. Ten en cuenta que vidrios resistentes al calor como el Pyrex no debe ser mezclado con el vidrio convencional, pues sus propiedades se verían afectadas. ";
                datosimg = R.drawable.elementospapel;
                break;
            case R.id.imgbuttonmetalsi:
                //asignacion parametros
                Titdescripcion = "Qué debemos reciclar";
                descripcion = "Puedes reciclar: Envases de lata de los alimentos y bebidas, el aluminio, hierro, cobre (que estén libres de recubrimientos). También las partes metálicas de electrodomésticos, juguetes, clavos, tubos de crema dental, alambres, entre otros. ¿Sabías que cuando reciclamos metal, la contaminación del aire, del agua, y los desechos producidos por la minería son disminuidos de manera significativa? La producción de los metales implica un gasto del recurso hídrico y de energía, al reciclarlos disminuimos ese impacto. Los metales mas comunes son el acero y el aluminio.";
                datosimg = R.drawable.elementospapel;
                break;
            case R.id.imgbuttonmetalno:
                //asignacion parametros
                Titdescripcion = "Qué no debemos reciclar";
                descripcion = "Filtros de aire para vehículos, pilas normales y alcalinas y latas oxidadas. Estas últimas pueden ser llevadas a supermercados de cadena a canecas destinadas para ello. Las pilas, al igual que otros productos eléctricos similares, como las baterías o los acumuladores, contienen metales y sustancias químicas tóxicas: el mercurio, el cadmio o el plomo que son peligrosos para la salud y el medio ambiente, si no se tratan de forma adecuada.";
                datosimg = R.drawable.elementospapel;
                break;
        }

        // Envio de parametros
        Intent intent = new Intent(Info_ElementosReciclablesActivity.this, Info_TiposDescripcionActivity.class);
        intent.putExtra("Titulo_Descripcion", Titdescripcion);
        intent.putExtra("Descripcion", descripcion);
        intent.putExtra("Image_Descripcion", datosimg);
        startActivity(intent);
    }
}
package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BeneficiosActivity<findViewById> extends AppCompatActivity implements View.OnClickListener {

    Button Benitem1, Benitem2, Benitem3, Benitem4, Benitem5, Benitem6, Benitem7;


    private String Titdescripcion;
    private String descripcion;
    private int datosimg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficios);
        Benitem1 = (Button)findViewById(R.id.btBenitem1);
        Benitem2 = (Button)findViewById(R.id.btBenitem2);
        Benitem3 = (Button)findViewById(R.id.btBenitem3);
        Benitem4 = (Button)findViewById(R.id.btBenitem4);
        Benitem5 = (Button)findViewById(R.id.btBenitem5);
        Benitem6 = (Button)findViewById(R.id.btBenitem6);
        Benitem7 = (Button)findViewById(R.id.btBenitem7);

        Benitem1.setOnClickListener((View.OnClickListener) this);
        Benitem2.setOnClickListener((View.OnClickListener) this);
        Benitem3.setOnClickListener((View.OnClickListener) this);
        Benitem4.setOnClickListener((View.OnClickListener) this);
        Benitem5.setOnClickListener((View.OnClickListener) this);
        Benitem6.setOnClickListener((View.OnClickListener) this);
        Benitem7.setOnClickListener((View.OnClickListener) this);
    }

      @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btBenitem1:
                //asignacion parametros
                Titdescripcion = "REDUCE LA CONTAMINACIÓN";
                descripcion = "Uno de los beneficios del reciclaje es la reducción de la contaminación, debido a múltiples factores, las cuales se destacan los siguientes:" +
                        "1.\tCuando optamos por consumir menos energía, se reduce el trabajo de extracción, transporte y elaboración de nuevas materias primas, así mismo, evitamos generar más CO2 y reducimos los gases de efecto invernadero. " +
                        " 2.\tReciclando materiales como lo son vidrio, papel o plástico, no es necesario el uso de más materias primas para su fabricación, acorde a o anterior, se ahorra una cantidad de recursos naturales y se conservan los bosques.";
                datosimg = R.drawable.reduccion;
                break;
            case R.id.btBenitem2:
                //asignacion parametros
                Titdescripcion = "AHORRO DE DINERO";
                descripcion = "Un punto clave dentro de los beneficios del reciclaje, se debe a su aporte económico o en su defecto al ahorro que este representa, de acuerdo con la revista portafolio, son 5 los consejos para tener en cuenta para que esto de fruto. El primero se basa en comprar tamaños pequeños y librarse del falso ahorro de los grandes tamaños; el segundo es reutilizar las botellas vacías de agua; el tercero es utilizar “composte” para reciclar papel, cartón y desechos; el cuarto es Re tapizar los muebles, remontar sus zapatos y crear nuevos accesorios de moda para no adquirir nuevos; y por último el quinto la cual comprende el extender la vida útil de los equipos, autos, celulares, videojuegos entre otros.";
                datosimg = R.drawable.ahorro;
                break;
            case R.id.btBenitem3:
                //asignacion parametros
                Titdescripcion = "AHORRO DE PETROLEO";
                descripcion = "El ahorro del petróleo es uno de los beneficios del reciclaje, esto debido a que ayuda a ahorrar dinero, reduce el cambio climático, reduce el costo de dependencia de este y aumenta la sustentabilidad energética debido a que el petróleo es un recurso no renovable. Por otra parte, su explotación es menos frecuente y evita la fragmentación de suelos por la extracción de este.";
                datosimg = R.drawable.petroleo;
                break;
            case R.id.btBenitem4:
                //asignacion parametros
                Titdescripcion = "PRESERVA LOS RECURSOS NATURALES";
                descripcion = "El beneficio de reciclar también se ve reflejado en la preserva de los recursos naturales, un ejemplo de ello es que con cada tonelada de cartón reciclado se ahorran 140 litros de petróleo, 50.000 litros de agua y la vida de 15 árboles. Sin embargo, esto no se logra sin la ayuda de cada persona mediante la selección de origen.";
                datosimg = R.drawable.recursos;
                break;
            case R.id.btBenitem5:
                //asignacion parametros
                Titdescripcion = "CREA EMPLEOS";
                descripcion = "El reciclaje tiene como beneficio la creación de empleos, esto debido a que evita que se importe materia prima y se ahorre divisas, por otra parte, ayuda a que se preserven los ecosistemas naturales. Así mismo, permite la venta directa sin intermediarios, aportando así a la economía del país.";
                datosimg = R.drawable.trabajo;
                break;
            case R.id.btBenitem6:
                //asignacion parametros
                Titdescripcion = "MENOS MATERIAS PRIMAS";
                descripcion = "Con el reciclaje se puede dar un nuevo uso o reutilización a materiales como el vidrio, el papel o el plástico, por lo anterior no es necesario el uso de nuevas materias para fabricar productos. Un ejemplo de lo anteriormente dicho es que si reciclamos papel evitamos la deforestación y ayudamos a que los bosques se recuperen.";
                datosimg = R.drawable.desforestacion;
                break;
            case R.id.btBenitem7:
                //asignacion parametros
                Titdescripcion = "FABRICACIÓN DE NUEVOS PRODUCTOS";
                descripcion = "Gracias a la resistencia de los diferentes productos como lo son el cartón, el aluminio, el Tetra Pack y el PET, se pueden reutilizar para fabricar nuevos productos. Existen varios ejemplos de los anteriormente dicho, el cartón por una parte es base para crear muebles; el aluminio por otro lado, se funde creando bloques de este mismo material; así mismo, el Tetra Pack cumple su función al separar la celulosa (fabricación de cartón, cuadernos, etc) y el polialuminio (fabricación de mesas y sillas); por último el PET descompone el plástico y se moldea para fabricar cajas, contenedores de compost, etc.";
                datosimg = R.drawable.nuevosproductos;
                break;
        }
        // Envio de parametros
        Intent intent = new Intent(BeneficiosActivity.this, Info_TiposDescripcionActivity.class);
        intent.putExtra("Titulo_Descripcion", Titdescripcion);
        intent.putExtra("Descripcion", descripcion);
        intent.putExtra("Image_Descripcion", datosimg);
        startActivity(intent);
    }
}
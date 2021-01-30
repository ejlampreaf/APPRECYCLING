package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Info_TiposActivity extends AppCompatActivity {

    private ListView listviewtipos;

    private String items []={"Reciclaje de papel y cartón", "Reciclaje de plástico", "Reciclaje de vidrio", "Reciclaje de textil y calzado",
            "Reciclaje de residuos orgánicos (biorresiduos)", "Reciclaje de pilas y baterías", "Reciclaje de chatarra o metales",
            "Reciclaje de tierras y escombros", "Reciclaje de agua", "Reciclaje de aparatos eléctricos y electrónicos", "Reciclaje de basura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tipos);

        listviewtipos = (ListView)findViewById(R.id.listviewtipos);
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this, R.layout.list_item_tipos, items);
        listviewtipos.setAdapter(adapter);

    }
}
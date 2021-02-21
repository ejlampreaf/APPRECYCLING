package com.example.splash;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class verPerfil extends Fragment {

    TextView perf_nombre, perf_edad, perf_sexo, perf_ciudad, perf_pensamiento;

    public verPerfil() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener( "key", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestkey, @NonNull Bundle bundle) {
                String IngName = bundle.getString(  "perfNombre");
                String IngEdad = bundle.getString( "perfEdad");
                String IngSexo = bundle.getString("perfSexo");
                String IngCiudad = bundle.getString( "perfCiudad");
                String IngPensamiento = bundle.getString( "perfPensamiento");

                perf_nombre.setText(IngName);
                perf_edad.setText(IngEdad);
                perf_sexo.setText(IngSexo);
                perf_ciudad.setText(IngCiudad);
                perf_pensamiento.setText(IngPensamiento);
            }
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsatanceState) {
        return inflater.inflate(R.layout.fragment_ver_perfil, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        perf_nombre = view.findViewById(R.id.IngNombre);
        perf_edad = view.findViewById(R.id.IngEdad);
        perf_sexo = view.findViewById(R.id.IngSexo);
        perf_ciudad = view.findViewById(R.id.IngCiudad);
        perf_pensamiento = view.findViewById(R.id.IngPensamiento);

    }





}








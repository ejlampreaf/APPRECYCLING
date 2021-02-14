package com.example.splash;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav_Perfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav_Perfil extends Fragment {
    EditText IngNombre, IngEdad, IngSexo, IngCiudad, IngPensamiento;
    Button btnGuardar;

    public nav_Perfil() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsatanceState) {
        return inflater.inflate(R.layout.fragment_nav__perfil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        IngNombre = view.findViewById(R.id.IngNombre);
        IngEdad = view.findViewById(R.id.IngEdad);
        IngSexo = view.findViewById(R.id.IngSexo);
        IngCiudad = view.findViewById(R.id.IngCiudad);
        IngPensamiento = view.findViewById(R.id.IngPensamiento);
        btnGuardar = view.findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("perfNombre",IngNombre.getText().toString().trim());
                bundle.putString("perfEdad",IngEdad.getText().toString().trim());
                bundle.putString("perfSexo",IngSexo.getText().toString().trim());
                bundle.putString("perfCiudad",IngCiudad.getText().toString().trim());
                bundle.putString("perfPensamiento",IngPensamiento.getText().toString().trim());

                getParentFragmentManager().setFragmentResult( "Key", bundle);
            }
        });
    }




}
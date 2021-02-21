package com.example.splash;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MiAyuda extends Fragment {
    Button btnComoDescargar, btnComoCompartirr, btnComoCambiarPerfil;

    public MiAyuda() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsatanceState) {
        View view = inflater.inflate(R.layout.fragment_mi_ayuda, container, false);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnComoDescargar:
                break;
            case R.id.btnComoCompartirr:
                break;
            case R.id.btnComoCambiarPerfil:
                break;
        }

    }

}
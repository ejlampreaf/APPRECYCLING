package com.example.splash.ui;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.splash.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityLugares extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_lugares);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);

        // Add a marker in Bogota and move the camera
        LatLng bogota = new LatLng(4.6533326, -74.083652);
        mMap.addMarker(new MarkerOptions().position(bogota).title("Bogota D.C."));


        LatLng engativa = new LatLng(4.6959442398114675, -74.08649384160711);
        mMap.addMarker(new MarkerOptions().position(engativa).title("Localidad Engativa").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng kennedy = new LatLng(4.618962828456479, -74.13516864509474);
        mMap.addMarker(new MarkerOptions().position(kennedy).title("Localidad Kenndy").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng fontibon = new LatLng(4.663860418896225, -74.13048860074342);
        mMap.addMarker(new MarkerOptions().position(fontibon).title("Localidad Fontibon").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng antonionarino = new LatLng(4.592576344286128, -74.12348714748954);
        mMap.addMarker(new MarkerOptions().position(antonionarino).title("Localidad Antonio Nariño").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng chapinero = new LatLng(4.6772438605410045, -74.05098069166759);
        mMap.addMarker(new MarkerOptions().position(chapinero).title("Localidad Chapinero").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng tunjuelito = new LatLng(4.583968396180182, -74.12986683443437);
        mMap.addMarker(new MarkerOptions().position(tunjuelito).title("Localidad Tunjuelito").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng puentearanda = new LatLng(4.624490032204794, -74.11237382975196);
        mMap.addMarker(new MarkerOptions().position(puentearanda).title("Localidad Puente Aranda").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng ciudadbolivar = new LatLng(4.595779238237001, -74.15932302844737);
        mMap.addMarker(new MarkerOptions().position(ciudadbolivar).title("Localidad Ciudad Bolivar").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng teusaquillo = new LatLng(4.687839649769288, -74.12669140885218);
        mMap.addMarker(new MarkerOptions().position(teusaquillo).title("Localidad Teusaquillo").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng sancristobal = new LatLng(4.566840803381606, -74.09654503029718);
        mMap.addMarker(new MarkerOptions().position(sancristobal).title("Localidad San Cristobal").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng bosa = new LatLng(4.595899415559824, -74.1634402554333);
        mMap.addMarker(new MarkerOptions().position(bosa).title("Localidad Bosa").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng rafaeluribe = new LatLng(4.581591238755807, -74.11417664563986);
        mMap.addMarker(new MarkerOptions().position(rafaeluribe).title("Localidad Rafael Uribe").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));

        LatLng santafe = new LatLng(4.572245158721604, -74.09769045858782);
        mMap.addMarker(new MarkerOptions().position(santafe).title("Localidad Santa Fe").snippet("Zona de reciclado").icon(BitmapDescriptorFactory.fromResource(R.drawable.trashgreen)));















        //Camara
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bogota,10));

    }
}
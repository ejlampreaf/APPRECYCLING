package com.example.splash;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Info_TiposDescripcionActivity extends AppCompatActivity {

    private static final int STORAGE_CODE = 1000;
    public TextView textViewtiposdescripcion;
    public ImageView imvtiposdescripcion;
    public Bitmap bmp;
    public Bitmap scaledBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__tipos_descripcion);

        textViewtiposdescripcion = (TextView) findViewById(R.id.textviewtiposdescripcion);
        textViewtiposdescripcion.setText(getIntent().getStringExtra("Descripcion"));

        imvtiposdescripcion = (ImageView) findViewById(R.id.imvtiposdescripcion);
        imvtiposdescripcion.setImageResource(getIntent().getIntExtra("Image_Descripcion",0));

        /*bmp = BitmapFactory.decodeResource(getResources(),R.drawable.info);
        scaledBitmap = Bitmap.createScaledBitmap(bmp, 100,200, false);*/

    }

    private void savePdf() {
        Document mDoc = new Document();
        String mFileName = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(System.currentTimeMillis());
        String mFilePath = Environment.getExternalStorageDirectory() + "/" + mFileName + ".pdf";

        try {
            PdfWriter.getInstance(mDoc, new FileOutputStream(mFilePath));
            mDoc.open();
            String mtext = textViewtiposdescripcion.getText().toString();
            mDoc.addAuthor("Jorge Carrillo");
            mDoc.add(new Paragraph(mtext));
            mDoc.close();
            Toast.makeText(this, mFileName + ".pdf\nis saved to\n" + mFilePath, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            ;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case STORAGE_CODE:{
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    savePdf();
                }
                else {
                    Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
                }

            }

        }

    }


    //Metodo para mostrar los botones de accion
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuacciones, menu);
        return true;
    }

    //Metodo para agregar acciones basicas a los botones
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.itemcompartir) {
            Intent regresar = new Intent(this, HomeActivity.class);
            startActivity(regresar);
            return true;
        } else if (id == R.id.itemdescargar) {
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
                if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                        PackageManager.PERMISSION_DENIED) {
                    String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                    requestPermissions(permissions, STORAGE_CODE);
                } else {
                    savePdf();
                }
            } else {
                savePdf();
            }
            return true;
        } else if (id == R.id.itemhome) {
            Intent regresar = new Intent(this, Info_TiposActivity.class);
            startActivity(regresar);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
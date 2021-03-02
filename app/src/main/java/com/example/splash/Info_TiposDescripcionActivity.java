package com.example.splash;

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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Info_TiposDescripcionActivity extends AppCompatActivity {

    private static final int STORAGE_CODE = 1000;
    public TextView textViewtitulotiposdescripcion;
    public TextView textViewtiposdescripcion;
    public ImageView imvtiposdescripcion;
    //public Bitmap bmp;
    //public Bitmap scaledBitmap;
     public   Button btnCompartir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__tipos_descripcion);

        textViewtitulotiposdescripcion = (TextView) findViewById(R.id.textviewtitulotiposdescripcion);
        textViewtitulotiposdescripcion.setText(getIntent().getStringExtra("Titulo_Descripcion"));

        textViewtiposdescripcion = (TextView) findViewById(R.id.textviewtiposdescripcion);
        textViewtiposdescripcion.setText(getIntent().getStringExtra("Descripcion"));

        imvtiposdescripcion = (ImageView) findViewById(R.id.imvtiposdescripcion);
        imvtiposdescripcion.setImageResource(getIntent().getIntExtra("Image_Descripcion",0));

        btnCompartir =findViewById(R.id.itemcompartir);

        //bmp = BitmapFactory.decodeResource(getResources(),getIntent().getIntExtra("Image_Descripcion",0));

        //scaledBitmap = Bitmap.createScaledBitmap(bm,100,100, false);

    }

    private void savePdf() {
        Document mDoc = new Document();
        String mFileName = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(System.currentTimeMillis());
        String mFilePath = Environment.getExternalStorageDirectory() + "/" + mFileName + ".pdf";

        Bitmap bm = BitmapFactory.decodeResource(getResources(), getIntent().getIntExtra("Image_Descripcion",0));
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        float proporcion = 400 / ((float) bm.getWidth());
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(bm,400, (int) (bm.getHeight() * proporcion), false);
        scaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        Image img = null;
        byte[] byteArray = stream.toByteArray();

        try {
            PdfWriter.getInstance(mDoc, new FileOutputStream(mFilePath));
            mDoc.open();
            String titdescripcion = textViewtitulotiposdescripcion.getText().toString();
            String textdescripcion = textViewtiposdescripcion.getText().toString();
            mDoc.addAuthor("APPRECYCLING");
            Font negrita = new Font();
            negrita.setStyle(Font.BOLD);
            Paragraph titulo = new Paragraph(titdescripcion,negrita);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.setSpacingAfter(10);
            mDoc.add(titulo);
            Paragraph texto = new Paragraph(textdescripcion);
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            texto.setSpacingAfter(10);
            mDoc.add(texto);
            img = Image.getInstance(byteArray);
            img.setAlignment(Element.ALIGN_CENTER);
            mDoc.add(img);
            mDoc.close();
            Toast.makeText(this, "Archivo\n" + mFileName + ".pdf\nis saved to\n" + mFilePath, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(this, "Archivo no descargado\n"+ e.getMessage(), Toast.LENGTH_LONG).show();
            ;
        }
    }




    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case STORAGE_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    savePdf();
                } else {
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

                Intent sendIntent =new Intent();
                sendIntent.setAction(Intent.ACTION_SEND_MULTIPLE);
                sendIntent.putExtra(Intent.EXTRA_TITLE, textViewtitulotiposdescripcion.getText().toString() );
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, textViewtitulotiposdescripcion.getText().toString() );
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT, textViewtiposdescripcion.getText().toString() );
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, "Share with"));

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
            Intent regresar = new Intent(this, HomeActivity.class);
            startActivity(regresar);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
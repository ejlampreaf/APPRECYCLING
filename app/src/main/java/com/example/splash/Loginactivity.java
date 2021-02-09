    package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Loginactivity extends AppCompatActivity implements View.OnClickListener {

    private EditText n, p;
    private TextView  btnregistro;
    private Button btningresar;
    dUsuario du;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT > 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        setContentView(R.layout.activity_loginactivity);


        n = (EditText)findViewById(R.id.camponombreis);
        p = (EditText)findViewById(R.id.campopasswordis);
        btningresar=(Button)findViewById(R.id.btningresar);
        btnregistro=(TextView)findViewById(R.id.btnregistro);


        btningresar.setOnClickListener(this);
        btnregistro.setOnClickListener(this);

        du=new dUsuario(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btningresar:
                    String u=n.getText().toString();
                    String pass=p.getText().toString();

                    if (u.equals("")&&pass.equals("")){
                        Toast.makeText(this,"Error:Campos vacios", Toast.LENGTH_LONG).show();
                    }else if (du.login(u, pass)==1){
                        Usuario ux=du.getUsuario(u, pass);
                        Toast.makeText(this,"Datos correctos", Toast.LENGTH_LONG).show();
                        Intent i2=new Intent(Loginactivity.this, HomeActivity.class);
                        i2.putExtra("Id",ux.getId());
                        startActivity(i2);
                        finish();
                    }else {
                        Toast.makeText(this,"Datos incorrectos", Toast.LENGTH_LONG).show();
                    }

                break;

            case R.id.btnregistro:
                Intent i=new Intent(Loginactivity.this, registroActivity.class);
                startActivity(i);
                break;

        }
    }
}
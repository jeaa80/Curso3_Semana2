package com.jesus.taseasemana2_2;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    TextView b_editar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        TextView textNombre = (TextView) findViewById(R.id.Nombre2);
        TextView textFecha = (TextView) findViewById(R.id.FechaNa2);
        TextView textTelefono = (TextView) findViewById(R.id.Telefono2);
        TextView textEmail = (TextView) findViewById(R.id.Email2);
        TextView textDescripcion = (TextView) findViewById(R.id.Descripcion2);

        textNombre.setText(getIntent().getExtras().getString(String.valueOf(R.string.pnombre)));
        textFecha.setText(getIntent().getExtras().getString(String.valueOf(R.string.pfecha)));
        textTelefono.setText(getIntent().getExtras().getString(String.valueOf(R.string.ptelefono)));
        textEmail.setText(getIntent().getExtras().getString(String.valueOf(R.string.pemail)));
        textDescripcion.setText(getIntent().getExtras().getString(String.valueOf(R.string.pdescripcion)));

        //Evento para pasar a la otra actividad
        b_editar = (TextView) findViewById(R.id.b_editar);

        b_editar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro.this, MainActivity.class);

                startActivity(intent);
                finish();
            }
        });

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(Registro.this,MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }


}

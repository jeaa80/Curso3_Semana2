package com.jesus.taseasemana2_2;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import java.util.Calendar;

import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    //private Datos listaDatos;
    private TextView dateText;
    TextView b_siguiente;
    private EditText campoNombre, campoFecha, campoTelefono, campoEmail, campoDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNombre         = (EditText) findViewById(R.id.etNombre);
        //campoFecha          = (EditText) findViewById(R.id.etFechaNac);
        campoTelefono       = (EditText) findViewById(R.id.etTelefono);
        campoEmail          = (EditText) findViewById(R.id.etEmail);
        campoDescripcion    = (EditText) findViewById(R.id.etDescripcion);

        Datos listaDatos = new Datos(campoNombre, campoFecha, campoTelefono,campoEmail,campoDescripcion);

        // Evento para seleccionar la fecha
        dateText = findViewById(R.id.etFechaNac);

        findViewById(R.id.etFechaNac).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        //Evento para pasar a la otra actividad
        b_siguiente = (TextView) findViewById(R.id.b_siguiente);

        b_siguiente.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Registro.class);
            intent.putExtra(String.valueOf(R.string.pnombre), campoNombre.getText()+"");
            intent.putExtra(String.valueOf(R.string.pfecha), dateText.getText()+"");
            intent.putExtra(String.valueOf(R.string.ptelefono), campoTelefono.getText()+"");
            intent.putExtra(String.valueOf(R.string.pemail), campoEmail.getText()+"");
            intent.putExtra(String.valueOf(R.string.pdescripcion), campoDescripcion.getText()+"");

           /* Toast.makeText(getBaseContext(),campoNombre.getText(),Toast.LENGTH_SHORT).show();
            Toast.makeText(getBaseContext(),dateText.getText(),Toast.LENGTH_SHORT).show();
            Toast.makeText(getBaseContext(),campoTelefono.getText(),Toast.LENGTH_SHORT).show();
            Toast.makeText(getBaseContext(),campoEmail.getText(),Toast.LENGTH_SHORT).show();
            Toast.makeText(getBaseContext(),campoDescripcion.getText(),Toast.LENGTH_SHORT).show();
*/

            startActivity(intent);
            finish();
        }
    });

    }
    //Método que muestra Picker
    public void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
    //Evento para imprimir la fecha en el text view
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = (month + 1) + "/" + dayOfMonth + "/" + year;
        dateText.setText(date);
    }
}


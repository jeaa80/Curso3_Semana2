package com.jesus.taseasemana2_2;

import android.widget.EditText;

public class Datos {

    private EditText    nombre;
    private EditText    telefono;
    private EditText    fecha;
    private EditText    email;
    private EditText    descripcion;

    public Datos(EditText nombre, EditText fecha, EditText telefono, EditText email, EditText descripcion) {
        this.nombre         =   nombre;
        this.fecha          =   fecha;
        this.telefono       =   telefono;
        this.email          =   email;
        this.descripcion    =   descripcion;
    }

    public EditText getNombre() {
        return nombre;
    }

    public void setNombre(EditText nombre) {
        this.nombre = nombre;
    }

    public EditText getFecha() { return fecha; }

    public void setFecha(EditText fecha) { this.fecha = fecha; }

    public EditText getTelefono() {
        return telefono;
    }

    public void setTelefono(EditText telefono) {
        this.telefono = telefono;
    }

    public EditText getEmail() {
        return email;
    }

    public void setEmail(EditText email) {
        this.email = email;
    }

    public EditText getDescripcion() { return descripcion; }

    public void setDescripcion(EditText descripcion) { this.descripcion = descripcion; }
}

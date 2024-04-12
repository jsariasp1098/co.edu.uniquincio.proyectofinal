package com.example;

public class TorreControl {
    private int id;
    private String ubicacion;
    private String correo;
    private String telefono;

    public TorreControl(){

    }
    public TorreControl(int id, String ubicacion, String correo, String telefono){
        this.id = id;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

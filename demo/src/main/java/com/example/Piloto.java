package com.example;

public class Piloto extends Aerolinea {
    private String licencia;
    private String nombre;
    private String tipoLicencia;

    //public Piloto (){

    //}
    public Piloto(String nombreAerolinea, String licencia, String nombre, String tipoLicencia) {
        super(nombreAerolinea);
        this.licencia = licencia;
        this.nombre = nombre;
        this.tipoLicencia = tipoLicencia;
    }
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoLicencia() {
        return tipoLicencia;
    }
    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
}

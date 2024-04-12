package com.example;

public class Aerolinea {
    private String nombreAerolinea;
    private int vuelosOperados;
    private int vuelosProgramados;
    private int vuelosCancelados;

    public Aerolinea(String nombreAerolinea2){

    }
    public Aerolinea(String nombreAerolinea, int vuelosOperados, int vuelosProgramados, int vuelosCancelados){
        this.nombreAerolinea = nombreAerolinea;
        this.vuelosOperados = vuelosOperados;
        this.vuelosProgramados = vuelosProgramados;
        this.vuelosCancelados = vuelosCancelados;
    }  
    
    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }
    public String getNombreAerolinea() {
        return nombreAerolinea;
    }
    public int getVuelosOperados() {
        return vuelosOperados;
    }
    public void setVuelosOperados(int vuelosOperados) {
        this.vuelosOperados = vuelosOperados;
    }
    public int getVuelosProgramados() {
        return vuelosProgramados;
    }
    public void setVuelosProgramados(int vuelosProgramados) {
        this.vuelosProgramados = vuelosProgramados;
    }
    public int getVuelosCancelados() {
        return vuelosCancelados;
    }
    public void setVuelosCancelados(int vuelosCancelados) {
        this.vuelosCancelados = vuelosCancelados;
    }
}

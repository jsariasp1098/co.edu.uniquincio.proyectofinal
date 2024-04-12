package com.example;



public class Vuelo extends Piloto {
    
    private String numVuelo;
    private String ruta;
    private String terminal;
    private String puerta;
    private String estado;
    private String fechaDespegue;
    private String fechaAterrizaje;
    private int numPasajeros;
    private int idTorreControl;

    //public Vuelo(){

    //}

    public Vuelo(String tipoLicencia, String numVuelo, String ruta, String terminal, String puerta, String fechaDespegue, String fechaAterrizaje,
                 String estado, int numPasajeros,int idTorreControl) {
            super(tipoLicencia, estado, estado, estado);
            this.numVuelo = numVuelo;
            this.ruta = ruta;
            this.terminal = terminal;
            this.puerta = puerta;
            this.fechaDespegue = fechaDespegue;
            this.fechaAterrizaje= fechaAterrizaje;
            this.estado = estado;
            this.numPasajeros = numPasajeros;
            this.idTorreControl = idTorreControl;
    }
    /*public String getAerolinea() {
            return aerolinea;
    }
    public void setAerolinea(String aerolinea) {
            this.aerolinea = aerolinea;
    }*/
    public String getNumVuelo() {
        return numVuelo;
    }
    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }
    public String getRuta() {
            return ruta;
    }
    public void setRuta(String ruta) {
            this.ruta = ruta;
    }
    public String getTerminal() {
            return terminal;
    }
    public void setTerminal(String terminal) {
            this.terminal = terminal;
    }
    public String getPuerta() {
            return puerta;
    }
    public void setPuerta(String puerta) {
            this.puerta = puerta;
    }
    public String getEstado() {
            return estado;
    }
    public void setEstado(String estado) {
            this.estado = estado;
    }
    public int getNumPasajeros() {
            return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
            this.numPasajeros = numPasajeros;
    }
    public int getIdTorreControl() {
            return idTorreControl;
    }
    public void setIdTorreControl(int idTorreControl) {
            this.idTorreControl = idTorreControl;
    }   
    public String getFechaAterrizaje() {
        return fechaAterrizaje;
    }
    public void setFechaAterrizaje(String fechaAterrizaje) {
        this.fechaAterrizaje = fechaAterrizaje;
    }
    public void setFechaDespegue(String fechaDespegue) {
        this.fechaDespegue = fechaDespegue;
    }
    public String getFechaDespegue() {
        return fechaDespegue;
    }
}

package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

public class TiendaRopa {
    String idTienda, nombreTienda, direccion;

    public TiendaRopa() {
    }

    public TiendaRopa(String idTienda, String nombreTienda, String direccion) {
        this.idTienda = idTienda;
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

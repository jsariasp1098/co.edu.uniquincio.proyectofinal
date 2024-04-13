package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.builder.ClienteBuilder;

public class Cliente extends Persona{
    String idCliente;

    public Cliente() {
    }

    public Cliente(String tipoIdentificacion, String numeroIdentificacion, String nombre, String apellidos,
                   String direccion, String email, String idCliente) {
        super(tipoIdentificacion, numeroIdentificacion, nombre, apellidos, direccion, email);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {

        this.idCliente = idCliente;
    }

    public static ClienteBuilder Builder(){
        return new ClienteBuilder();
    }
}

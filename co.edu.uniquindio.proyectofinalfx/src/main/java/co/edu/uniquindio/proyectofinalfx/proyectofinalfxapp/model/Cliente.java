package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.builder.ClienteBuilder;

import java.util.Date;

public class Cliente extends Persona{
    private String idCliente, pass;


    public Cliente() {
    }

    public Cliente(String tipoIdentificacion, String numeroIdentificacion, String nombre, String apellidos,
                   String direccion, String email, String idCliente, String pass) {
        super(tipoIdentificacion, numeroIdentificacion, nombre, apellidos, direccion, email);
        this.idCliente = idCliente;
        this.pass = pass;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {

        this.idCliente = idCliente;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public static ClienteBuilder Builder(){

        return new ClienteBuilder();
    }
}

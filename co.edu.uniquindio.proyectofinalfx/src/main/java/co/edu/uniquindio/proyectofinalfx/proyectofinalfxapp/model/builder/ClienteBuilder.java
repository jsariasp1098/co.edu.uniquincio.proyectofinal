package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.builder;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Cliente;

import java.util.Date;

public class ClienteBuilder {
    private String tipoIdentificacion, numeroIdentificacion, nombre, apellidos, direccion, email, idCliente, pass;


    public ClienteBuilder nombre (String nombre){
        this.nombre = nombre;
        return this;
    }
    public ClienteBuilder apellidos (String apellidos){
        this.apellidos = apellidos;
        return this;
    }
    public ClienteBuilder tipoIdentificacion (String tipoIdentificacion){
        this.tipoIdentificacion = tipoIdentificacion;
        return this;
    }
    public ClienteBuilder numeroIdentificacion (String numeroIdentificacion){
        this.numeroIdentificacion = numeroIdentificacion;
        return this;
    }
    public ClienteBuilder direccion (String direccion){
        this.direccion = direccion;
        return this;
    }
    public ClienteBuilder email (String email){
        this.email = email;
        return this;
    }
    public ClienteBuilder idCliente (String idCliente){
        this.idCliente = idCliente;
        return this;
    }
    public ClienteBuilder pass (String pass){
        this.pass = pass;
        return this;
    }

    public Cliente Build (){
        return new Cliente(tipoIdentificacion, numeroIdentificacion, nombre, apellidos,
                direccion, email, idCliente, pass);
    }
}

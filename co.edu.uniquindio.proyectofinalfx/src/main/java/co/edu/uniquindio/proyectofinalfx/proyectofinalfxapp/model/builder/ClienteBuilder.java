package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.builder;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Cliente;

public class ClienteBuilder {
    String tipoIdentificacion, numeroIdentificacion, nombre, apellidos, direccion, email, idCliente;

    public ClienteBuilder() {
    }
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
    public Cliente Build (){
        return new Cliente(tipoIdentificacion, numeroIdentificacion, nombre, apellidos, direccion, email, idCliente);
    }
}

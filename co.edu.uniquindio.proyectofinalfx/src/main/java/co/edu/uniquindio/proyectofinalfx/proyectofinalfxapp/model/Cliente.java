package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.builder.ClienteBuilder;

import java.util.Date;

public class Cliente extends Persona{
    private String idCliente;
    private Date fechaNacimiento, fechaCreacion;

    public Cliente() {
    }

    public Cliente(String tipoIdentificacion, String numeroIdentificacion, String nombre, String apellidos,
                   String direccion, String email, String idCliente, Date fechaNacimiento, Date fechaCreacion) {
        super(tipoIdentificacion, numeroIdentificacion, nombre, apellidos, direccion, email);
        this.idCliente = idCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {

        this.idCliente = idCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public static ClienteBuilder Builder(){

        return new ClienteBuilder();
    }
}

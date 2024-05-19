package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.builder.ClienteBuilder;
import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.builder.EmpleadoBuilder;

public class Empleado extends Persona{
    String idEmpleado, rol, pass;

    public Empleado() {
    }

    public Empleado(String tipoIdentificacion, String numeroIdentificacion, String nombre, String apellidos,
                    String direccion, String email, String idEmpleado, String rol, String pass) {
        super(tipoIdentificacion, numeroIdentificacion, nombre, apellidos, direccion, email);
        this.idEmpleado = idEmpleado;
        this.rol = rol;
        this.pass = pass;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public static EmpleadoBuilder Builder(){

        return new EmpleadoBuilder();
    }
}

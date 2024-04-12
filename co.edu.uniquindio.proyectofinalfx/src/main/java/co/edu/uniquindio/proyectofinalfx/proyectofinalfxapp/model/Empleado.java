package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

public class Empleado extends Persona{
    String idEmpleado, rol;

    public Empleado() {
    }

    public Empleado(String tipoIdentificacion, String numeroIdentificacion, String nombre, String apellidos,
                    String direccion, String email, String idEmpleado, String rol) {
        super(tipoIdentificacion, numeroIdentificacion, nombre, apellidos, direccion, email);
        this.idEmpleado = idEmpleado;
        this.rol = rol;
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
}

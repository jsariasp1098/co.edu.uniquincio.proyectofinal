package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.builder;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Empleado;

public class EmpleadoBuilder {
    private String tipoIdentificacion,  numeroIdentificacion,  nombre,  apellidos,
     direccion,  email,  idEmpleado,  rol,  pass;

    public EmpleadoBuilder tipoIdentificacion (String tipoIdentificacion){
        this.tipoIdentificacion = tipoIdentificacion;
        return this;
    }

    public EmpleadoBuilder numeroIdentificacion (String numeroIdentificacion){
        this.numeroIdentificacion = numeroIdentificacion;
        return this;
    }
    public EmpleadoBuilder nombre (String nombre){
        this.nombre = nombre;
        return this;
    }
    public EmpleadoBuilder apellidos (String apellidos){
        this.apellidos = apellidos;
        return this;
    }
    public EmpleadoBuilder direccion (String direccion){
        this.direccion = direccion;
        return this;
    }public EmpleadoBuilder email (String email){
        this.email = email;
        return this;
    }
    public EmpleadoBuilder idEmpleado (String idEmpleado){
        this.idEmpleado = idEmpleado;
        return this;
    }
    public EmpleadoBuilder rol (String rol){
        this.rol = rol;
        return this;
    }
    public EmpleadoBuilder pass (String pass){
        this.pass = pass;
        return this;
    }
    public Empleado Build (){
        return new Empleado(tipoIdentificacion,  numeroIdentificacion,  nombre,  apellidos,
                direccion,  email,  idEmpleado,  rol,  pass);
    }


}

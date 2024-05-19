package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.factory;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Cliente;
import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Empleado;

import java.util.ArrayList;
import java.util.List;

public class PrestamoObjeto {

    List<Cliente> listCliente = new ArrayList<>();
    List<Empleado> listEmpleado = new ArrayList<>();
    

    public PrestamoObjeto() {
    }

    public void setListCliente(List<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    public List<Cliente> getListCliente() {

        return listCliente;
    }

    public List<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }

    public boolean crearCliente(Cliente newCliente) {
        Cliente clienteEncontrado = obtenerCliente(newCliente.getNumeroIdentificacion());
        if(clienteEncontrado == null){
            int IDcliente = listCliente.size()-1;
            int idClienteNew = Integer.parseInt(listCliente.get(IDcliente).getIdCliente())+1;
            newCliente.setIdCliente(Integer.toString(idClienteNew));
            getListCliente().add(newCliente);
            return true;
        }else{
            return false;
        }
    }

    private Cliente obtenerCliente(String identifiacionCliente) {
        Cliente cliente = null;
        for (Cliente cliente1 : getListCliente()) {
            if(cliente1.getNumeroIdentificacion().equals(identifiacionCliente)){
                cliente = cliente1;
                break;
            }
        }
        return cliente;
    }

    public boolean modificarCLiente(String numeroIdentificacion, Cliente clienteModificar) {
        for (int i=0 ; i<getListCliente().size(); i++) {
            if(getListCliente().get(i).getNumeroIdentificacion().equals(numeroIdentificacion)) {
                getListCliente().get(i).setNumeroIdentificacion(clienteModificar.getNumeroIdentificacion());
                getListCliente().get(i).setTipoIdentificacion(clienteModificar.getTipoIdentificacion());
                getListCliente().get(i).setNombre(clienteModificar.getNombre());
                getListCliente().get(i).setApellidos(clienteModificar.getApellidos());
                getListCliente().get(i).setDireccion(clienteModificar.getDireccion());
                getListCliente().get(i).setEmail(clienteModificar.getEmail());
            }
        }
        return true;
    }

    public boolean eliminarCliente(Cliente clienteSeleccionado) {
        if(clienteSeleccionado == null){
            return  false;
        }else{
            getListCliente().remove(clienteSeleccionado);
            return true;
        }
    }

    public String buscarUsuario(String usuario, String contrasena) {
        String tipo = "";
        for (Cliente cliente : getListCliente()) {
            if(cliente.getNumeroIdentificacion().equals(usuario)){
                if (cliente.getPass().equals(contrasena)) {
                    tipo = "Cliente";
                }
            }
        }
        for (Empleado empleado : getListEmpleado()) {
            if(empleado.getNumeroIdentificacion().equals(usuario)){
                if (empleado.getPass().equals(contrasena)) {
                    tipo = empleado.getRol();
                }
            }
        }
        return tipo;
    }

    public boolean crearEmpleado(Empleado newEmpleado) {
        Empleado empleadoEncontrado = obtenerEmpleado(newEmpleado.getNumeroIdentificacion());
        if(empleadoEncontrado == null){
            int IDempleado = listEmpleado.size()-1;
            int idEmpleadoNew = Integer.parseInt(listEmpleado.get(IDempleado).getIdEmpleado())+1;
            newEmpleado.setIdEmpleado(Integer.toString(idEmpleadoNew));
            getListEmpleado().add(newEmpleado);
            return true;
        }else{
            return false;
        }
    }

    private Empleado obtenerEmpleado(String numeroIdentificacion) {
        Empleado empleado = null;
        for (Empleado empleado1 : getListEmpleado()) {
            if(empleado1.getNumeroIdentificacion().equals(numeroIdentificacion)){
                empleado = empleado1;
                break;
            }
        }
        return empleado;
    }

    public boolean modificarEmpleado(String numeroIdentificacion, Empleado empleadoModificar) {
        for (int i=0 ; i<getListEmpleado().size(); i++) {
            if(getListEmpleado().get(i).getNumeroIdentificacion().equals(numeroIdentificacion)) {
                getListEmpleado().get(i).setNumeroIdentificacion(empleadoModificar.getNumeroIdentificacion());
                getListEmpleado().get(i).setTipoIdentificacion(empleadoModificar.getTipoIdentificacion());
                getListEmpleado().get(i).setNombre(empleadoModificar.getNombre());
                getListEmpleado().get(i).setApellidos(empleadoModificar.getApellidos());
                getListEmpleado().get(i).setDireccion(empleadoModificar.getDireccion());
                getListEmpleado().get(i).setEmail(empleadoModificar.getEmail());
                getListEmpleado().get(i).setRol(empleadoModificar.getRol());
            }
        }
        return true;
    }

    public boolean eliminarEmpleado(Empleado empleadoSeleccionado) {
        if(empleadoSeleccionado == null){
            return  false;
        }else{
            getListEmpleado().remove(empleadoSeleccionado);
            return true;
        }
    }
}

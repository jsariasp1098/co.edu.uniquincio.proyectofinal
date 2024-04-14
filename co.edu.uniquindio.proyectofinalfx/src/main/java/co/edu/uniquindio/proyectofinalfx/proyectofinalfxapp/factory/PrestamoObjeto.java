package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.factory;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class PrestamoObjeto {

    List<Cliente> listCliente = new ArrayList<>();

    public PrestamoObjeto() {
    }

    public void setListCliente(List<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    public List<Cliente> getListCliente() {

        return listCliente;
    }

    public boolean crearCliente(Cliente newCliente) {
        Cliente clienteEncontrado = obtenerCliente(newCliente.getNumeroIdentificacion());
        if(clienteEncontrado == null){
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
}

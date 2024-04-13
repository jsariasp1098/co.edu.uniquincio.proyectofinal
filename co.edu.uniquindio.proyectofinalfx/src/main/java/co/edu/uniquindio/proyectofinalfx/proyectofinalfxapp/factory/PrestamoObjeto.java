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
}

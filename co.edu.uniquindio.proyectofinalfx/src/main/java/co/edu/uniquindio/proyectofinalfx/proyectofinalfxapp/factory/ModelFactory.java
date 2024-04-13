package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.factory;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Cliente;

import java.util.List;

public class ModelFactory {
    private static ModelFactory modelFactory;

    private PrestamoObjeto prestamoObjeto;
    private ModelFactory(){
        prestamoObjeto = new PrestamoObjeto();
        InicializarDatos();
    }
    public static ModelFactory getInstancia() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    private void InicializarDatos() {
        Cliente cliente1 = Cliente.Builder()
                .idCliente("0")
                .apellidos("Arias Parra")
                .nombre("Juan Sebastian")
                .tipoIdentificacion("Cedulda")
                .numeroIdentificacion("1098308516")
                .direccion("Calle 8 # 7-22")
                .email("jsariasp_1@uqvirtual.edu.co")
                .Build();
        Cliente cliente2 = Cliente.Builder()
                .idCliente("1")
                .apellidos("Espinosa Monroy")
                .nombre("Lina Maria")
                .tipoIdentificacion("Cedulda")
                .numeroIdentificacion("24606390")
                .direccion("Calle 8 # 7-22")
                .email("lina.emiliana@gmail.com")
                .Build();
        Cliente cliente3 = Cliente.Builder()
                .idCliente("2")
                .apellidos("Arias Espinosa")
                .nombre("Emiliana")
                .tipoIdentificacion("Tarjeta Identidad")
                .numeroIdentificacion("1098546178")
                .direccion("Calle 8 # 7-22")
                .email("emiliana.ariae03@gmail.com")
                .Build();
        prestamoObjeto.listCliente.add(cliente1);
        prestamoObjeto.listCliente.add(cliente2);
        prestamoObjeto.listCliente.add(cliente3);
    }
    public List<Cliente> obtenerCliente() {
        return prestamoObjeto.getListCliente();
    }
}

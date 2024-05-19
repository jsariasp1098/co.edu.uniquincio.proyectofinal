package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.factory;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Cliente;
import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Empleado;

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
                .tipoIdentificacion("Cedula")
                .numeroIdentificacion("1098308516")
                .direccion("Calle 8 # 7-22")
                .email("jsariasp_1@uqvirtual.edu.co")
                .pass("12345")
                .Build();
        Cliente cliente2 = Cliente.Builder()
                .idCliente("1")
                .apellidos("Espinosa Monroy")
                .nombre("Lina Maria")
                .tipoIdentificacion("Cedula")
                .numeroIdentificacion("24606390")
                .direccion("Calle 6 # 15-20")
                .email("lina.emiliana@gmail.com")
                .pass("12345")
                .Build();
        Cliente cliente3 = Cliente.Builder()
                .idCliente("2")
                .apellidos("Arias Espinosa")
                .nombre("Emiliana")
                .tipoIdentificacion("Tarjeta Identidad")
                .numeroIdentificacion("1098546178")
                .direccion("Carrera 12 # 6-25")
                .email("emiliana.ariae03@gmail.com")
                .pass("12345")
                .Build();
        prestamoObjeto.listCliente.add(cliente1);
        prestamoObjeto.listCliente.add(cliente2);
        prestamoObjeto.listCliente.add(cliente3);

        Empleado empleado1 = Empleado.Builder()
                .idEmpleado("0")
                .rol("Administrador")
                .tipoIdentificacion("CC")
                .numeroIdentificacion("18492058")
                .nombre("Luis Alberto")
                .apellidos("Pardo")
                .direccion("Calle 8 # 17-55")
                .email("cheleguizamon@gmail.com")
                .pass("12345")
                .Build();
        Empleado empleado2 = Empleado.Builder()
                .idEmpleado("1")
                .rol("Vendedor")
                .tipoIdentificacion("CC")
                .numeroIdentificacion("18492294")
                .nombre("Mauricio Andres")
                .apellidos("Espinosa")
                .direccion("Calle 10 # 15-74")
                .email("maurycanino@gmail.com")
                .pass("12345")
                .Build();

        prestamoObjeto.listEmpleado.add(empleado1);
        prestamoObjeto.listEmpleado.add(empleado2);

    }
    public List<Cliente> obtenerCliente() {
        return prestamoObjeto.getListCliente();
    }

    public List<Empleado> obtenerEmpleado() {
        return prestamoObjeto.getListEmpleado();
    }

    public boolean crearCliente(Cliente newCliente) {
        return prestamoObjeto.crearCliente(newCliente);
    }

    public boolean modificarCliente(String numeroIdentificacion, Cliente clienteModificar) {
        return prestamoObjeto.modificarCLiente(numeroIdentificacion, clienteModificar);
    }

    public boolean eliminarCliente(Cliente clienteSeleccionado) {
        return prestamoObjeto.eliminarCliente(clienteSeleccionado);
    }

    public String buscarUsuario(String usuario, String contrasena) {

        return prestamoObjeto.buscarUsuario(usuario,contrasena);
    }

    public boolean crearEmpleado(Empleado newEmpleado) {
        return prestamoObjeto.crearEmpleado(newEmpleado);
    }

    public boolean modificarEmpleado(String numeroIdentificacion, Empleado empleadoModificar) {
        return prestamoObjeto.modificarEmpleado(numeroIdentificacion, empleadoModificar);
    }

    public boolean eliminarEmpleado(Empleado empleadoSeleccionado) {
        return prestamoObjeto.eliminarEmpleado(empleadoSeleccionado);
    }
}

package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.controller;


import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.factory.ModelFactory;
import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Cliente;
import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Empleado;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GestionAdministradorController {
    ModelFactory modelFactory;

    ObservableList<Cliente> listCliente = FXCollections.observableArrayList();
    ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    ObservableList<Cliente> listClienteFiltro = FXCollections.observableArrayList();
    Cliente clienteSeleccionado;
    Empleado empleadoSeleccionado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnActualizarEmpleado;

    @FXML
    private Button btnAgregarProductoCompra;

    @FXML
    private Button btnAgregarProductoVenta;

    @FXML
    private Button btnBuscarClienteVenta;

    @FXML
    private Button btnBuscarPedidoEntregado;

    @FXML
    private Button btnBuscarProductoCompra;

    @FXML
    private Button btnBuscarProductoVenta;

    @FXML
    private Button btnCancelarCompra;

    @FXML
    private Button btnCancelarVenta;

    @FXML
    private Button btnCompraNueva;

    @FXML
    private Button btnCrearClientes;

    @FXML
    private Button btnCrearEmpleado;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private Button btnEliminarEmpleado;

    @FXML
    private Button btnRealizarCompra;

    @FXML
    private Button btnRealizarVenta;

    @FXML
    private Button btnVentaNueva;

    @FXML
    private ComboBox<String> cbRolEmpleado;

    @FXML
    private Label lbCambioVenta;

    @FXML
    private Label lbCantidadProductoCompra;

    @FXML
    private Label lbCantidadProductoVenta;

    @FXML
    private Label lbDescripcionProductoCompra;

    @FXML
    private Label lbDescripcionProductoVenta;

    @FXML
    private Label lbDescuentoProductoVenta;

    @FXML
    private Label lbDireccionClienteVenta;

    @FXML
    private Label lbDireccionProveedorCompra;

    @FXML
    private Label lbEfectivoRecibido;

    @FXML
    private Label lbFechaVenta;

    @FXML
    private Label lbFechaVenta1;

    @FXML
    private Label lbIDProductoCompra;

    @FXML
    private Label lbIdClienteVenta;

    @FXML
    private Label lbIdProductoVenta;

    @FXML
    private Label lbNombreClienteVenta;

    @FXML
    private Label lbNombreProductoCompra;

    @FXML
    private Label lbNombreProveedorCompra;

    @FXML
    private Label lbPrecioCompraProducto;

    @FXML
    private Label lbPrecioVentaProducto;

    @FXML
    private Label lbProveedor;

    @FXML
    private Label lbTelefonoProveedorCompra;

    @FXML
    private Label lbTipoProductoCompra;

    @FXML
    private Label lbValorDescuentoCompra;

    @FXML
    private Label lbValorDescuentoVenta;

    @FXML
    private Label lbValorPagarCompra;

    @FXML
    private Label lbValorPagarVenta;

    @FXML
    private Label lbValorTotalCompra;

    @FXML
    private Label lbValorTotalVenta;

    @FXML
    private Label lbVendedor;

    @FXML
    private SplitMenuButton slipTipoProductoCompra;

    @FXML
    private TableColumn<Empleado, String> tbApellidoEmpleado;

    @FXML
    private TableView<Cliente> tbCliente;

    @FXML
    private TableView<?> tbCompra;

    @FXML
    private TableColumn<Empleado, String> tbDireccionEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbEmailEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbIDEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbIdentificacionEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbRolEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbNombreEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbPassEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbTipoIdentificacionEmpleado;

    @FXML
    private TableView<Empleado> tbEmpleados;

    @FXML
    private TableView<?> tbVenta;

    @FXML
    private TableColumn<Cliente, String> tbcApellidoCliente;

    @FXML
    private TableColumn<?, ?> tbcCantidadCompra;

    @FXML
    private TableColumn<?, ?> tbcCantidadVenta;

    @FXML
    private TableColumn<?, ?> tbcDescripcionCompra;

    @FXML
    private TableColumn<?, ?> tbcDescripcionVenta;

    @FXML
    private TableColumn<Cliente, String> tbcDireccionCliente;

    @FXML
    private TableColumn<Cliente, String> tbcEmailCliente;

    @FXML
    private TableColumn<Cliente, String> tbcIDCliente;

    @FXML
    private TableColumn<?, ?> tbcIdProductoCompra;

    @FXML
    private TableColumn<?, ?> tbcIdProductoVenta;

    @FXML
    private TableColumn<Cliente, String> tbcIdentificacionCliente;

    @FXML
    private TableColumn<Cliente, String> tbcNombreCliente;

    @FXML
    private TableColumn<Cliente, String> tbcPassCliente;

    @FXML
    private TableColumn<?, ?> tbcPorcentajeDescuentoCompra;

    @FXML
    private TableColumn<?, ?> tbcPorcentajeDescuentoVenta;

    @FXML
    private TableColumn<Cliente, String> tbcTipoIdentificacionCliente;

    @FXML
    private TableColumn<?, ?> tbcValorTotalCompra;

    @FXML
    private TableColumn<?, ?> tbcValorTotalVenta;

    @FXML
    private TableColumn<?, ?> tbcValorUnitarioCompra;

    @FXML
    private TableColumn<?, ?> tbcValorUnitarioVenta;

    @FXML
    private TextField txtApellidoCliente;

    @FXML
    private TextField txtApellidoEmpleado;

    @FXML
    private Label txtCambioVenta;

    @FXML
    private Spinner<?> txtCantidadProductoCompra;

    @FXML
    private TextField txtCantidadProductoVenta;

    @FXML
    private TextField txtDescripcionProductoCompra;

    @FXML
    private TextField txtDescripcionProductoVenta;

    @FXML
    private TextField txtDescuentoProductoVenta;

    @FXML
    private TextField txtDireccionCliente;

    @FXML
    private TextField txtDireccionCliienteVenta;

    @FXML
    private TextField txtDireccionEmpleado;

    @FXML
    private TextField txtDireccionProveedorCompra;

    @FXML
    private TextField txtEfectivoRecibidoVenta;

    @FXML
    private TextField txtEmailCliente;

    @FXML
    private TextField txtEmailEmpleado;

    @FXML
    private TextField txtFechaCompra;

    @FXML
    private TextField txtFechaVenta;

    @FXML
    private TextField txtIDProductoCompra;

    @FXML
    private TextField txtIDProveedorCompra;

    @FXML
    private TextField txtIdClienteVenta;

    @FXML
    private TextField txtIdProducttoVenta;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private TextField txtNombreClienteVenta;

    @FXML
    private TextField txtNombreEmpleado;

    @FXML
    private TextField txtNombreProductoCompra;

    @FXML
    private TextField txtNombreProveedorCompra;

    @FXML
    private TextField txtNombreVendedor;

    @FXML
    private TextField txtNumeroIdentificacionCliente;

    @FXML
    private TextField txtNumeroIdentificacionEmpleado;

    @FXML
    private TextField txtNumeroVenta;

    @FXML
    private TextField txtPrecioCompraProducto;

    @FXML
    private TextField txtPrecioVentaProductoCompra;

    @FXML
    private TextField txtTipoIdentificacionCliente;

    @FXML
    private TextField txtTipoIdentificacionEmpleado;

    @FXML
    private Label txtValorDescuentoCompra;

    @FXML
    private Label txtValorDescuentoVenta;

    @FXML
    private Label txtValorPagarCompra;

    @FXML
    private Label txtValorPagarVenta;

    @FXML
    private Label txtValorTotalCompra;

    @FXML
    private Label txtValorTotalVenta;

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstancia();
        ObservableList<String> factory = FXCollections.observableArrayList("Administrador",
                "Vendedor");
        cbRolEmpleado.setItems(factory);
        initviewCliente();
        initViewEmpleado();
    }

    private void initViewEmpleado() {
        initDataBindindEmpelado();
        ObtenerEmpleado();
        tbEmpleados.getItems().clear();
        tbEmpleados.setItems(listEmpleados);
        listenerSelectionEmpleado();
    }

    private void ObtenerEmpleado() {
        listEmpleados.addAll(modelFactory.obtenerEmpleado());
    }

    private void listenerSelectionEmpleado() {
        tbEmpleados.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            empleadoSeleccionado = newSelection;
            mostrarInformacionEmpleado(empleadoSeleccionado);
        });
    }

    private void mostrarInformacionEmpleado(Empleado empleadoSeleccionado) {
        if(empleadoSeleccionado != null){
            txtNombreEmpleado.setText(empleadoSeleccionado.getNombre());
            txtApellidoEmpleado.setText(empleadoSeleccionado.getApellidos());
            txtTipoIdentificacionEmpleado.setText(empleadoSeleccionado.getTipoIdentificacion());
            txtNumeroIdentificacionEmpleado.setText(empleadoSeleccionado.getNumeroIdentificacion());
            txtDireccionEmpleado.setText(empleadoSeleccionado.getDireccion());
            txtEmailEmpleado.setText(empleadoSeleccionado.getEmail());
            cbRolEmpleado.setValue(empleadoSeleccionado.getRol());
        }
    }


    private void initDataBindindEmpelado() {
        tbIDEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdEmpleado()));
        tbNombreEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbApellidoEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
        tbTipoIdentificacionEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoIdentificacion()));
        tbIdentificacionEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroIdentificacion()));
        tbRolEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRol()));
        tbDireccionEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        tbEmailEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));
        tbPassEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPass()));

    }

    private void listenerSelectionCliente() {
        tbCliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            clienteSeleccionado = newSelection;
            mostrarInformacionCliente(clienteSeleccionado);
        });
    }
    private void mostrarInformacionCliente(Cliente clienteSeleccionado) {
        if(clienteSeleccionado != null){
            txtNombreCliente.setText(clienteSeleccionado.getNombre());
            txtApellidoCliente.setText(clienteSeleccionado.getApellidos());
            txtTipoIdentificacionCliente.setText(clienteSeleccionado.getTipoIdentificacion());
            txtNumeroIdentificacionCliente.setText(clienteSeleccionado.getNumeroIdentificacion());
            txtDireccionCliente.setText(clienteSeleccionado.getDireccion());
            txtEmailCliente.setText(clienteSeleccionado.getEmail());
        }
    }

    private void ObtenerCliente() {

        listCliente.addAll(modelFactory.obtenerCliente());
    }
    private void initDataBindindCliente() {
        tbcIDCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdCliente()));
        tbcApellidoCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
        tbcNombreCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbcTipoIdentificacionCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoIdentificacion()));
        tbcIdentificacionCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroIdentificacion()));
        tbcDireccionCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        tbcEmailCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));
        tbcPassCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPass()));
    }

    @FXML
    void onActualizarCliente(ActionEvent event) {
        if (clienteSeleccionado == null) {
            mostrarMensaje("Notificación Cliente", "Cliente no modificado",
                    "No hay cliente seleccionado", Alert.AlertType.ERROR);
        }else{
            Cliente clienteModificar = crearCLiente();
            if(clienteModificar.getNombre().equals(clienteSeleccionado.getNombre())
                    &&clienteModificar.getApellidos().equals(clienteSeleccionado.getApellidos())
                    &&clienteModificar.getTipoIdentificacion().equals(clienteSeleccionado.getTipoIdentificacion())
                    &&clienteModificar.getNumeroIdentificacion().equals(clienteSeleccionado.getNumeroIdentificacion())
                    &&clienteModificar.getDireccion().equals(clienteSeleccionado.getDireccion())
                    &&clienteModificar.getEmail().equals(clienteSeleccionado.getEmail())) {
                mostrarMensaje("Notificación Cliente", "Cliente no Modificado",
                        "No hay campos diferentes para modificar", Alert.AlertType.ERROR);
            }else {
                modelFactory.modificarCliente(clienteSeleccionado.getNumeroIdentificacion(), clienteModificar);
                tbCliente.getItems().clear();
                listCliente.addAll(modelFactory.obtenerCliente());
                tbCliente.setItems(listCliente);
                mostrarMensaje("Notificación Cliente", "Cliente Modificado",
                        "Cliente modificado satisfactoriamente", Alert.AlertType.INFORMATION);
                limpiarCamposCliente();
            }
        }
    }

    private void initviewCliente(){
        initDataBindindCliente();
        ObtenerCliente();
        tbCliente.getItems().clear();
        tbCliente.setItems(listCliente);
        listenerSelectionCliente();
    }

    @FXML
    void onActualizarEmpleado(ActionEvent event) {
        if (empleadoSeleccionado == null) {
            mostrarMensaje("Notificación Empleado", "Empleado no modificado",
                    "No hay Empleado seleccionado", Alert.AlertType.ERROR);
        }else{
            Empleado empleadoModificar = crearEmpleado();
            if(empleadoModificar.getNombre().equals(empleadoSeleccionado.getNombre())
                    &&empleadoModificar.getApellidos().equals(empleadoSeleccionado.getApellidos())
                    &&empleadoModificar.getTipoIdentificacion().equals(empleadoSeleccionado.getTipoIdentificacion())
                    &&empleadoModificar.getNumeroIdentificacion().equals(empleadoSeleccionado.getNumeroIdentificacion())
                    &&empleadoModificar.getDireccion().equals(empleadoSeleccionado.getDireccion())
                    &&empleadoModificar.getEmail().equals(empleadoSeleccionado.getEmail())
                    &&empleadoModificar.getRol().equals(empleadoSeleccionado.getRol())) {
                mostrarMensaje("Notificación Empleado", "Empleado no Modificado",
                        "No hay campos diferentes para modificar", Alert.AlertType.ERROR);
            }else {
                modelFactory.modificarEmpleado(empleadoSeleccionado.getNumeroIdentificacion(), empleadoModificar);
                tbEmpleados.getItems().clear();
                listEmpleados.addAll(modelFactory.obtenerEmpleado());
                tbEmpleados.setItems(listEmpleados);
                mostrarMensaje("Notificación Empleado", "Empleado Modificado",
                        "Empleado modificado satisfactoriamente", Alert.AlertType.INFORMATION);
                limpiarCamposEmpleado();
            }
        }
    }

    private void limpiarCamposEmpleado() {
        txtNombreEmpleado.setText("");
        txtApellidoEmpleado.setText("");
        txtTipoIdentificacionEmpleado.setText("");
        txtNumeroIdentificacionEmpleado.setText("");
        txtDireccionEmpleado.setText("");
        txtEmailEmpleado.setText("");
        cbRolEmpleado.setValue("Rol");
    }

    @FXML
    void onCrearCliente(ActionEvent event) {
        if(validarFormularioCliente()) {
            Cliente newCliente = crearCLiente();
            if(modelFactory.crearCliente(newCliente)) {
                listCliente.add(newCliente);
                mostrarMensaje("Notificación Cliente", "Cliente creado", "El Cliente se ha creado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposCliente();
            }else {
                mostrarMensaje("Notificación Cliente", "Cliente no creado", "El cliente ya existe", Alert.AlertType.ERROR);
                limpiarCamposCliente();
            }
        }else{
            mostrarMensaje("Notificación Cliente", "Cliente no creado", "Datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void limpiarCamposCliente() {
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtTipoIdentificacionCliente.setText("");
        txtNumeroIdentificacionCliente.setText("");
        txtDireccionCliente.setText("");
        txtEmailCliente.setText("");
    }

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }

    private Cliente crearCLiente() {
        return Cliente.Builder()
                .apellidos(txtApellidoCliente.getText())
                .nombre(txtNombreCliente.getText())
                .tipoIdentificacion(txtTipoIdentificacionCliente.getText())
                .numeroIdentificacion(txtNumeroIdentificacionCliente.getText())
                .direccion(txtDireccionCliente.getText())
                .email(txtEmailCliente.getText())
                .Build();
    }

    private boolean validarFormularioCliente() {
        if (txtNombreCliente.getText().isEmpty()
                || txtApellidoCliente.getText().isEmpty()
                || txtTipoIdentificacionCliente.getText().isEmpty()
                || txtNumeroIdentificacionCliente.getText().isEmpty()
                || txtDireccionCliente.getText().isEmpty()
                || txtEmailCliente.getText().isEmpty())
        {
            return false;
        }
        return true;
    }

    @FXML
    void onCrearEmpleado(ActionEvent event) {
        if(validarFormularioEmpleado()) {
            Empleado newEmpleado = crearEmpleado();
            if(modelFactory.crearEmpleado(newEmpleado)) {
                listEmpleados.add(newEmpleado);
                mostrarMensaje("Notificación Empleado", "Empleado creado", "El Emppleado se ha creado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposCliente();
            }else {
                mostrarMensaje("Notificación Empleado", "Empleado no creado", "El Empleado ya existe", Alert.AlertType.ERROR);
                limpiarCamposCliente();
            }
        }else{
            mostrarMensaje("Notificación Empleado", "Empleado no creado", "Datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private Empleado crearEmpleado() {
        return Empleado.Builder()
                .nombre(txtNombreEmpleado.getText())
                .apellidos(txtApellidoEmpleado.getText())
                .tipoIdentificacion(txtTipoIdentificacionEmpleado.getText())
                .numeroIdentificacion(txtNumeroIdentificacionEmpleado.getText())
                .direccion(txtDireccionEmpleado.getText())
                .email(txtEmailEmpleado.getText())
                .rol(cbRolEmpleado.getSelectionModel().getSelectedItem().toString())
                .Build();
    }

    private boolean validarFormularioEmpleado() {
        if (txtNombreEmpleado.getText().isEmpty()
                || txtApellidoEmpleado.getText().isEmpty()
                || txtTipoIdentificacionEmpleado.getText().isEmpty()
                || txtNumeroIdentificacionEmpleado.getText().isEmpty()
                || txtDireccionEmpleado.getText().isEmpty()
                || txtEmailEmpleado.getText().isEmpty())
        {
            return false;
        }
        return true;
    }

    @FXML
    void onEliminarCliente(ActionEvent event) {
        if(clienteSeleccionado == null){
            mostrarMensaje("Notificación Cliente", "Cliente no Eliminado",
                    "No hay cliente seleccionado", Alert.AlertType.ERROR);
        }else{
            elimarCliente(clienteSeleccionado);
        }
    }

    private void elimarCliente(Cliente clienteSeleccionado) {
        boolean eliminar = modelFactory.eliminarCliente(clienteSeleccionado);
        if(eliminar == true) {
            listCliente.remove(clienteSeleccionado);
            tbCliente.setItems(listCliente);
            mostrarMensaje("Notificación Cliente", "Cliente Eliminado",
                    "EL cliente fue eliminado", Alert.AlertType.INFORMATION);
            limpiarCamposCliente();
        }
    }

    @FXML
    void onEliminarEmpleado(ActionEvent event) {
        if(empleadoSeleccionado == null){
            mostrarMensaje("Notificación Empleado", "Empleado no Eliminado",
                    "No hay empleado seleccionado", Alert.AlertType.ERROR);
        }else{
            elimarEmpleado(empleadoSeleccionado);
        }
    }

    private void elimarEmpleado(Empleado empleadoSeleccionado) {
        boolean eliminarEmpleado = modelFactory.eliminarEmpleado(empleadoSeleccionado);
        if(eliminarEmpleado) {
            listEmpleados.remove(empleadoSeleccionado);
            tbEmpleados.setItems(listEmpleados);
            mostrarMensaje("Notificación Empleado", "Empleado Eliminado",
                    "EL empleado fue eliminado", Alert.AlertType.INFORMATION);
            limpiarCamposEmpleado();
        }
    }


}

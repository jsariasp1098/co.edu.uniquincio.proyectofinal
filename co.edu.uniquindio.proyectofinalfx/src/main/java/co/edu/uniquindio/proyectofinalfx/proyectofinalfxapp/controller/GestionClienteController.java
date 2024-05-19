package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.controller;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.factory.ModelFactory;
import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.Cliente;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;


public class GestionClienteController {

    ModelFactory modelFactory;

    ObservableList<Cliente> listCliente = FXCollections.observableArrayList();
    ObservableList<Cliente> listClienteFiltro = FXCollections.observableArrayList();
    Cliente clienteSeleccionado;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnCrearClientes;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private Label lbBuscar;

    @FXML
    private TableColumn<Cliente, String> tbApellidoCliente;

    @FXML
    private TableView<Cliente> tbCliente;

    @FXML
    private TableColumn<Cliente, String> tbDireccionCliente;

    @FXML
    private TableColumn<Cliente, String> tbEmailCliente;

    @FXML
    private TableColumn<Cliente, String> tbIDCliente;

    @FXML
    private TableColumn<Cliente, String> tbIdentificacionCliente;

    @FXML
    private TableColumn<Cliente, String> tbNombreCliente;

    @FXML
    private TableColumn<Cliente, String> tbTipoIdentificacionCliente;

    @FXML
    private TextField txtApellidoCliente;

    @FXML
    private TextField txtBuscarCliente;

    @FXML
    private TextField txtDireccionCliente;

    @FXML
    private TextField txtEmailCliente;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private TextField txtNumeroIdentificacionCliente;

    @FXML
    private TextField txtTipoIdentificacionCliente;
    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstancia();
        initview();
    }
    private void listenerSelection() {
        tbCliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            clienteSeleccionado = newSelection;
            mostrarInformacionPropietario(clienteSeleccionado);
        });
    }

    private void mostrarInformacionPropietario(Cliente clienteSeleccionado) {
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

    private void initDataBindind() {
        tbIDCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdCliente()));
        tbApellidoCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
        tbNombreCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbTipoIdentificacionCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoIdentificacion()));
        tbIdentificacionCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroIdentificacion()));
        tbDireccionCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        tbEmailCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));
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

    private void initview (){
        initDataBindind();
        ObtenerCliente();
        tbCliente.getItems().clear();
        tbCliente.setItems(listCliente);
        listenerSelection();
    }
    @FXML
    void filtrarNombreApellido(KeyEvent event) {
        String filtre = txtBuscarCliente.getText();
        if(filtre.isEmpty()){
            tbCliente.setItems(listCliente);
        }else{
            listClienteFiltro.clear();
            for (Cliente cliente1: listCliente) {
                if (cliente1.getNombre().toLowerCase().contains(filtre.toLowerCase())||
                        cliente1.getNumeroIdentificacion().toLowerCase().contains(filtre.toLowerCase())){
                    listClienteFiltro.add(cliente1);
                }
            }
            tbCliente.setItems(listClienteFiltro);
        }
    }
    @FXML
    void onCrearCliente(ActionEvent event) {
        if(validarFormulario()) {
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

    private boolean validarFormulario() {
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

}

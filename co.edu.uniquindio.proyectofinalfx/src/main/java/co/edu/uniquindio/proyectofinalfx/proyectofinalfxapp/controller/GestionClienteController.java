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


public class GestionClienteController {

    ModelFactory modelFactory;

    ObservableList<Cliente> listCliente = FXCollections.observableArrayList();
    Cliente clienteSeleccionado;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnCrearClientes;

    @FXML
    private Button btnEliminarCliente;

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

    }

        private void initview (){
        initDataBindind();
        ObtenerCliente();
        tbCliente.getItems().clear();
        tbCliente.setItems(listCliente);
        listenerSelection();
    }
    @FXML
    void onCrearCliente(ActionEvent event) {

    }

    @FXML
    void onEliminarCliente(ActionEvent event) {

    }

}

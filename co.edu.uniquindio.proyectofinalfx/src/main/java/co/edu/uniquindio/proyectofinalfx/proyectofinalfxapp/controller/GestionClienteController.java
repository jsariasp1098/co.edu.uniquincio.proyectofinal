package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class GestionClienteController {

    @FXML
    private Button btnAgregarProductoVenta;

    @FXML
    private Button btnBuscarProductoPedido;

    @FXML
    private Button btnCancelarPedido;

    @FXML
    private Button btnPedidoNueva;

    @FXML
    private Button btnRealizarPedido;

    @FXML
    private Label lbCantidadProductoVenta;

    @FXML
    private Label lbDescripcionProductoVenta;

    @FXML
    private Label lbIdClienteVenta;

    @FXML
    private Label lbIdProductoVenta;

    @FXML
    private Label lbNombreClienteVenta;

    @FXML
    private Label lbNombreClienteVenta1;

    @FXML
    private Label lbValorPagarVenta;

    @FXML
    private Spinner<?> spCantidadPedido;

    @FXML
    private TableView<?> tbPedido;

    @FXML
    private TableColumn<?, ?> tbcCantidadPedido;

    @FXML
    private TableColumn<?, ?> tbcDescripcionPedido;

    @FXML
    private TableColumn<?, ?> tbcIdProductoPedido;

    @FXML
    private TableColumn<?, ?> tbcValorTotalPedido;

    @FXML
    private TableColumn<?, ?> tbcValorUnitarioPedido;

    @FXML
    private TextField txtDescripcionProductoPedido;

    @FXML
    private TextField txtFechaPedido;

    @FXML
    private TextField txtIdClientePedido;

    @FXML
    private TextField txtIdProducttoPedido;

    @FXML
    private TextField txtNombrePedido;

    @FXML
    private Label txtValorPagarPedido;

    @FXML
    void onAgregarProductoPedido(ActionEvent event) {

    }

    @FXML
    void onBuscarProductoPedido(ActionEvent event) {

    }

    @FXML
    void onCancelarPedido(ActionEvent event) {

    }

    @FXML
    void onNuevoPedido(ActionEvent event) {

    }

    @FXML
    void onRealizarPedido(ActionEvent event) {

    }


}

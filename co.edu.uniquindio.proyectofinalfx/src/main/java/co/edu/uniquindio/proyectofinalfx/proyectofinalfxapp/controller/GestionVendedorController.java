package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionVendedorController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    private Button btnRealizarCompra;

    @FXML
    private Button btnRealizarVenta;

    @FXML
    private Button btnVentaNueva;

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
    private TableView<?> tbCompra;

    @FXML
    private TableView<?> tbVenta;

    @FXML
    private TableColumn<?, ?> tbcCantidad;

    @FXML
    private TableColumn<?, ?> tbcCantidadCompra;

    @FXML
    private TableColumn<?, ?> tbcDescripcion;

    @FXML
    private TableColumn<?, ?> tbcDescripcionCompra;

    @FXML
    private TableColumn<?, ?> tbcIdProducto;

    @FXML
    private TableColumn<?, ?> tbcIdProductoCompra;

    @FXML
    private TableColumn<?, ?> tbcPorcentajeDescuento;

    @FXML
    private TableColumn<?, ?> tbcPorcentajeDescuentoCompra;

    @FXML
    private TableColumn<?, ?> tbcValorTotal;

    @FXML
    private TableColumn<?, ?> tbcValorTotalCompra;

    @FXML
    private TableColumn<?, ?> tbcValorUnitario;

    @FXML
    private TableColumn<?, ?> tbcValorUnitarioCompra;

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
    private TextField txtDireccionCliienteVenta;

    @FXML
    private TextField txtDireccionProveedorCompra;

    @FXML
    private TextField txtEfectivoRecibido;

    @FXML
    private TextField txtFechaCompra;

    @FXML
    private TextField txtFechaVenta;

    @FXML
    private TextField txtFechaVenta1;

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
    private TextField txtNombreProductoCompra;

    @FXML
    private TextField txtNombreProveedorCompra;

    @FXML
    private TextField txtNombreVendedor;

    @FXML
    private TextField txtPrecioCompraProducto;

    @FXML
    private TextField txtPrecioVentaProductoCompra;

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
    void onCrearCliente(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}

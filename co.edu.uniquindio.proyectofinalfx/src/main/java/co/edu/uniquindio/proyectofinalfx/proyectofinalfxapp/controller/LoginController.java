package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.controller;
import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.InterfaceView.InterfaceFactory;
import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.InterfaceView.InterfaceView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.factory.ModelFactory;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {
    ModelFactory modelFactory;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIngresarSistema;

    @FXML
    private CheckBox chbMostrarContrasena;

    @FXML
    private Label lbContrasenaIngreso;

    @FXML
    private Label lbCrearUsuario;

    @FXML
    private Label lbIniciarSesion;

    @FXML
    private Label lbNombreSistema;

    @FXML
    private Label lbUsuarioIngreso;

    @FXML
    private PasswordField pfContrasena;

    @FXML
    private TextField txtContrasenaIngreso;

    @FXML
    private TextField txtUsuarioIngreso;

    @FXML
    public void initialize() {
        txtContrasenaIngreso.setVisible(false);
        modelFactory = ModelFactory.getInstancia();
    }
    @FXML
    void onCrearUsuario(MouseEvent event) {

    }

    @FXML
    void onIngresarSistema(ActionEvent event) throws IOException {

        String usuario = txtUsuarioIngreso.getText();
        String contrasena = pfContrasena.getText();

        if((usuario.isEmpty()) && (contrasena.isEmpty())) {

        }else{
            String tipo = modelFactory.buscarUsuario(usuario,contrasena);
            if(tipo.isEmpty()) {

            }else{
                InterfaceView llamarInterface = InterfaceFactory.tipoInterface(tipo);
                Node source = (Node) event.getSource();
                Stage stage = (Stage) source.getScene().getWindow();
                stage.close();
                llamarInterface.llamarInterface();
            }
        }
    }

    @FXML
    void onMostrarContrasena(ActionEvent event) {
        if(chbMostrarContrasena.isSelected()){
            txtContrasenaIngreso.setVisible(true);
            pfContrasena.setVisible(false);
            txtContrasenaIngreso.textProperty().bind(Bindings.concat(pfContrasena.getText()));
        }else{
            txtContrasenaIngreso.setVisible(false);
            pfContrasena.setVisible(true);
        }
    }
    @FXML
    void passwordFieldMostrar(KeyEvent event) {

    }
}

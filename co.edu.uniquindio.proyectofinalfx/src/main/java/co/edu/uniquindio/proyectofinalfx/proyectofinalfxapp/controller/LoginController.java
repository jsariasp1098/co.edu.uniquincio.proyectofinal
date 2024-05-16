package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.HelloApplication;
import javafx.scene.Node;
import javafx.stage.Stage;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class LoginController {
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
    void onCrearUsuario(MouseEvent event) {

    }

    @FXML
    void onIngresarSistema(ActionEvent event) throws IOException {

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("cliente-view.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage1 = new Stage();
        stage1.setTitle("Tienda de Ropa");
        stage1.setScene(scene);
        stage1.show();




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

    @FXML
    public void initialize() {
        txtContrasenaIngreso.setVisible(false);
    }
}

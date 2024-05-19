package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.InterfaceView;

import co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InterfaceAdminstrador implements InterfaceView {
    @Override
    public void llamarInterfaca() throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("administrador-view.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage1 = new Stage();
        stage1.setTitle("Tienda de Ropa - Administrador");
        stage1.setScene(scene);
        stage1.show();
    }
}

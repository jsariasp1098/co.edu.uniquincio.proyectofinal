package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model.InterfaceView;

public class InterfaceFactory {

    public static InterfaceView tipoInterface (String tipo) {
        switch (tipo) {
            case "Cliente":
                return new InterfaceCliente();
            case "Administrador":
                return new InterfaceAdminstrador();
            case "Vendedor":
                return new InterfaceVendedor();
        }
        return null;
    }
}

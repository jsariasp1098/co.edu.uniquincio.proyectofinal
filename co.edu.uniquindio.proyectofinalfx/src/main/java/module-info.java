module co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp to javafx.fxml;
    exports co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp;
    opens co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.controller;
            exports co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.controller;

}
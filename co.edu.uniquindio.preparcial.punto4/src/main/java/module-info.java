module co.edu.uniquindio.preparcial.punto4.empresaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.preparcial.punto4.empresaapp to javafx.fxml;
    exports co.edu.uniquindio.preparcial.punto4.empresaapp;
}
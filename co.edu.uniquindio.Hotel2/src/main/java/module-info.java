module co.edu.uniquindio.hotel2.hotel2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.hotel2.hotel2 to javafx.fxml;
    exports co.edu.uniquindio.hotel2.hotel2;
}
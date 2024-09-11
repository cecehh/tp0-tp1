module fr.chelie {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens fr.chelie to javafx.fxml, javafx.controls;
    exports fr.chelie;

    opens fr.chelie.components to javafx.fxml;
    exports fr.chelie.components;
    opens fr.chelie.controllers to javafx.fxml;
    exports fr.chelie.controllers;
    opens fr.chelie.interfaces to javafx.fxml;
    exports fr.chelie.interfaces;

}
module com.alesandro.ejercicio321 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.alesandro.ejercicio321 to javafx.fxml;
    exports com.alesandro.ejercicio321;
    exports com.alesandro.ejercicio321.controller;
    opens com.alesandro.ejercicio321.controller to javafx.fxml;
    exports com.alesandro.ejercicio321.db;
    opens com.alesandro.ejercicio321.db to javafx.fxml;
}
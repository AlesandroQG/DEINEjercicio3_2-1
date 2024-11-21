module com.alesandro.ejercicio3_21 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires net.sf.jasperreports.core;


    opens com.alesandro.ejercicio3_21 to javafx.fxml;
    exports com.alesandro.ejercicio3_21;
    exports com.alesandro.ejercicio3_21.controller;
    opens com.alesandro.ejercicio3_21.controller to javafx.fxml;
    exports com.alesandro.ejercicio3_21.db;
    opens com.alesandro.ejercicio3_21.db to javafx.fxml;
}
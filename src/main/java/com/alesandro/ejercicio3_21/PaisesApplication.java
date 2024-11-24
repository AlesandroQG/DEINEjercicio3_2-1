package com.alesandro.ejercicio3_21;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase donde se ejecuta la aplicación principal
 *
 * @author alesandroquirosgobbato
 */
public class PaisesApplication extends Application {
    /**
     * {@inheritDoc}
     *
     * Función donde se carga y se muestra la ventana de la aplicación
     *
     * @param stage
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PaisesApplication.class.getResource("fxml/Paises.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("PAÍSES");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Función main donde se lanza la aplicación
     *
     * @param args parámetros por consola
     */
    public static void main(String[] args) {
        Application.launch();
    }
}
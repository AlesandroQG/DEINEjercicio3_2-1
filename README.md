# Ejercicio 3_2 1 - Países
## DM2 DEIN 2024-2025
### Alesandro Quirós Gobbato

Esta es una aplicación hecha con JavaFX y JasperReports que muestra un informe con los países de la base de datos.

JasperReport está compilado en 7.0.1.

#### Estructura

La estructura del proyecto es la siguiente:
- `src > main`:
    - `java > com.alesandro.ejercicio3_21`:
        - `PaisesApplicacion.java`: Clase que lanza la aplicación
        - `controller`:
          - `PaisesController.java`: Clase que controla los eventos de la ventana principal de la aplicación
        - `dao`:
          - `DaoPais.java`: Clase que realiza las operaciones con la base de datos del modelo País
        - `db`:
          - `DBConnect.java`: Clase que se conecta a la base de datos
        - `model`:
          - `Pais.java`: Clase que define el objeto País
    - `resources > com.alesandro.ejercicio3_21`:
        - `fxml`:
          - `Paises.fxml`: Ventana principal de la aplicación
        - `images`: Carpeta que contiene las imágenes de la aplicación
        - `reports`:
          - `Paises.jasper`: Fichero del informe de JasperReport
          - `Paises.jrxml`: Fichero para la edición del informe de JasperReport en JasperStudio
        - `sql`:
          - `paises.sql`: Fichero para la creación de la base de datos

package com.alesandro.ejercicio3_21.dao;

import com.alesandro.ejercicio3_21.db.DBConnect;
import com.alesandro.ejercicio3_21.model.Pais;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Dao del objeto País
 */
public class DaoPais {
    /**
     * Función que carga los datos de la tabla País y los devuelve para usarlos en un mapa
     *
     * @return mapa de país para cargar en un informe
     */
    public static HashMap<String, Object> findAll() {
        DBConnect connection;
        HashMap<String, Object> paises = new HashMap<String, Object>();
        try {
            connection = new DBConnect();
            String consulta = "SELECT id,pais,capital,num_habitantes FROM pais";
            PreparedStatement pstmt = connection.getConnection().prepareStatement(consulta);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String pais_db = rs.getString("pais");
                String capital = rs.getString("capital");
                int num_habitantes = rs.getInt("num_habitantes");
                Pais pais = new Pais(id,pais_db,capital,num_habitantes);
                paises.put(id + "", pais);
            }
            rs.close();
            connection.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paises;
    }
}

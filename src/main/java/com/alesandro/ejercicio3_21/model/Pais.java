package com.alesandro.ejercicio3_21.model;

import java.util.Objects;

/**
 * Clase País
 */
public class Pais {
    private int id;
    private String pais;
    private String capital;
    private int num_habitantes;

    /**
     * Constructor con parámetros de país
     *
     * @param id del país
     * @param pais nombre del país
     * @param capital del país
     * @param num_habitantes del país
     */
    public Pais(int id, String pais, String capital, int num_habitantes) {
        this.id = id;
        this.pais = pais;
        this.capital = capital;
        this.num_habitantes = num_habitantes;
    }

    /**
     * Constructor vacío de país
     */
    public Pais() {}

    /**
     * Getter para la id del país
     *
     * @return id del país
     */
    public int getId() {
        return id;
    }

    /**
     * Setter para la id del país
     *
     * @param id nueva id del país
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter para el nombre del país
     *
     * @return nombre del país
     */
    public String getPais() {
        return pais;
    }

    /**
     * Setter para el nombre del país
     *
     * @param pais nuevo nombre del país
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Getter para la capital del país
     *
     * @return capital del país
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Setter para la capital del país
     *
     * @param capital nueva capital del país
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * Getter para el número de habitantes del país
     *
     * @return número de habitantes del país
     */
    public int getNum_habitantes() {
        return num_habitantes;
    }

    /**
     * Setter para el número de habitantes del país
     *
     * @param num_habitantes nuevo número de habitantes del país
     */
    public void setNum_habitantes(int num_habitantes) {
        this.num_habitantes = num_habitantes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return id == pais.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

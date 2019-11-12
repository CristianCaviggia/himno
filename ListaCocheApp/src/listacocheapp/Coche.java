/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacocheapp;

/**
 *
 * @john
 */
public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private int Km;

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the Km
     */
    public int getKm() {
        return Km;
    }

    /**
     * @param Km the Km to set
     */
    public void setKm(int Km) {
        this.Km = Km;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("/nMatricula: ");
        sb.append(matricula);
        sb.append("/nMarca: ");
        sb.append(marca);
        sb.append("/nModelo: ");
        sb.append(modelo);
        sb.append("/nKm: ");
        sb.append(Km);
        return sb.toString();

    }
}

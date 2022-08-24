/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Alumnos {

    private String nombreCompleto;
    private int dni;

    private int cantVotos;

    public Alumnos() {
    }

    public Alumnos(String nombreCompleto, int dni, int cantVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantVotos=" + cantVotos + '}';
    }
}
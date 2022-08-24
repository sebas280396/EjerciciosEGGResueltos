/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Polideportivo extends Edificio {
     Scanner leer = new Scanner(System.in);
    private String nombre;
    private String tipoCancha;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoCancha, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoCancha = tipoCancha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    @Override
    public void calcularSuperficie(int ancho, int largo) {
        System.out.println("El polideportivo es techado o abierto?");
        tipoCancha=leer.nextLine();
        System.out.println("Ingese el ancho del Polideportivo");
        ancho=leer.nextInt();
        System.out.println("Ingese el largo del Polideportivo");
        largo=leer.nextInt();
        double superficiePolidepotivo=largo*ancho;
        System.out.println("La superficie del polideportivo es de ; "+superficiePolidepotivo);

    }

    @Override
    public void calcularVolumen(int ancho, int largo, int alto) {
        System.out.println("Ingese el ancho del Polideportivo");
        ancho=leer.nextInt();
        System.out.println("Ingese el largo del Polideportivo");
        largo=leer.nextInt();
        System.out.println("Ingese el alto del Polideportivo");
        double volumenPolidepotivo=largo*ancho*alto;
        System.out.println("La superficie del polideportivo es de ; "+volumenPolidepotivo);

    }
}

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
public class EdificioDeOficinas extends Edificio {
    Scanner leer = new Scanner(System.in);
    private int numOficinas;
    private int cantPersonas;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonas, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public void calcularSuperficie(int ancho, int largo) {
          System.out.println("Ingese el ancho del Edificio de Oficinas");
        ancho=leer.nextInt();
        System.out.println("Ingese el largo del Edificio de Oficinas");
        largo=leer.nextInt();
        System.out.println("Ingese el num de pisos del Edificio de Oficinas");
        numPisos=leer.nextInt();
        double superficieEdificio=largo*ancho*numPisos;
        System.out.println("La superficie del edificio es de ; "+superficieEdificio);
    }

    @Override
    public void calcularVolumen(int ancho, int largo, int alto) {
         System.out.println("Ingese el ancho del Edificio de Oficinas");
        ancho=leer.nextInt();
        System.out.println("Ingese el largo del Edificio de Oficinas");
        largo=leer.nextInt();
        System.out.println("Ingese el alto del Edificio de Oficinas");
        alto=leer.nextInt();
        double volumenEdificio=largo*ancho*alto;
        System.out.println("El volumen del edificio es de ; "+volumenEdificio);
    }

   public void cantPersonas() {
       System.out.println("Cuantas personas entran en cada oficina?");
       int persoficina = leer.nextInt();
       int ofixpiso= numPisos;
       int perxpiso=ofixpiso*persoficina;
       System.out.println("La cantidad de personas que entran por piso es de : "+perxpiso);
       cantPersonas=perxpiso*numPisos;
       System.out.println("La cantidad de personas en todo el edificio es de  : "+cantPersonas);
   }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ServicioNIF {
     Scanner leer = new Scanner(System.in);
    String[] vectorNIF = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public NIF crearNIF() {
        NIF nif = new NIF();
        System.out.println("Ingrese su DNI");
        nif.setDNI(leer.nextLong());
        long letra = nif.getDNI() % 23;
        System.out.println(letra);
        for (int i = 0; i < vectorNIF.length; i++) {
            if (i == letra) {
                nif.setLetra(vectorNIF[i]);
                System.out.println(vectorNIF[i]);
            }
        }
        return nif;
    }
    public NIF mostrarNIF(NIF nif){
        System.out.println(nif.getDNI()+" - "+nif.getLetra());
        return nif;
    }

}


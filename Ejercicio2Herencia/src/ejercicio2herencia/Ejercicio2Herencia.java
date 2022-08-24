/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2herencia;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;

/**
 *
 * @author sebas
 */
public class Ejercicio2Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Electrodomestico e1 =new Electrodomestico();
     Lavadora dream = new Lavadora();
     dream.crearLavadora();
     e1.precioFinal(e1);
     dream.precioFinal(dream);
     Televisor tele = new Televisor();
     tele.crearTelevisor();
      e1.precioFinal(e1);
     tele.precioFinal(tele);
    }     
    }
    


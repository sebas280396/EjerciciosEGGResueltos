/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Entidad;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Servicio {
    public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);
    Entidad re = new Entidad ();

    public Entidad crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        re.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        re.setAltura(leer.nextInt());
        return re;

    }
    public void superficie(){
    re.setSuperficie((re.getBase()* re.getAltura()));
        System.out.println("La superficie del rectangulo es: "+re.getSuperficie());
}
    public void perimetro(){
        re.setPerimetro(re.getBase()+re.getAltura()*2);
        System.out.println("El perimetro del rectangulo es: "+re.getPerimetro());
    }
    public void dibujarRectangulo(){
               for(int i = 0; i < re.getBase(); i++) {
                System.out.print("");
            }
            System.out.println();

 
            for(int i = 0; i <=re.getAltura(); i++) {
                System.out.print("");
                for(int j = 0; j <= re.getAltura(); j++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }


            for(int i = 0; i < re.getBase(); i++) {
                System.out.print("");
            }

    }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ServicioRectangulo {
     Scanner leer = new Scanner(System.in);
    Rectangulo re = new Rectangulo();

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        re.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        re.setAltura(leer.nextInt());
        return re;

    }
    public void superficie(){
    re.setSuperficie(re.getBase()*re.getAltura());
        System.out.println("La superficie del rectangulo es: "+re.getSuperficie());
}
    public void perimetro(){
        re.setPerimetro(re.getBase()+re.getAltura()*2);
        System.out.println("El perimetro del rectangulo es: "+re.getPerimetro());
    }
    public void dibujarRectangulo(){
    
        for (int i = 1; i <= re.getAltura(); i++) {
            for (int j = 1; j <= re.getBase(); j++) {
                if (i==1 ||  i==re.getAltura()|| j==1 || j==re.getBase()){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }

    }


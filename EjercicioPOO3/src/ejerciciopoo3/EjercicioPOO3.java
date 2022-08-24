/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo3;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

/**
 *
 * @author sebas
 */
public class EjercicioPOO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioRectangulo r=new ServicioRectangulo();
     Rectangulo re=r.crearRectangulo();
     r.perimetro();
     r.superficie();
     r.dibujarRectangulo();
        System.out.println(" ");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopooextra2;

import Entidad.Puntos;
import Servicio.ServicioPuntos;

/**
 *
 * @author sebas
 */
public class EjercicioPOOextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioPuntos sc = new ServicioPuntos ();
       Puntos p = sc.crearPuntos();
       sc.Calcular();
    
}
}

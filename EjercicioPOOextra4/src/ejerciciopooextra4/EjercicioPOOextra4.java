/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopooextra4;

import Entidad.NIF;
import Servicio.ServicioNIF;

/**
 *
 * @author sebas
 */
public class EjercicioPOOextra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioNIF sn = new ServicioNIF();
        NIF nif = sn.crearNIF();
        sn.mostrarNIF(nif); 
    }
    
}

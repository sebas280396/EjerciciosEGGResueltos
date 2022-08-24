/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia7;

import Entidad.Pais;
import Servicio.ServicioPais;
import java.util.TreeSet;


/**
 *
 * @author sebas
 */
public class Ejercicio5_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   
        ServicioPais sp = new ServicioPais();
        TreeSet<Pais> paises = new TreeSet();
        sp.crearPais(paises);
        for (Pais aux : paises) {
            System.out.println(aux);
        }
        sp.removerPais(paises);

    }

}



    

 
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

import Entidad.Persona;

/**
 *
 * @author sebas
 */
public class EjemplosPOO {

   
    public static void main(String[] args) {
        // TODO code application logic here
    Persona persona1 = new Persona();
    Persona persona2 = new Persona("Mari", 24, "Femenino");
    
      persona1.setNombre("Seba");
        System.out.println("Mi nombre es "+persona1.getNombre());
        System.out.println("------------------------");
        System.out.println(persona2);
    
    }
    
}

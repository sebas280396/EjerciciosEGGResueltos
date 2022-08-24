/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deteccionerrores1.guia7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sebas
 */
public class DeteccionErrores3Guia8 {

    public static void main(String[] args) {

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        System.out.println("Lista de bebidas");
        System.out.println(bebidas);

        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        System.out.println("Bebidas disponibles");
        System.out.println(bebidas);
    }
}

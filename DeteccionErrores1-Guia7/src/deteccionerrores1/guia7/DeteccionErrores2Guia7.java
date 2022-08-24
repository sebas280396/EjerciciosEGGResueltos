/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deteccionerrores1.guia7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sebas
 */
public class DeteccionErrores2Guia7 {
    public static void main(String[] args) {
HashMap<Integer, String> personas = new HashMap();
int a1 = 1;
String n1 = "Albus";
int a2 = 2;
String n2 = "Severus";
personas.put(a1, n1);
personas.put(a2, n2);
for(Map.Entry<Integer, String> recorrer : personas.entrySet()){
    System.out.println("El orden de los mejores magos n°"+ recorrer.getKey()+ " y su nombre es "+ recorrer.getValue());
}
    }
}

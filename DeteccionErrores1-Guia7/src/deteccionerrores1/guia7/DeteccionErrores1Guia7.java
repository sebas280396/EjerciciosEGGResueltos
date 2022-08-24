/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deteccionerrores1.guia7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author sebas
 */
public class DeteccionErrores1Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> listado = new ArrayList();// muestra el listado en las posiciones del vector sin orden de acuerdo a como esta tipeado
       int a = 20;
       listado.add(a);
       int b =1;
       listado.add(b);
       int c =2;
       listado.add(c);
       int d = 4;
       listado.add(d);
       int e = 6;
        listado.add(e);
       int f = 20;    
       listado.add(f);
       int g = 20;
       listado.add(g);
        System.out.println("--------Lista-----");
        System.out.println(listado);
        System.out.println("--------Remover posicion 0 en vector----------");
        listado.remove(0);
        System.out.println(listado);
        System.out.println("-------------Eliminar un valor duplicado el primero que encuentre-------------");
       // listado.remove(4);
        System.out.println(listado);
        
TreeSet <String> lista = new TreeSet();// nos arma las posiciones del vector de acuerdo al orden numerico o letra
        String a1 = "Seba";
        lista.add(a1);
        String a2 = "Adrian";
        lista.add(a2);
        String a3 = "Ibañez";
        lista.add(a3);
        String a4 = "Roci";
        lista.add(a4);
        String a5 = "Mari";
        lista.add(a5);
        String a6= "Lore";
        lista.add(a6);
        System.out.println("-----Conjunto------"); 
        System.out.println(lista);
        System.out.println("-------------------");
HashMap <Integer, String> num1  = new HashMap();//mapa <llave, valor> ordena la posicion en el vector de acuerdo al valor de la llave
        int dni = 39603907;
        String c1 = "Sebastian";
        num1.put(dni, c1);
        int dni2 = 24058899;
        String c2 = "Adrian";
        num1.put(dni2, c2);
        int dni3 = 23579386;
        String c3 = "Lorena";
        num1.put(dni3, c3);
        int dni4 = 5083978;
        String c4 = "Victor";
        num1.put(dni4, c4);
        System.out.println("---------Mapa---------");
        System.out.println(num1);
        System.out.println("----------------------");
        num1.remove(dni);
        System.out.println("----------------------");
        System.out.println(num1);
        
    }
    
}

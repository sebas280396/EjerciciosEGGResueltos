/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1programa;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Practica10 {
 public static void main (String [] args){
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite");
        int num = leer.nextInt();
        System.out.println("Ingrese numeros hasta que la suma de los mismos supere el limite establecido");
        int numsuma= 0;
        int suma = 0;
        while (suma<num){
           numsuma= leer.nextInt();
           suma = suma + numsuma;
        }
        System.out.println("Ha llegado al limite");
        System.out.println(suma);
     
 }   
}

/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
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
public class Practica2 {
  public static void main (String[] args){
   Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese su nombre");
    String nombre = leer.nextLine();
     System.out.println(nombre.toUpperCase());
     System.out.println(nombre.toLowerCase());
      
  }  
}

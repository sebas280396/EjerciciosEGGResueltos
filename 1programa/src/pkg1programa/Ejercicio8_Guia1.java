/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.*
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
public class Ejercicio8_Guia1 {
    public static void main (String [] args){
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese una nota comprendida entre 0 y 10");
     int notas = leer.nextInt();  
          while(notas > 10){
      System.out.println("Ingrese una nota correcta");
      notas=leer.nextInt();
     
  
  }
           System.out.println("La nota ingresa es valida");
     }
     }
        
        
    


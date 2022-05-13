/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
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
public class Practica7 {
  public static void main (String[] args){
   Scanner leer = new Scanner (System.in);
      System.out.println("Ingrese una frase ");
      String clave = leer.nextLine();
      if(clave.equals("eureka")){
          System.out.println("La frase ingresada es "+clave+" y es correcta");
  }  
      else{
          System.out.println("La frase ingresada es "+clave+" y no es correcta");   
      }
}
}

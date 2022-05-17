/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package pkg1programa;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Practica9 {
  public static void main(String [] args){
   Scanner leer = new Scanner (System.in);   
      System.out.println("Ingrese una palabra o frase");
      String palabra = leer.nextLine();
      int longitud;
      longitud = palabra.length();
      String cadena;
      cadena = palabra.substring(0,1);
      if(cadena.equals("A") || cadena.equals("a")){
          System.out.println("CORRECTO");
      }
      else{
          System.out.println("INCORRECTO");
      }
  }  
}

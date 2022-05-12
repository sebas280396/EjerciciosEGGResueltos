///Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
//alguno de ellos es mayor a 25.*

package pkg1programa;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Ejercicio7_menos1 {
    public  static void main (String [] args){
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese el 1° valor ");
      int a = leer.nextInt();
      System.out.println ("ingrese el 2° valor ");
      int b = leer.nextInt();
      
      if (a> 25 && b> 25){
      System.out.println("Tanto el primer valor "+a+" como el segundo valor "+b+ " son mayores a 25");
      } else if (b< 25 && a< 25) {
           
          System.out.println("Tanto el primer valor "+a+" como el segundo valor "+b+ " son menores a 25");
      }     
      if(a < 25 && b > 25 ){
      System.out.println("El primer valor "+a+ " es menor a 25 y el segundo valor "+b+" es mayor a 25");
              }     
      if(a > 25 && b < 25){
       System.out.println("El primer valor "+a+ " es mayor a 25 y el segundo valor "+b+" es menor a 25"); 
      
      }
      
              
      
}
}


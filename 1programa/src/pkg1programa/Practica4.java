/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
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
public class Practica4 {
    public static void main (String [] args){
  Scanner leer = new Scanner(System.in);          
  System.out.println("Ingrese los grados");
  double c;
  c=leer.nextFloat();
  double f;
  f = 32 + (9* (c / 5));
        System.out.println("Los grados Celsius pasados a Fahrenheit es: "+f);
  }           
}

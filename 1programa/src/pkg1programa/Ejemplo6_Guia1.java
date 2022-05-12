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
public class Ejemplo6_Guia1 {
 public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
System.out.println("Ingresa tu nombre");
String nombre = leer.nextLine();
System.out.println("Ingresa tu edad");
int edad = leer.nextInt();
System.out.println("Su nombre es "+nombre+" y su edad es "+edad);
}
}   


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
public class Ejercicio16 {
 public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

       int vector[]=new int [100];
        for (int i = 0; i < vector.length; i++) {
              vector[i]= (int)(Math.random()*100 );
              System.out.println(vector[i]);


        }

        System.out.println("Ingrese un valor a buscar en el vector entre 0-99");
        int num=leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
           if (num==vector[i]){
               System.out.println("El numero "+num+" se encuentra repetido en la posición " + i);
           }

        } 
 }
}

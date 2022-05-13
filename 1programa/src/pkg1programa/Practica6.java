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
public class Practica6 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (num%2==0){
            System.out.println("Su numero es par");
        } else {
                System.out.println("Su numero es inpar");
                }
    }

}


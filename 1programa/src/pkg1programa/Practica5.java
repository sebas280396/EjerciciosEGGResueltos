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
public class Practica5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular el doble, el triple y la raiz cuadrada");
        int x = leer.nextInt();
        int dos = x*2;
        int tres = x*3;
        double raiz = (double)Math.sqrt(x);
        System.out.println("Los valores son: ");
        System.out.println(dos+"\n"+tres+"\n"+raiz);
    }

}


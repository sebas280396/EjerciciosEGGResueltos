/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1programa;

/**
 *
 * @author sebas
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        String aux=" "; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matriz[i][j]=(int) (Math.random()*10);
               System.out.print( matriz[i][j]+" ");


         }
            System.out.println("");

        }
         System.out.println("---------------------");
            for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {

               System.out.print( matriz[i][j]+" ");

        }

                System.out.println("");


    }
    }
}


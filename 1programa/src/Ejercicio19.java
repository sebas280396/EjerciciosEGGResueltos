/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 

 import java.util.Scanner;
/** 
 *
 * @author sebas
 */
public class Ejercicio19 {
  public static void main(String[] args) {
        int contador=0;
        int[][] matrizB; 
        int i, e;
        int matriz[][]={{0,-2,0,-9},{2,0,-6,-4},{0,6,0,1},{9,4,-1,0}};
        matrizB= new int[4][4];
        for (i = 0; i < 4; i++) {
            for (e = 0; e < 4; e++) {
                System.out.print(" [" + i + "," + e + "]");
                System.out.print("=" + matriz[i][e]);
            }
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < 4; i++) {
            for (e = 0; e < 4; e++) {

                System.out.print(" [" + e + "," + i + "]");
                System.out.print("=" + (matriz[e][i]));
                matrizB[i][e]= -matriz[e][i];
            }
            System.out.println();
        }
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                if (matrizB[j][k]!=matriz[j][k]){
                    //System.out.println("Su matriz no antisimetrica.");
                }else {
                    //System.out.println("Su matriz es antisimetrica.");
                    contador++;
                }
            }

        }
        if (contador==16){
            System.out.println("Su matriz es antisimetrica");
        }else{
            System.out.println("Su matriz no es antisimetrica");
        }

    }

}


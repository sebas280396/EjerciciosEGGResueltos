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
public class Ejercicio17 {
    public static void main(String[] args) {
        // TODO code application logic here
        int vector [] = new int [10];
         int uno = 0;
         int dos = 0;
         int tres = 0;
         int cuatro = 0;
         int cinco=0;
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random()*100000);
            int longi = (int) Math.log10(vector[i])+1;
            if (longi == 1) {
                uno++;
            }
            else if (longi==2) {
                 dos++;
            }
            else if (longi==3) {
                tres++;
            }
            else if (longi==4) {
               cuatro++;
            }
            else if (longi==5) {
                cinco++;
            }
            System.out.println(vector[i]+" "+(longi));

        }
         System.out.println("La cantidad de num de 1 digito es de " + uno);
         System.out.println("La cantidad de num de 2 digito es de " + dos);
         System.out.println("La cantidad de num de 3 digito es de " + tres);
         System.out.println("La cantidad de num de 4 digito es de " + cuatro);
         System.out.println("La cantidad de num de 5 digito es de " + cinco);
    }
}


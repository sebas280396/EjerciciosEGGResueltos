/*
  Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O 

* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1programa;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Ejercicio12 {
   public static void main (String [] args){
       Scanner leer = new Scanner(System.in);
   
        String cadena = "";
        int longi = 0;
        int correcta =0;
        int incorrecta=0;
        String subcad1 = "";
        String subcad2 = "";
        while (cadena!= ("&&&&&")) {
            if (cadena.equals("&&&&&")){
            break;
        }
            System.out.println("Ingrese una cadena para verificar");
        cadena = leer.nextLine();
        longi = cadena.length();
        subcad1 = cadena.substring(0,1);
        subcad2= cadena.substring(longi-1, longi);
           
        if (longi<=5 && ((subcad1=="X")|| (subcad1=="x")) && ((subcad2=="o") || (subcad2=="O")))  {
            correcta++;
        } else 
            incorrecta++;
        }
        System.out.println("La cantidad de cadenas correctas son " +correcta +"\n" + "La cantidad de cadenas incorrectas es " +incorrecta);
         System.out.println("ss"+subcad2);
    }

}
    


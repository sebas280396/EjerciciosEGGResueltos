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
public class Ejercicio14 {
    public static void main (String [] args ){
        Scanner leer = new Scanner(System.in);
      
  
        System.out.println("¿Cuantos Euros desea convertir?");
        int Euros = leer.nextInt();
        String yenes = "Yenes ";
        String dolares = "Dolares ";
        String Libras = "Libras ";
        double [] guardado = new double[3];
        double [] devolverDinero= new double[3];
        guardado = devolverDinero (Euros,yenes,dolares,Libras);
        System.out.println();
        System.out.println("* El cambio de la moneda es de...");
        System.out.println(yenes + guardado[0] + "\n" + dolares + guardado[1] + "\n" + Libras + guardado [2]);

    }
    public static double [] devolverDinero (int Euros, String yenes, String dolares, String Libras){
        double [] guardado = new double[3];
        double [] valores = new double[]{0.86,1.28611,129.852}; 
        int i;
        for (i=0;i<valores.length;i++){
             guardado[i] = Euros * valores[i];
        }
        return guardado;
    }

} 
        
    
    


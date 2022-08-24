/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Ejercicio1extra {
    public static void main (String [] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una cantidad de minutos a convertir a dias y hora");
        int minutos= leer.nextInt();
        int dia=0;
        int horas;
        int contador;
        
        while(minutos >= 1440){
         if(minutos  >= 1440){
            dia++;
            minutos = minutos -1440;
             horas =  minutos/60;
        
            
           System.out.println("Las horas son "+horas+" y "+ " los dias son "+dia);
        }
        }
        
    }

}
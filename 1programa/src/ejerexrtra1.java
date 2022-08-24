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
public class ejerexrtra1 {
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
       System.out.println("Ingrese los minutos que desea calcular");
       int minutos=leer.nextInt();
       int dias=0;
       while (minutos>1440){
         if (minutos>1440){
        dias++;
        minutos = minutos-1440;
       } 
       }
      int horas= minutos/60;
        System.out.print(dias+ " dias " + horas+" hs ");
    }

}


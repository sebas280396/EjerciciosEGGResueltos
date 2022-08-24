/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ServicioMeses {
  

    Scanner leer=new Scanner(System.in);

    public Meses crearArrays(){

         Meses m=new Meses();
            String messecreto= m.getMeses()[4];
         System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");

       String intromes=leer.nextLine();
        System.out.println(m.getMeses()[4]);



            while(!intromes.equals(messecreto)){
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
               intromes= leer.nextLine();
               }


        System.out.println("¡Ha acertado!");






    return m;
    }

}


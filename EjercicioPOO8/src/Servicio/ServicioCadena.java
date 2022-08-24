/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ServicioCadena {
     Scanner leer=new Scanner(System.in).useDelimiter("\n");

     public int mostrarVocales(Cadena frase){
         String subcad;
         int vocal=0;
         System.out.println(frase.getFrase());
         for (int i = 0; i < frase.getLongi() ; i++) {
             subcad=frase.getFrase().substring(i, i+1);
             if (subcad.equalsIgnoreCase("a")||subcad.equalsIgnoreCase("e")||subcad.equalsIgnoreCase("i")||subcad.equalsIgnoreCase("o")||subcad.equalsIgnoreCase("u")) {
                 vocal++;
             } 
         }
         System.out.println(vocal);
     return vocal;
     }
     public String invertirFrase(Cadena frase){
         String fraseinv= "";
         for (int i = frase.getLongi() - 1; i >= 0; i--)
             fraseinv= fraseinv+frase.getFrase().charAt(i);
         System.out.println(fraseinv);
     return fraseinv;
     }
     public int vecesRepetido(Cadena frase){
         int aux = 0;
         String subcad;
         System.out.println("Ingrese la letra que desea ver cuantas veces se repite");
         String letra = leer.next();
         for (int i = 0; i < frase.getLongi() ; i++) {
             subcad=frase.getFrase().substring(i, i+1);
             if (subcad.equalsIgnoreCase(letra)) {
                 aux++;
                 
             }
         }
         System.out.println("La cantidad de veces que se repite " +letra+ " es "+aux);
         return aux;
    
         
     }
        public int compararLongitud (Cadena frase){
            System.out.println("Ingrese una nueva frase para comparar con la original");
            String frase2= leer.next();
            leer.nextLine();
           if (frase2.length() > frase.getLongi()){
               System.out.println("La nueva frase "+frase2+" tiene mayor longitud a la frase original "+frase.getFrase());
           }
           else if(frase2.length() == frase.getLongi()){
               System.out.println("La nueva frase "+frase2+" tiene la misma longitud que la frase original "+frase.getFrase());
           }
           else if(frase2.length() < frase.getLongi()){
               System.out.println("La nueva frase "+frase2+" tiene menor longitud que la frase original "+frase.getFrase());
           }
           return frase2.length();
       }
       public String unirFrases (Cadena frase){
           System.out.println("Ingrese una nueva frase para unir con la original");
           String frase2 = leer.next();
           leer.nextLine();
           String fraseresultante =  frase.getFrase() +" "+  frase2 ;
           
           System.out.println("La nueva frase resultante es "+fraseresultante);
           return fraseresultante;
       } 
     
     public String reemplazar(Cadena frase){
         System.out.println("Ingrese el caracter que desea reemplazar en la frase original");
         String caracter= leer.next();
         String subcad="";
         for (int i = 0; i < frase.getLongi(); i++) {
             subcad=frase.getFrase().substring(i, i+1);
             if(subcad.equalsIgnoreCase("a")){
                 subcad=caracter;
             }else if(!subcad.equalsIgnoreCase("a")){
                 subcad=subcad;
             }
             System.out.print(subcad);
         }
         return subcad;
     }
}


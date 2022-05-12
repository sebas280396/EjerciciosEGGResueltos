/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
*/
package pkg1programa;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Ejercicio9_guia1 {
    public static void main (String [] args){
     Scanner leer = new Scanner (System.in);
        int contador;
        contador =0;
        int numeros;
        int total = 0;
        System.out.println("Ingrese al menos un valor numerico hasta ingresar 0");
     do{ 
        
        
        
          numeros = leer.nextInt();
          
          if (numeros > 0){
               total = total+ numeros;
          }
              contador++;
     
     
     }while(contador < 20 && numeros != 0);
     
         
        System.out.println("La sumatoria total es: "+total);
         
    }
}
     


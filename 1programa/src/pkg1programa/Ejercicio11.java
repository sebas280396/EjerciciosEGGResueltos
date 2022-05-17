/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:plate in the editor.
 */
package pkg1programa;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Ejercicio11 {
public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros por favor");
        int num1=leer.nextInt();
         int num2=leer.nextInt();

              System.out.println("Ingrese la opcion que desee");
                     System.out.println("MENU\n" +
"1. Sumar\n" +
"2. Restar\n" +
"3. Multiplicar\n" +
"4. Dividir\n" +
"5. Salir\n" +
"Elija opción:");

         int menu=leer.nextInt();
         boolean bandera=true;
         do {
              switch(menu){
            case 1:
                System.out.println("La suma de los numeros enteros es " + (num1+num2));
                              System.out.println("Ingrese la opcion que desee");
                     System.out.println("MENU\n" +
"1. Sumar\n" +
"2. Restar\n" +
"3. Multiplicar\n" +
"4. Dividir\n" +
"5. Salir\n" +
"Elija opción:");
                     menu=leer.nextInt();
                break;
            case 2:
                System.out.println("La resta de los numeros enteros es " + (num1-num2));
                                              System.out.println("Ingrese la opcion que desee");
                     System.out.println("MENU\n" +
"1. Sumar\n" +
"2. Restar\n" +
"3. Multiplicar\n" +
"4. Dividir\n" +
"5. Salir\n" +
"Elija opción:");
                     menu=leer.nextInt();
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros enteros es " + (num1*num2));
                                              System.out.println("Ingrese la opcion que desee");
                     System.out.println("MENU\n" +
"1. Sumar\n" +
"2. Restar\n" +
"3. Multiplicar\n" +
"4. Dividir\n" +
"5. Salir\n" +
"Elija opción:");
                     menu=leer.nextInt();
                break;
            case 4:
                System.out.println("La division de los numeros enteros es " + (num1/num2));
                                              System.out.println("Ingrese la opcion que desee");
                     System.out.println("MENU\n" +
"1. Sumar\n" +
"2. Restar\n" +
"3. Multiplicar\n" +
"4. Dividir\n" +
"5. Salir\n" +
"Elija opción:");
                     menu=leer.nextInt();
                break;
            case 5:
                System.out.println("¿Desea salir del programa?. S/N");
                String letra=leer.nextLine();
                if (letra.equals("S")){
                    bandera=false;
                       System.out.println("A salido del programa");
            

 break;
        }
        

              }           
         } 
         
         while ((menu==1)||(menu==2)||(menu==3)||(menu==4)||(menu==5));

              }    

      
        }




        // TODO code application logic here
    
    


/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:

 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ServicioPuntos {
    Scanner leer = new Scanner (System.in);
    Puntos p = new Puntos();
    
public Puntos crearPuntos (){
    System.out.println("Ingrese el valor de x1: ");
    p.setX1(leer.nextDouble());
    System.out.println("Ingrese el valor de x2: ");
    p.setX2(leer.nextDouble());
    System.out.println("Ingrese el valor de y1: ");
    p.setY1(leer.nextDouble());
    System.out.println("Ingrese el valor de y2: ");
    p.setY2(leer.nextDouble());
    return p;
}    
public Puntos Calcular (){
    double resultado = Math.sqrt((Math.pow((p.getX2()-p.getX1()), 2))+(Math.pow((p.getY2()-p.getY1()), 2)));
    System.out.println("La distancia entre los puntos es "+resultado);
    return p;
}    
}

/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ServicioCancion {
    Scanner leer = new Scanner (System.in);
    Cancion c1 = new Cancion();
    
    public Cancion crearCancion(){
        System.out.println("El autor de la cancion es: ");
        c1.setAutor(leer.nextLine());
        System.out.println("El titulo de la cancion es: ");
        c1.setTitulo(leer.nextLine ());
        
        System.out.println("El autor de la cancion es "+ c1.getAutor()+ " y el titulo de la cancion es "+c1.getTitulo());
        return c1;
    }
    
}

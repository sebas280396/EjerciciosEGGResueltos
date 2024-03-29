//*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.


package ejerciciospoo;

import Entidad.Libreria;
import Servicio.Servicio;

/**
 *
 * @author sebas
 */
public class EjerciciosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Servicio libro = new Servicio ();
        
        Libreria book = libro.crearLibro();
        
        System.out.println(book.toString());
    }
    
}

package Servicio;

import java.util.Scanner;
import Entidad.Libreria;
public class Servicio {
    
private Scanner leer = new Scanner(System.in).useDelimiter("\n");

public Libreria crearLibro (){
    System.out.println("Introducir ISBN del libro");
    int Isbn = leer.nextInt();
    System.out.println("Intoducir el titulo del libro");
    String titulo = leer.next();
    System.out.println("Introduce el nombre del autor");
    String autor = leer.next();
    System.out.println("Introduce la cantidad de paginas");
    int paginas = leer.nextInt();
    
    return new Libreria (Isbn, titulo, autor, paginas);




}

}
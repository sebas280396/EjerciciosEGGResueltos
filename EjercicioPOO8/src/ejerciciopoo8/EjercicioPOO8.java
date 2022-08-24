/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo8;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class EjercicioPOO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
      ServicioCadena sc= new ServicioCadena();
      Cadena frase = new Cadena();
        System.out.println("Ingrese una frase");
        frase.setFrase(leer.nextLine());
        frase.setLongi(frase.getFrase().length());
        sc.mostrarVocales(frase);
        sc.invertirFrase(frase);
        sc.vecesRepetido(frase);
        sc.compararLongitud(frase);
        sc.unirFrases(frase);
        sc.reemplazar(frase);
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo9;

import Entidad.Matematica;
import Servicio.ServicioMatematica;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EjercicioPOO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        ServicioMatematica sm = new ServicioMatematica();
        Matematica numero = new Matematica();
        numero.setNum1(Math.floor(Math.random()*10));
        numero.setNum2(Math.floor(Math.random()*10));
        System.out.println(numero.getNum1() + " " + numero.getNum2());
        System.out.println(sm.devolverMayor(numero, numero));
        sm.calcularPotencia(numero, numero);
        sm.calcularRaiz(numero, numero);

    }
    
}

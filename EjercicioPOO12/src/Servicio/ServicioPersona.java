/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ServicioPersona {
     Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();
    public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese su fecha de nacimiento respetando el formato dd/mm/aaa");
       System.out.print("Dia: ");
        int dia=leer.nextInt();
        System.out.print("Mes: ");
        int mes=leer.nextInt();
        System.out.print("Anio: ");
        int anio=leer.nextInt();
        Date Nacimiento =new Date(anio-1900, mes-1, dia);
        p1.setNacimiento(Nacimiento);
        System.out.println(Nacimiento);
        return p1;
    }

    public Persona calcularEdad() {
        Date fechactual = new Date();
        int diffechas=fechactual.getYear()-p1.getNacimiento().getYear();
        System.out.println("La edad calculada de la persona es "+diffechas+ " años");
        return p1;
    }

    public Persona menorQue() {
        System.out.println("Ingrese otra edad");
        int edad= leer.nextInt();
        Date fech = new Date(edad);
        boolean difedad=true;
        if (difedad= p1.getNacimiento().after(fech)) {
            System.out.println(difedad);
            System.out.println("La persona es mayor");
    }
        else {
            System.out.println("La persona es menor");
        }
        System.out.println(difedad);
        return p1;
    }
} 


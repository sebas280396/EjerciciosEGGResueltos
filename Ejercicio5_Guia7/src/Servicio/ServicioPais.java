/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author sebas
 */
public class ServicioPais {
      Scanner leer = new Scanner(System.in);

    public void crearPais(TreeSet<Pais> paises) {
        String aux = "s";
        while (aux.equalsIgnoreCase("s")) {
            Pais p = new Pais();
            System.out.print("Ingrese un pais: ");
            p.setPaises(leer.nextLine());
            paises.add(p);
            System.out.print("Desea agregar otra pais? S/N: ");
            aux = leer.nextLine();
        }
    }

    public void removerPais(TreeSet<Pais> paises) {
        Iterator<Pais> it = paises.iterator();
        System.out.println("Ingrese el pais que desea remover");
        String paisR = leer.nextLine();
        int aux1 =0;
        while (it.hasNext()) {
            Pais aux = it.next();
            if (aux.getPaises().equals(paisR)) {
                it.remove();
            } else {
                aux1++;
            }

        }
        if (aux1==paises.size()-1){
            System.out.println("El pais no se encuntra en la lista");
        }
        for (Pais aux : paises) {
            System.out.println(aux);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author sebas
 */
public class ServicioProductos {
      Scanner leer = new Scanner(System.in);
    
    public void introducirElemento(HashMap <String, Double> productos) {
        String aux = "s";
        while (aux.equalsIgnoreCase("s")) {
            Productos p = new Productos();
            System.out.print("Ingrese el producto a introducir en la lista :");
            String produ=(leer.nextLine());
            p.setNombre(produ);
            System.out.print("Ingrese el precio del producto :");
            double pr=(leer.nextDouble());
            p.setPrecio(pr);
            productos.put(p.getNombre(),p.getPrecio());
            leer.nextLine();
            System.out.print("Desea agregar otro artículo? S/N: ");
            aux = leer.nextLine();
    }
        leer.nextLine();
    }
    
        public void modificarPrecio (TreeMap<String, Double> t){
            String produ;
            boolean bandera = true;
            System.out.println("Elija un producto para modificar su precio");
            produ=leer.nextLine();
            for (Map.Entry<String, Double> entry : t.entrySet()) {
                if (bandera==true) {
                if (produ.equals(entry.getKey())) {
                    System.out.println("Se va a modificar el precio de : "+produ+", por favor, ingrese un nuevo valor :");
                    t.replace(produ, leer.nextDouble());
                    bandera=true;
                }
                }
                    else {
                            System.out.println("El producto no se encuentra en la lista");
                            bandera=false;
                            }
                }
            leer.nextLine();
            }
      public void elmininarProducto (TreeMap<String, Double> t){
            System.out.println("Desea eliminar algún producto? s/n");
            String aux=leer.nextLine();
            boolean bandera = true;
            System.out.println("Elija el producto que desee eliminar");
             String produ=leer.nextLine();

            while(aux.equalsIgnoreCase("s")) {

                System.out.println("Se va a eliminar el producto : "+produ+" ");
                    t.remove(produ);
                    System.out.println("Desea eliminar otro producto? s/n");
                    aux=leer.nextLine();
            }
}
}


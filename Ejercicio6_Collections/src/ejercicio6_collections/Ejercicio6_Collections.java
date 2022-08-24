/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_collections;

import Servicio.ServicioProductos;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author sebas
 */
public class Ejercicio6_Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HashMap<String, Double> productos = new HashMap();
    ServicioProductos sp = new ServicioProductos();
    sp.introducirElemento(productos);
//        for (Map.Entry<String, Double> entry : productos.entrySet()) {
//            System.out.println("Articulo = "+entry.getKey()+", Precio= $ "+entry.getValue());
//        }
    TreeMap<String, Double> t = new TreeMap();
    t.putAll(productos);
        for (String key : t.keySet()) {
            System.out.println("Articulo = "+key+", Precio= $ "+t.get(key));
        }
        sp.modificarPrecio(t);
         for (String key : t.keySet()) {
            System.out.println("Articulo = "+key+", Precio= $ "+t.get(key));
    }
   sp.elmininarProducto(t);
       System.out.println("La lista de productos actualizada es :");
    for (String key : t.keySet()) {
           System.out.println("Articulo = "+key+", Precio= $ "+t.get(key));
}
}
}
    
    


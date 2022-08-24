/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author sebas
 */
public class Lavadora extends Electrodomestico {
       private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char cenerg, double peso) {
        super(precio, color, cenerg, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

public void crearLavadora() {

    super.crearElectrodomestico();
    System.out.println("Ingrese la carga de la lavadora");
    carga=leer.nextInt();
}
    @Override
    public void precioFinal(Electrodomestico e1){
    super.precioFinal(e1);
    if (carga>30) {
        e1.setPrecio(e1.getPrecio()+500);
    }
        System.out.println("El precio final de la lavadora es de "+e1.getPrecio());
}
}

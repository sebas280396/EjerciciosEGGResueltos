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
public class Televisor extends Electrodomestico {
    private int pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, double precio, String color, char cenerg, double peso) {
        super(precio, color, cenerg, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    public void crearTelevisor() {
        super.crearElectrodomestico();
        String aux = "";
        System.out.println("Ingrese las pulgadas del televisor");
        pulgadas=leer.nextInt();
        leer.nextLine();
        System.out.println("Contiene sintonizador TDT? s/n");
        if (aux.equalsIgnoreCase("s")) {
            tdt=true;
        } else if (aux.equalsIgnoreCase("n")){
            tdt=false;
        }
    }
    @Override
    public void precioFinal(Electrodomestico e1){
        e1.precioFinal(e1);
        if (pulgadas>40) {
            e1.setPrecio(e1.getPrecio()*1.3);
        }
        if (tdt==true) {
            e1.setPrecio(e1.getPrecio()+500);
        }
        System.out.println("El precio final del televisor es de "+e1.getPrecio());
    } 
}

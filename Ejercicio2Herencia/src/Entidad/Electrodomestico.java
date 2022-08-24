/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Electrodomestico {
     Scanner leer = new Scanner(System.in);
    protected double precio;
    protected String color;
    protected char letra;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char cenerg, double peso) {
        this.precio = precio;
        this.color = color;
        this.letra = cenerg;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getCenerg() {
        return letra;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCenerg(char letra) {
        this.letra = letra;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            System.out.println("El grado de consumo es del tipo " + letra);
        } else {
            letra = 'F';
        }
    }

    protected void comprobarColor(String color) {
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
            System.out.println("El color del electrodomestico es " + color);
        } else {
            color = "Blanco";
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Electrodomestico e1 = new Electrodomestico();
        System.out.println("Ingrese el color del electrodomestico");
        e1.setColor(leer.nextLine());
        System.out.println("Ingrese el tipo de consumo (letra) del electrodomestico");
        e1.setCenerg(leer.next().charAt(letra));
        System.out.println("Ingrese el peso del electrodomestico");
        e1.setPeso(leer.nextDouble());
        e1.setPrecio(1000);
        e1.comprobarColor(e1.getColor());
        e1.comprobarConsumoEnergetico(e1.getCenerg());
        return e1;
    }

    public void precioFinal(Electrodomestico e1) {

        switch (e1.getCenerg()) {
            case 'A':
            case 'a':
                e1.setPrecio(e1.getPrecio() + 1000);
                break;
            case 'B':
            case 'b':
                e1.setPrecio(e1.getPrecio() + 800);
                break;
            case 'C':
            case 'c':
                e1.setPrecio(e1.getPrecio() + 600);
                break;
            case 'D':
            case 'd':
                e1.setPrecio(e1.getPrecio() + 500);
                break;
            case 'E':
            case 'e':
                e1.setPrecio(e1.getPrecio() + 300);
                break;
            case 'F':
            case 'f':
                e1.setPrecio(e1.getPrecio() + 100);
                break;
            default:
        }
        if (e1.getPeso() >= 1 && e1.getPeso() <= 19) {
            e1.setPrecio(e1.getPrecio() + 100);
        } else if (e1.getPeso() >= 20 && e1.getPeso() <= 49) {
            e1.setPrecio(e1.getPrecio() + 500);
        } else if (e1.getPeso() >= 50 && e1.getPeso() <= 79) {
            e1.setPrecio(e1.getPrecio() + 800);
        } else if (e1.getPeso() > 80) {
            e1.setPrecio(e1.getPrecio() + 1000);
        }
         System.out.println("El precio final del electrodomestico es de "+e1.getPrecio());
    }
}


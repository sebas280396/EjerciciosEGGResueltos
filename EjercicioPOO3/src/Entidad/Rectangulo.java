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
public class Rectangulo {
 
    private int base;
    private int altura;
    private int superficie;
    private int perimetro;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura, int superficie, int perimetro) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }



}


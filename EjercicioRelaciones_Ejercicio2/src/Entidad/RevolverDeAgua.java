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
public class RevolverDeAgua {
       private double posiactual;
    private double posiagua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(double posiactual, double posiagua) {
        this.posiactual = posiactual;
        this.posiagua = posiagua;
    }

    public double getPosiactual() {
        return posiactual;
    }

    public double getPosiagua() {
        return posiagua;
    }

    public void setPosiactual(double posiactual) {
        this.posiactual = posiactual;
    }

    public void setPosiagua(double posiagua) {
        this.posiagua = posiagua;
    }

    @Override
    public String toString() {
        return "RevolverdeAgua{" + "posiactual=" + posiactual + ", posiagua=" + posiagua + '}';
    }

}


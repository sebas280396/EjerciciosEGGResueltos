/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.RevolverDeAgua;

/**
 *
 * @author sebas
 */
public class ServicioRevolver {
     public RevolverDeAgua  llenarRevolver() {
        RevolverDeAgua revolver = new RevolverDeAgua();
        System.out.println("Llenando el cargador");
        revolver.setPosiactual(Math.round(Math.random() * 6));
        revolver.setPosiagua(Math.round(Math.random() * 6));
       
        return revolver;
    }

    public boolean mojar(RevolverDeAgua revolver) {
        boolean bandera = false;
        if (revolver.getPosiactual() == revolver.getPosiagua()) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    public void siguienteChorro(RevolverDeAgua revolver) {

        revolver.setPosiactual(revolver.getPosiactual() + 1);
        if (revolver.getPosiactual() > 6) {
            revolver.setPosiactual(0);
        }
    }
//   public void toString(RevolverdeAgua revolver){
//       System.out.println(revolver.toString());
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.List;

/**
 *
 * @author sebas
 */
public class ServicioJugador {
    ServicioRevolver sr = new ServicioRevolver();
    RevolverDeAgua revolver=sr.llenarRevolver();
    public Jugador disparo(Jugador jugador, List<Jugador> jugadores) {

        System.out.println(revolver.getPosiactual());
        System.out.println(revolver.getPosiagua());
        if (sr.mojar(revolver) == true) {
            jugador.setMojado(true);

        } else {
            sr.siguienteChorro(revolver);
            jugador.setMojado(false);
        }

        return jugador;
    }
}


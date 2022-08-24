/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorelaciones_ejercicio2;

import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import Servicio.ServicioJuego;
import Servicio.ServicioJugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class EjercicioRelaciones_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              ServicioJugador jugador = new ServicioJugador();
        ServicioJuego juego = new ServicioJuego();
        Jugador Jugadores = new Jugador();
        RevolverDeAgua revolver = new RevolverDeAgua();
        List<Jugador> jugadores = new ArrayList();
//        jugador.disparo(revolver, Jugadores, jugadores);
        juego.ronda(jugadores, revolver, Jugadores);

//   sj.disparo();
//    }
    }
}
    
    


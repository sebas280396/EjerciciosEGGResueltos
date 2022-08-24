/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ServicioJuego {
      Scanner leer = new Scanner(System.in);
    ServicioRevolver sr = new ServicioRevolver();
    public void llenarJuego(List<Jugador> jugadores, RevolverDeAgua revolver) {
      
        Juego juego = new Juego();
        
        String aux = "S";
        int cantjugadores = 0;
        while (aux.equalsIgnoreCase("S") && cantjugadores < 6) {
            Jugador jugador = new Jugador();
            System.out.println("Que numero de ID desea elegir entre 1-6");
            jugador.setId(leer.nextInt());

            if (jugador.getId() >= 7) {
                System.out.println("Ha elegido un numero fuera de rango, por favor ingrese un numero entre 1-6: ");
                jugador.setId(leer.nextInt());
            }
            leer.nextLine();
            System.out.println("Ingrese el nombre del jugador: ");
            jugador.setNombre(leer.nextLine());
            jugadores.add(jugador);
            juego.setJugadores(jugadores);
            System.out.println("Quieres agregar otro jugador?");
            aux = leer.nextLine();
            cantjugadores++;
            System.out.println(cantjugadores);
        }
    
    }

    public void ronda(List<Jugador> jugadores, RevolverDeAgua revolver, Jugador jugador) {
        ServicioJugador sj = new ServicioJugador();
        ServicioJuego sju = new ServicioJuego();
        sju.llenarJuego(jugadores, revolver);
        int rondas = 1;
        boolean bandera = false;
        
        while (rondas<=6){
       
        Iterator<Jugador> it = jugadores.iterator();
        while (it.hasNext()) {
            Jugador aux = it.next();
            System.out.println("Ronda #" + rondas + ".");
            System.out.println(aux.getNombre() + "# " + aux.getId() + " se apunta con el revolver");
            if (jugador.getMojado() == true) {
                System.out.println("El revolver se ha disparado y "+aux.getNombre() +"# "+ aux.getId() + " ha sido mojado ");
                   bandera= true;
                break;
            } else {
            System.out.println("El revolver no se ha disparado, el jugador "+aux.getNombre() +"# "+ aux.getId() + "se ha salvado ");
           

//            System.out.println("El jugador "+aux+" se apunta");
        }
     rondas++;
     }
      if(bandera == true){
          break;
      } 
    }

}
}


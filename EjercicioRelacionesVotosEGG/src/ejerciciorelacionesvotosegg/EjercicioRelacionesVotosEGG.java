/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorelacionesvotosegg;

import Entidad.Alumnos;
import Entidad.Simulador;
import Servicio.ServicioSimulador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class EjercicioRelacionesVotosEGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador s = new Simulador();
        ServicioSimulador ss = new ServicioSimulador();
        List <Alumnos>a=new ArrayList<>();
       List<String>nombreCompleto=new ArrayList<>();
        List<Integer>dni=new ArrayList<>();
    s.generarNombres(5);
    s.generarDnis(5);
    ss.llenarListaAlumnos(nombreCompleto, dni);
    ss.votacion(a);

{

        }
    }

}
    
    


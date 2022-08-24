/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Simulador {
    private List<String>nombreCompleto;
   private List<Integer>dni;
   private List<Alumnos>alumnos;

    public Simulador() {
    }

    public Simulador(List<String> nombreCompleto, List<Integer> dni, List<Alumnos> alumnos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.alumnos = alumnos;
    }

    public List<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

 

    public List<String> getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(List<String> nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public List<Integer> getDni() {
        return dni;
    }

    public void setDni(List<Integer> dni) {
        this.dni = dni;
    }
    public List<String> generarNombres(int cantidad){
        
        List<String>nombreCompleto=new ArrayList<>();
        String[] nombresAleatorios = new String[cantidad];
        String[] nombres = { "Andrea", "Andrea", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
                "Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
                "Caritina", "Carlota", "Baltazar"};
        String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
                "Carion", "Castiyo", "Castorena", "Guerrero", "Grande", "Guerrero", "Grano", "Grasia", "Griego",
                "Grigalva" };

        for (int i = 0; i < cantidad; i++) {
         
                     nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
                    + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
          
            nombreCompleto.add(nombresAleatorios[i]);
            
        }
             
     return nombreCompleto;
    }
        public List<Integer> generarDnis(int cantidad){
        
        List<Integer>dni=new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
         
                   double dniAleatorio = (int)Math.floor(Math.random()*(45000000-30000000+1)+30000000);
                    
          
         dni.add((int)dniAleatorio);
        }
        
            
     return dni;
    }
}

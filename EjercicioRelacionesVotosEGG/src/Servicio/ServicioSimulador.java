/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumnos;
import Entidad.Simulador;
import Entidad.Voto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sebas
 */
public class ServicioSimulador {
      Simulador s=new Simulador();
      public  List <Alumnos> llenarListaAlumnos(List<String>nombreCompleto,List<Integer>dni){
        List <Alumnos>a=new ArrayList<>();
       nombreCompleto= s.generarNombres(5);
       dni=s.generarDnis(5);

        System.out.println(nombreCompleto);
        System.out.println(dni);
        Iterator <String> it=nombreCompleto.iterator();
        Iterator <Integer> it2=dni.iterator();

       while(it.hasNext()){

           Alumnos al=new Alumnos();
          String aux=it.next();
          al.setNombreCompleto(aux);
        int aux1=it2.next();
        al.setDni(aux1);
        a.add(al);
       }


         for (Alumnos alumnos1 : a) {
             System.out.println(alumnos1);
        }
   return a; }

     public void votacion(List <Alumnos>a){
         Voto v=new Voto();
         List <Alumnos> ab=a;
         Iterator <Alumnos> it3=a.iterator();


       while(it3.hasNext()){
         v.setAlumno(it3.next());
           for (int i = 0; i < 3; i++) {
               if(!v.getAlumno().getNombreCompleto().equals(it3.next().getNombreCompleto()));
               for (int j = 0; j <ab.size() ; j++) {
                   int c=(int)Math.random()*10;
                  ab.get(c);//debemos setear en la posicion ramdon en nuestra lista alumno
               }
           }





       }

     }
}
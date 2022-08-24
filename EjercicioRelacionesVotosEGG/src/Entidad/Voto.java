/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.List;

/**
 *
 * @author sebas
 */
public class Voto {
    private Alumnos alumno;
   private List<Alumnos>alumnos2;

    public Voto() {
    }

    public Voto(Alumnos alumno, List<Alumnos> alumnos2) {
        this.alumno = alumno;
        this.alumnos2 = alumnos2;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public List<Alumnos> getAlumnos2() {
        return alumnos2;
    }

    public void setAlumnos2(List<Alumnos> alumnos2) {
        this.alumnos2 = alumnos2;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnos2=" + alumnos2 + '}';
    }




}
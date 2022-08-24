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
public class Persona {
    //atributos
    //constructores
    //metodos propios
    private String nombre;
    private int edad;
    private
            String sexo;
    
    
    public Persona (){
        
    }
    public Persona (String nombre){
        this.nombre=nombre;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    
    }
        public String getNombre() {
        return nombre;
  }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
}

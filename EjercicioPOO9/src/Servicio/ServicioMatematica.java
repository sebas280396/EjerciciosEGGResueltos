/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author sebas
 */
public class ServicioMatematica {
  
    public static double devolverMayor(Matematica num1,Matematica num2){
        return Math.max(num1.getNum1(), num2.getNum2());
    }
    public static double calcularPotencia(Matematica num1, Matematica num2){
        double numeroelevado;
        if (num1.getNum1()>num2.getNum2()){
            numeroelevado=(Math.pow(num1.getNum1(), num2.getNum2()));
            System.out.println(numeroelevado);
        }else{
            numeroelevado=(Math.pow(num2.getNum2(), num1.getNum1()));
            System.out.println(numeroelevado);
        }
        return numeroelevado;
    }
    public static double calcularRaiz(Matematica num1, Matematica num2){
        double raiz;
        if (Math.abs(num1.getNum1())<Math.abs(num2.getNum2())){
            raiz=(Math.sqrt(Math.abs(num1.getNum1())));
            System.out.println(Math.abs(raiz));
        }else{
            raiz=(Math.sqrt(Math.abs(num2.getNum2())));
            System.out.println(Math.abs(raiz));
        }
        return raiz;

    }

}


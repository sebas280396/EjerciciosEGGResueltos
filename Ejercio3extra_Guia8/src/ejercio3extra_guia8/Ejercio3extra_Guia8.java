
package ejercio3extra_guia8;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercio3extra_Guia8 {

   
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
        String aux = "";
        ArrayList<Edificio> lista = new ArrayList();
        int auxp = 0;
        int auxo = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Precione enter para continuar");
            leer.nextLine();
            System.out.println("Qué tipo de edificio desea agregar? Oficina / Polideportivo");
            aux = leer.nextLine().toLowerCase();

            if (auxp == 2 && auxo<2) {
                System.out.println("Ya hay 2 polideportivos creados, se ingresará una oficina");
                aux = "oficina";
            } else if (auxo == 2 && auxp<2) {
                System.out.println("Ya hay 2 oficinas creadas, se ingresará un polideportivo");
                aux = "polideportivo";
            }
            switch (aux.toUpperCase()) {
                case "OFICINA":
                    EdificioDeOficinas ed = new EdificioDeOficinas();
                    ed.calcularSuperficie(0, 0);
                    ed.calcularVolumen(0, 0, 0);
                    ed.cantPersonas();
                    auxo++;
                    lista.add(ed);
                    break;
                case "POLIDEPORTIVO":
                    Polideportivo po = new Polideportivo();
                    po.calcularSuperficie(0, 0);
                    po.calcularVolumen(0, 0, 0);
                    auxp++;
                    lista.add(po);
                    break;
            }
        }
        for (Edificio aux2 : lista) {
            System.out.println(aux2);
        }
    }
}


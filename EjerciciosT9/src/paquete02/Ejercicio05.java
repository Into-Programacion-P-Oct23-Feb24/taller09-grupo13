/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial1;
        String[] inicial = new String[estudiantes.length];
        char iniciallet;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial1 = entrada.nextLine().toUpperCase();
            //se guardan las iniciales de los estudiantes 
            for (int i = 0; i < estudiantes.length; i++) {
                inicial[i] = estudiantes[i].substring(0, 1);
            }
            //Comparamos si la incial que ingreso el estudiante cumple
            //sale del ciclo y la inicial ingreseda no cumple sigue pidiendo 
            //que ingrese una inicial hasta que se cumpla y pueda salir del ciclo.
            for (int i = 0; i < estudiantes.length; i++) {
                if (inicial1.equals(inicial[i])) {
                    bandera = false;
                }
            }

        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int s = 0;
        int f;
        // Declaramos un arreglo que llevara el nombre de: marcas
        String[] marcas;
        String cadena;
        System.out.println("Ingrese el numero de marcas que desea colocar");
        n = entrada.nextInt();
        marcas = new String[n];
        entrada.nextLine();
        // Si la variable n (que es el valor que se le pide al usuario es mayor
        // a la variable s que tiene un valor inicial de 0 entonces entra dentro
        // del ciclo repetitivo
        while (n > s) {
            System.out.println("Ingrese la marca del vehiculo");
            cadena = entrada.nextLine();
            String inicial = cadena.substring(0, 1);
            // toUppercase hace que los caracteres ingresado por el usuario 
            // se vuelvan mayusculas
            inicial = inicial.toUpperCase();
            // Si la inicial de la marca del automovil ingresado por el usuario
            // empieza con "A" "C" "T" entonces imprimira un texto diciendo  que
            // esa marca ingresada no es permitida y le pedira al usuario que ingrese
            // otra marca, por lo tanto lo ingresado no tomara valor dentro del arreglo
            if (inicial.equals("A") || (inicial.equals("C"))
                    || (inicial.equals("T"))) {
                System.out.println("Marca no permitida");
                // Por lo contrario si no ingresa una marca con esas restricciones
                // la marca ingresada tomara valor dentro del arreglo.
            } else {
                marcas[s] = cadena;
                s++;
            }

        }
        for (f = 0; f < n; f++) {
            // Al final se imprimira las marcas ingresadas por el usuario 
            // que no tengan ninguna restriccion mencionada anteriormente
            System.out.printf("%s\n", marcas[f]);
        }

    }
}

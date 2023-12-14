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
        String[] marcas;
        String cadena;
        System.out.println("Ingrese el numero de marcas que desea colocar");
        n = entrada.nextInt();
        marcas = new String[n];
        entrada.nextLine();
        while (n > s) {
            System.out.println("Ingrese la marca del vehiculo");
            cadena = entrada.nextLine();
            String inicial = cadena.substring(0, 1);
            inicial = inicial.toUpperCase();
            if (inicial.equals("A") || (inicial.equals("C"))
                    || (inicial.equals("T"))) {
                System.out.println("Marca no permitida");
            } else {
                marcas[s] = cadena;
                s++;
            }
        }
        for (f = 0; f < n; f++) {
            System.out.printf("%s\n", marcas[f]);
        }

    }
}

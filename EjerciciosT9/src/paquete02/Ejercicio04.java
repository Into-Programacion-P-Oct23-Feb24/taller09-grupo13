/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos los arrelgos y variables 
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        int f;
        // iniciamos un ciclo for
        for (f = 0; f < 7; f++) {
            // si promediio es igual o mayor a 0 y menor que 6 se entra en la condición
            if (promedios[f] >= 0 && promedios[f] <= 5.9) {
                promediosCualitativos[f] = "Regular";
                // si promediio es igual o mayor a 6 y menor que 9 se entra en la condición
                } else if (promedios[f] >= 6 && promedios[f] <= 8.9) {
                promediosCualitativos[f] = "Bueno";
                    // si promediio es igual a 9 y igual o menor que 10 se entra en la condición
                    } else if (promedios[f] >= 9 && promedios[f] <= 10) {
                      promediosCualitativos[f] = "Sobresaliente";
            }
        }
        // inciamos otro ciclo for
        for (f = 0; f < 7; f++) {
            // imprimimos en pantalla el nombre del estudiante , el promedio, y el tipo de
            // promedio que es
            System.out.printf("%s promedio: %.2f promedio cualitativo %s\n",
                    estudiantes[f], promedios[f], promediosCualitativos[f]);
        }
    }

}

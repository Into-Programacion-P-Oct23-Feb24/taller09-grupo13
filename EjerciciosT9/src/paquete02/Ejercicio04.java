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

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        int f;
        for (f = 0; f < 7; f++) {
            if (promedios[f] >= 0 && promedios[f] <= 5.9) {
                promediosCualitativos[f] = "Regular";
            } else if (promedios[f] >= 6 && promedios[f] <= 8.9) {
                promediosCualitativos[f] = "Bueno";
            } else if (promedios[f] >= 9 && promedios[f] <= 10) {
                promediosCualitativos[f] = "Sobresaliente";
            }
        }
        for (f = 0; f < 7; f++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo %s\n",
                    estudiantes[f], promedios[f], promediosCualitativos[f]);
        }
    }

}

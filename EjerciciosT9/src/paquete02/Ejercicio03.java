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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaración de variables y arreglos
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        double media = 13;
        int baja = 0;
        int mayor = 0;
        int f;
        // Creamos un ciclo for el cual nos permita salir del ciclo
        for (f = 0; f < 13; f++) {
            // Suma va a ir acumulando la suma de cada valor del arreglo
            suma = suma + arreglo[f];
        }
        // Sacamos el valor de la media
        media = suma / media;
        // Creamos otro ciclo for
        for (f = 0; f < 13; f++) {
            // Evaluamos el valor de los elementos y si el valor de los
            // elementos es menor que la media se entra en la condición
            if (arreglo[f] < media) {
                // A la variable con nombre baja se le suma 1
                baja++;
                // Si no se cumple la anterior condición se entra aquí
            } else {
                // A la variable con nombre mayor se le suma 1
                mayor++;
            }

        }
        // Presentamos en pantalla el numero de elementos mayores a la media
        System.out.printf("El numero de elementos que estan arriba "
                + "de la media son: %d\n", mayor);
        // Presentamos en pantalla el numero de elementos menores a la media
        System.out.printf("El numero de elementos que estan abajo "
                + "de la media son: %d\n", baja);
    }

}

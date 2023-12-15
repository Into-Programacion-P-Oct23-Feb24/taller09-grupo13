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
        // creamos un ciclo for el cual nos permita salir del ciclo
        for (f=0; f <13;f++){
           // suma va a ir acumulando la suma de cada valor del arreglo
           suma = suma + arreglo[f];
        }
        // sacamos el valor de la media
        media = suma / media;
        // creamos otro ciclo for
        for (f=0; f <13;f++){
            // evaluamos el valor de los elementos y si el valor de los
            // elementos es menor que la media se entra en la condición
            if (arreglo[f]<media){
                // a baja se le suma 1
                baja++;
                   // si no se cumple la anterior condición se entra aquí
                   }else{
                        // a mayor se le suma 1
                        mayor++;
        }
       
        }
        // presentamos en pantalla los elementos mayores a la media
        System.out.printf("El numero de elementos que estan arriba "
                + "de la media son: %d\n",mayor);
        // presentamos en pantalla los elementos menores de la media
        System.out.printf("El numero de elementos que estan abajo "
                + "de la media son: %d\n",baja);
    }

}

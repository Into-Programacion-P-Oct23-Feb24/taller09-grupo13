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
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        double media = 13;
        int baja = 0;
        int mayor = 0;
        int f;
        for (f=0; f <13;f++){
        suma = suma + arreglo[f];
        }
        media = suma / media;
        for (f=0; f <13;f++){
        if (arreglo[f]<media){
        baja++;
        }else{
        mayor++;
        }
       
        }
        System.out.printf("El numero de elementos que estan arriba "
                + "de la media son: %d\n",mayor);
        System.out.printf("El numero de elementos que estan abajo "
                + "de la media son: %d\n",baja);
    }

}

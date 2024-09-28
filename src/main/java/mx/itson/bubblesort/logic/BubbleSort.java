/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.bubblesort.logic;

/**
 * Clase que implementa el algoritmo de ordenamiento de burbuja.
 * 
 * @author ImLuisAlvarado
 */
public class BubbleSort {

    /**
     * Ordena un arreglo de enteros utilizando el algoritmo de ordenamiento de burbuja.
     * 
     * @param array El arreglo de enteros que se va a ordenar.
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        /**
         * Ciclo externo que itera n-1 veces.
         */
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            /**
             * Ciclo interno que itera desde el primer elemento hasta el elemento n-i-1.
             */
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    /**
                     * Swap de los elementos array[j] y array[j + 1].
                     */
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            /**
             * Si no se realizaron swaps en la iteración actual, se sale del ciclo externo.
             */
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Imprime un arreglo de enteros.
     * 
     * @param arr El arreglo de enteros que se va a imprimir.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
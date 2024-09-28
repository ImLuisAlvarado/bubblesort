/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.bubblesort.ui;

import static mx.itson.bubblesort.logic.BubbleSort.bubbleSort;
import static mx.itson.bubblesort.logic.BubbleSort.printArray;

/**
 *
 * @author darkheaven
 */
public class Main {
    public static void main(String[] args) {
        int[] ids = {251990,239313,258963,257898,257892,254200};

        System.out.println("Arreglo original:");
        printArray(ids);

        bubbleSort(ids);

        System.out.println("Arreglo ordenado:");
        printArray(ids);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Arrays;

/**
 *
 * @author Gordon
 */
public class Selection_Sort {
    public static void main(String[] args) {
    int array []= {3,56,23,5,2};
    boolean swapped = true;
    int j = 0;
    int tmp;
    while (swapped) {
        swapped = false;
        j++;
        for (int i = 0; i < array.length - j; i++) {
            if (array[i] > array[i + 1]) {
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                swapped = true;           
                }
            }
        }
        System.out.println(Arrays.toString(array) + ", ");
    }
}


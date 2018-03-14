/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import java.util.Arrays;
/**
 *
 * @author 24740
 */
public class Sort_Janky { public static void main(String[] args) {
        
    int arr[] = {11 ,3 ,2, 5, 6};
    int steps =0;
    for(int i = 0; i<arr.length-1; i++){
        steps++;
        for(int j = i+1; j<arr.length; j++){
            if(arr[i]>arr[j]){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
                }
            }
        }
            System.out.println(Arrays.toString(arr) + "\nSteps: " + steps);
    }    
}

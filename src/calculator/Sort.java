/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
/**
 *
 * @author 24740
 */
public class Sort { public static void main(String[] args) {

    int arr[] = {5, 4, 3, 2, 1};
    int steps = 0;
    //Bubblesort
    for(int y = 0; y<arr.length-1;y++)
    
    for(int limit = arr.length-1; limit > 0; limit--){
        for(int start=0; start < limit; start++){
            steps++;
            if(arr[start]>arr[start+1]){
                int tmp = arr[start];
                arr[start]=arr[start+1];
                arr[start+1] = tmp;               
            }
            }
            }
    for(int i =0; i<arr.length;i++){
        System.out.print(" " + arr[i]  );
    }
            System.out.println("\nSteps: " + steps);
    }
}

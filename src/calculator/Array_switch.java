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
public class Array_switch {
    public static void main(String[] args) {
     
     int[] arr = {1,4,3,9};
     
        int temp = arr[0];
        arr[0]=arr[3];
        arr[3] = temp;
        
        for(int x = 0;x < arr.length;x++){
            System.out.print("{" + arr[x] + "}");
        }
   
    }
}

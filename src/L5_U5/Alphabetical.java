/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import javax.swing.JOptionPane;
/**
 * \\ZYXWVUTSRQPONMLKJIHGFEDCBA
 * @author 24740
 */
public class Alphabetical {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input a string: ");;
        String output = "";
        int[] arr = new int[input.length()];        //array of unicode
        for(int i = 0; i<input.length();i++){       //converts string into array
            arr[i]=input.charAt(i);
        }
        int[] arr2 = ss(arr);                       //selection sort into new array
        for(int i = 0;i<input.length();i++){        //Converts back into string
            output +=(char)arr2[i];
        }
        System.out.println(output);
    }
    public static int[] ss(int[] arr){
        for(int x = 0; x < arr.length-1;x++){           
            for(int i=x+1; i < arr.length;i++){
                if(arr[x]>arr[i]){
                    int temps = arr[x];
                    arr[x] = arr[i];
                    arr[i] = temps;
                }
            }
        }
        return arr;
    }
}

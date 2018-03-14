/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.util.Arrays;
import javax.swing.JOptionPane;
/*
* Take users input and uses selection sort...
*
*Author 24740
*/
public class Selection_sort {
    public static void main(String[] args) {
        int s = Integer.parseInt(JOptionPane.showInputDialog("Size of array:"));
        int[] arr = new int[s];
        for(int x = 1;x<=s;x++){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Number "+x+":"));
            arr[x-1]=n;
        }
        System.out.println(Arrays.toString(arr));
        arr=ss(arr);
        System.out.println(Arrays.toString(arr));
        
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

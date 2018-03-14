/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author 24740
 */
public class Test_practice {
    public static void main(String[] args) {
     
        int[] n = new int[10];
        System.out.println("Enter 10 numbers");
        Scanner input = new Scanner(System.in);
        for(int x = 0; x<n.length; x++){                           
        n[x] = input.nextInt();              
        }
        int total = 0;
        for(int q = 0;q<n.length;q++){
            total += n[q];
        }
        int average = total/n.length;
        System.out.println("Average is: " + average);
        
        //double var = ((Math.sqrt(n[q])/n.length)-average;
    }
}

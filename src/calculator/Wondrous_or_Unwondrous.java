/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author Gordon
 */
public class Wondrous_or_Unwondrous {
    public static void main(String[] args) {
        
        System.out.println("Enter a number");
    Scanner input = new Scanner (System.in);
        int num = input.nextInt();   
        int counter=0;
        
            if(num%2==0){             
                while(num !=1){
                num = num/2;
                counter++;                    
                } 
                System.out.println("Wondrous\t" + counter);
            }else if(num%2!=0){
                num = num*3+1;
                System.out.println("Unwondrous");
            }else
                System.out.println("Error");
    }
}    


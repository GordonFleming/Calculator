/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov_Exams;
import java.util.Scanner;
/**
 * Uses if statements to declare if a number is larger than the previous
 * @author Gordon
 */
public class LargestofThreeNUmbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 numbers- ");
        int n1 = input.nextInt();
        System.out.println("");
        int n2 = input.nextInt();
        System.out.println("");
        int n3 = input.nextInt();
        if(n1 > n2 &&n1 > n3){
            System.out.println("\nLargest number." + n1);
        }else if(n2 > n1 && n2 > n3){
            System.out.println("\nLargest number. " + n2);
        }else if(n3 > n1 && n3 > n2){
            System.out.println("\nLargest number. " + n3);
        }else
             System.out.println("\nMore than two number are the same or invalid..."); 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 * Gets user Input and outputs the 12 multiplication table
 * @author Gordon
 */
public class MultiplicationTables {
    public static void main(String[] args) {       
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number you want multiplied \n Table of 12: \n");
        int num = input.nextInt();       
        for(int pro = 1; pro <13; pro++){
            System.out.println(num  + " * " + pro + " = " + (num*pro));   
        }
    }
}

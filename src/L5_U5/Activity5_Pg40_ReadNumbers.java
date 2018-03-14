/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.util.Scanner;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author 24740
 */
public class Activity5_Pg40_ReadNumbers {
    public static void main(String[] args) throws FileNotFoundException{
        String fileName = JOptionPane.showInputDialog("Enter the file name:");
        Scanner scFile = new Scanner (new File(fileName+".txt"));
        int num, sum = 0;
            while(scFile.hasNextInt()){
                num = scFile.nextInt();
                System.out.print(num + " ");
                sum += num;
            }
            scFile.close();
            System.out.println("\n The sum is " + sum);
    }
}

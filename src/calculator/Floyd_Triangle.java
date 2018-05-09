/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 * Gets user input for number of rows then add number after each loop
 * @author Gordon
 */
public class Floyd_Triangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of rows you want: \n");
        int num = input.nextInt();
        int n = 1;
        for(int x = 1; x <= num; x++){
            for(int y = 1; y<=x; y++){
                System.out.print(n + " ");
                        n++;
            }
            System.out.println("");
        }
        
    }
}

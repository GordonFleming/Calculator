/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static java.lang.System.in;
import java.util.Scanner;
import static sun.text.normalizer.Utility.hex;

/**
 *
 * @author 24740
 */
public class Converting_Hex { public static void main(String[] args) {
    String hex;
    while (true) {
    System.out.println("Enter a four Characters");
    Scanner s = new Scanner(System.in);
    hex = s.nextLine().toUpperCase().trim();
    //String hex = "F00D".toUpperCase();
    if (hex.length() == 4) {break;}
        System.out.println("Must enter four characters!");
    }
    int decimal = 0;
    
    for(int  index = 0 ; index < 4; index++){
        char digit = hex.charAt(index);
        
        int digitVal = digit - '0';
        if(digitVal > 9){
            digitVal = 10 + (digit - 'A');
        }
        int power = (int)Math.pow(16, 3-index);
        decimal = decimal + power * digitVal;             
    }
            System.out.println("Hex = " + hex + ",decimal = " + decimal);
    
    
    }   
}

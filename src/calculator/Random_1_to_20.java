/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 24740
 */
public class Random_1_to_20 { public static void main(String[] args) {
        
   int rnum = 1+ (int) (Math.random() * 20);
   int turn = 5;
           
           while (turn > 0){               
               System.out.println("Guess a number: ");
               int guess = new Scanner (System.in).nextInt();
                if (guess > rnum){
                    System.out.println("Too Big");                   
                }else if (guess < rnum){
                    System.out.println("Too Small");                   
                }else if (guess == rnum){
                    System.out.println("Correct, you win in " + + (6 -turn)); break;
           }
        }
            System.out.println("Oops Wrong! Try again!");
    }   
}

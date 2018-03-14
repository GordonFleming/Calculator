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
public class Running_Average {
    public static void main(String[] args) {
      
       long sum = 0L;
       int count = 0;
       boolean done = false;
       while (!done){
           System.out.println("Enter a number");
           int val = new Scanner (System.in).nextInt();
           if (val ==0){
               done = true;
               System.out.println("You broke the program,      Idiot");
           }else {
              sum = sum + val;
              count = count +1;
              double avg = ((double)sum) / count;
               System.out.println(avg);
              
              
           }
       }
        

        
    }
}

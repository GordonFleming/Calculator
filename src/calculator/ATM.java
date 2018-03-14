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
public class ATM { public static void main(String[] args) {
    
    //0.look at users pin
    String pin = "1234";
    long balance = 1000000;
        
    //ask user for pin
      System.out.print("Enter Pin");
    String userpin = new Scanner(System.in).nextLine();
  
    if(userpin .equals (pin)){
        //correct pin
        
        System.out.println("Amount? ");
        int amount = new Scanner (System.in).nextInt();
        
        if(amount > balance) {
            System.out.println("insufficient funds");
        }else {
            balance = balance - amount;
            System.out.println("Take cash of R" + amount); 
            
       }
    }else{
        //incorrect pin
        System.out.println ("incorrect pin go away");
        }
}
}

       


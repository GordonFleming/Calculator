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
public class hollow_square {public static void main(String[] args) {
            System.out.println("Enter a number:");
    
    Scanner Input = new Scanner(System.in);
    int star = Input.nextInt();
    
  for(int geez=1; geez <= star; geez++  ){
            for(int deez=1; deez <= star; deez++){
                if(deez == star || geez == star || geez == 1 || deez == 1){
                    System.out.print(" *");                   
                }else{
                    System.out.print("");
            }  
               System.out.println(); 
        }          
    }
}
}

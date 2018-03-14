/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author 24740
 */
public class Loops_practice { public static void main(String[] args) {
        
            //System.out.println("   1");
           // System.out.println("  121");
          //  System.out.println(" 12321");
         //   System.out.println("1234321");        
                         
         for(int row = 1; row <= 5; row++){             
             int space = 5-row;
         for(int sp = 0; sp < space; sp++){
                 System.out.print("");
             }
         for(int digit = 1; digit <= row; digit++){
                 System.out.print(" " + digit);
             }   
         for(int digit = row-1;digit != 0;digit--){
             System.out.print(digit);
         }
             System.out.println("");
         }           
    }
}

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
public class Types {
    public static void main(String[] args) {
        
        int a = 7;                                  //integer
        double x = 3.14159;                         //real number
        String msg = "it all the flick of da rist"; //for text
        boolean raining = true;                     //true or false
        char c = 'A';                               //Character (only 1 letter)
        
        System.out.println("c" + c);
        
        //Maths functions
        System.out.println (Math.sin (x/12));        //or cos (4));
        System.out.println (Math.sqrt (2));          //square root
        System.out.println (Math.abs ( -5 ));        //Makes No. possitive
        System.out.println (Math.random ());         //random 0 <= x < 1
        System.out.println (Math.pow (x, 4));        //x raised to the No. 4
        
        double z = Math.sqrt(2);
        System.out.println(z * a);
    }
}

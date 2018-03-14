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
public class Arithmetic {
    public static void main(String[] args){ 
    
    double x = 10;
    double y = x / 3;
    System.out.println(y);
    
    int a = 10;
    System.out.println( a/3 );
    // always rounds down when left side is int
    System.out.println (5 / 4);                     //normal division
    System.out.println (5.0 / 4);                   //division round down when the NO. is an int
    System.out.println (6 % 4);                     //remander % sign
    
    int N = 666;                                     //divide by 2 and giver remander
    if (N % 2 == 0)  {                              //Is N divisable by 2? Compares with to "=="
        System.out.println ("N is even");           //Yes print even
    }else {                                         //or This is the "No" braach:
            System.out.println ("N is odd");        //Print odd
    }
    }
    
        
    
}


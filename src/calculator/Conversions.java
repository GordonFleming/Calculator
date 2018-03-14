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
public class Conversions {public static void main(String[] args) 
{   
    char a = '@';
    System.out.println (a);
    int b = (int)a;
    b = b=2;
    a = (char)b;
    System.out.println (a); 
    
    int i = 15;
    long k = 20L;
    System.out.println (k);
    i = (int)k;
    System.out.println (i);
    
    int wierd = 0x04C1;
    a = (char)wierd;            //for greek alphabets...
    System.out.println (a);
    
    }
}

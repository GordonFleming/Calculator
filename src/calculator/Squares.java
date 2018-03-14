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
public class Squares {
    
    public static void main(String[] args) {
    
    int N = 1;
    
    while( N*N < 100) {                         //While loops program
        System.out.print ("The sqaure of ");
        System.out.print (N);
        System.out.print (" is ");
        System.out.println (N*N);               //Println makes it move to the next row of output
        N = N + 1;
        
        }
    }
}

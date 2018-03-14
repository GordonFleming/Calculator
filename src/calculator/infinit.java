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
public class infinit { public static void main(String[] args) {
        
    double s = 2;
    double x = 1;   
    double answer = Math.sqrt(s);
    int loops = 0;
    
    
    while(Math.abs(answer-x) > 0.0000001){     
        x = 0.5 * (x+(s/x));
        loops++;
        } 
            System.out.println("Number " + x + "\tloops " + loops);
    }              
}

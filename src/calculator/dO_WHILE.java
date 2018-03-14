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
public class dO_WHILE {
    public static void main(String[] args) {
        
    int t = 0;
    double x = 0;
    double y = 0;
    
    double speedX = 40.6;
    double speedY = 30.2;
    double g = 9.8;
    
        do{
          
            t++;
            x = x + speedX;
            y = y + speedY;
            speedY -= g;
            
        }while (y > 0);
        
        System.out.println("Range, " + x); 
        System.out.println("Flight time, " + t);
        System.out.println("Height to clear 100m, " + "...");
    
    }
}

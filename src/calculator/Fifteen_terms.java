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
public class Fifteen_terms { public static void main(String[] args) {
        
    double sum = 0;
       
        for(int term=1; term <= 15; term++){
            double value = (1.0*term)/(term+1);
            sum = sum + value;
            }   
            System.out.println(sum);
    }   
}

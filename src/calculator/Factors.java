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
public class Factors {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //count the number of factors N
        prime(127);
        prime(32);
        prime(57);
    }
        public static void prime (int N){    
                   
        int D = 1;
        int count = 0;
        
    while ( D <= N ){
        if (N % D == 0){  
            count = count + 1;
            }
         D=D +1;                        
        }
    System.out.println ( N );
            if (count == 2){ 
             System.out.println (  " IS Prime " );  
            }else{
                System.out.println ( " IS not PRIME ");
             }
    }
    }



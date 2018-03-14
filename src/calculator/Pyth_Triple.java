/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;

/**
 *
 * @author gordonfleming
 */
public class Pyth_Triple {
        public static void main(String[] args) {
        for(int a=1;a<=100;a++){
            for(int b=1;b<=100;b++){
                for(int c=1;c<=100;c++){
                    if(c*c == a*a + b*b){
                        System.out.println("" + a + ", " + b + ", " + c);
                    }
                }
            }
        }
    }
}

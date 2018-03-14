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
public class loops {

    public static void main(String[] args) {

        int x = 1;
        while (x < 11) {
            System.out.print(" " + x);
            x = x + 1;
        }
        System.out.println(); //New line
        for (int y = 1; y < 11; y = y + 1) {
            System.out.print(" " + y);
        }
        System.out.println();
        for (int Z = 10; Z > 0; Z = Z - 1) {
            System.out.print(" " + Z);
        }
        System.out.println();
        for(char c = 'A'; c <= 'Z'; c=(char)(c+1)) {
            System.out.print(" " + c);
        }
        System.out.println();
        //for (;;) {
            //infinite loop
        //}
    }
}

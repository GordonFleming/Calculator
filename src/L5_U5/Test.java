/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.util.Scanner;
/**
 *
 * @author 24740
 */
public class Test {
    public static void main(String[] args) {
        String w1 = "";
        String w2 = "";
        System.out.println("Type in 'Simon': ");
        Scanner input = new Scanner (System.in);
        w2 = input.next(); 
        while(!w1.equals("Simon")){
            w1 += w2;
        }
        System.out.print(w2);
    }
}

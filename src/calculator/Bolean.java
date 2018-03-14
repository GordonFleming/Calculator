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
public class Bolean {
    
    public static void main(String[] args) {
        
        boolean a = false;
        boolean b = true;
        
        boolean p = !a;         //Not
        boolean q = a && b;     //and
        boolean r = a || b;     //or
        
        //System.out.println(p);
        //System.out.println(q);
        //System/.out.println(r);
        
        boolean z = (a || b ) && !(a && b);
       //or
        boolean c = a ^ b;
        
        System.out.println(z);
        System.out.println(c);
    }   
}

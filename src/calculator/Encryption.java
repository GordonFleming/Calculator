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
public class Encryption {
    public static void main(String[] args) {
        
        String message = "WILLIAM";
        
        int msglen = message.length();
        
        for (int pos=0; pos<msglen; pos=pos+1){
            char y = message.charAt (pos);
            
            int z = (int) y;
            //Do the encrypt/decrypt math:
            if (z <= 'M'){
                z = z + 13;
            }else {
                z = z-13;
            }
            //Convert z back to char
            y = (char)z;
                     
            System.out.println (y);
        }   
        System.out.println ();
    }
}
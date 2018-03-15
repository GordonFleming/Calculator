/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
/**
 *
 * @author 24740
 */
public class FriendApp {
    public static void main(String[] args)throws FileNotFoundException {
        try {
            FriendArray f = new FriendArray();            
            System.out.println(f.toString());
    } catch (InputMismatchException e) {
    System.out.print(e.getMessage()); 
        }                  
    }
}

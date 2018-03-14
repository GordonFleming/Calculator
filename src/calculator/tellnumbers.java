/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author 24740
 */
public class tellnumbers { public static void main(String[] args) {
        
    int no = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
    int digit = 1;
    
    
    System.out.println("Your number " + no + " has " + digit + " digit");
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author 24740
 */
public class Initials {
    public static void main(String[] args) throws FileNotFoundException {
        String Fname = JOptionPane.showInputDialog("Enter the file name: ");
        Scanner scFile = new Scanner (new File(Fname+".txt"));
        String initials, surname;
        char init;
        System.out.println("The initials of the names are: ");
        while(scFile.hasNext()){
            initials = scFile.next();
            init = initials.charAt(0);
            surname = scFile.next();
            System.out.println("\n" + init + "." + surname);
        }
        scFile.close();
    }
}

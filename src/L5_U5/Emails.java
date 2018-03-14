/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.util.*;
import java.io.*;
/**
 *
 * @author Gordon
 */
public class Emails {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scFile = new Scanner (new File ("emails.txt"));
        String line = "";
        System.out.println("UserName: \t\t\t Domain: \n*****************************************************");
            while(scFile.hasNext()){
                line = scFile.next(); 
                Scanner scLine = new Scanner (line).useDelimiter("@" + "");  
                System.out.println(scLine.next() + "\t\t|\t|\t" + scLine.next());                                 //Printf(...) instead
            }
            scFile.close();
    }
}

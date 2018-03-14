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
public class BirthDates{
    public static void main(String[] args) throws FileNotFoundException{       
        Scanner scFile = new Scanner (new File ("Birthdates.txt")); 
            String line = "";
            int day,month,year;
            System.out.printf("%-39s%-39s\n**********************************************\n","Fullname:","Date:");
            while(scFile.hasNext()){               
                line = scFile.nextLine();
                Scanner scLine = new Scanner (line).useDelimiter("#");
                System.out.printf("%-16s%-23s%-16s\n"  , scLine.next() , scLine.next() , scLine.next());           
        }
        scFile.close();
    }
}

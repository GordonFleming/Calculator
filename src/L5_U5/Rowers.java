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
public class Rowers {
    public static void main(String[] args) throws FileNotFoundException{       
        Scanner scFile = new Scanner (new File("rowers.txt"));
        String line = "";
        int num,place;
        String boat,name,role;
        while(scFile.hasNext()){
            line  = scFile.nextLine().replace(",","#");
            Scanner scLine = new Scanner (line).useDelimiter("#");          
            num=scLine.nextInt();
            role=scLine.next();
            name=scLine.next();
            boat=scLine.next();
            place=scLine.nextInt();
            System.out.println(num + "\t" + name + "\t\t" + role + "\t\t" + boat + "\t\t" + place);     //Printf(...) instead
        }
        scFile.close();
    }
}

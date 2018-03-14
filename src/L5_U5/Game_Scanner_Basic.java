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
 * @author 24740
 */
public class Game_Scanner_Basic {
    public static void main(String[] args) throws FileNotFoundException{       
        Scanner scFile = new Scanner (new File("hiscores.txt"));
        String line;
        System.out.println("Name: \t\t Scores: \t\t Time: \n************************************************");
        while(scFile.hasNext()){
            line = scFile.nextLine();
            Scanner scLine = new Scanner (line).useDelimiter("#");
            System.out.printf("%-18s%-23s%-16s\n", scLine.next() , scLine.next() , scLine.next());
        }
        scFile.close();
    }
}

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
public class ReadTextFile {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner scFile = new Scanner (new File ("Names.txt"));
        String name;
        while (scFile.hasNext()){
            name = scFile.nextLine();
            System.out.println(name);
        }
        scFile.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.io.*;
import java.util.*;
/**
 *
 * @author flemi
 */
public class Rally {
    private Car []cArr = new Car[150];
    private int size = 0;
    public Rally()throws FileNotFoundException{
        try (Scanner scFile = new Scanner (new File ("Rally.txt"))) {
            String constructor,country,team,driver; //int Number;
            while(scFile.hasNext()){
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter(",");
                constructor = scLine.next();
                country = scLine.next();
                team = scLine.next();
                scLine.useDelimiter("\\z");
                driver = scLine.next();
                size++;
            }
        }
    }
    @Override
    public String toString(){
        String temp = "";
        for(int i=0;i<size;i++){
            temp += cArr[i].toString() + "\n";
        }
        return temp;
    }
}

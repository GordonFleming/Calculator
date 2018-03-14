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
 * @author 24740
 */
public class FriendArray {
    private Friend [] fa = new Friend[20];                                      //The amount of object elements
    private int size = 0;
    public FriendArray()throws FileNotFoundException{
        try(Scanner scFile = new Scanner (new File ("Friends.txt"))){           //works with the catch (try then catch)
            String line,name;
            double height;
            int age;
            while(scFile.hasNext()){                                            //looks through text file
                line = scFile.nextLine();                                       //looks at line by line
                Scanner sc = new Scanner(line).useDelimiter("#");               //reads each token
                name = scFile.next();                                           //extracts...
                height = scFile.nextDouble();
                age = scFile.nextInt();
                fa[size] = new Friend(name,height,age);                         //adds object to array or scFile.next() instead of...
                size++;
            }       
            scFile.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found, check file path");
        }
    }
    @Override
    public String toString(){
        String temp = "";
        for(int i=0;i<size;i++){
            temp += fa[i].toString() + "\n";                    
        }
        return temp;
    }
}

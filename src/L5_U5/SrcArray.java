/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author 24740
 */
public class SrcArray {
    private Source [] src = new Source[150];                                      
    private int size = 0;
    public SrcArray()throws FileNotFoundException{
        try(Scanner scFile = new Scanner (new File ("Ref.txt"))){           
            String line,author,year,title;
            while(scFile.hasNext()){                                           
                line = scFile.nextLine();                                      
                Scanner scLine = new Scanner(line).useDelimiter(",");          
                author = scLine.next();                                          
                year = scLine.next();
                title = scLine.next();
                src[size] = new Source(author,year,title);                         
                size++;            
            }       
            scFile.close();            
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found, check file path");
        } 
    }
    @Override
    public String toString(){
        String temp = "";
        for(int i=0;i<size;i++){
            temp += src[i].toString() + "\n";                    
        }
        return temp;
    }
}


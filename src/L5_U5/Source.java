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
public class Source {
    private String author;
    private String year;
    private String title;
    
    public Source(String a, String y, String t){
        author = a;
        year = y;
        title = t;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String removeBrackets(){
        String line;
        try(Scanner scFile = new Scanner (new File ("Ref.txt"))){         
            while(scFile.hasNext()){                                           
                year = scFile.nextLine().replaceAll("[^()]","");
            }       
            scFile.close();            
        }
        catch (FileNotFoundException e){
            System.out.println("File not found, check file path");
        }  
        return year;
    }
    @Override                   
    public String toString(){                                                   
    return getAuthor() + "\t" + year + "\t" + getTitle();
    }
}

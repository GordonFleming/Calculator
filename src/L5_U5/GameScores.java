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
 * @author gordonfleming
 */
public class GameScores {
    private String name;
    private int score, time; 
    public GameScores(int s, int t, String n){
        s = score;
        t = time;
        n = name;
    }
    public static String Name(String name)throws FileNotFoundException{
        String n = name;
        Scanner scFile = new Scanner (new File("Hiscores.txt"));
        while(scFile.hasNext()){
            Scanner scLine = new Scanner (new File("Hiscores.txt"));
            n +=scLine.next();
        }
        return n;
    }
    public static int Score(int score)throws FileNotFoundException{
        int s = score;
        Scanner scFile = new Scanner (new File("Hiscores.txt"));
        while(scFile.hasNext()){
           Scanner scLine = new Scanner (new File("Hiscores.txt"));
           s += scLine.nextInt();
        }
        return s;
    }
    public static int getSeconds(int seconds)throws FileNotFoundException{
        int sec = seconds;
        String line = "";
        Scanner scFile = new Scanner (new File("Hiscores.txt")); 
        while(scFile.hasNext()){
            line = scFile.nextLine();
            Scanner scLine = new Scanner (line).useDelimiter(":");
            sec += scLine.nextInt()*60+scLine.nextInt();
        }
        return sec;
    }
    @Override
    public String toString(){
        return "Name:\t\tScores:\t\tTime in seconds:\n" + name + "\t\t" + score + "\t\t" + time;
    }
    public static void main(String[] args) {
        //GameScore G1 = new GameScores();
        //System.out.println(G1);
    }
}

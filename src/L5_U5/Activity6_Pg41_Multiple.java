/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author 24740
 */
public class Activity6_Pg41_Multiple {
    public static void main(String[] args) throws IOException{
        String input = JOptionPane.showInputDialog("Enter the file name:");
        Scanner scFile = new Scanner (new File(input+".txt"));
            String line = "", name = "";
            int num, sum = 0;
            while (scFile.hasNext()){
                line = scFile.nextLine();
                Scanner scLine = new Scanner (line).useDelimiter("#");          //Dilimeter is space between tokens
                name = scLine.next();                                           //Words = Tokens
                num = scLine.nextInt();
                scLine.close();
                sum+=num;
                System.out.println(name+"\t + " + "\t\t" + num);
            }
            scFile.close();
            System.out.println("The sum is " + sum);
    }
}

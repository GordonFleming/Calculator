/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Gordon
 */
public class WriteToFile {
    public static void main(String[] args) throws IOException {
        PrintWriter outFile = new PrintWriter(new FileWriter("Data.txt"));
        String line = JOptionPane.showInputDialog("Enter a line of text - Stop to exit");
            while(!line.equals("STOP")){
                outFile.println(line);
                line = JOptionPane.showInputDialog("Enter a line of text - Stop to exit");
            }
            outFile.close();
    }
}

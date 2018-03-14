/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import javax.swing.JOptionPane;
/**
 *
 * @author Gordon
 */
public class JavaTest_Q2 {
    public static void main(String[] args) {
        String ka = JOptionPane.showInputDialog("Enter a word");
        String k = ka.toLowerCase();
        int[] a = new int[26];
        boolean[] b = new boolean[26];
        for(int i = 0; i<k.length();i++) {
            int j = k.charAt(i)-97;
            a[j]++;
        }
        for(int i = 0; i<k.length();i++) {
            int j = k.charAt(i)-97;
            if(!b[j]) {
                System.out.print(ka.charAt(i));
                System.out.print(a[j]);
                b[j]=true;
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;
import java.util.Scanner;
/**
 *
 * @author 24740
 */
public class Test {
    public static void main(String[] args) {
        String year = "(2001)";
        String newYear = year.replaceAll("^()","");
        System.out.print(newYear);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;

/**
 *
 * @author Gordon
 */
public class CharManipulation {
    public static void main(String[] args) {        
        String w1 = "Dog ate the one dog with pure ellegance: ";  
        w1 = w1.toLowerCase();
        System.out.println(w1.replaceFirst("dog","cat"));
        System.out.println(w1.substring(5,6));
        System.out.println(w1.indexOf('p'));
    }
}
        /**
         * .indexOf             str1.indexOf('B')
         * .subString           'String'.substring(15,20)
         * .replace All/First   .replaceAll("com","net") 
         * .toCharArray         char[] array= str.toCharArray()
        */

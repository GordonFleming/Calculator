/*
 * Some code:
 * By Gordon Fleming
 */
package L5_July_Exam_Practice;

import java.util.Scanner;

/**
 *
 * @author gordonfleming
 */
public class Pluralise {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        
        switch(word.charAt(word.length()-1)){
            case 'x':
            case 's':
                System.out.println(word+"es"); break;
            case 'y':
                for(int i = 0;i<word.length()-1;i++){
                System.out.print(word.charAt(i));
            } System.out.print("ies");break;
            default:
                System.out.println(word + "s");
        } 
    }
    
}
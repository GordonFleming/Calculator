/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;

/**
 *
 * @author 24740
 */
public class String_methods {
    public static String WhiteSpace(String sentence){
        String s2 = "";
        for(int i = 0;i<sentence.length();i++){
            if(!Character.isWhitespace(sentence.charAt(i))){
                s2+=sentence.charAt(i);
            }
        }
        return s2;
    }
    public static String ToUpperCase(String sentence){
        String s2 = "";
        for(int i = 0;i<sentence.length();i++){
            s2+=Character.toUpperCase(sentence.charAt(i));
        }
        return s2;
    }
    public static String FirstLetterUpperCase(String sentence){
        String s2 = "";
        for(int i = 0;i<sentence.length();i++){
            if(sentence.charAt(i)=='.'){
                s2+=".";
                for(int j = i+1;j<sentence.length();j++){
                        if(Character.isLetter(sentence.charAt(j))){
                            s2+=Character.toUpperCase(sentence.charAt(j));
                            i = j;
                            break;                     
                        } else { 
                            s2+=sentence.charAt(j);
                        }                       
                    }                
            } else {
                s2+=sentence.charAt(i);
            }
        }
        return s2;
    }
    public static void main(String[] args) {
        String sentence1 = "T a k e  away w h ite spac es";
        String sentence2 = "My name is Gordon. turns all to caps.";
        String sentence3 = "Start of every. sentence .should .be .caps";
        System.out.println(WhiteSpace(sentence1) + "\n" + ToUpperCase(sentence2) + "\n" + FirstLetterUpperCase(sentence3));
    } 
}
/**
 * All belong to there class (object.method)
 * Static:ClassName.method
 * Non-static(object): object.method
 * *********** *
 * charAt(i)
 * length()
 * compareTo()
 * contains
 * equals()
 * equalsIgnoreCase()
 */
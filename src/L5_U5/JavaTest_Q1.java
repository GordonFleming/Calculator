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
public class JavaTest_Q1 {
    public static int NonAlphabetical(String sentence){
        String s1 = sentence;
        int count = 0;
            for(int i=0;i<sentence.length();i++){
                if(!Character.isLetter(sentence.charAt(i))){
                    count++;
                }
            }
        return count;
    }
    public static int NumberofUpperCase(String sentence){
        String s2 = sentence;
        int count = 0;
            for(int i=0;i<sentence.length();i++){
                if(Character.isUpperCase(sentence.charAt(i)))
                    count++;
            }
        return count;
    }
    public static int FourLetterWords(String sentence){
        String s3 = sentence;
        int fourletter = 0;
        int LetterCount = 0;
            for(int i=0;i<sentence.length();i++){
                if(Character.isLetter(sentence.charAt(i))){
                    LetterCount++;
                }else{
                    if(LetterCount==4){
                        fourletter++;
                    }
                    LetterCount = 0;
                }
            }
            if(LetterCount == 4){
                fourletter++;
            }
        return fourletter;
    }
    public static void main(String[] args) {
        String s1 = "There should be 4";
        String s2 = "FIVE should be Uppercase";
        String s3 = "One Two Three Four Four Four Four";
        System.out.println("Number of non-alphabetical characters: " + NonAlphabetical(s1));
        System.out.println("Number of UpperCase letters: " + NumberofUpperCase(s2));
        System.out.println("Number of four letter words: " + FourLetterWords(s3));
    }
}

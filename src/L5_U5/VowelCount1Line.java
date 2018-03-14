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
public class VowelCount1Line {
    public static void main(String[] args) {
        String word = "there should be some vowels";
        int vowels = word.replaceAll("[^aeiouAEIOU]","").length();
        System.out.println(vowels);
    }
}

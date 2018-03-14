/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author 24740
 */
public class Remove_vowels {

    public static void main(String[] args) {

        String s = "The rain is spain the William in pain!"; //remove vowels (a, e, i, o, u)
        String d = s.toLowerCase();
        
                for(int william = 0; william <= s.length() -1; william++){
                   char y = d.charAt(william);
                    if(y != 'a' && y != 'e' && y != 'i' && y != 'o' && y != 'u'){
                       System.out.print(s.charAt(william));
                    }
                        
                }
               
    }

}

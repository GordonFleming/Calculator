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
public class Character_manipulation {
          public static void main(String[] args) {                              //uses java api Character. class
              char ch = '>';
              if(Character.isLetter(ch)){
                 System.out.println("The capital letter is: " + Character.toUpperCase(ch)); 
              }else
                  System.out.println("Is no a letter: " + ch);           
    }
}

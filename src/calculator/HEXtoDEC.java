/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
/**
 *
 * @author Gordon
 */
public class HEXtoDEC {
    public static void main(String[] args) {
        
     String hex  = "doge".toUpperCase();  
     int decimal = 0;
     
     for(int index = 0;index<4;index++){
         char dig = hex.charAt(index);
         
         int digitVal = dig - '0'; //Handles 0-9
         if(digitVal >9){
             digitVal =10 + (dig -'A'); //Handles A..F
            }
         int power = (int)Math.pow(16,3-index);
        decimal = decimal + power *digitVal;
        }
        System.out.println("Hex= " + hex + ", decimal = " + decimal);
    }
}

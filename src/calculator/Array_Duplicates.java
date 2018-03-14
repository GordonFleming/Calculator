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
public class Array_Duplicates {
    public static void main(String[] args) {
        
        int[]lottery = new int[6];
        
        for(int x = 0; x<lottery.length; x++){
            lottery[x] = 1+(int)(Math.random()*52);
                boolean allowed = false;
            
           for(int i = 0; i<x;i++){
               if(lottery[i]==lottery[x]){
                   allowed = true;
               }
           }            
           if(allowed){
               x--;
           }
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 * Compares various Scanarios of wether what is what due to specified classifications
 * @author Gordon
 */
public class if_else {
    public static void main(String[] args) {
     
        int numlegs =4;
        boolean mammal = true;
        boolean carnivore = true;
        int horns = 0;
        double weight = 5;
        
        if(numlegs==4 && mammal && !carnivore && horns==2 && weight>1000){
            System.out.println("Giraffe");
        }else if(numlegs==2 && mammal && carnivore && horns==0 && weight<1000){
            System.out.println("Human");
        }else if(numlegs==4 && mammal && carnivore && horns==0 && weight<1000){
            System.out.println("Wolverine");
        }else if(numlegs==4 && mammal && !carnivore && horns==0 && weight>1000){
            System.out.println("Elephant");
        }else if(numlegs==4 && !mammal && carnivore && horns==2 && weight<1000){
            System.out.println("Komodo Dragon");
        }else
            System.out.println("Not listed");
    }
}

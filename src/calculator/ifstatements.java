/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author 24740/Gordon Fleming
 */
public class ifstatements {
    public static void main(String[] args) {
        
     int numLegs = 2;
     boolean mammal = true;
     boolean carnivore = false;
     int horns = 2;
     double weight = 1200.5;
     
     if(weight >1000 && mammal && horns==2 && numLegs == 4 && !carnivore){
         System.out.println("Giraffe");
     }else if (weight <1000 && mammal && horns==0 && numLegs == 2 && carnivore){
         System.out.println("Human");
     }else if(weight <1000 && mammal && horns==0 && numLegs == 4 && carnivore){
         System.out.println("Wolverine");
     }else if(weight >1000 && mammal && horns==0 && numLegs == 4 && !carnivore){
         System.out.println("Elephant");
     }else if(weight <1000 && !mammal && horns==2 && numLegs == 4 && carnivore){
         System.out.println("Komodo Dragon");
     }else
            System.out.println("Something that is not listed");
        
    }
}

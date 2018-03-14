package calculator;

import java.util.Scanner;

public class Nested_loops_Rugby { public static void main(String[] args) {
    
            System.out.println("Enter a rugby score:");
            
            Scanner input = new Scanner(System.in);
            int score = input.nextInt();
                    
                    for(int penalties = 0; penalties <= 33/3; penalties++){     
                        for(int tries = 0; tries <= 33/5; tries++){
                            for(int contri = 0; contri <= 33/7; contri++){
                                if(penalties*3 + tries*5 + contri*7 == score){
            System.out.println("");
            System.out.println("Penalties " + penalties + " ,Tries " + tries + " ,Converted tries / Goal " + contri);                                 
                    }
                }
            }                                                                                                           
        } 
                    if(score == 0 || score == 2 || score == 4){
                        System.out.println("Impossible rugby score! Meh, try again?");
                    }
            System.out.println("");                   
    }   
}


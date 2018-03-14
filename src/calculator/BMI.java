/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author 24740
 */
public class BMI {public static void main(String[] args) {
     
     //int height = 1;
     //  int weight = 2;
    //String height = ("2");
    //String weight = ("3");
  
    Scanner input = new Scanner(System.in);

        double weight = 0.0;
        double height = 0.0;
        double bmi = 0.0;

        System.out.print("Enter your weight in Kg: ");
        weight = input.nextInt();

        System.out.print("Enter your height: ");
        height = input.nextInt();

        bmi = (double)((weight)/(height * height));

        System.out.printf(" Your BMI is ", bmi);
        
        if (bmi > 30){
            System.out.println(bmi+ " Obese");
        }else if (bmi >= 20){
            System.out.println(bmi+ " Overweight");
        }else if (bmi <=18.5){
                System.out.println(bmi+ " Normal");
        }else if (bmi >= 18.5){       
                System.out.println(bmi+ " Underweight");
        }else 
                System.out.println(bmi+ " Error");
                        
                                       
    }
}

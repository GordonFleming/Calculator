/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov_Exams;
import java.util.Scanner;
/**
 *
 * @author Gordon
 */
public class BMI_OOP {
    double height;
    double weight;
    public BMI_OOP(double h,double w){
        height = h;
        weight = w;
    }
    public double bmi(){
        return weight/Math.pow(height, 2);
    }
    public String toString(){
        return "Person of height " + height + " and weight " + weight + " has a BMI of: " + bmi();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your height: ");
        double h = input.nextDouble();
        System.out.println("Enter your Weight: ");
        double w = input.nextDouble();
        BMI_OOP p1 = new BMI_OOP(h,w);
        System.out.println(p1 + "\n");     
        if(p1.bmi()<18.5){
            System.out.println("Underweight");
        }else if(p1.bmi()>18.5&&p1.bmi()<25){
            System.out.println("Normal");
        }else if(p1.bmi()>25&&p1.bmi()<30){
            System.out.println("Overweight");
        }else if(p1.bmi()>30){
            System.out.println("Obese");
        }else
            System.out.println("Error");
    }
}

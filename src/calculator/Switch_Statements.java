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
public class Switch_Statements {
    public static void main(String[] args) {
            
        System.out.println("Enter a number 1-12: ");
        Scanner input = new Scanner (System.in);    
        int num = input.nextInt();
        String month;
        switch(num){
            case 1 : month="January";break;
            case 2 : month="February";break;
            case 3 : month="March";break;
            case 4 : month="April";break;
            case 5 : month="May";break;
            case 6 : month="June";break;
            case 7 : month="July";break;
            case 8 : month="August";break;
            case 9 : month="September";break;
            case 10 : month="October";break;
            case 11 : month="November";break;
            case 12 : month="December";break; 
            default: month = "";
        }
        switch(num){
            case 1:case 2:case 12: System.out.println("Summer\t" + num + " = " + month);
            break;
            case 3:case 4:case 5: System.out.println("Summer\t" + num + " = " + month);
            break;
            case 9:case 10:case 11: System.out.println("Summer\t" + num + " = " + month);
            break;
            case 6:case 7:case 8: System.out.println("Summer\t" + num + " = " + month);
            break;
        }
    }
}

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
public class Practice {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        
       int pri = input.nextInt();
        
        for(int i =2;i<=pri/2;i++)
        {
            temp = pri%i;
            if(temp==0)
            {
                isPrime = false;
                break;
            }
        }
        
        int n = 13;
        if(isPrime)
        {            
            System.out.println(input + " Number is Prime" );
        }else
            System.out.println(input + " None Prime number" );
        
        
    }
   
}

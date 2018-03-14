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
public class Loops_Revision {
    public static void main(String[] args) {
        int x = 23;
        while(true){
            if(sum(x)==pd(x)){
                break;
            }
            x++;
        }
        System.out.println(x);
    }
    public static int sum(int x){
        int sum = 0;
        while (x > 0) {
            sum += x%10;
            x /= 10;
        }
        return sum;
    }
    public static int pd(int x){
        int pd = 1;
        while (x>0){
            pd *= x%10;
            x /= 10;
        }
        return pd;
    }
}
    

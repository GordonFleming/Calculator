/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov_Exams;

/**
 * In a specific case which scanario is best to earn the most
 * @author Gordon
 */
public class Best_option {
    public static void main(String[] args) {
        
        int opt1 = 100*10;
        int opt2 = 1+2+4+8+12+24+48+96+192+384;
        
        if(opt1<opt2){
            System.out.println("Option 2 is better " + opt2 + " compared to " + opt1);
        }else if (opt2<opt1){
            System.out.println("Option 1 is better " + opt1 + " compared to " + opt2);
        }
    }
}

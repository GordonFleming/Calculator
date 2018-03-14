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
public class three_to_thirty { public static void main(String[] args) {
        
    int start = 3;
    int row = 1;
    while (row <=10){
        
        for(int col = 1; col <= row; col++){
            int val = start + (col-1);
            System.out.print(val);
            System.out.print("\t");
        }
        row = row + 1;
        start = start +2;
        System.out.println();
    }
    
    }
}

/*
 * Some code:
 * By Gordon Fleming
 */
package L5_July_Exam_Practice;

/**
 *
 * @author gordonfleming
 */
public class Divisable {
    
    public static void main(String[] args) {
        int sum = 0;
            for(int i = 100; i < 200;i++){
                if(i%7==0){
                    sum += i;
                }else
                    sum = sum+0;
            }
            System.out.println("The sum of all numbers divisable by 7 100<x<200 are: " + sum);
    }
    
}

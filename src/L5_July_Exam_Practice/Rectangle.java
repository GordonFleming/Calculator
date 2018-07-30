/*
 * Some code:
 * By Gordon Fleming
 */
package L5_July_Exam_Practice;
import java.util.Scanner;

/**
 *
 * @author gordonfleming
 */
public class Rectangle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of rows: ");
        int r = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = input.nextInt();
            
            for(int i = 0;i<r;i++){
                System.out.println("");
                for(int o = 0;o<c;o++){
                    System.out.print("#");
                }
            }
    }
    
}

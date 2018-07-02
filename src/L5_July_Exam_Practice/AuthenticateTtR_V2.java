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
public class AuthenticateTtR_V2 {
    static String team;
    static int input, running, Prescore, Postscore;
    int count=0;
    
    public AuthenticateTtR_V2(String t, int i, int r, int pre, int post){
        team = t;
        input = i;
        running = r;
        Prescore = pre;
        Postscore = post;
    }
    
    public static void Calculator(){
        switch (input) {
            case 1:
                running += 1;
                break;
            case 2:
                running += 2;
                break;
            case 3:
                running += 4;
                break;
            case 4:
                running += 7;
                break;
            case 6:
                running += 15;
                break;
            case 8:
                running += 21;
                break;
            default:
                System.out.println("Invalid statement!");
                break;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Ticket to ride Validator!");
        System.out.println("\nComplete the following...\n");
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your team name: \n");
        team = in.next();    
        System.out.println("Enter the score on the board: \n");
        Prescore = in.nextInt();
        System.out.println("Now slowly enter the trains, length by length");
        
        while(in.next().equals("exit") == false){ 
            input = in.nextInt();                       
        }
        System.out.println("Hello "+team+", Your score was calculated as  " + running + "  compared to your prescore of  " + Prescore);    
    }
}

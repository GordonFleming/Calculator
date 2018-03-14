
package calculator;

import java.util.Scanner;


public class Shapes {

    public static void main(String[] args) {

        System.out.println("Enter a number:");

        Scanner Input = new Scanner(System.in);
        int star = Input.nextInt();

        for (int first = 1; first <= star; first++) {
            for (int second = 1; second <= first; second++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

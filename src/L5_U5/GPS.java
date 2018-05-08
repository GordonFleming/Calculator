/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;

/**
 *
 * @author flemi
 */
public class GPS {
    public static void main(String[] args) {
        double x1=1.2; double y1=2.4; int t1=15;
        double x2=100; double y2=-75.3; int t2=25;
        double speed = Math.sqrt(((x2-x1)*(x2-x1))+((y2=y1)*(y2-y1)))/(t2-t1);
        System.out.println("Average speed = " + speed);
        if(speed<16.7){
            System.out.println("Not speeding");
        }else
            System.out.println("Speeding");
    }
}

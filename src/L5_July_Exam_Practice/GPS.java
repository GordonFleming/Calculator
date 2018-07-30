/*
 * Some code:
 * By Gordon Fleming
 */
package L5_July_Exam_Practice;

/**
 *
 * @author gordonfleming
 */
public class GPS {
    
    double x1 = 1.2, y1 = 2.4; int t1 = 15;
    double x2 = 100, y2 = -75.3; int t2 = 25;
    double speed;
    
    public double speed(){
        speed = Math.sqrt((Math.pow(x2-x1,x2-x1)+Math.pow(y2-y1,y2-y1))/(t2-t1));
        return speed;
    }
   
    public static void main(String[] args) {
        GPS p1 = new GPS();
        if(p1.speed()>16.7){
            System.out.println("Speeding!");
        }else
            System.out.println("Not speeding.");
    }    
}

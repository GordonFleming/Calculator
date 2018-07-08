/*
 * Some code:
 * By Gordon Fleming
 */
package L5_July_Exam_Practice;

/**
 *
 * @author gordonfleming
 */
public class Particle_OOP {
    
    double x, y;
    
    public Particle_OOP(){
        x = 0.0;
        y = 0.0;
    }
    
    public void move(double a, double r){
        x = x + r * Math.sin(a*Math.PI/180);
        y = y + r * Math.cos(a*Math.PI/180);
    }
    
    public double distance (){
        return Math.sqrt(x*x+y*y);
    }   
    
    public static void main(String[] args) {
        Particle_OOP p1 = new Particle_OOP();
        Particle_OOP p2 = new Particle_OOP();
        
        for(int i =0; i<1000; i++){
            double r1 = Math.random()*0.2-0.1;
            double a1 = Math.random()*360;
            p1.move(a1,r1);
            double r2 = Math.random()*0.2-0.1;
            double a2 = Math.random()*360;
            p2.move(a2,r2);
        }
        
        if(p1.distance()>p2.distance()){
            System.out.println("Particle 1 moved the furthest " + p1.distance() + " and Particle 2 " + p2.distance());
        }else if(p2.distance()>p1.distance()){
            System.out.println("Particle 2 moved the furthest " + p2.distance() + " and Particle 1 " + p1.distance());
        }else
        System.out.println("They moved exactly the same distance");
    }
    
}

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
public class Polygon {
    int numSides, sideLen;
    public Polygon(int n, int s){
        numSides = n;
        sideLen = s;
    }
    public double getArea(){
        double rads = Math.toRadians(180/numSides);
        double perimeter = numSides*sideLen;
        double apothem = sideLen/(2*Math.tan(rads));
        return 0.5*perimeter*apothem;
    }
    public double getPerimeter(){
        return numSides*sideLen;
    }
    public String toString(){
        return numSides+"-sided polygon, area/perimeter ratio "+this.getArea()/this.getPerimeter();
    }
    public static void main(String[] args) {
        Polygon p = new Polygon(6,7);
        System.out.println("Area: "+p.getArea());
        System.out.println(p);
    }
}
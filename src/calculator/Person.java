package calculator;
/**
 *
 * @author 24740
 */
public class Person {
    
    //Properties
    
    //**Heght of the person in meters. */
    double height;
    /**Weight in kilograms*/
    double weight;
    
public Person(double h, double w){
    
    height=h;
    weight=w;
    
}

public String toString(){
    
    return "Person of weight " + weight + " and height " + height;
}  
public double bmi(){
    return weight / (height*height);
}
    //Main program
    public static void main(String[] args) {
        System.out.println("Hello");
        Person p1 = new Person(1.6, 85);
        Person p2 = new Person(2.1, 90);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("BMI is= " + p1.bmi());
        System.out.println("BMI is= " + p2.bmi());
    }
}

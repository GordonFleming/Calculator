/*
 * Some code:
 * By Gordon Fleming
 */
package L5_July_Exam_Practice;

/**
 *
 * @author gordonfleming
 */
public class Human {
    
    String name, eyeColour;
    int age, height;
    
    public Human(){
        
    }
    
    public void speak(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + height + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye colour is " + eyeColour);
    }
    
    public void eat(){
        System.out.println("eating...");
    }
            
    public void walk(){
        System.out.println("walking...");
    }
    
    public void work(){
        System.out.println("working...");
    }
    
    public static void main(String[] args) {
        
    }
}

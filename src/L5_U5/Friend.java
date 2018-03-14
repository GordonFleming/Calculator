/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;

/**
 *
 * @author 24740
 */
public class Friend {                           //Definition class (defines friend)
    private String name;
    private double height;
    private int age;
    public Friend(String name, double h, int a){
        this.name=name;
        height = h;
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override                   //tells java to not use in-built one
    public String toString(){                                                   
    return getName() + "\t" + getHeight() + "\t" + getAge();
    }
    public static void main(String[] args) {
        
    }
}

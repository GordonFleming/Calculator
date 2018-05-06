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
public class Car {
    private String constructor;
    private int number;
    private String team;
    private String driver;
    private String codriver;
    public Car(String c,String t,String d,String cd,int n){
        n = number;
        c = constructor;
        t = team;
        d = driver;
        cd = codriver;
    }
    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String getCodriver() {
        return codriver;
    }
    public void setCodriver(String codriver) {
        this.codriver = codriver;
    }
    @Override
    public String toString(){
    return "Constructor: " + getConstructor() + "\nTeam number: " + getNumber() + "\nTeam: " + getTeam() + "\nDriver: " + getDriver() + "\nCo-Driver: " + getCodriver();
    }   
}

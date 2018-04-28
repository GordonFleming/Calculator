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
public class Driver {
    private String name, country;
    public Driver (String n, String c){
        n = name;
        c = country;
    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    @Override
    public String toString(){
        return getName() + " " + getCountry();
    }
}

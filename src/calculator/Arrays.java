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
public class Arrays {
    public static void main(String[] args) {
        
     double x = 1.5;
     double y = 0.7;
     //double z???
     double total = x+y; //+z
     
        System.out.println("Sum= " + total);
        
        double[] myList  = {1.5, 0.7, 2.2, 5.4, 4.3, 0.2, 0.9, 2.7, 1.0}; //Static array
        System.out.println("Size of my myList= " + myList.length);
        
        System.out.println("First of my myList= " + myList[0]); //pulls indavidual numbers
        System.out.println("Second of my myList= " + myList[1]);
        System.out.println("Third of my myList= " + myList[2]);
        System.out.println("Last of my mylist= " + myList[myList.length-1]);
    
    double Total = 0.0;
        for(int item = 0; item < myList.length; item++){ //goes through each one adding them one by one
            Total += myList[item];
        }
        double average = 0.0;
        average = Total/myList.length;
        System.out.println("Total= " + Total);
        System.out.println("Average= " + average);
        
        System.out.println("");
        System.out.println("");
        
        int[] q = new int [999];   //dynamic array
        int all = 0;
        for(int i =0;i<q.length;i++){
            q[i] = 1+(int)(6*Math.random());            
            }
        for(int i = 0; i < q.length;i++){
                if(q[i]==2){
                    all++;
                }
        }
       
        System.out.println("Amount of twos: " + all); //counts amount of twos
}
}

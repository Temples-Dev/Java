/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superman;

/**
 *
 * @author Welcome Guest!
 */
public class Vehicle {  //superclass
    int maxSpeed;
    Vehicle(){
        System.out.println("Vehicle constructor");
    }
     Vehicle(int maxSpeed){
        System.out.println("Vehicle constructor with maxSpeed");
        this.maxSpeed=maxSpeed;
    }
    
    
    
    
    
    
//    int maxSpeed=120;
//    public void vroom(){
//        System.out.println("Vroom vroom");
//    }
}

class Car extends Vehicle{//subclass
    Car(){
        super();
        
        
        System.out.println("Car constructor");
    }
    
    
    // supper can be used to call a constructor, a variable, and a method
    
    
    
    
    
    
    
    
    
    
    
    
    
//    int maxSpeed=100;
//    public void display(){
//        System.out.println(super.maxSpeed);
//    }
//    @Override
//    public void vroom(){
////        System.out.println("Skurrt");
//super.vroom();
//        
//    }
}
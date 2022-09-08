/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kissi_lessons;

/**
 *
 * @author Welcome Guest!
 */
public class Car {
    String tyres,engine, brand,windscreen,color;
    
    public void Car(String wheel,String motor,String brand,String windscreen,String color){
        tyres=wheel;
        engine=motor;
        this.windscreen=windscreen;
        this.color=color;
        this.brand=brand;
        }
    public void details(){
            System.out.println("the brand of the car is "+brand);
            System.out.println("the color of the car is "+color);
            System.out.println("the windscreen of the car is "+windscreen);
           // System.out.println("the windscreen of the car is "+windscreen);
            System.out.println("the engine of the car is "+engine);
            System.out.println("the tyres of the car is "+tyres);
        }
}

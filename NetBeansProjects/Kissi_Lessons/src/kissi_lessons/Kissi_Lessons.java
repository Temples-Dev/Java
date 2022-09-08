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
public class Kissi_Lessons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//       2nd Lessons from Mr Kissi 
        Car benz=new Car();
        benz.Car("17 inch","3.5", "benz", "gloss",  "blue");
        benz.details();
        
        System.out.println("\n");
        
        Car ferrari=new Car();
        ferrari.Car("22 inch","5.7","ferrari","glastic","green");
        ferrari.details();
        
         System.out.println("\n");
         
         Person human=new Person();
         human.Person("Temple", 25, "Male", 17.3, "Dark");
         human.details();
    } 
}

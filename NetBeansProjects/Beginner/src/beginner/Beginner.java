/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner;

/**
 *
 * @author Welcome Guest!
 */
public class Beginner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
 a = 2;
 b = 3;
 c = a - b;
if (c >= 0){
    System.out.println("c is a positive number");
}
 if (c < 0){
     System.out.println("c is a negative number");
 }
 System.out.println();
 c = b - a;
 if (c >= 0) {
     System.out.println("c is a positive number");
 }
 if (c < 0){
     System.out.println("c is a negative number");
 }
 
 // New work
 
 double x, y, z;
 x = 3;
 y = 4;
 z = Math.sqrt(x*x + y*y);
 System.out.println("\nHypotenuse is " +z);

 
 
 
 
 
 
 
 
    }
    
}

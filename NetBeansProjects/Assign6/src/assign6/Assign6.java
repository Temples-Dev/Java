/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assign6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        int x,y,z;
        System.out.println("Person one,ener your age: ");
        x= input.nextInt();
        System.out.println("Person two,ener your age: ");
        y=input.nextInt();
        System.out.println("Person three,ener your age: ");
        z=input.nextInt();
        
        // Person 1
        if(((x>y)&&(x>z))){
            System.out.println("Person one is the oldest");
        } else if ((x<y)&&(x<z)){
                    System.out.println("Person one is the youngest");
                    }
         //Person 2
        if((y>x)&&(y>z)){
            System.out.println("Person two is the oldest");
        } else if((y<x)&&(y<z)){
            System.out.println("Person two is the youngest");
                    }
        // Person 3
        if((z>x)&&(z>y)){
            System.out.println("Person three is the oldest");
        } else if((z<x)&&(z<y)){
            System.out.println("Person three is the youngest");
        
    }
    
    }
}

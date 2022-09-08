/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmnet2;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assigmnet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input =new Scanner(System.in);
         int x,y,z;
        
              System.out.println("Input the 1st number: ");  
         x=input.nextInt();
         System.out.println("Input the 2nd number: ");  
         y=input.nextInt();
         System.out.println("Input the 3rd number: ");  
         z=input.nextInt();
         
         if ((x>y)&&(x>z)){
             System.out.println("The greatest: "+ x);
         } else if((y>x)&&(y>z)){
              System.out.println("The greatest: "+y);
         } else {
              System.out.println("The greatest: "+z);
         }
         
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

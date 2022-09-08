/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop4;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y,z;
         Scanner input=new Scanner(System.in);
         System.out.println("Enter a number: ");
         y=input.nextInt();
         int x;
         z=1;
         
         for(x=1;x<=y;x++){
             
             z=z*x;
         }
            
             
         
         
        System.out.println(y+"! is : " + z);
        
        
        
        
    }
    
}

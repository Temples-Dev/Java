/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop3;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        int x,y,num,mut;
        System.out.println("Enter a positive number");
        x=input.nextInt();
          System.out.println("The Multiplication table for "+x+" :");
        for (num=1;num<=12;num++){
                  mut= x*num;
                
            System.out.println(x+ "*"+ num +"="+ mut);
       }
       
      
        
            
        
        
    }
    
}

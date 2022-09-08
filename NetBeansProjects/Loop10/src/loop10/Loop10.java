/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop10;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
         int x,y;
         char z;
         do{
              System.out.println("Enter num 1");
         x=input.nextInt();
         System.out.println("Enter num 2");
         y=input.nextInt();
         
         int sum;
         sum= x+y;
             System.out.println("The sum of "+x+" and "+y+" is \n"+sum);
         
             System.out.println("Do you want to continue y/n");
             z=input.next().charAt(0);
       
         }while( (z=='Y')||(z=='y') );
         
        
         
                 }
}
    


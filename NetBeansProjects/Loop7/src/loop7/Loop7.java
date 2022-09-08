/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop7;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int num;
         char choice;
         int even;
          even=0;
          int Odd;
            Odd=0;
        
      do{
            System.out.println("Enter integers");
        num =input.nextInt();
        
        
       
        if(num%2==0){
            
           
            even+=num;
            
        }else{
            
           
             Odd+=num;
        }
       
        System.out.println("Do you want to continue y/n ?");
        choice=input.next().charAt(0);
      } while((choice=='y')||(choice=='Y'));
        System.out.println("Sum of Even number is: \n"+ even);
        System.out.println("Sum of Odd number is: \n"+ Odd);
      
        
        
      
    }
        
        
      
}

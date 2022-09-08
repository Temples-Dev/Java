/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop11;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        char z;
        //z='Y';
         int pos=0;
          int neg=0;
           int zero=0;
        do{
            
            int x;
            System.out.println("Enter numbers");
            x=input.nextInt();
             System.out.println("Do you want to continue y/n");
                 z=input.next().charAt(0);
            if(x>0){
               
                pos++;
               
            } else if(x<0){
               
                neg++;
              
            } else{
               
                zero++;
                 
                
                
               
            }
        } while((z=='Y')||(z=='y'));
        
        System.out.println("Positive numbers\n"+pos+" \nNegative numbers\n"+neg+"\nzero numbers\n"+zero);
    }
    
}

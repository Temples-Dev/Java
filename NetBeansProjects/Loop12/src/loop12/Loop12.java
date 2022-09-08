/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop12;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        char z;
          int x;
          
          int max=Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;
          
          
          
          
        do{
          
            System.out.println("Enter numbers");
            x=input.nextInt();
             System.out.println("Do you want to continue y/n");
                 z=input.next().charAt(0);
                  
                 if(x>max){
                     max=x;
                 } 
                 if(x<min){
                     min=x;
                 }
             
             
        }while((z=='Y')||(z=='y'));
        
        
        System.out.println("Largest number\n"+ max);
        System.out.println("Smallest number\n"+ min);
        
        /* if(x>=0){
                  if((x>0)&&(x>=x)){
               int pos=0;
                pos++;
                      System.out.println(x+" is the largest");
              }
                 
              }
              if((x<=0)){
                   if((x<0)&&(x<=x)){
                int neg=0;
                neg++;
                       System.out.println(x+" is the smallest");
                   }
              }
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

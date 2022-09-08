/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        Scanner input=new Scanner(System.in);
        char z;
   do{
   int y;
   int x=0;
        System.out.println("Guess the random generated");
        y=input.nextInt();
        if (y==x){
            x=rand.nextInt();
            //if(y==0&&x==0){
            //      System.out.println("You Got it,Random number is:"+x);
          //  }
    
        }
        while(y>x){
            System.out.println("Too high, try again");
            break;
        }
       while(y<x){
           System.out.println("Too low, try again");
           break;
       }
        System.out.println("Random number is:"+x);
        System.out.println("Do you want to try again y/n?");
        z=input.next().charAt(0);
   } while((z=='Y'||z=='y'));
        
        System.out.println("Hope you try again later");
    
    
    
    
    
    
    
    }
        }
        
        
        
        
        
        
        
        
        
        
        
        
    
    


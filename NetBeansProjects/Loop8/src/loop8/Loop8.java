/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this ylate file, choose Tools | Templates
 * and open the ylate in the editor.
 */
package loop8;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        int x;
        System.out.println("Enter a positive integer: \n");
        x= input.nextInt();
       
        int y;
        boolean isPrime=true;
        for(int i=2;i<=x/2;i++){
            y=x%i;
            if(y==0){
                isPrime=false;
             //   break;
                
            }
        }
        if(isPrime){
            System.out.println(x+" is a Prime number");
        }else{
            System.out.println(x+" is not a Prime number^");
        }
        
        
        
     /*  if(((x>1)&&(x/x==1))&&()){
            System.out.println("it is a prime number");
        } */
        
        
       
        
        
        
        
            }
        }
    
         
  
      
    
    


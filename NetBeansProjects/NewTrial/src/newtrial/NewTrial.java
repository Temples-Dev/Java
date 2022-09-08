/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtrial;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class NewTrial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Program to print the greatest input
      /*  Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int x;
        x=input.nextInt();
        System.out.println("Enter number 2");
        int y;
        y=input.nextInt();
        
        if(x>y){
            System.out.println(x+" is the greatest");
        }else if(y>x){
            System.out.println(y+" is the greatest ");
       }else{
            System.out.println("input cannot be validated");
        }
      */
      
      
      Scanner input=new Scanner(System.in);
      int Q;
        System.out.println("enter quatity of purchase:");
        Q=input.nextInt();
       
        int C;
       C= Q*100;
       int dis;
       dis=100-10;
       if(C>1000){
           int discount=dis*Q;
           System.out.println("Your discount is : "+ discount);
           
          //System.out.println("Your total cost is :"+ );
       }else{
           System.out.println("Yor cost is:"+ C);
       }
             
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    }
    
}

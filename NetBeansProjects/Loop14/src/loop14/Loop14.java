/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop14;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input=new Scanner(System.in);
         int x;
         System.out.println("Enter number of fibonacci elements");
         x=input.nextInt();
         System.out.println("Fibonacci elements are:");
        int n1=0;
        int n2=1;
        int n3;
        int i;
       // int number;
        
        System.out.println(n1);
        System.out.println(n2);
        
        for(i=2;i<x;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

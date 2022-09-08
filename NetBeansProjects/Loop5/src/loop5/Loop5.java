/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop5;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        // A program to calculate an exponential value
        int x,y,result;
        result=1;
        System.out.println("Enter base number 1 ");
        x=input.nextInt();
        
        System.out.println("Enter exponent number 2 ");
        y=input.nextInt();
        
        for(int count=1;count<=y; count++){
            result=result*x;
        }
        
        System.out.println("The power "+x+" is: "+ result);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

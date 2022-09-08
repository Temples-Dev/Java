/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop6;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Loop6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
        int x,reverse;
        reverse=0;
        System.out.println("Enter number");
        x=input.nextInt();
        
        while( x != 0 ) {
			reverse = reverse * 10;
			reverse = reverse + x%10;
			x = x/10;
		}
		System.out.println("Reverse of entered number is "+reverse);
        
       // int n, reverse = 0;
		//System.out.println("Enter the number to reverse");
		//Scanner in = new Scanner(System.in);
		//n = in.nextInt();
        
        /*
       
       
        for(int y=0;y<=x;){
            
            reverse=
            
        }
        
        System.out.println("A reversed Output is");
        
        */
        
     

		
		
	

        
        
        
    }
    
}

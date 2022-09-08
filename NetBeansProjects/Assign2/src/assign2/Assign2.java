/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assign2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter num1:");
        num1=input.nextInt();
        System.out.println("Enter num2:");
        num2= input.nextInt();
        
        if (num1> num2){
            System.out.println("num1 is the greatest");
        } else if(num2>num1){
            System.out.println("num2 is the greatest");
        } else {
            System.out.println("Input cannot be validated" );
           
            
        }
        
    }
    
}

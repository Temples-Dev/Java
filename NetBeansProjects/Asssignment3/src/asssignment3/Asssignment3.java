/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asssignment3;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Asssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println("input number");
        float num = input.nextFloat();
        if (num>0){
            if(num<1){
                System.out.println("Positive small number");
            } else if(num>1000000){
                System.out.println("Positive large number");
            } else{
                System.out.println("Positive number");
            }
        } else if (num<0){
            if(Math.abs(num)<1){
                System.out.println("Negative small number");
            } else if(Math.abs(num)>1000000){
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        } else{
            System.out.println("Zero");
        }
        
        
        
        
        
        
        
        
        
    }
    
}

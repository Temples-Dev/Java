/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;


import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        float number;
        System.out.println("Enter a number: ");
        number=input.nextFloat();
        
        if(number>0){
            System.out.println(number+ " Number  Posiive ");
        } else if(number<0){
            System.out.println(number+ "  Number negative ");
        } else{
            System.out.println(number+ "  Number neutral ");
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}

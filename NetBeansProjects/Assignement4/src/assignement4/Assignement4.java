/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement4;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assignement4 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        int day;
        System.out.println("Enter week day number");
        day=input.nextInt();
        
        switch(day){
            case 1:
                System.out.println("Monday"); break;
                 
            case 2:
                System.out.println("Tuesday");
                 break;
            case 3: 
                System.out.println("Wednesday");
                 break;
            case 4:
                System.out.println("Thursday");
                 break;
            case 5:
                System.out.println("Friday");
                 break;
            case 6:
                System.out.println("Saturday");
                 break;
            case 7: 
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter week day number 1-7");
        }
        
        
        
        
       
       
        
        
        
        
        
        
    }
}


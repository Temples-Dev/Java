/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author Welcome Guest!
 */
public class Assignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year;
    	Scanner input = new Scanner(System.in);
    	
        System.out.println("Enter any Year:");
    	year = input.nextInt();
    	input.close();
        boolean Leap;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    Leap = true;
                else
                    Leap = false;
            }
            else
                Leap = true;
        }
        else {
            Leap = false;
        }

        if(Leap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}

        
        
        
        
        
        
        
        
        
        
        
    

